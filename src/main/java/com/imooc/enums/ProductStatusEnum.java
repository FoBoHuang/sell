package com.imooc.enums;

import lombok.Getter;
import org.aspectj.apache.bcel.classfile.Code;

/**
 * 商品状态
 *
 * @author Huangfobo
 * @create 2018-07-23 16:51
 **/
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private  String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
