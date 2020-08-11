package lm.test.ehcache_demo.service;

import lm.test.ehcache_demo.dao.pojo.EmpInfo;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-05 11:38
 **/
public interface EmpInfoService {

    /**
    * @Description: 获得用户信息
    * @param: userid
    * @return: lm.test.ehcache_demo.dao.pojo.EmpInfo
    * @author: 老马
    * @Date: 2020/8/5 11:39
    */
    EmpInfo getEmpInfoByUserId(String userid);

    /**
    * @Description: 只能查询5次的接口
    * @param: userid
    * @return: lm.test.ehcache_demo.dao.pojo.EmpInfo
    * @author: 老马
    * @Date: 2020/8/6 11:36
    */
    EmpInfo getEmpInfoByUserIdCount5(String userid) throws Exception;
}
