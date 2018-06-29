package com.ford.service.exhibition.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ford.dao.base.CallMapper;
import com.ford.dao.exhibition.FordExhibitionSupplierMapper;
import com.ford.dao.exhibition.custom.FordExhibitionSupplierCustomMapper;
import com.ford.entity.exhibition.FordExhibitionSupplier;
import com.ford.entity.exhibition.FordExhibitionSupplierExample;
import com.ford.service.exhibition.IFordExhSupplierService;

@Repository("fordExhSupplierServiceImpl")
public class FordExhSupplierServiceImpl implements IFordExhSupplierService{

	@Autowired
	private FordExhibitionSupplierMapper fordExhibitionSupplierMapper;
	
	@Autowired
	private FordExhibitionSupplierCustomMapper fordExhibitionSupplierCustomMapper;
	
	@Autowired
	private CallMapper callMapper;
	
	@Override
	public int addFordExhSupplier(FordExhibitionSupplier fordExhibitionSupplier) throws Exception {
		if (null==fordExhibitionSupplier.getId()||"".equals(fordExhibitionSupplier.getId())) {
			String id = callMapper.callFGetId();
			fordExhibitionSupplier.setId(id);
		}
		return fordExhibitionSupplierMapper.insertSelective(fordExhibitionSupplier);
	}

	@Override
	public List<FordExhibitionSupplier> queryFordExhSupplierBycondition(
			FordExhibitionSupplierExample fordExhibitionSupplierExample) throws Exception {
		return fordExhibitionSupplierMapper.selectByExample(fordExhibitionSupplierExample);
	}

	@Override
	public int updateFordExhSupplier(FordExhibitionSupplier fordExhibitionSupplier,
			FordExhibitionSupplierExample fordExhibitionSupplierExample) throws Exception {
		return fordExhibitionSupplierMapper.updateByExampleSelective(fordExhibitionSupplier, fordExhibitionSupplierExample);
	}

	@Override
	public int updateFordExhSupplierWinCount(Map<String, Object> map) throws Exception {
		return fordExhibitionSupplierCustomMapper.updateSupplierWinCount(map);
	}
	
	
}
