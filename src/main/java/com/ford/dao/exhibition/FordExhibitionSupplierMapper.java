package com.ford.dao.exhibition;

import com.ford.entity.exhibition.FordExhibitionSupplier;
import com.ford.entity.exhibition.FordExhibitionSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("fordExhibitionSupplierMapper")
public interface FordExhibitionSupplierMapper {
    long countByExample(FordExhibitionSupplierExample example);

    int deleteByExample(FordExhibitionSupplierExample example);

    int insert(FordExhibitionSupplier record);

    int insertSelective(FordExhibitionSupplier record);

    List<FordExhibitionSupplier> selectByExample(FordExhibitionSupplierExample example);

    int updateByExampleSelective(@Param("record") FordExhibitionSupplier record, @Param("example") FordExhibitionSupplierExample example);

    int updateByExample(@Param("record") FordExhibitionSupplier record, @Param("example") FordExhibitionSupplierExample example);
}