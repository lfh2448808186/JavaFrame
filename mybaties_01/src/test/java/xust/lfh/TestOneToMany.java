package xust.lfh;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import xust.lfh.pojo.StuClass;
import xust.lfh.pojo.StuInfo;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/2/22  下午5:36
 */

public class TestOneToMany {
    public static void main(String[] args) {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(in);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            StuClass stuClass =
                    sqlSession.selectOne("xust.lfh.pojo.StuClass.findStuClassByCid", 1);
            System.out.println("班级ID:"+stuClass.getCid()+"\n班级名:"+stuClass.getCname()+"\n总人数:"+stuClass.getSum());
            for (StuInfo stu: stuClass.getStuInfoList()) {
                System.out.println(stu.toString());
            }
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
