package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsPay;

public interface RpmsPayDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsPay record);

    int insertSelective(RpmsPay record);

    RpmsPay selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsPay record);

    int updateByPrimaryKey(RpmsPay record);
}