package com.wangx.platform.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wangx.platform.mapper.KpiModelMapper;
import com.wangx.platform.service.KpiModelService;

@Service
@Transactional
public class KpiModelServiceImpl implements KpiModelService {

	@Autowired
	private KpiModelMapper kpiModelMapper;

	public int insert(Map<String, Object> map) {
		return kpiModelMapper.insert(map);
	}

	public Map<String, Object> findOne(String KpiModelId) {
		return kpiModelMapper.findOne(KpiModelId);
	}

	public List<Map<String, Object>> find(Map<String, Object> map) {
		return kpiModelMapper.find(map);
	}

}
