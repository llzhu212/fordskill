package com.ford.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ford.entity.user.FordAgentinfo;
import com.ford.entity.user.FordAgentinfoExample;

public interface FordAgentinfoMapper {
    long countByExample(FordAgentinfoExample example);

    int deleteByExample(FordAgentinfoExample example);

    int insert(FordAgentinfo record);

    int insertSelective(FordAgentinfo record);

    List<FordAgentinfo> selectByExample(FordAgentinfoExample example);

    int updateByExampleSelective(@Param("record") FordAgentinfo record, @Param("example") FordAgentinfoExample example);

    int updateByExample(@Param("record") FordAgentinfo record, @Param("example") FordAgentinfoExample example);
}