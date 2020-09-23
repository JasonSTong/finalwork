package com.ha5fun.finalwork.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/22 11:24 上午
 */
public interface AdminService {
    /**
     * 管理员登录
     * @param adminName
     * @param adminPasswd
     * @return
     */
    Boolean adminLogin(String adminName, String adminPasswd);
}
