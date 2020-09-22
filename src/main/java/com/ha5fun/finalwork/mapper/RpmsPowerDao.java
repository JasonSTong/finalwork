package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsPower;

public interface RpmsPowerDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsPower record);

    int insertSelective(RpmsPower record);

    RpmsPower selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsPower record);

    int updateByPrimaryKey(RpmsPower record);
}