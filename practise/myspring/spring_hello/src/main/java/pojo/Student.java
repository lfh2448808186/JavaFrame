package pojo;

public class Student {
    public Student() {
        System.out.println("Student对象创建了");
    }


    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Student(String msg) {
        this.msg = msg;
    }

    public void study(){
        System.out.println("学生正在学习"+msg);
    }
}
