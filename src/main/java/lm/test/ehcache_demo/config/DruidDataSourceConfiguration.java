package lm.test.ehcache_demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * package: cn.net.wangfujing.springboottest.config
 * describe: TODO
 * creat_user: 老马
 * creat_date: 2017/11/27
 * creat_time: 9:51
 * copyright (C) 2016-2036 北京数字王府井科技有限公司.
 **/
@Configuration
public class DruidDataSourceConfiguration {
    @ConditionalOnClass(DruidDataSource.class)
    @ConditionalOnProperty(name = "spring.datasource.type", havingValue = "com.alibaba.druid.pool.DruidDataSource", matchIfMissing = true)
    static class Druid extends DruidDataSourceConfiguration {
        @Bean
        @ConfigurationProperties("spring.datasource.druid")
        public DruidDataSource dataSource(DataSourceProperties properties) {
            DruidDataSource druidDataSource = (DruidDataSource) properties.initializeDataSourceBuilder().type(DruidDataSource.class).build();
            DatabaseDriver databaseDriver = DatabaseDriver.fromJdbcUrl(properties.determineUrl());
            String validationQuery = databaseDriver.getValidationQuery();
            if (validationQuery != null) {
                druidDataSource.setValidationQuery(validationQuery);
            }
            return druidDataSource;
        }
    }
}
