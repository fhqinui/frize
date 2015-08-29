package com.fhqinui.firze.common.util;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

import com.fhqinui.frize.common.utils.DateUtils;

public class DateUtilsTest {
	
	@Test
	public void custTimeTest(){
		Date date = new Date();
		Date resultDate = DateUtils.cutTime(date);
		System.out.println(DateUtils.formatDateTime(resultDate));
	}
	
	@Test
	public void addDaysTest(){
		Date date = new Date();
		Date resultDate = DateUtils.addDays(date, -40);
		System.out.println(DateUtils.formatDateTime(resultDate));
	}
	
	@Test
	public void addHoursTest(){
		Date date = new Date();
		Date resultDate = DateUtils.addHours(date, -40);
		System.out.println(DateUtils.formatDateTime(resultDate));
	}
	
	@Test
	public void betweenDateTest() throws ParseException{
		String dateStr1 = "2015-06-04 23:23:23"; 
		String dateStr2 = "2015-06-05 00:23:23";
		Date date1 = DateUtils.parseDatetime(dateStr1);
		Date date2 = DateUtils.parseDatetime(dateStr2);
		System.out.println(DateUtils.betweenDays(date1, date2));
	}
}
