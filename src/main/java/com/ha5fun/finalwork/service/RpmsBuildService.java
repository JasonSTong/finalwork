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
     *
     */
    List<RpmsBuildPojo> findAllBuilds() ;
}
