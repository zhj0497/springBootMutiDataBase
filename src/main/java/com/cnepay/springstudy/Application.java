package com.cnepay.springstudy;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.cnepay.springstudy.mapper")
public class Application {
    static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        logger.info("=========================");
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        String port = context.getEnvironment().getProperty("server.port");
        logger.info("the project address : http://localhost:" + port);
    }
}
