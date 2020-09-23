package com.ha5fun.finalwork.controller;

import com.ha5fun.finalwork.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/22 11:28 上午
 */
@Controller
@RequestMapping("/admin/")
public class AdminController {
    @Autowired
    private AdminService adminService;


    @RequestMapping(method = RequestMethod.POST ,value = "login")
    @ResponseBody
    public Boolean adminLogin(@Param("adminName")String adminName ,@Param("adminPasswd") String adminPasswd ){
        System.out.println(adminName+adminPasswd);

        return adminService.adminLogin(adminName,adminPasswd);
    }
}
