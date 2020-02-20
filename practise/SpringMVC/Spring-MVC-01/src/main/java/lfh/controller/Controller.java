package lfh.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LFH on 2020/2/14
 */


//对于这一个控制器在Spring IOC中注册的名字，直接在地址栏中输入，便可以得到在setViewName（‘文件名’）的页面
public class Controller implements org.springframework.web.servlet.mvc.Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        //封装对象，放在ModelAndView中。Model
        mv.addObject("msg","HelloSpringMVC!");
        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("page01"); //: /WEB-INF/jsp/hello.jsp

        return mv;
    }
}
