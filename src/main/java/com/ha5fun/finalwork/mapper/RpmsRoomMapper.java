package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsRoomPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsRoomMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsRoomPojo record);

    int insertSelective(RpmsRoomPojo record);

    RpmsRoomPojo selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsRoomPojo record);

    int updateByPrimaryKey(RpmsRoomPojo record);
}