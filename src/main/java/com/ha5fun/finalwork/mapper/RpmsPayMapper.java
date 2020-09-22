package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsPayPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsPayMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsPayPojo record);

    int insertSelective(RpmsPayPojo record);

    RpmsPayPojo selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsPayPojo record);

    int updateByPrimaryKey(RpmsPayPojo record);
}