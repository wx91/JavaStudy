package com.wangx.platform.core.dto;

import java.io.Serializable;

/**
 * Description: <br/>
 * Date: 2016年1月18日 下午3:49:34 <br/>
 * 
 * @author hut
 * @version
 * @see
 */
public class BaseDto implements Serializable {

	public final static int FAIL = 1;// 失败

	public final static int SUCCESS = 0;// 成功

	private static final long serialVersionUID = 149124814045609190L;

	protected int status = SUCCESS; // 标识 默认成功

	protected String msg = "";

	protected String code = "";

	public void errorMsg(String msg) {
		this.status = FAIL;
		this.msg = msg;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
