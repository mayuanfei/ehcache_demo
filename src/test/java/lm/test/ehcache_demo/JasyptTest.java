package lm.test.ehcache_demo;/**
 * Created by a on 2020/7/24.
 */

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @program: szwfj-weixin-work
 * @description:
 * @author: 赵明阳
 * @create: 2020-07-24 11:42
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class JasyptTest {
    @Resource
    private StringEncryptor encryptor;

    @Test
    public void testJasypt() {
        String test123 = encryptor.encrypt("123456");
        System.out.println("test123===>" + test123);
        String decrypt = encryptor.decrypt(test123);
        System.out.println("decrypt===>" + decrypt);
    }
}
