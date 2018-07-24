package com.imooc.utils;

import java.util.Random;

/**
 * 生成唯一主键的工具类
 *
 * @author Huangfobo
 * @create 2018-07-24 20:28
 **/

public class KeyUtil {

    /*
     * @功能描述 生成唯一的主键
     *  格式：时间 + 随机数
     * @author Huang
     * @date 2018/7/24 20:28
     * @param
     * @return
     */
    public static synchronized String getUniqueKey(){

        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
