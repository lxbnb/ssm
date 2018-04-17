package hdgc.dao;

import hdgc.bean.GroupPower;
import hdgc.bean.GroupPowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupPowerMapper {
    long countByExample(GroupPowerExample example);

    int deleteByExample(GroupPowerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GroupPower record);

    int insertSelective(GroupPower record);

    List<GroupPower> selectByExample(GroupPowerExample example);

    GroupPower selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GroupPower record, @Param("example") GroupPowerExample example);

    int updateByExample(@Param("record") GroupPower record, @Param("example") GroupPowerExample example);

    int updateByPrimaryKeySelective(GroupPower record);

    int updateByPrimaryKey(GroupPower record);
}