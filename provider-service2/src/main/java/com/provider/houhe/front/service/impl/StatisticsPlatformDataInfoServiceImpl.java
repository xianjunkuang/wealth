package com.provider.houhe.front.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provider.houhe.front.dao.StatisticsPlatformDataInfoDao;
import com.provider.houhe.front.service.StatisticsPlatformDataInfoService;

@Service("statisticsPlatformDataInfoService")
public class StatisticsPlatformDataInfoServiceImpl implements StatisticsPlatformDataInfoService {
	@Autowired
	private StatisticsPlatformDataInfoDao statisticsPlatformDataInfoDao;

	@Override
	public Map<String, Object> queryLatestStatData() {	
			return statisticsPlatformDataInfoDao.queryLatestStatisticsPlatformDataInfo();
	}
}
