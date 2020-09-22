package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsType;

public interface RpmsTypeDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsType record);

    int insertSelective(RpmsType record);

    RpmsType selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsType record);

    int updateByPrimaryKey(RpmsType record);
}