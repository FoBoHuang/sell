package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品类目Dao层
 *
 * @author Huangfobo
 * @create 2018-07-23 15:30
 **/

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    /*/*
     * @功能描述
     *
     * @author Huang
     * @date 2018/7/23 15:25
     * @param [categoryTypeList]
     * @return java.util.List<com.imooc.dataobject.ProductCategory>
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
