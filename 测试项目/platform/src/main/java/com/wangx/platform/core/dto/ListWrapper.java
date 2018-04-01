package com.wangx.platform.core.dto;

import java.io.Serializable;
import java.util.List;

public class ListWrapper<T> implements Serializable {
	private static final long serialVersionUID = 4509052294450818836L;

	public ListWrapper() {
	}

	public ListWrapper(List<T> list) {
		this.list = list;
	}

	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
