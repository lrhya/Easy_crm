package com.lrh.crm.test;

import com.lrh.crm.bean.Department;
import com.lrh.crm.bean.Employee;
import com.lrh.crm.dao.DepartmentMapper;
import com.lrh.crm.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @author lrhya
 * @version 1.0
 * @date 2019/11/13 9:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD() {
        System.out.println(departmentMapper);
        //1、插入几个部门
//	    departmentMapper.insertSelective(new Department(3, "开发部"));
//		departmentMapper.insertSelective(new Department(4, "测试部"));

        //2、生成员工数据，测试员工插入
//        employeeMapper.insertSelective(new Employee(3, "lrhya", 1, "lrhya@163.com", 1));

        //3、批量插入多个员工；批量，使用可以执行批量操作的sqlSession。
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0; i < 1000; i++) {
            String uid = UUID.randomUUID().toString().substring(0, 5) + i;
            mapper.insertSelective(new Employee(null, uid, 0, uid + "@xixi.com", 1));
        }
        System.out.println("批量完成");
    }

}
