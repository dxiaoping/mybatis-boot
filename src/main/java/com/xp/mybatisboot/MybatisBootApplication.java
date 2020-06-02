package com.xp.mybatisboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.xp.mybatisboot.*"})
@MapperScan("com.xp.mybatisboot.mapper")
public class MybatisBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisBootApplication.class, args);
    }

}
