package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsCharge;

public interface RpmsChargeDao {
    int deleteByPrimaryKey(Integer chargeId);

    int insert(RpmsCharge record);

    int insertSelective(RpmsCharge record);

    RpmsCharge selectByPrimaryKey(Integer chargeId);

    int updateByPrimaryKeySelective(RpmsCharge record);

    int updateByPrimaryKey(RpmsCharge record);
}