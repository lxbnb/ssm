package hdgc.dao;

import hdgc.bean.Alluser;
import hdgc.bean.AlluserExample;
import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

public interface AlluserMapper {
    long countByExample(AlluserExample example);

    int deleteByExample(AlluserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Alluser record);
    
    int insertSelective(Alluser record);

    List<Alluser> selectByExample(AlluserExample example);

    Alluser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Alluser record, @Param("example") AlluserExample example);

    int updateByExample(@Param("record") Alluser record, @Param("example") AlluserExample example);

    int updateByPrimaryKeySelective(Alluser record);

    int updateByPrimaryKey(Alluser record);
}