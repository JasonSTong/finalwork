package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsRolePowerPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsRolePowerMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsRolePowerPojo record);

    int insertSelective(RpmsRolePowerPojo record);

    RpmsRolePowerPojo selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsRolePowerPojo record);

    int updateByPrimaryKey(RpmsRolePowerPojo record);
}