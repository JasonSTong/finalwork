package generate;

import generate.RpmsMaterial;

public interface RpmsMaterialDao {
    int deleteByPrimaryKey(Integer materialId);

    int insert(RpmsMaterial record);

    int insertSelective(RpmsMaterial record);

    RpmsMaterial selectByPrimaryKey(Integer materialId);

    int updateByPrimaryKeySelective(RpmsMaterial record);

    int updateByPrimaryKey(RpmsMaterial record);
}