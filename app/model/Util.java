package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class Util {

	public static Date getCurrentTimeStamp() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		dateFormat.format(date);
		return date;
	}

	public static Date getCurrentTimeStampFromString(String string) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date;
		try {
			date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH).parse(string);
		} catch (ParseException e) {
			date = new Date();
			dateFormat.format(date);
		}
		return date;
	}
	
	 
}
