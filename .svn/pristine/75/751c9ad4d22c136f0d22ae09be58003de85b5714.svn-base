package hdgc.dao;

import hdgc.bean.Websystem;
import hdgc.bean.WebsystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsystemMapper {
    long countByExample(WebsystemExample example);

    int deleteByExample(WebsystemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Websystem record);

    int insertSelective(Websystem record);

    List<Websystem> selectByExample(WebsystemExample example);

    Websystem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Websystem record, @Param("example") WebsystemExample example);

    int updateByExample(@Param("record") Websystem record, @Param("example") WebsystemExample example);

    int updateByPrimaryKeySelective(Websystem record);

    int updateByPrimaryKey(Websystem record);
}