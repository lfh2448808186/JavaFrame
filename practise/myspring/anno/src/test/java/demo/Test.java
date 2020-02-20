package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext_demo.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.insert();


    }
}
