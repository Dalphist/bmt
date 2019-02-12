package bmt.common.beans;

import java.io.Serializable;

/**
* Title: ResultBean  
* Description:结果Bean，所有的Controller使用，配合AOP
* @author Dalphist  
* @date 2019年2月11日
 */
public class ResultBean<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final int NO_LOGIN = -1;
	public static final int SUCCESS = 0;
	public static final int FAIL = 1;
	public static final int NO_PERMISSION = 2;
	
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
	
	public ResultBean<T> success(){
		this.setCode(SUCCESS);
		return this;
	}
	
	public ResultBean<T> fail(){
		this.setCode(FAIL);
		return this;
	}
	
	public ResultBean<T> noLogin(){
		this.setCode(NO_LOGIN);
		return this;
	}
	
	public ResultBean<T> message(String msg){
		this.setMsg(msg);
		return this;
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
