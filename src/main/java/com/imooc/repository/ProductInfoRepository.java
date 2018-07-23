package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品Dao层
 *
 * @author Huangfobo
 * @create 2018-07-23 16:43
 **/

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    /*/*
     * @功能描述 根据商品状态查询
     *
     * @author Huang
     * @date 2018/7/23 16:45
     * @param [productStatus]
     * @return java.util.List<com.imooc.dataobject.ProductInfo>
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
