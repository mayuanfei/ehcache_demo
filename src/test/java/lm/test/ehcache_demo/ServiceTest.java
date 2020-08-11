package lm.test.ehcache_demo;

import com.alibaba.fastjson.JSON;
import lm.test.ehcache_demo.dao.pojo.EmpInfo;
import lm.test.ehcache_demo.service.EmpInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-05 11:23
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    @Resource
    private EmpInfoService empInfoService;

    @Test
    public void testEmp() throws Exception {
    }
}
