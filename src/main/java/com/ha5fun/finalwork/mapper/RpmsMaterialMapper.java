package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsMaterialPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsMaterialMapper {
    int deleteByPrimaryKey(Integer materialId);

    int insert(RpmsMaterialPojo record);

    int insertSelective(RpmsMaterialPojo record);

    RpmsMaterialPojo selectByPrimaryKey(Integer materialId);

    int updateByPrimaryKeySelective(RpmsMaterialPojo record);

    int updateByPrimaryKey(RpmsMaterialPojo record);
}