package com.lrh.crm.service;

import com.lrh.crm.bean.Employee;
import com.lrh.crm.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



/**
 * @author lrhya
 * @version 1.0
 * @date 2019/11/13 10:41
 */


@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAll() {
        return employeeMapper.selectByExampleWithDept(null);
    }
}


