package com.ha5fun.finalwork.service.impl;

import com.ha5fun.finalwork.mapper.AdminMapper;
import com.ha5fun.finalwork.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/22 11:24 上午
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Boolean adminLogin(String adminName, String adminPasswd) {
        return adminMapper.adminLogin(adminName,adminPasswd) >= 0;
    }
}
