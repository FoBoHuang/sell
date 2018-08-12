package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * 卖家信息端
 *
 * @author Huangfobo
 * @create 2018-08-11 23:11
 **/

public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
