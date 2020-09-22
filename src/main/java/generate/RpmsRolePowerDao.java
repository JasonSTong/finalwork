package generate;

import generate.RpmsRolePower;

public interface RpmsRolePowerDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsRolePower record);

    int insertSelective(RpmsRolePower record);

    RpmsRolePower selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsRolePower record);

    int updateByPrimaryKey(RpmsRolePower record);
}