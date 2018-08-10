package com.imooc.form;

import lombok.Data;

/**
 * 类目表单
 *
 * @author Huangfobo
 * @create 2018-08-10 21:11
 **/
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
