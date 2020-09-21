package com.ha5fun.finalwork.service.impl;

import com.ha5fun.finalwork.mapper.RpmsBuildMapper;
import com.ha5fun.finalwork.pojo.RpmsBuildPojo;
import com.ha5fun.finalwork.service.RpmsBuildService;
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
        return rpmsBuildMapper.selAllBuild();
    }
}
