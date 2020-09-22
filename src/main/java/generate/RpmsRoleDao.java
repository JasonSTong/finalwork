package generate;

import generate.RpmsRole;

public interface RpmsRoleDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsRole record);

    int insertSelective(RpmsRole record);

    RpmsRole selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsRole record);

    int updateByPrimaryKey(RpmsRole record);
}