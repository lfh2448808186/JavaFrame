import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import watchDemo.Service;

public class TestRecord {
    public static void main(String[] args) throws Exception {
       ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Service service01 = context.getBean("service", Service.class);
        service01.service();
    }
}
