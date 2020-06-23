package com.cjn.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.cjn.boot.mapper")
@SpringBootApplication
public class Boot06DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot06DataMybatisApplication.class, args);
    }

}
