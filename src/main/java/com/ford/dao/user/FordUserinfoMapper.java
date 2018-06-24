package com.ford.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ford.entity.user.FordUserinfo;
import com.ford.entity.user.FordUserinfoExample;

public interface FordUserinfoMapper {
    long countByExample(FordUserinfoExample example);

    int deleteByExample(FordUserinfoExample example);

    int insert(FordUserinfo record);

    int insertSelective(FordUserinfo record);

    List<FordUserinfo> selectByExample(FordUserinfoExample example);

    int updateByExampleSelective(@Param("record") FordUserinfo record, @Param("example") FordUserinfoExample example);

    int updateByExample(@Param("record") FordUserinfo record, @Param("example") FordUserinfoExample example);
}