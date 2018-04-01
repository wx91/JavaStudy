package com.wangx.platform.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangx.platform.core.dto.ListDto;
import com.wangx.platform.core.dto.MapDto;
import com.wangx.platform.service.KpiModelService;

@Controller
@RequestMapping("/kpimodel")
public class KpiModelController {

	@Autowired
	private KpiModelService kpiModelService;

	@RequestMapping("/save")
	@ResponseBody
	public MapDto save(@RequestParam Map<String, Object> map) {
		MapDto dto = new MapDto();
		String kpiModelId = UUID.randomUUID().toString();
		map.put("kpiModellId", kpiModelId);
		this.kpiModelService.insert(map);
		return dto;
	}

	@RequestMapping("/find")
	@ResponseBody
	public ListDto<Map<String, Object>> find(@RequestParam Map<String, Object> map) {
		ListDto<Map<String, Object>> dto = new ListDto<Map<String, Object>>();
		dto.setStatus(0);
		List<Map<String, Object>> list = this.kpiModelService.find(map);
		for (int i = 0; i < list.size(); i++) {
			
		}
		
		
		dto.setList(list);
		return dto;
	}

	@RequestMapping("/findOne")
	public String findOne(@RequestParam Map<String, Object> map, Model model) {
		String kpiModelId = map.get("kpiModelId").toString();
		Map<String, Object> kpimodel = this.kpiModelService.findOne(kpiModelId);
		model.addAttribute("kpiModel", kpimodel);
		return "kpimodel/view";
	}

	@RequestMapping("/echart")
	public String echart() {
		// String kpiModelId = map.get("kpiModelId").toString();
		// Map<String, Object> kpimodel = this.kpiModelService.findOne(kpiModelId);
		// model.addAttribute("kpiModel",kpimodel);
		return "kpimodel/echart";
	}

}
