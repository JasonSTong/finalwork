package generate;

import generate.RpmsPay;

public interface RpmsPayDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsPay record);

    int insertSelective(RpmsPay record);

    RpmsPay selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsPay record);

    int updateByPrimaryKey(RpmsPay record);
}