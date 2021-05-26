package com.example.demo.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.Interval;
import org.joda.time.Period;

public class DateTimeUtils {
	public static Map<String, Integer> getTimeLapse(Date startDate, Date endDate) {
		Interval interval = new Interval(startDate.getTime(), endDate.getTime());
		Period period = interval.toPeriod();
		Map<String, Integer> res = new HashMap<String, Integer>();
		res.put("YEARS", period.getYears());
		res.put("MONTHS", period.getMonths());
		res.put("DAYS", period.getDays());
		res.put("HOURS", period.getHours());
		res.put("MINUTES", period.getMinutes());
		res.put("SECONDS", period.getSeconds());
		return res;
	}
}
