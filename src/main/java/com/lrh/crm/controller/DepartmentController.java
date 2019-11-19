package com.lrh.crm.controller;

import com.lrh.crm.bean.Department;
import com.lrh.crm.bean.Msg;
import com.lrh.crm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lrhya
 * @version 1.0
 * @date 2019/11/19 10:25
 */

@Controller
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    /**
     * 返回所有的部门信息
     */
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        //查出的所有部门信息
        List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts", list);
    }

}
