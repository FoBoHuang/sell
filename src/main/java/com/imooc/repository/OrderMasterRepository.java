package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单主表Dao层
 *
 * @author Huangfobo
 * @create 2018-07-24 19:26
 **/

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    /*/*
     * @功能描述 根据买家微信openid进行分页查询
     *
     * @author Huang
     * @date 2018/7/25 10:26
     * @param [buyerOpenid, pageable]
     * @return org.springframework.data.domain.Page<com.imooc.dataobject.OrderMaster>
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
