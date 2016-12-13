package com.jinjiang.utils;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class JsonUtils {

	/**
	 * 类转为json
	 * 
	 * @param obj
	 * @return
	 */
	public static String objectToJson(Object obj) {
		if (obj == null)
			return null;
		if (obj.getClass().equals(String.class))
			return (String) obj;
		try {
			return JSON.toJSONString(obj);
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * 
	 * @param json
	 * @param type
	 * @return
	 */
	public static <T> T jsonToObject(String json ,Class<T> type){
		if(StringUtils.isEmpty(json))
			return null;
		if(String.class.equals(type))
			return (T)type;
		return JSON.parseObject(json, type);
	}
	
	public static <T> List<T> jsonToListObject(String json,Class<T> type){
		if(json == null)
			return null;
		return JSON.parseArray(json, type);
	}
}
