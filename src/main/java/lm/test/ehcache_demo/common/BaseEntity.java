package lm.test.ehcache_demo.common;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * package: cn.net.wangfujing.springbootmybatistest.dao.pojo
 * describe: TODO
 * creat_user: 老马
 * creat_date: 2017/11/29
 * creat_time: 9:58
 * copyright (C) 2016-2036 北京数字王府井科技有限公司.
 **/
public abstract class BaseEntity implements Serializable {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
