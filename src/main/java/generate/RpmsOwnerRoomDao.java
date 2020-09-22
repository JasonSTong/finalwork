package generate;

import generate.RpmsOwnerRoom;

public interface RpmsOwnerRoomDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsOwnerRoom record);

    int insertSelective(RpmsOwnerRoom record);

    RpmsOwnerRoom selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsOwnerRoom record);

    int updateByPrimaryKey(RpmsOwnerRoom record);
}