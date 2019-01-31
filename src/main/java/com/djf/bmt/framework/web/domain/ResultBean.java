package com.djf.bmt.framework.web.domain;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final int NO_LOGIN = -1;
	private static final int SUCCESS = 0;
	private static final int FAIL = 1;
	private static final int NO_PERMISSION = 2;
	
	private String msg = "success";
	private int code = SUCCESS;
	private T data;
	
	public ResultBean() {
		super();
	}
	
	public ResultBean(T data) {
		super();
		this.data = data;
	}
	
	public ResultBean(Throwable e) {
		super();
		this.msg = e.toString();
		this.code = FAIL;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static int getNoLogin() {
		return NO_LOGIN;
	}
	public static int getSuccess() {
		return SUCCESS;
	}
	public static int getFail() {
		return FAIL;
	}
	public static int getNoPermission() {
		return NO_PERMISSION;
	}
	
	
}