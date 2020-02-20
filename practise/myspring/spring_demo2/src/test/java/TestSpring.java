import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = applicationContext.getBean("student",Student.class);
        System.out.println(student);
        student.toString();
    }
}
