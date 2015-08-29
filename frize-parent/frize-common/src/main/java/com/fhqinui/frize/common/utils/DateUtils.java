package com.fhqinui.frize.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhaofei
 * @date 2015年6月4日 下午2:44:38
 */
public class DateUtils {

	public static final String DEFAULT_DATETIME_PARTTEN = "yyyy-MM-dd HH:mm:ss";
	public static final String DEFAULT_DATE_PARTTEN = "yyyy-MM-dd";

	/**
	 * @see 格式化时间、日期, 格式 yyyy-MM-dd HH:mm:ss
	 * @param date
	 *            需要格式化的时间
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午2:49:14
	 */
	public static final String formatDateTime(final Date date) {
		return new SimpleDateFormat(DEFAULT_DATETIME_PARTTEN).format(date);
	}

	/**
	 * 根据自定格式格式化时间
	 * 
	 * @param date
	 *            需要格式化的时间
	 * @param dateStr
	 *            格式字符串
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午2:55:18
	 */
	public static final String format(final Date date, final String partten) {
		return new SimpleDateFormat(partten).format(date);
	}

	/**
	 * 格式化日期, 格式yyyy-MM-dd
	 * 
	 * @param date
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午2:58:07
	 */
	public static final String formatDate(final Date date) {
		return new SimpleDateFormat(DEFAULT_DATE_PARTTEN).format(date);
	}
	
	/**
	 * 解析时间，格式yyyy-MM-dd HH:mm:ss
	 * @param dateString 格式yyyy-MM-dd HH:mm:ss
	 * @return
	 * @throws ParseException
	 * @author zhaofei
	 * @date 2015年6月4日 下午3:11:24
	 */
	public static final Date parseDatetime(final String dateString) throws ParseException{
		return new SimpleDateFormat(DEFAULT_DATETIME_PARTTEN).parse(dateString);
	}
	
	/**
	 * 解析时间，格式yyyy-MM-dd
	 * @param dateString 格式yyyy-MM-dd
	 * @return
	 * @throws ParseException
	 * @author zhaofei
	 * @date 2015年6月4日 下午3:11:24
	 */
	public static final Date parseDate(final String dateString) throws ParseException{
		return new SimpleDateFormat(DEFAULT_DATE_PARTTEN).parse(dateString);
	}
	
	/**
	 * 去掉日期里的时间
	 * @param date
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午3:14:37
	 */
	public static final Date cutTime(final Date date){
		final SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_PARTTEN);
		try {
			return sdf.parse(sdf.format(date));
		} catch (ParseException e) {
		} 
		return null;
	}
	
	/**
	 * 比较两个日期对象是否为同一天
	 * @param date1
	 * @param date2
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午3:01:41
	 */
	public static boolean isSameDay(final Date date1, final Date date2) {
		if (date1 == null || date2 == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		final Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);
		final Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		return isSameDay(cal1, cal2);
	}

	/**
	 * 比较两个日历对象是否同一天
	 * @param cal1 
	 * @param cal2
	 * @return 
	 * @author zhaofei
	 * @date 2015年6月4日 下午3:00:36
	 */
	public static boolean isSameDay(final Calendar cal1, final Calendar cal2) {
		if (cal1 == null || cal2 == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA)
				&& cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1
					.get(Calendar.DAY_OF_YEAR) == cal2
				.get(Calendar.DAY_OF_YEAR));
	}
	
	/**
	 * <p>比较两个日期相隔的天数，去掉时间只比较日期
	 * <p>2015-06-04 23:23:23  到 2015-06-05 00:23:23  返回 1
	 * <p>2015-06-04 00:23:23  到 2015-06-05 23:23:23  返回 1
	 * <p>2015-06-05 00:23:23  到 2015-06-04 23:23:23  返回 -1
	 * @param date1
	 * @param date2
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午3:40:34
	 */
	public static int betweenDays(final Date date1, final Date date2){
		final long time1 = DateUtils.cutTime(date1).getTime();
		final long time2 = DateUtils.cutTime(date2).getTime();
		return (int)((time2 - time1) / (1000 * 60 * 60 * 24));
	}
	
	/**
	 * 在当前日期上增加n年
	 * @param date
	 * @param amount
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午3:22:17
	 */
    public static Date addYears(final Date date, final int amount) {
        return add(date, Calendar.YEAR, amount);
    }

    /**
     * 在当前日期上增加n月
     * @param date
     * @param amount
     * @return
     * @author zhaofei
     * @date 2015年6月4日 下午3:23:16
     */
    public static Date addMonths(final Date date, final int amount) {
        return add(date, Calendar.MONTH, amount);
    }

    /**
     * 在当前日期上增加n周
     * @param date
     * @param amount
     * @return
     * @author zhaofei
     * @date 2015年6月4日 下午3:23:27
     */
    public static Date addWeeks(final Date date, final int amount) {
        return add(date, Calendar.WEEK_OF_YEAR, amount);
    }

    /**
     * 在当前日期上增加n天
     * @param date
     * @param amount
     * @return
     * @author zhaofei
     * @date 2015年6月4日 下午3:23:40
     */
    public static Date addDays(final Date date, final int amount) {
        return add(date, Calendar.DAY_OF_MONTH, amount);
    }

    /**
     * 在当前日期上增加n小时
     * @param date
     * @param amount
     * @return
     * @author zhaofei
     * @date 2015年6月4日 下午3:24:10
     */
    public static Date addHours(final Date date, final int amount) {
        return add(date, Calendar.HOUR_OF_DAY, amount);
    }

    /**
     * 在当前日期上增加n分钟
     * @param date
     * @param amount
     * @return
     * @author zhaofei
     * @date 2015年6月4日 下午3:24:26
     */
    public static Date addMinutes(final Date date, final int amount) {
        return add(date, Calendar.MINUTE, amount);
    }

    /**
     * 在当前日期上增加n秒
     * @param date
     * @param amount
     * @return
     * @author zhaofei
     * @date 2015年6月4日 下午3:24:35
     */
    public static Date addSeconds(final Date date, final int amount) {
        return add(date, Calendar.SECOND, amount);
    }

    private static Date add(final Date date, final int calendarField, final int amount) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        final Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(calendarField, amount);
        return c.getTime();
    }
}
