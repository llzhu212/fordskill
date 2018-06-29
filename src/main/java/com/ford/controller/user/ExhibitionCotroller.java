package com.ford.controller.user;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ford.entity.exhibition.FordExhibitionSupplier;
import com.ford.entity.exhibition.FordExhibitionSupplierExample;
import com.ford.entity.exhibition.FordExhibitionSupplierExample.Criteria;
import com.ford.entity.exhibition.FordExhibitionUserinfo;
import com.ford.service.exhibition.IFordExhSupplierService;
import com.ford.service.exhibition.IFordExhUserinfoService;
import com.ford.utils.DateUtil;

@Controller
@RequestMapping("/fordexhibition")
public class ExhibitionCotroller {

	private Logger log = Logger.getLogger("error");

	@Autowired
	private IFordExhUserinfoService fordExhUserinfoService;

	@Autowired
	private IFordExhSupplierService fordExhSupplierService;

	@RequestMapping(value = "/addExhibition.act")
	// public ModelAndView addExhibition(FordExhibitionUserinfo
	// fordExhibitionUserinfo) {
	public ModelAndView addExhibition(@RequestBody String json) {
		FordExhibitionUserinfo fordExhibitionUserinfo = new FordExhibitionUserinfo();
		try {
			ObjectMapper om = new ObjectMapper();
			fordExhibitionUserinfo = om.readValue(json, FordExhibitionUserinfo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		boolean flag = false;
		ModelAndView modelAndView = new ModelAndView();
		try {
			fordExhibitionUserinfo.setIswin("0");
			String time = DateUtil.getCurrentTiem();
			fordExhibitionUserinfo.setTime(time);
			fordExhUserinfoService.addUserinfo(fordExhibitionUserinfo);
		} catch (Exception e) {
			log.error(e.getMessage());
			modelAndView.setViewName("chongfu");
			return modelAndView;
		}
		// 抽奖
		int i = (int) (Math.random() * 100 + 1);
		try {
			if (i <= 10) {
				Map<String, Object> map = new HashMap<>();
				map.put("id", fordExhibitionUserinfo.getId());
				map.put("iswin", "1");
				// 查询中奖数量是否超过5次
				FordExhibitionSupplierExample fordExhibitionSupplierExample = new FordExhibitionSupplierExample();
				Criteria criteria = fordExhibitionSupplierExample.createCriteria();
				criteria.andCodeEqualTo(fordExhibitionUserinfo.getCode());
				List<FordExhibitionSupplier> list = fordExhSupplierService
						.queryFordExhSupplierBycondition(fordExhibitionSupplierExample);
				if (null != list && list.size() > 0) {
					// 更新中奖信息
					FordExhibitionSupplier fordExhibitionSupplier = list.get(0);
					if (fordExhibitionSupplier.getCount() < 5) {
						// 更新中奖信息
						int count = fordExhibitionSupplier.getCount() + 1;
						map.put("count", count);
						map.put("code", fordExhibitionSupplier.getCode());
						fordExhSupplierService.updateFordExhSupplierWinCount(map);
						flag = true;
					}
				} else {
					FordExhibitionSupplier fordExhibitionSupplier = new FordExhibitionSupplier();
					fordExhibitionSupplier.setCode(fordExhibitionUserinfo.getCode());
					fordExhibitionSupplier.setCount(1);
					fordExhSupplierService.addFordExhSupplier(fordExhibitionSupplier);
					fordExhUserinfoService.updateUserinfoWinByKey(map);
					flag = true;
				}
			}
		} catch (Exception e) {
			log.error("未中奖:" + e.getMessage());
		}
		if (flag) {
			modelAndView.setViewName("choujiang2");
		} else {
			modelAndView.setViewName("choujiang1");
		}
		return modelAndView;
	}

}
