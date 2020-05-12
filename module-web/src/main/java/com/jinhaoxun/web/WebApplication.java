package com.jinhaoxun.web;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@EnableAsync
@ComponentScan(basePackages = {"com.jinhaoxun.common", "com.jinhaoxun.thirdparty", "com.jinhaoxun.web", "com.jinhaoxun.service", "com.jinhaoxun.dao"})
@MapperScan({"com.jinhaoxun.dao.mapper"})
@EnableScheduling
@ServletComponentScan
@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) {
        log.info("========================迈叽叽歪歪，担猛猛开始！========================");
        SpringApplication.run(WebApplication.class, args);
        log.info("=========================兴死有神秀，无BUG哩！========================");
    }
}