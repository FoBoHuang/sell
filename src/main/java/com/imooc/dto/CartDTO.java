package com.imooc.dto;

import lombok.Data;

/**
 * 购物车数据传输对象
 *
 * @author Huangfobo
 * @create 2018-07-24 21:09
 **/
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
