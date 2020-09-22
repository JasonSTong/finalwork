package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsBuild;

public interface RpmsBuildDao {
    int deleteByPrimaryKey(Integer buildId);

    int insert(RpmsBuild record);

    int insertSelective(RpmsBuild record);

    RpmsBuild selectByPrimaryKey(Integer buildId);

    int updateByPrimaryKeySelective(RpmsBuild record);

    int updateByPrimaryKey(RpmsBuild record);
}