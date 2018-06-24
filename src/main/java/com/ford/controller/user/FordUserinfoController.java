package com.ford.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ford.entity.common.ResponeToWeb;
import com.ford.entity.user.FordUserinfo;
import com.ford.entity.user.FordUserinfoExample;
import com.ford.entity.user.FordUserinfoExample.Criteria;
import com.ford.service.user.IFordUserinfoService;

@RestController
@RequestMapping("/forduserinfo")
public class FordUserinfoController {

private Logger log  = Logger.getLogger("error");
	
	@Autowired
	IFordUserinfoService fordUserinfoService;
	
	@RequestMapping(value="/findFordUserinfo.act")
	public  ResponeToWeb findUserinfo(@RequestBody String json){
		ResponeToWeb responeToWeb = new ResponeToWeb();
		ObjectMapper om = new ObjectMapper();
		try {
			FordUserinfo fordUserinfo = om.readValue(json, FordUserinfo.class);
			FordUserinfoExample fordUserinfoExample = new FordUserinfoExample();
			Criteria criteria = fordUserinfoExample.createCriteria();
			criteria.andOpenidEqualTo(fordUserinfo.getOpenid());
			List<FordUserinfo> list = fordUserinfoService.findFordUserinfo(fordUserinfoExample);
			responeToWeb.setSuccess(true);
			responeToWeb.setMsg("查询成功");
			Map<String, Object> map = new HashMap<>();
			map.put("result", list);
		} catch (Exception e) {
			log.error("查询失败:"+e.getMessage());
		}
		return responeToWeb;
	}

}
