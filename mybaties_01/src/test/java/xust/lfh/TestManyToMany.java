package xust.lfh;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import xust.lfh.pojo.ClassInfo;
import xust.lfh.pojo.TeachInfo;

import java.io.IOException;
import java.io.InputStream;

import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/2/22  下午9:13
 */
public class TestManyToMany {
    public static void main(String[] args) {

        try {
            InputStream in =
                    Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
            SqlSession sqlSession = factory.openSession();
            List<ClassInfo> list = sqlSession.selectList("xust.lfh.pojo.ClassInfo.findClassInfoByCid",1);
            for (ClassInfo classInfo : list) {
                System.out.println("班级:"+classInfo.getCid()+"\t班级名"+classInfo.getCname()+"\t总人数:"+classInfo.getSum());
                List<TeachInfo> teachInfoList = classInfo.getTeachInfoList();
                for (TeachInfo teachInfo : teachInfoList) {
                    System.out.println(teachInfo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
