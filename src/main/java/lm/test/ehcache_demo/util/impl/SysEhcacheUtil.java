package lm.test.ehcache_demo.util.impl;

import net.sf.ehcache.Element;
import org.springframework.stereotype.Component;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-10 13:52
 **/
@Component
public class SysEhcacheUtil extends BaseEhcacheUtilImpl {
    /*****************
     * 子类需要实现的方法
     ****************/
    @Override
    protected String getCacheName() {
        return "syscache";
    }

    /**
     * @param key
     * @param value
     * @Description: 设置缓存值.过期时间取决于xml中配置的过期时间timeToIdleSeconds或者timeToLiveSeconds
     * @param: key
     * @param: value
     * @return: void
     * @author: 老马
     * @Date: 2020/8/10 11:39
     */
    @Override
    public void put(String key, Object value) {
        Element element = new Element(key, value);
        this.getCache().put(element);
        this.getCache().flush();
    }

    /**
     * @param key
     * @Description: 获取缓存值
     * @param: key
     * @return: java.lang.Object
     * @author: 老马
     * @Date: 2020/8/10 11:38
     */
    @Override
    public Object get(String key) {
        Element element = this.getCache().get(key);
        this.getCache().flush();
        return element == null ? null : element.getObjectValue();
    }
}
