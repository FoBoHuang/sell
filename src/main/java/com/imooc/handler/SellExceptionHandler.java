package com.imooc.handler;

import com.imooc.VO.ResultVO;
import com.imooc.config.ProjecturlConfig;
import com.imooc.exception.SellException;
import com.imooc.exception.SellerAuthorizeException;
import com.imooc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
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
    /*http://127.0.0.1:8080/wechat/qrAuthorize?returnUrl=http://127.0.0.1:8080/seller/login*/
    /*统一处理了SellerAuthorizeException这一类的异常*/
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
                .concat(projecturlConfig.getWechatOpenAuthorize())
                .concat("/wechat/qrAuthorize")
                .concat("?returnUrl=")
                .concat(projecturlConfig.getSell())
                .concat("/seller/login"));
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e){

        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }
}
