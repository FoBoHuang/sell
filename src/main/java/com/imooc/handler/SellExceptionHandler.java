package com.imooc.handler;

import com.imooc.config.ProjecturlConfig;
import com.imooc.exception.SellerAuthorizeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Huangfobo
 * @create 2018-08-13 0:28
 **/
@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjecturlConfig projecturlConfig;

    //拦截登录异常
    /*http://127.0.0.1:8080/wechat/qrAuthorize?returnUrl=http://sell.natapp4.cc/sell/seller/login*/
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
                .concat(projecturlConfig.getWechatOpenAuthorize())
                .concat("/wechat/qrAuthorize")
                .concat("?returnUrl=")
                .concat(projecturlConfig.getSell())
                .concat("/seller/login"));
    }
}
