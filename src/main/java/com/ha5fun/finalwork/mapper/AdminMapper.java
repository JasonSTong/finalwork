package com.ha5fun.finalwork.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/22 11:20 上午
 */
@Mapper
public interface AdminMapper {
    int adminLogin(@Param("adminName") String adminName,@Param("adminPasswd") String adminPasswd);
}
