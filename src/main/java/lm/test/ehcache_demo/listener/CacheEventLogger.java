package lm.test.ehcache_demo.listener;

import lombok.extern.slf4j.Slf4j;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListenerAdapter;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-06 16:12
 **/
@Slf4j
public class CacheEventLogger extends CacheEventListenerAdapter {

    @Override
    public void notifyElementPut(Ehcache cache, Element element) throws CacheException {
        log.info("{}添加缓存值:{}={}",cache.getName(), element.getObjectKey(), element.getObjectValue());
    }

    @Override
    public void notifyElementUpdated(Ehcache cache, Element element) throws CacheException {
        log.info("{}更新缓存值:{}={}",cache.getName(), element.getObjectKey(), element.getObjectValue());
    }

    @Override
    public void notifyElementExpired(Ehcache cache, Element element) {
        log.info("{}缓存值过期:{}={}",cache.getName(), element.getObjectKey(), element.getObjectValue());
    }

    @Override
    public void notifyElementEvicted(Ehcache cache, Element element) {
        log.info("{}删除缓存值:{}={}",cache.getName(), element.getObjectKey(), element.getObjectValue());
    }
}
