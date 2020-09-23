package com.ha5fun.finalwork.service;

import com.ha5fun.finalwork.pojo.RpmsOwnerPojo;

import java.util.List;

public interface RpmsOwnerService {
    /**
     * 查询所有业主
     * @return list<RpmsOwner>类型的集合
     */
    List<RpmsOwnerPojo> selectAllOwner();

    /**
     * 修改业主信息
     * @param rpmsOwner
     * @return 0：失败 1：成功
     */
    int updateOwner(RpmsOwnerPojo rpmsOwner);

    /**
     * 删除业主信息
     * @param ownerId
     * @return 0；成功 1：失败
     */
    int deleteOwner(int ownerId);

    /**
     * 增加业主
     * @param rpmsOwner
     * @return 0:失败 1：成功
     */
    int addOwner(RpmsOwnerPojo rpmsOwner);
}
