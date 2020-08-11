package lm.test.ehcache_demo.util;

import net.sf.ehcache.Cache;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-07 09:33
 **/
public interface EhcacheUtil {


    /**
    * @Description: 通过cache的名称获得对应的Ehcache的对应cache对象
    * @param: cacheName
    * @return: net.sf.ehcache.Cache
    * @author: 老马
    * @Date: 2020/8/10 11:32
    */
    Cache getCache();

    /**
    * @Description: 获取缓存值
    * @param: key
    * @return: java.lang.Object
    * @author: 老马
    * @Date: 2020/8/10 11:38
    */
    Object get(String key);

    /**
    * @Description: 设置缓存值.过期时间取决于xml中配置的过期时间timeToIdleSeconds或者timeToLiveSeconds
    * @param: key
    * @param: value
    * @return: void
    * @author: 老马
    * @Date: 2020/8/10 11:39
    */
    void put(String key, Object value);

    /**
    * @Description: 设置缓存值并且设置过期时间
    * @param: key
    * @param: value
    * @param: expire : 过期时间;秒为单位
    * @return: void
    * @author: 老马
    * @Date: 2020/8/10 11:41
    */
    void put(Object key, Object value, int expire);

    /**
    * @Description: 移除某个key值
    * @param: key
    * @return: void
    * @author: 老马
    * @Date: 2020/8/10 11:44
    */
    void remove(String key);

    /**
    * @Description: 移除本cache下的所有key
    * @param:
    * @return: void
    * @author: 老马
    * @Date: 2020/8/10 11:44
    */
    void removeAll();
}

