import lfh.School;
import lfh.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        School sch = applicationContext.getBean("sch", School.class);
        System.out.println(sch);
        AbstractApplicationContext ac = (AbstractApplicationContext) applicationContext;
        ac.registerShutdownHook();
        Student stu = sch.getStu();
        System.out.println(stu);

    }
}
