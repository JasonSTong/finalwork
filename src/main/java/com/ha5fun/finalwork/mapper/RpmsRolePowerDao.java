package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsRolePower;

public interface RpmsRolePowerDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsRolePower record);

    int insertSelective(RpmsRolePower record);

    RpmsRolePower selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsRolePower record);

    int updateByPrimaryKey(RpmsRolePower record);
}