package com.ford.dao.skill;

import com.ford.entity.skill.FordRegistration;
import com.ford.entity.skill.FordRegistrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FordRegistrationMapper {
    long countByExample(FordRegistrationExample example);

    int deleteByExample(FordRegistrationExample example);

    int insert(FordRegistration record);

    int insertSelective(FordRegistration record);

    List<FordRegistration> selectByExample(FordRegistrationExample example);

    int updateByExampleSelective(@Param("record") FordRegistration record, @Param("example") FordRegistrationExample example);

    int updateByExample(@Param("record") FordRegistration record, @Param("example") FordRegistrationExample example);
}