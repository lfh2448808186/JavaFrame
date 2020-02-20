import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xust.lfh.pojo.Person;

/**
 * Created by LFH on 2020/2/16
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplication {


    @Autowired
    Person person;
    @Test
    public void test(){
        System.out.println(person);
    }
}
