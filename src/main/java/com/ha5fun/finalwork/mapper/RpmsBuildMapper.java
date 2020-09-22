package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsBuildPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RpmsBuildMapper {

    List<RpmsBuildPojo> selAllBuildings();

    int deleteByPrimaryKey(Integer buildId);

    int insert(RpmsBuildPojo record);

    int insertSelective(RpmsBuildPojo record);

    RpmsBuildPojo selectByPrimaryKey(Integer buildId);

    int updateByPrimaryKeySelective(RpmsBuildPojo record);

    int updateByPrimaryKey(RpmsBuildPojo record);
}