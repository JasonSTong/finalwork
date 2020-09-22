package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsPowerPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsPowerMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsPowerPojo record);

    int insertSelective(RpmsPowerPojo record);

    RpmsPowerPojo selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsPowerPojo record);

    int updateByPrimaryKey(RpmsPowerPojo record);
}