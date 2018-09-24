package blog.dao;

import blog.pojo.RelationshipsExample;
import blog.pojo.RelationshipsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationshipsMapper {
    int countByExample(RelationshipsExample example);

    int deleteByExample(RelationshipsExample example);

    int deleteByPrimaryKey(RelationshipsKey key);

    int insert(RelationshipsKey record);

    int insertSelective(RelationshipsKey record);

    List<RelationshipsKey> selectByExample(RelationshipsExample example);

    int updateByExampleSelective(@Param("record") RelationshipsKey record, @Param("example") RelationshipsExample example);

    int updateByExample(@Param("record") RelationshipsKey record, @Param("example") RelationshipsExample example);
}