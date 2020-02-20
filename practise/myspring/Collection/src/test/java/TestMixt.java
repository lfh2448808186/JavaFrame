import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Mix;

public class TestMixt {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Mix mix = applicationContext.getBean("mix", Mix.class);
        System.out.println(mix);
    }
}
