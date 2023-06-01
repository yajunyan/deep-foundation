package com.yloonspring.accservers.rocketmq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.*;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2021/5/28 23:14
 * @ClassName: Rocketmqtest
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public class Rocketmqtest {

    @Test
    public void producerTest() throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer defaultMQProducer = new DefaultMQProducer("Hotz");
        //设置nameserver地址
        defaultMQProducer.setNamesrvAddr("192.168.95.135:9876");
        defaultMQProducer.start();
        defaultMQProducer.setSendMsgTimeout(60000);
        //topic 消息将要发送的地址
        //body  消息数据
        String topic = "TOPIC1";
        String tag = "topic1_tag";
        byte[] body = "body4".getBytes();
        Message msg = new Message(topic,tag, body);
        defaultMQProducer.send(msg, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                  System.out.println("success");
            }

            @Override
            public void onException(Throwable throwable) {
                 System.out.println("fail");
            }
        });
        //defaultMQProducer.send(msg);
        System.out.println("producer send finished");
        Thread.sleep(60000);

    }

    @Test
    public void consumerTest() throws MQClientException, InterruptedException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("cosunmer1");
        consumer.setNamesrvAddr("192.168.95.135:9876");
        consumer.subscribe("TOPIC1", "*");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                for(MessageExt msg:msgs){
                    System.out.println(new String(msg.getBody()));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
         consumer.start();
         System.out.println("consume start");
         Thread.sleep(60000);
    }

    @Test
    public void TransactionProducerTest() throws MQClientException {
        TransactionMQProducer producer = new TransactionMQProducer("transactionp");
        producer.setNamesrvAddr("192.168.95.135:9876");

        //回调
        producer.setTransactionListener(new TransactionListener() {
            @Override
            public LocalTransactionState executeLocalTransaction(Message message, Object o) {
                //执行本地事务
                System.out.println("------executeLocalTransaction------");
                System.out.println("msg:" + new String(message.getBody()));
                System.out.println("msg: "+message.getTransactionId());
                return LocalTransactionState.COMMIT_MESSAGE;
            }

            @Override
            public LocalTransactionState checkLocalTransaction(MessageExt message) {
                //broker端回调，检查事务
                System.out.println("------checkLocalTransaction------");
                System.out.println("msg:" + new String(message.getBody()));
                System.out.println("msg: "+message.getTransactionId());
                //事务执行成功
                return LocalTransactionState.COMMIT_MESSAGE;
                //return LocalTransactionState.UNKNOW;
                //return LocalTransactionState.ROLLBACK_MESSAGE;
            }
        });

        producer.start();
        producer.sendMessageInTransaction(new Message("tran1001", "tran1body".getBytes()), null );

    }

    @Test
    public long  getOutFlowNo(){
        String pkValue;
        String str = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        int rannum = (int) (new Random().nextDouble() * (9999 - 10 + 1)) + 100;// 获取3位随机数
        // pkValue= UUID.randomUUID().toString().replace("-","");
        pkValue= str+rannum;
        return Long.valueOf(pkValue);
    }
}
