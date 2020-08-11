package lm.test.ehcache_demo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @program: szwfj-weixin-work
 * @description:
 * @author: 老马
 * @create: 2018-07-11 10:21
 **/
@SuppressWarnings("all")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse implements Serializable {

    //返回的code
    protected Integer code;
    //返回的信息
    protected String msg;
    //扩展的其他信息.最终都会变成json格式
    protected Object data;

    public static CommonResponse buildSuccessCommonResponse() {
        return new CommonResponse(Constants.COMMON_RESPONSE_CODE_SUCCESS, "成功", null);
    }

    public static CommonResponse buildFailCommonResponse(String errorMsg) {
        return new CommonResponse(Constants.COMMON_RESPONSE_CODE_ERROR, errorMsg, null);
    }

    public static CommonResponse buildSuccessCommonResponseWithData(Object data) {
        return new CommonResponse(Constants.COMMON_RESPONSE_CODE_SUCCESS, "成功", data);
    }

    public static CommonResponse buildFailCommonResponseWithData(String errorMsg, Object data) {
        return new CommonResponse(Constants.COMMON_RESPONSE_CODE_ERROR, errorMsg, data);
    }
}
