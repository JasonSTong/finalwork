package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsTypePojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsTypeMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsTypePojo record);

    int insertSelective(RpmsTypePojo record);

    RpmsTypePojo selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsTypePojo record);

    int updateByPrimaryKey(RpmsTypePojo record);
}