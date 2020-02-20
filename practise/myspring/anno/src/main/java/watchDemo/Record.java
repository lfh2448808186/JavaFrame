package watchDemo;

import java.util.Date;

public class Record {
    private String className;
    private String methodName;
    private Date recordTime;
    private Long expendTime;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Long getExpendTime() {
        return expendTime;
    }

    public void setExpendTime(Long expendTime) {
        this.expendTime = expendTime;
    }


    @Override
    public String toString() {
        return "Record{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", recordTime=" + recordTime +
                ", expendTime=" + expendTime +
                '}';
    }
}
