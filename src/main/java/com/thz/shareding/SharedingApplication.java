package com.thz.shareding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan(basePackages = "com.thz.shareding.dao")
public class SharedingApplication {


    public static void main(String[] args) {
        SpringApplication.run(SharedingApplication.class, args);
    }

}
