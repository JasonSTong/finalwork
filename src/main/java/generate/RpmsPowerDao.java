package generate;

import generate.RpmsPower;

public interface RpmsPowerDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(RpmsPower record);

    int insertSelective(RpmsPower record);

    RpmsPower selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(RpmsPower record);

    int updateByPrimaryKey(RpmsPower record);
}