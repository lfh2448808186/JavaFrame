package xust.lfh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xust.lfh.component.MyLocaleResolver;
import xust.lfh.component.LoginHandlerInterceptor;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/3/6  下午2:28
 */
//自己配置springmvc的作用
@Configuration
public class MyMvcConfigure implements WebMvcConfigurer {


    //自定义配置解析器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("index.html").setViewName("login");
        registry.addViewController("main.html").setViewName("dashboard");
    }

    //添加springMvc中的资源路径对应位置
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");

    }

    //配置拦截器进行访问控制注意对静态资源的访问权限要放开
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/","/index.html","/user/login","/asserts/**","/webjars/**","login.html");
    }

    //获取国际化的信息
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
