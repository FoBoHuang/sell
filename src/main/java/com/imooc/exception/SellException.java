package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * 商品异常类
 *
 * @author Huangfobo
 * @create 2018-07-24 20:09
 **/

public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {

        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
