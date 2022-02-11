package co.com.algoritms.easy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConversion {

	public static void main(String[] args) {

		System.out.println(timeConversion("07:05:45PM"));

	}

	private static String timeConversion(String s) {

		try {
			DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
			DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");

			return outputformat.format(df.parse(s));
		} catch (Exception e) {
			return "";
		}

	}
}
