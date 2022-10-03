package com.luckey.bicolorsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication(scanBasePackages = "com.luckey.bicolorsphere")
@MapperScan(value = {"com.luckey.bicolorsphere.mapper"})
public class BicolorSphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(BicolorSphereApplication.class, args);
    }

}
