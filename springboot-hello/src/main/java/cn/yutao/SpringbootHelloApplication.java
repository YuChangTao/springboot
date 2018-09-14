package cn.yutao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

/**
 * 组合注解
 * @SpringBootConfiguration ——> @Configuration
 * @EnableAutoConfiguration 开启自动配置
 * @ComponentScan 默认扫描@SpringBootApplication所在类的同级目录和它的子目录
 */

@SpringBootApplication(exclude = {RedisAutoConfiguration.class})//排除指定的自动配置类
public class SpringbootHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloApplication.class, args);
    }
}
