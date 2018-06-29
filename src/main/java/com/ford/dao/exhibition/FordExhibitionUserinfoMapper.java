package com.ford.dao.exhibition;

import com.ford.entity.exhibition.FordExhibitionUserinfo;
import com.ford.entity.exhibition.FordExhibitionUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FordExhibitionUserinfoMapper {
    long countByExample(FordExhibitionUserinfoExample example);

    int deleteByExample(FordExhibitionUserinfoExample example);

    int insert(FordExhibitionUserinfo record);

    int insertSelective(FordExhibitionUserinfo record);

    List<FordExhibitionUserinfo> selectByExample(FordExhibitionUserinfoExample example);

    int updateByExampleSelective(@Param("record") FordExhibitionUserinfo record, @Param("example") FordExhibitionUserinfoExample example);

    int updateByExample(@Param("record") FordExhibitionUserinfo record, @Param("example") FordExhibitionUserinfoExample example);
}