package lfh;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("sch")
@Scope(scopeName = "singleton")
public class School {

    @Value("005")
    private int sid;
    @Qualifier("stu")
    private Student stu;

    @Override
    public String toString() {
        return "School{" +
                "sid=" + sid +
                ", stu=" + stu +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean 的初始化完成调用init()方法");
    }
    @PreDestroy
    public void destory(){
        System.out.println("调用bean的销毁方法");
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }
}
