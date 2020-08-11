package lm.test.ehcache_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@MapperScan(basePackages = "lm.test.ehcache_demo.dao.mapper")
@EnableCaching
public class EhcacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhcacheDemoApplication.class, args);
    }

}
