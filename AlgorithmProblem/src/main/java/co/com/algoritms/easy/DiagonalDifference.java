package co.com.algoritms.easy;

import java.util.*;

public class DiagonalDifference {

	public static void main(String[] args) {
		List<List<Integer>> arr = Arrays.asList(Arrays.asList(11,2,4), Arrays.asList(4,5,6), Arrays.asList(10,8,-12));
		
		System.out.println(diagonalDifference(arr));
	}

	public static int diagonalDifference(List<List<Integer>> arr) {

		int left = 0;
		int right = 0;
		int size = arr.size()-1;
		int start = 0;
		
		for (List<Integer> list : arr) {
			left += list.get(start++);
			right += list.get(size--);
		}
		
		return Math.abs(left-right);
	}

}
