package com.ford.dao.user;

import com.ford.entity.user.FordUserinfoExam;
import com.ford.entity.user.FordUserinfoExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FordUserinfoExamMapper {
    long countByExample(FordUserinfoExamExample example);

    int deleteByExample(FordUserinfoExamExample example);

    int insert(FordUserinfoExam record);

    int insertSelective(FordUserinfoExam record);

    List<FordUserinfoExam> selectByExample(FordUserinfoExamExample example);

    int updateByExampleSelective(@Param("record") FordUserinfoExam record, @Param("example") FordUserinfoExamExample example);

    int updateByExample(@Param("record") FordUserinfoExam record, @Param("example") FordUserinfoExamExample example);
}