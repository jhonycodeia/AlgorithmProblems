package co.com.algoritms.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SalesbyMatch {

	public static void main(String[] args) {
		List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);

		sockMerchant(7, ar);
	}

	public static int sockMerchant(int n, List<Integer> ar) {

		Map<Integer, List<Integer>> numberMap = ar.stream().collect(Collectors.groupingBy(Integer::intValue));

		int sum = 0;
		for (Integer integer : numberMap.keySet()) {
			sum += numberMap.get(integer).size() / 2;
		}

		return sum;

	}

}
