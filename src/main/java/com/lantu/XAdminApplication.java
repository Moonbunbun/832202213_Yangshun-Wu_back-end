package com.lantu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lantu.*.mapper")

public class XAdminApplication {

    public static void main(String[] args) {

        SpringApplication.run(XAdminApplication.class, args);
    }

}
