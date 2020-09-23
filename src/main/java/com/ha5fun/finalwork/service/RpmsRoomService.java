package com.ha5fun.finalwork.service;

import com.ha5fun.finalwork.pojo.RpmsRoomPojo;

import java.util.List;

public interface RpmsRoomService {

    /**
     * 通过id删除房间
     * @param roomId
     * @return 0：成功  1：失败
     */
    int deleteRoom(int roomId);

    /**
     * 修改room
     * @param rpmsRoom
     * @return 1:成功 0：失败
     */
    int updateRoom(RpmsRoomPojo rpmsRoom);

    /**
     * 增加room
     * @param rpmsRoom
     * @return 1:成功 0:失败
     */
    int addRoom(RpmsRoomPojo rpmsRoom);

    /**
     * 查所有房间
     * @return 返回List<RpmsRoom>类型的集合
     */
    List<RpmsRoomPojo> selectRoom();
}
