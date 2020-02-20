package xust.lfh.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import xust.lfh.springboot.bean.Person;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Autowired
    ApplicationContext ioc;

    @Test
    void helloService(){
        boolean helloService = ioc.containsBean("helloService");
        System.out.println(helloService);
    }
}
