package com.wangx.platform.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface KpiModelMapper {

	List<Map<String, Object>> find(Map<String, Object> map);

	public int insert(Map<String, Object> map);

	public Map<String, Object> findOne(@Param("KpiModelId") String KpiModelId);

}
