package com.consumer.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.provider.houhe.front.service.StatisticsPlatformDataInfoService;

@Controller
public class IndexController{


	@Autowired
	private StatisticsPlatformDataInfoService statisticsPlatformDataInfoService;
	
	/**
	 * 测试方法
	 * @return
	 */
	@RequestMapping(value = "/", produces = "application/javascript;charset=UTF-8")
	public String index(HttpServletRequest request) {		
		Map<String, Object> map = statisticsPlatformDataInfoService.queryLatestStatData();
		request.setAttribute("totalDealAmount", map.get("totalDealAmount"));
		request.setAttribute("totalHasRepaymentAmount", map.get("totalHasRepaymentAmount"));
		return "home";
	}
	
	
	
}
