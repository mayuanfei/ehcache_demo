package lm.test.ehcache_demo.service.impl;

import lm.test.ehcache_demo.dao.pojo.EmpInfo;
import lm.test.ehcache_demo.service.EmpInfoService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-05 11:39
 **/
@Service
public class EmpInfoServiceImpl implements EmpInfoService {
//    @Resource
//    private EmpInfoMapper empInfoMapper;

    //使用ehcache哪个缓存配置
    private final String USER_CACHE_NAME  = "timecache";


    /**
     * @param userid
     * @Description: 获得用户信息
     * @param: userid
     * @return: lm.test.ehcache_demo.dao.pojo.EmpInfo
     * @author: 老马
     * @Date: 2020/8/5 11:39
     */
    @Override
    @Cacheable(value = USER_CACHE_NAME, key = "'lm_user_' + #userid")
    public EmpInfo getEmpInfoByUserId(String userid) {
//        return this.empInfoMapper.selectEmpInfoByUserId(userid);
        return null;
    }

    @Override
    public EmpInfo getEmpInfoByUserIdCount5(String userid) throws Exception {
//        String key = DateTime.now().toString("yyyyMMdd") + userid;
//        Cache syscache = this.cacheManager.getCacheManager().getCache("syscache");
//        Element element = syscache.get(key);
//        Integer visitCount = (element == null ? null : (Integer)element.getObjectValue());
////        Integer visitCount = (Integer) ehCacheUtils.get(key);
//        if(visitCount == null) {
//            Element newElement = new Element(key, 1);
//            //newElement.setTimeToLive(10);
//            syscache.put(newElement);
//            visitCount = 1;
//        }else {
//            Element existelement = new Element(key, (visitCount + 1));
//            //existelement.setTimeToLive(10);
//            syscache.put(existelement);
//        }
//        System.out.println(visitCount);
//        if(visitCount>5) {
//            throw new CommonException(Constants.COMMON_RESPONSE_CODE_ERROR, "访问次数超限");
//        }
//        return this.empInfoMapper.selectEmpInfoByUserId(userid);
        return null;
    }
}
