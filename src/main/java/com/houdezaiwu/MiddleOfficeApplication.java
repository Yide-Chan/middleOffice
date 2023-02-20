package com.houdezaiwu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiddleOfficeApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiddleOfficeApplication.class, args);
        // 启动定时任务调度器
//        QuartzScheduler.getInstance().start();
    }
}