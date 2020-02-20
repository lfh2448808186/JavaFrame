import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;
import pojo.Teacher;

public class TestSpring2 {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher);

    }
}
