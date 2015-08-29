package com.fhqinui.firze.common.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		testMap();
	}
	
	public static void testMap(){
		Map<String, String> map = new HashMap<String, String>();
		long time = new Date().getTime();
		for(int i = 0; i < 1000000; i ++){
			double randomDouble = Math.random();
			map.put("" + randomDouble, "" + randomDouble);
		}
		long time1 = new Date().getTime();
		
		for(Map.Entry<String, String> entry : map.entrySet()){
			entry.getValue();
		}
		long time2 = new Date().getTime();
		
		for(String key : map.keySet()){
			map.get(key);
		}
		long time3 = new Date().getTime();
		System.out.println(time1 - time);
		System.out.println(time2 - time1);
		System.out.println(time3 - time2);
	}
}
