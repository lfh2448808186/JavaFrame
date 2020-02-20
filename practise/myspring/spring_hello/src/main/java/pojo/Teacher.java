package pojo;

public class Teacher {


    public Teacher() {
        System.out.println("Teacher对象创建了");
    }

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void teach(){
        System.out.println("老师讲解"+msg+"知识");
    }
}

