package com.yloonspring.accservers.service.proxy.jdkproxy;

import java.util.UUID;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yanyajun@umpay.com
 * @版本: 1.0
 * @创建日期: 2021/1/8 17:15
 * @ClassName: OrderService
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public interface OrderService {
    public void save(UUID orderId, String name);

    public void update(UUID orderId, String name);

    public String getByName(String name);

}
