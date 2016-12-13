package com.jinjiang.utils;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JsonUtilsTest {

	@Test
	public void test() {
		Map<String,String> maps = new HashMap<String, String>();
		maps.put("1", "开始");
		maps.put("2", "进行");
		String i = "1";
		System.out.print(JsonUtils.objectToJson(maps));
		System.out.println(i.getClass().equals(String.class));
		System.out.println(i.getClass());
	}

}
