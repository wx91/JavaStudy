package com.wangx.platform.core.dto;

import java.util.List;

public class ListDto<T> extends BaseDto {
	private static final long serialVersionUID = 36000510991627328L;

	private ListWrapper<T> data;

	public ListDto() {
	}

	public ListDto(List<T> list) {
		this.data = new ListWrapper<T>(list);
	}

	public ListWrapper<T> getData() {
		return data;
	}

	public void setData(ListWrapper<T> data) {
		this.data = data;
	}

	public void setList(List<T> list) {
		this.data = new ListWrapper<T>(list);
	}
}
