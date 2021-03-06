package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsUserPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsUserMapper {
    int deleteByPrimaryKey(String memberName);

    int insert(RpmsUserPojo record);

    int insertSelective(RpmsUserPojo record);

    RpmsUserPojo selectByPrimaryKey(String memberName);

    int updateByPrimaryKeySelective(RpmsUserPojo record);

    int updateByPrimaryKey(RpmsUserPojo record);
}