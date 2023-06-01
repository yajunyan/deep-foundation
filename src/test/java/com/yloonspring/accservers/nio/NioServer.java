package com.yloonspring.accservers.nio;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2021/11/23 14:25
 * @ClassName: NioServer
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public class NioServer {

    @Test
    public void server() throws IOException {
        //打开一个ServerSocketChannel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 6666);
        //绑定地址
        serverSocketChannel.bind(address);
        //设置为非阻塞
        serverSocketChannel.configureBlocking(false);
        //打开一个选择器
        Selector selector = Selector.open();
        //serverSocketChannel注册到选择器中,监听连接事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        //循环等待客户端的连接
        while (true) {
            //等待3秒，（返回0相当于没有事件）如果没有事件，则跳过
            if (selector.select(3000) == 0) {
                System.out.println("服务器等待3秒，没有连接");
                continue;
            }
            //如果有事件selector.select(3000)>0的情况,获取事件
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            //获取迭代器遍历
            Iterator<SelectionKey> it = selectionKeys.iterator();
            while (it.hasNext()) {
                //获取到事件
                SelectionKey selectionKey = it.next();
                //判断如果是连接事件
                if (selectionKey.isAcceptable()) {
                    //服务器与客户端建立连接，获取socketChannel
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    //设置成非阻塞
                    socketChannel.configureBlocking(false);
                    //把socketChannel注册到selector中，监听读事件，并绑定一个缓冲区
                    socketChannel.register(selector, SelectionKey.OP_READ, ByteBuffer.allocate(1024));
                }
                //如果是读事件
                if (selectionKey.isReadable()) {
                    //获取通道
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    //获取关联的ByteBuffer
                    ByteBuffer buffer = (ByteBuffer) selectionKey.attachment();
                    //打印从客户端获取到的数据
                    socketChannel.read(buffer);
                    System.out.println("from 客户端：" + new String(buffer.array()));
                }
                //从事件集合中删除已处理的事件，防止重复处理
                it.remove();
            }
        }
    }
}
