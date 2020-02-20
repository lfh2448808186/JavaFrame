package xust.lfh.controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by LFH on 2020/2/16
 */
@Controller
public class HelloSpringboot {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello,Spring Boot";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>您好<h1>");
        map.put("user", Arrays.asList("zhangsan,lisi,wangmazi"));
        return "success";
    }

}
