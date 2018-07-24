package com.imooc.enums;

import lombok.Getter;

/**
 * 订单状态的枚举类型
 *
 * @author Huangfobo
 * @create 2018-07-24 19:11
 **/
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private  String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
