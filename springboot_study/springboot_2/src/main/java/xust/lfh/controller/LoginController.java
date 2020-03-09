package xust.lfh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Description:  devtools使用
 * @author: LFH
 * @date: 2020/3/6  下午4:38
 */
@Controller
public class LoginController {

    //@RequestMapping(value = "/usr/login", method = RequestMethod.POST)
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            //防止重复提交表单可以使用重定向的方法
            //登录成功保存session
            session.setAttribute("loginUser",username);
            //将main设置成为了login的别名
            return "redirect:/main.html";
        }
        else
            map.put("msg","用户名或密码错误");
            return "login";
    }
}
