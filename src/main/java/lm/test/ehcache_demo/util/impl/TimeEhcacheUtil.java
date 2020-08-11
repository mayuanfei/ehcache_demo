package lm.test.ehcache_demo.util.impl;

import org.springframework.stereotype.Component;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-10 13:50
 **/
@Component
public class TimeEhcacheUtil extends BaseEhcacheUtilImpl {
    /*****************
     * 子类需要实现的方法
     ****************/
    @Override
    protected String getCacheName() {
        return "timecache";
    }
}
