package com.cjn.boot.config;

import com.cjn.boot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sky
 * @date 2020/6/4 0004 23:14
 * @Configuration 指明当前类是一个配置类，就是来替代之前的Spring配置文件
 */
@Configuration
public class MyConfig {


    /**
     * 将方法的返回值添加到容器中，容器中的组件默认ID就是方法名
     */
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

}
