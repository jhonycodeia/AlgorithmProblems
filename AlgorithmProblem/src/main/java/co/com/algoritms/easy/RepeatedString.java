package co.com.algoritms.easy;

import java.util.Arrays;
import java.util.List;

public class RepeatedString {

	public static void main(String[] args) {
		
		String s ="aba";
		long n =10;

		System.out.println(repeatedString(s, n));
	}

	public static long repeatedString(String s, long n) {
		return(count(s)*(n/s.length())+count(s.substring(0,(int) (n%s.length()))));
	}
	
	public static long count(String s) {
		return s.chars().filter(ch -> ch == 'a').count();
	}
}
