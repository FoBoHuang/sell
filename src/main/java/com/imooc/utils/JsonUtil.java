package com.imooc.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Json格式化工具
 *
 * @author Huangfobo
 * @create 2018-07-30 11:58
 **/

public class JsonUtil {

    public static String toJson(Object object){

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
