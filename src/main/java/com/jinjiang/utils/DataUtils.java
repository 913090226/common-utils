package com.jinjiang.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
	public static final String YYYY_MM_SS_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public static final String YYYY_MM_SS = "yyyy-MM-dd";
	public static final String HH_MM_SS = "HH:mm:ss";

	public static String fomatString(Date data, String formatStr) {
		if (data == null)
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat(formatStr);
		return formatter.format(data);

	}

	public static Date formatDate(String dateStr, String formatStr) {
		if (dateStr == null || StringUtils.isEmpty(dateStr))
			return null;
		SimpleDateFormat formatter = new SimpleDateFormat(formatStr);
		ParsePosition pos = new ParsePosition(0);
		return formatter.parse(dateStr, pos);
	}
}
