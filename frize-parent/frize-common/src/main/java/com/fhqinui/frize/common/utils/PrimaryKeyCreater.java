package com.fhqinui.frize.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 主键创建器
 *  
 * @author zhaofei
 * @date 2015年7月31日 下午4:34:54
 */
public class PrimaryKeyCreater {
	
	private static volatile Date date;
	
	private static volatile int currentVal;
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	
	/**
	 * 获取主键
	 * @return
	 * @author zhaofei
	 * @date 2015年7月31日 下午4:34:43
	 */
	public static synchronized String getPrimaryKey(){
		Date nowDate = new Date();
		if(date == null || date.getTime() != nowDate.getTime()){
			date = nowDate;
			currentVal = 1;
		}
		return dateFormat.format(date) + perfix(currentVal++, 6);
	}
	
	private static String perfix(int value, int length){
		StringBuffer sb = new StringBuffer();
		sb.append(value);
		while(sb.length() < length){
			sb.insert(0, "0");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		for(int j = 0; j < 10; j ++){
			new Thread() {
				@Override
				public void run() {
					long time = new Date().getTime();
					for(int i = 0; i < 10000; i++){
						System.out.println(getPrimaryKey());
					}
					long time1 = new Date().getTime();
					System.out.println(time1 - time);
				}
			}.start();
		}
	}
}
