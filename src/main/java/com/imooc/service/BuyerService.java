package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家订单校验服务层
 *
 * @author Huangfobo
 * @create 2018-07-27 10:33
 **/

public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
