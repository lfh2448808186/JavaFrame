package pojo;

public class Teacher {

    private int tid;
    private String name;

    public void setTid(int tid) {
        this.tid = tid;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
