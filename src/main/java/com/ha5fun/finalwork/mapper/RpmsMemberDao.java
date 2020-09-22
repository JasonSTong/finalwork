package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsMember;

public interface RpmsMemberDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsMember record);

    int insertSelective(RpmsMember record);

    RpmsMember selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsMember record);

    int updateByPrimaryKey(RpmsMember record);
}