package xust.lfh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xust.lfh.dao.DepartmentDao;
import xust.lfh.dao.EmployeeDao;
import xust.lfh.entities.Department;
import xust.lfh.entities.Employee;

import javax.websocket.server.PathParam;
import java.util.Collection;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/3/6  下午8:06
 */
@Controller
public class EmployeeController {


    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;


    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "/emp/list";
    }

    //进入员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    //对员工进行添加操作
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //@PathVariable @PathParm 注意使用方法的不同
    //到达修改页面
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        System.out.println(id);
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        System.out.println(employee);
        System.out.println(departments);
        return "emp/update";
    }
    //进行修改内容
    @PostMapping("/empu")
    public String update(Employee employee){
        System.out.println("hhhdddd"+employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id")Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }

}
