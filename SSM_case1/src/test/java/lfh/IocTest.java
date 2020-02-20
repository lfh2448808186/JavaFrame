package lfh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import xust.lfh.dao.DepartmentMapper;
import xust.lfh.dao.EmployeeMapper;
import xust.lfh.pojo.Department;
import xust.lfh.pojo.Employee;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/2/18  20:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class IocTest {

    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    public void test1(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Employee employee = ioc.getBean("employee", Employee.class);
//        System.out.println(employee);
        System.out.println(departmentMapper);

        System.out.println(departmentMapper.selectByPrimaryKey(1));
        System.out.println(employeeMapper.selectAll());
    }
}
