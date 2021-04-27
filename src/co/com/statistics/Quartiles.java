package co.com.statistics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quartiles {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(3, 7, 8, 5, 12, 14, 21, 13, 18);

		System.out.println(quartiles(arr));
	}

	public static List<Integer> quartiles(List<Integer> arr) {

		Collections.sort(arr);	
		
		return Arrays.asList(median(arr, 0, arr.size() / 2 - 1),median(arr, 0,arr.size() - 1),median(arr,arr.size() / 2 + arr.size() % 2, arr.size() - 1));
	}
	
	public static Integer median(List<Integer> arr, int start, int end) {	
		
		int length = end - start + 1;
	    int median = 0;
	    if (length % 2 != 0) {
	        median = arr.get(start + length / 2);
	    } else {
	        median = (arr.get(start + length / 2 - 1) + arr.get(start + length / 2)) / 2;
	    }
	    return median;
	}

}
