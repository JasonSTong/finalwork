package com.ha5fun.finalwork.service;

import com.ha5fun.finalwork.pojo.RpmsBuildPojo;

import java.util.List;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/21 8:57 下午
 */
public interface RpmsBuildService {
    /**
     * 查询所有的Buildings
     * @return 返回一个List<RpmsBuildPojo>集合
     */
    List<RpmsBuildPojo> findAllBuilds() ;

    /**
     * 通过主键id删除builds
     * @param buildId
     * @return 0 : 成功 1 ：失败
     */
    int deleteBuilds(int buildId);

    /**
     * 修改builds
     * @param rpmsBuild
     * @return 0 ：失败 1：成功
     */
    int updateBuild(RpmsBuildPojo rpmsBuild);

    /**
     * 添加builds
     * @param rpmsBuild
     * @return 0:失败 1：成功
     */
    int addBuilds(RpmsBuildPojo rpmsBuild);

}
