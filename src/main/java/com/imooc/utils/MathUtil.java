package com.imooc.utils;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author Huangfobo
 * @create 2018-08-01 20:24
 **/

public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    public static Boolean equals(Double d1,Double d2){

        Double result = Math.abs(d1 - d2);
        if(result < MONEY_RANGE){
            return  true;
        }
        else{
            return false;
        }
    }
}
