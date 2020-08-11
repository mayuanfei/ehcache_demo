package lm.test.ehcache_demo.listener;

import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheEventListenerFactory;

import java.util.Properties;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-10 13:46
 **/
public class MyCacheEventListenerFactory extends CacheEventListenerFactory {
    @Override
    public CacheEventListener createCacheEventListener(Properties properties) {
        return new CacheEventLogger();
    }
}
