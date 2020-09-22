package generate;

import generate.RpmsRoom;

public interface RpmsRoomDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsRoom record);

    int insertSelective(RpmsRoom record);

    RpmsRoom selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsRoom record);

    int updateByPrimaryKey(RpmsRoom record);
}