package com.yloonspring.accservers.service.suanfa.data;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2021/5/27 11:27
 * @ClassName: LinkNode
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public class LinkNode {
    public LinkNode next;
    public  int val;
    LinkNode(){}
    LinkNode(int val){ this.val=val;}
    LinkNode(int val, LinkNode next){
        this.val=val;
        this.next = next;
    }
}
