package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsOwnerRoomPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RpmsOwnerRoomMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsOwnerRoomPojo record);

    int insertSelective(RpmsOwnerRoomPojo record);

    RpmsOwnerRoomPojo selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsOwnerRoomPojo record);

    int updateByPrimaryKey(RpmsOwnerRoomPojo record);
}