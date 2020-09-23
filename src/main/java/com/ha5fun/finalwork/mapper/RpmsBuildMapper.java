package com.ha5fun.finalwork.mapper;

import com.ha5fun.finalwork.pojo.RpmsBuildPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RpmsBuildMapper {
    /**
     * 查询所有的Building
     * @return 返回RpmsBuildPojo的集合
     */
    List<RpmsBuildPojo> selAllBuildings();

    /**
     * 根据Id删除楼层
     * @param buildId
     * @return 返回删除状态吗
     */
    int deleteByPrimaryKey(int buildId , RpmsBuildPojo rpmsBuildPojo);

    /**
     * 新增楼层
     * @param record
     * @return 返回新增状态码
     */
    int insert(RpmsBuildPojo record);

    /**
     * 只插入传入的值
     * @param record
     * @return 返回状态码
     */
    int insertSelective(int id , RpmsBuildPojo record);

    /**
     * 根据id查询值
     * @param buildId
     * @return 返回RpmsBuildPojo
     */
    RpmsBuildPojo selectByPrimaryKey(Integer buildId);


//
//    int updateByPrimaryKeySelective(RpmsBuildPojo record);
//
//    int updateByPrimaryKey(RpmsBuildPojo record);
}