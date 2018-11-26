package com.youdao.analyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.youdao.analyzer")
public class SpringbootProDatatree8087Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProDatatree8087Application.class, args);
    }
}
