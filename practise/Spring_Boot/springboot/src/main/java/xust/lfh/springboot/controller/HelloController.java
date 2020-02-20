package xust.lfh.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LFH on 2020/2/16
 */
@RestController
public class HelloController {


    @Value("${person.name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){

        return "hello"+ name;
    }
}
