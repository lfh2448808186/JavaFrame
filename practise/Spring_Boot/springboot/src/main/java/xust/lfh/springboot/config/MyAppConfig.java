package xust.lfh.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xust.lfh.springboot.service.HelloService;

/**
 * Created by LFH on 2020/2/16
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器给添加组件了");
        return new HelloService();
    }
}
