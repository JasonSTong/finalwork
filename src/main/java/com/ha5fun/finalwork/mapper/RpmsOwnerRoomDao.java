package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsOwnerRoom;

public interface RpmsOwnerRoomDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsOwnerRoom record);

    int insertSelective(RpmsOwnerRoom record);

    RpmsOwnerRoom selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsOwnerRoom record);

    int updateByPrimaryKey(RpmsOwnerRoom record);
}