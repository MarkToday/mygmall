package com.pavilionvip.mygmall.launcher;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.pavilionvip.mygmall.data")
@SpringBootApplication(scanBasePackages = {"com.pavilionvip.mygmall"}, exclude = {RedisAutoConfiguration.class, RedisReactiveAutoConfiguration.class})
@EnableTransactionManagement
public class MygmallLauncherApplication {

    private static final Logger logger = LoggerFactory.getLogger(MygmallLauncherApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MygmallLauncherApplication.class, args);
        logger.info("[系统初始化完毕]");
    }

}
