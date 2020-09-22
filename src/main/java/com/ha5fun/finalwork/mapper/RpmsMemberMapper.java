package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsMemberPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsMemberMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsMemberPojo record);

    int insertSelective(RpmsMemberPojo record);

    RpmsMemberPojo selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsMemberPojo record);

    int updateByPrimaryKey(RpmsMemberPojo record);
}