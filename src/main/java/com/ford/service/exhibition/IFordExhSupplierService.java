package com.ford.service.exhibition;

import java.util.List;
import java.util.Map;

import com.ford.entity.exhibition.FordExhibitionSupplier;
import com.ford.entity.exhibition.FordExhibitionSupplierExample;

public interface IFordExhSupplierService {
	
	public int addFordExhSupplier(FordExhibitionSupplier fordExhibitionSupplier)throws Exception;
	
	public List<FordExhibitionSupplier> queryFordExhSupplierBycondition(FordExhibitionSupplierExample fordExhibitionSupplierExample)throws Exception;
	
	public int updateFordExhSupplier(FordExhibitionSupplier fordExhibitionSupplier,FordExhibitionSupplierExample fordExhibitionSupplierExample)throws Exception;
	
	public int updateFordExhSupplierWinCount(Map<String, Object> map)throws Exception;
}
