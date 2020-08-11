package lm.test.ehcache_demo.util.impl;

import lm.test.ehcache_demo.util.EhcacheUtil;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.cache.ehcache.EhCacheCacheManager;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-10 11:46
 **/
public abstract class BaseEhcacheUtilImpl implements EhcacheUtil {

    @Resource
    protected EhCacheCacheManager cacheManager;

    /***************************
     * 如下2个方法用于缓存到磁盘
     **************************/
    @PostConstruct
    private void init() {
        // 关闭tomcat时增加删除回调的钩子
        System.setProperty(net.sf.ehcache.CacheManager.ENABLE_SHUTDOWN_HOOK_PROPERTY,"true");
    }

    @PreDestroy
    private void destroy() {
        // 关闭tomcat时，执行相应的关闭
        CacheManager.getInstance().shutdown();
    }

    /*****************
     * 子类需要实现的方法
     ****************/
    protected abstract String getCacheName();


    /**
     * @Description: 通过cache的名称获得对应的Ehcache的对应cache对象
     * @param: cacheName
     * @return: net.sf.ehcache.Cache
     * @author: 老马
     * @Date: 2020/8/10 11:32
     */
    @Override
    public Cache getCache() {
        return this.cacheManager.getCacheManager().getCache(this.getCacheName());
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
        return element == null ? null : element.getObjectValue();
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
    }

    /**
     * @param key
     * @param value
     * @param expire
     * @Description: 设置缓存值并且设置过期时间
     * @param: key
     * @param: value
     * @param: expire : 过期时间;秒为单位
     * @return: void
     * @author: 老马
     * @Date: 2020/8/10 11:41
     */
    @Override
    public void put(Object key, Object value, int expire) {
        Element element = new Element(key, value);
        element.setTimeToLive(expire);
        this.getCache().put(element);

    }

    /**
     * @param key
     * @Description: 移除某个key值
     * @param: key
     * @return: void
     * @author: 老马
     * @Date: 2020/8/10 11:44
     */
    @Override
    public void remove(String key) {
        this.getCache().remove(key);
    }

    /**
     * @Description: 移除本cache下的所有key
     * @param:
     * @return: void
     * @author: 老马
     * @Date: 2020/8/10 11:44
     */
    @Override
    public void removeAll() {
        this.getCache().removeAll();
    }


}
