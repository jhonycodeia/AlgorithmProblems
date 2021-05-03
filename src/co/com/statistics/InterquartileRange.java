package co.com.statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class InterquartileRange {

	public static void main(String args[]) {

		List<Integer> values = Arrays.asList(6, 12, 8, 10, 20, 16);
		List<Integer> freqs = Arrays.asList(5, 4, 3, 2, 1, 5);

		interQuartile(values, freqs);

	}

	public static void interQuartile(List<Integer> values, List<Integer> freqs) {
		
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < values.size(); i++) {
			numbers.addAll(Collections.nCopies(freqs.get(i), values.get(i)));
		}
		
		Collections.sort(numbers);
		double resultado = median(numbers, 0, numbers.size() / 2 - 1)-median(numbers,numbers.size() / 2 + numbers.size() % 2, numbers.size() - 1);
		
		System.out.println(Math.abs(resultado));
	}

	public static Double median(List<Integer> arr, int start, int end) {

		int length = end - start + 1;
		double median = 0;
		if (length % 2 != 0) {
			median = arr.get(start + length / 2);
		} else {
			median = (arr.get(start + length / 2 - 1) + arr.get(start + length / 2)) / 2;
		}
		return median;
	}
}
