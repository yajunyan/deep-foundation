package com.yloonspring.accservers.bytetest;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2021/11/23 10:45
 * @ClassName: ByteBufferTest
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public class ByteBufferTest {

    @Test
    public void  testByteBuffer(){
        String msg = "test byte buffer";
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        byte[] bytes = msg.getBytes();

        //写入数据到buffer
        byteBuffer.put(bytes);
        //切换成读模式
        byteBuffer.flip();

        //创建一个临时数组
        byte[] tempByte = new byte[bytes.length];

        int i=0;
        //循环写入
        while(byteBuffer.hasRemaining()){
            byte b = byteBuffer.get();
            //放入临时数据中
            tempByte[i] = b;
            i++;
        }

        System.out.println(new String(tempByte));
    }
}
