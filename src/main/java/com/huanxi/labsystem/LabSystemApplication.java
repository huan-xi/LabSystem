package com.huanxi.labsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huanxi.labsystem.dao.mapper")
public class LabSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabSystemApplication.class, args);
    }
}
