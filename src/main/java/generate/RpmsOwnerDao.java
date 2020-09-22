package generate;

import generate.RpmsOwner;

public interface RpmsOwnerDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsOwner record);

    int insertSelective(RpmsOwner record);

    RpmsOwner selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsOwner record);

    int updateByPrimaryKey(RpmsOwner record);
}