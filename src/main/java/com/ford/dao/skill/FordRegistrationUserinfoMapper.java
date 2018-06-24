package com.ford.dao.skill;

import com.ford.entity.skill.FordRegistrationUserinfo;
import com.ford.entity.skill.FordRegistrationUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FordRegistrationUserinfoMapper {
    long countByExample(FordRegistrationUserinfoExample example);

    int deleteByExample(FordRegistrationUserinfoExample example);

    int insert(FordRegistrationUserinfo record);

    int insertSelective(FordRegistrationUserinfo record);

    List<FordRegistrationUserinfo> selectByExample(FordRegistrationUserinfoExample example);

    int updateByExampleSelective(@Param("record") FordRegistrationUserinfo record, @Param("example") FordRegistrationUserinfoExample example);

    int updateByExample(@Param("record") FordRegistrationUserinfo record, @Param("example") FordRegistrationUserinfoExample example);
}