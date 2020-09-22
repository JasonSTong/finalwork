package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsOwnerPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsOwnerMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsOwnerPojo record);

    int insertSelective(RpmsOwnerPojo record);

    RpmsOwnerPojo selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsOwnerPojo record);

    int updateByPrimaryKey(RpmsOwnerPojo record);
}