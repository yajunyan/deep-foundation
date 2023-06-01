package com.yloonspring.accservers.service.suanfa;

import com.yloonspring.accservers.service.suanfa.data.LinkNode;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2021/5/27 11:26
 * @ClassName: LinkDelN
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public class LinkDelN {

    public LinkNode  removeNthFromEnd(LinkNode head, int n){
        LinkNode   left = head;
        LinkNode   right = head;
        for(int i=0;i<n;i++){
            right = right.next;
        }

        if(right == null){
            head=head.next;
            return head;
        }
        while(right.next !=null){
            left = left.next;
            right= right.next;
        }

        left.next = left.next.next;
        return head;
    }
}
