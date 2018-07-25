package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态的枚举类型
 *
 * @author Huangfobo
 * @create 2018-07-24 20:10
 **/
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIT(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存不正确"),
    ORDER_NOT_EXIT(12,"订单不存在"),
    ORDERDETAIL_NOT_EXIT(13,"订单详情不存在")
    ;

    private Integer code;

    private  String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
