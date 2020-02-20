package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext_xml.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.delete();
    }

}
