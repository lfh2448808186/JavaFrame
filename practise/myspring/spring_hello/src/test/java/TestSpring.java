import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;
import pojo.Teacher;

public class TestSpring {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = applicationContext.getBean("student",Student.class);
        student.study();

        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        teacher.teach();
    }
}
