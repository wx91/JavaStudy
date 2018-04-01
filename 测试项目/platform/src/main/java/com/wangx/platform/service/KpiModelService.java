package com.wangx.platform.service;

import java.util.List;
import java.util.Map;

public interface KpiModelService {

	int insert(Map<String, Object> map);

	Map<String, Object> findOne(String KpiModelId);

	List<Map<String, Object>> find(Map<String, Object> map);

}
