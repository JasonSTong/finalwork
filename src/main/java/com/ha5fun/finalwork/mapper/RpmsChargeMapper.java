package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsChargePojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsChargeMapper {
    int deleteByPrimaryKey(Integer chargeId);

    int insert(RpmsChargePojo record);

    int insertSelective(RpmsChargePojo record);

    RpmsChargePojo selectByPrimaryKey(Integer chargeId);

    int updateByPrimaryKeySelective(RpmsChargePojo record);

    int updateByPrimaryKey(RpmsChargePojo record);
}