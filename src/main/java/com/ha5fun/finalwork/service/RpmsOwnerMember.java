package com.ha5fun.finalwork.service;

import com.ha5fun.finalwork.pojo.RpmsMemberPojo;

import java.util.List;

public interface RpmsOwnerMember {

    /**
     * 删除业主成员
     * @param memberId
     * @return 0:失败 1:成功
     */
    int deleteOwnerMember(int memberId);

    /**
     * 修改业主成员
     * @param rpmsMember
     * @return 0：失败 1：成功
     */
    int updateOwnerMember(RpmsMemberPojo rpmsMember);

    /**
     * 增加业主成员
     * @param rpmsMember
     * @return 0：失败 1：成功
     */
    int addOwnerMember(RpmsMemberPojo rpmsMember);

    /**
     * 查询所有业主成员
     * @return 返回List<RpmsMemberPojo> 类型的集合
     */
    List<RpmsMemberPojo> selectOwnerMember();
}
