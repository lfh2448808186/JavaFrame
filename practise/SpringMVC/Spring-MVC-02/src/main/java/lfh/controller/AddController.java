package lfh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LFH on 2020/2/15
 */
@Controller //添加Controller组件使其成为一个Spring的控制器
public class AddController {

    @RequestMapping(value = "/hello}")// 对于请求的地址的一个规定
    public String hello( int a,int b, Model model){

        int res = a + b;
        model.addAttribute("msg","结果是"+res);
        return   "hello";
    }
}
