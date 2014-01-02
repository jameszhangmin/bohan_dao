package com.bohan.bohan_dao.util;

import java.util.Calendar;
import java.util.Date;


public class DateUtil  {
	
	public static Date getDateWithHourAndMinute(Date date, Integer hour, Integer minute) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	public static Date add(Date date, int i) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, i);
		return c.getTime();
	}
}