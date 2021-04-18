package co.com.algoritms.easy;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(2, 4);
		List<Integer> b = Arrays.asList(16, 32, 96);
		System.out.println(mcd(b));
		System.out.println(mcm(b));
		
		System.out.println(getTotalX(a, b));

	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int f = mcm(a);
		int l = mcd(b);
		int count = 0;
		for (int i = f, j = 2; i <= l; i = f * j, j++) {
			if (l % i == 0) {
				count++;
			}
		}
		return count;
	}

	private static int mcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private static int mcd(List<Integer> input) {
		int result = input.get(0);
		for (int i = 1; i < input.size(); i++) {
			result = mcd(result, input.get(i));
		}
		return result;
	}

	private static int mcm(int a, int b) {
		return a * (b / mcd(a, b));
	}

	private static int mcm(List<Integer> input) {
		int result = input.get(0);
		for (int i = 1; i < input.size(); i++) {
			result = mcm(result, input.get(i));
		}
		return result;
	}

}
