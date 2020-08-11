package lm.test.ehcache_demo.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: szwfj-weixin-work
 * @description:
 * @author: 老马
 * @create: 2018-07-10 14:16
 **/
@Data
@AllArgsConstructor
public class CommonException extends Exception {

    private int code ;
    private String message;
}
