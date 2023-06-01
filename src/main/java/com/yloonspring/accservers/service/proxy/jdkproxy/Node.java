package com.yloonspring.accservers.service.proxy.jdkproxy;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yanyajun@umpay.com
 * @版本: 1.0
 * @创建日期: 2021/1/25 10:51
 * @ClassName: Node
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public class Node {
    private int value;

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    private Node nextNode;
    public  Node(int value){
        this.value = value;
    }
}
