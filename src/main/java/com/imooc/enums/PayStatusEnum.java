package com.imooc.enums;

import lombok.Getter;

/**
 * 支付状态的枚举类型
 *
 * @author Huangfobo
 * @create 2018-07-24 19:13
 **/
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private  String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
