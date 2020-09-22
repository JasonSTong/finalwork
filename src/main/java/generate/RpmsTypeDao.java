package generate;

import generate.RpmsType;

public interface RpmsTypeDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsType record);

    int insertSelective(RpmsType record);

    RpmsType selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsType record);

    int updateByPrimaryKey(RpmsType record);
}