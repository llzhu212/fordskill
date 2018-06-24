package com.ford.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

public class BaseResultJson {

	private Boolean success;// 返回状态
	private String code;// 错误异常编码
	private String message;// 消息提示
	private Object value;// 自定义的返回数据结果

	private Object obj;// 自定义的其他参数

	public BaseResultJson() {
		super();
	}

	public BaseResultJson(boolean success, String code, String message) {
		super();
		this.success = success;
		this.code = code;
		this.message = message;
	}

	public BaseResultJson(boolean success, String code, String message, Object value) {
		super();
		this.success = success;
		this.code = code;
		this.message = message;
		this.value = value;
	}

	/**
	 * 状态
	 * 
	 * @return
	 */
	public Boolean isSuccess() {
		return success;
	}

	/**
	 * 状态 默认true
	 * 
	 * @param success
	 */
	public void setSuccess() {
		this.success = true;
	}

	/**
	 * 状态
	 * 
	 * @param success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * 错误异常编码
	 * 
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 错误异常编码
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 消息提示
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * 消息提示
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 自定义的返回数据结果
	 * 
	 * @return
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * 自定义的返回数据结果
	 * 
	 * @param value
	 */
	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * 返回数据的json格式字符串
	 * 
	 * @return
	 */
	public String toJson() {

		Logger logger = LoggerFactory.getLogger(BaseResultJson.class);
		String json = new Gson().toJson(this);
		if (!JStringUtil.isnull(this.code)) {
			logger.error(json);
		} else {
			//logger.info(json);
		}
		return json;
	}

	/**
	 * 赋值并 返回数据的json格式字符串
	 * 
	 * @return
	 */
	public String toJson(boolean success, String code, String message) {

		Logger logger = LoggerFactory.getLogger(BaseResultJson.class);

		this.success = success;
		this.code = code;
		this.message = message;

		String json = new Gson().toJson(this);
		if (!JStringUtil.isnull(this.code)) {
			logger.error(json);
		} else {
			//logger.info(json);
		}
		return json;
	}

	public String toJson(boolean success) {
		this.success = success;
		String json = new Gson().toJson(this);
		return json;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
