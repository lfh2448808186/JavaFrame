import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.School;
import pojo.Student;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        School school = applicationContext.getBean("school", School.class);
        Student stu = school.getStu();
        System.out.println(stu);

    }
}
