package com.yloonspring.accservers.service.proxy.jdkproxy;

import java.util.UUID;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yanyajun@umpay.com
 * @版本: 1.0
 * @创建日期: 2021/1/8 17:16
 * @ClassName: OrderServiceImpl
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public class OrderServiceImpl implements OrderService {

    private String user = null;

    public OrderServiceImpl() {
    }

    public OrderServiceImpl(String user) {
        this.setUser(user);
    }

    private void setUser(String user) {
    }

    //...

    @Override
    public void save(UUID orderId, String name) {
        System.out.println("call save()方法,save:" + name);
    }

    @Override
    public void update(UUID orderId, String name) {
        System.out.println("call update()方法");
    }

    @Override
    public String getByName(String name) {
        System.out.println("call getByName()方法");
        return "aoho";
    }
    
}
