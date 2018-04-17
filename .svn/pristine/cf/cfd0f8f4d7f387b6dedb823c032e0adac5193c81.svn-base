package hdgc.dao;

import hdgc.bean.PowerGroup;
import hdgc.bean.PowerGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerGroupMapper {
    long countByExample(PowerGroupExample example);

    int deleteByExample(PowerGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PowerGroup record);

    int insertSelective(PowerGroup record);

    List<PowerGroup> selectByExample(PowerGroupExample example);

    PowerGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PowerGroup record, @Param("example") PowerGroupExample example);

    int updateByExample(@Param("record") PowerGroup record, @Param("example") PowerGroupExample example);

    int updateByPrimaryKeySelective(PowerGroup record);

    int updateByPrimaryKey(PowerGroup record);
}