package com.game.wegame;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "com.game.wegame.service.interf") //以注解的方式扫描接口包下的所有接口实体类
public class WegameApplication {

    public static void main(String[] args) {
        SpringApplication.run(WegameApplication.class, args);
    }

}
