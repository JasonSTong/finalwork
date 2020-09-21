package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsBuildPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chen
 * @Company ha5fun.com
 * @Date 2020/9/21 8:31 下午
 */
@Mapper
public interface RpmsBuildMapper {
    List<RpmsBuildPojo> selAllBuild() ;
}
