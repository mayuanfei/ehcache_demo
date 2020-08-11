package lm.test.ehcache_demo.web.handler;


import lm.test.ehcache_demo.common.CommonException;
import lm.test.ehcache_demo.common.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * package: cn.net.wangfujing.partner.web.handler
 * describe: 处理各种异常的页面
 * creat_user: 老马
 * creat_date: 2017/12/15
 * creat_time: 9:27
 * copyright (C) 2016-2036 北京数字王府井科技有限公司.
 **/
@SuppressWarnings("all")
@RestControllerAdvice
@Slf4j
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public CommonResponse commonExceptionHandler(CommonException e) {
        log.error("全局异常捕获CommonException：{}", e.getMessage());
        return CommonResponse.buildFailCommonResponse(e.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public CommonResponse exceptionHandler(Exception e) {
        log.error("全局异常捕获Exception：{}",e.getMessage());
        return CommonResponse.buildFailCommonResponse("系统异常,请联系开发。");
    }

}
