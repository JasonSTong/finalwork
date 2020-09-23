package com.ha5fun.finalwork.service.impl;

import com.ha5fun.finalwork.mapper.RpmsBuildMapper;
import com.ha5fun.finalwork.pojo.RpmsBuildPojo;
import com.ha5fun.finalwork.service.RpmsBuildService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/21 9:00 下午
 */
@Service("RpmsBuildService")
public class RpmsBuildServiceImpl implements RpmsBuildService {
    @Autowired
    private RpmsBuildMapper rpmsBuildMapper;


    @Override
    public List<RpmsBuildPojo> findAllBuilds() {
        return rpmsBuildMapper.selAllBuildings();
    }

    @Override
    public RpmsBuildPojo selById(int id) {
        return rpmsBuildMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteBuilds(int buildId) {
        System.out.println(buildId+"------------------------------");
        return rpmsBuildMapper.deleteByPrimaryKey(buildId);
    }


    @Override
    public int updateBuild(int id ,RpmsBuildPojo rpmsBuild) {
        return 0;
    }

    @Override
    public int addBuilds(RpmsBuildPojo rpmsBuild) {
        return 0;
    }

    @Override
    public int reDelBuild(int buildId) {
        return rpmsBuildMapper.reDelBuild(buildId);
    }


}
