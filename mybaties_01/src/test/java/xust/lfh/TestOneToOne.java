package xust.lfh;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import xust.lfh.pojo.Stu;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/2/22  下午3:49
 */
public class TestOneToOne {
    public static void main(String[] args) throws IOException {

        InputStream in =
                Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new
                SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        Stu stu = sqlSession.selectOne("xust.lfh.pojo.Stu.findStudentBySid", 3);
        System.out.println(stu);
        sqlSession.close();
    }
}
