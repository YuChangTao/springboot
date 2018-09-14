package com.yutao.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//开启定时任务配置
@EnableAsync//开启异步调用
public class SpringbootJspApplication {

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(SpringbootJspApplication.class);
        //禁用命令行设置属性
        sa.setAddCommandLineProperties(false);
        //禁用devTools热部署
        System.setProperty("spring.devtools.restart.enabled","false");
        sa.run(args);
    }
}
