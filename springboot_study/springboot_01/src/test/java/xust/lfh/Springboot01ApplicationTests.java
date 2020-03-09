package xust.lfh;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import xust.lfh.pojo.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot01ApplicationTests {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
