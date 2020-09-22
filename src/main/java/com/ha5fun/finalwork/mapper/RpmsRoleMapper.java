package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsRolePojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsRoleMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsRolePojo record);

    int insertSelective(RpmsRolePojo record);

    RpmsRolePojo selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsRolePojo record);

    int updateByPrimaryKey(RpmsRolePojo record);
}