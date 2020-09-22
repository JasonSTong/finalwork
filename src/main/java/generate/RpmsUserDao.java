package generate;

import generate.RpmsUser;

public interface RpmsUserDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsUser record);

    int insertSelective(RpmsUser record);

    RpmsUser selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsUser record);

    int updateByPrimaryKey(RpmsUser record);
}