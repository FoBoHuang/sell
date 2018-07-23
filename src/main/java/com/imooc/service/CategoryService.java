package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * 商品类目Service层
 *
 * @author Huangfobo
 * @create 2018-07-23 15:30
 **/

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    /*/*
     * @功能描述 买家端用到的查询方法——根据商品类目编号进行查询
     *
     * @author Huang
     * @date 2018/7/23 15:34
     * @param [categoryTypeList]
     * @return java.util.List<com.imooc.dataobject.ProductCategory>
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
