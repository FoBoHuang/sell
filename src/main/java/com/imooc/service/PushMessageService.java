package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 推送消息
 *
 * @author Huangfobo
 * @create 2018-08-13 16:16
 **/

public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
