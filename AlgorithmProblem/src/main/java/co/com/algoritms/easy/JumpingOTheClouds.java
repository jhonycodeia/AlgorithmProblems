package co.com.algoritms.easy;

import java.util.Arrays;
import java.util.List;

public class JumpingOTheClouds {

	public static void main(String[] args) {

		List<Integer> ar = Arrays.asList(0, 0, 1, 0, 0, 1, 0);

		System.out.println(jumpingOnClouds(ar));

	}

	public static int jumpingOnClouds(List<Integer> c) {
		int jump = 0;
		int i = 0;
		while (i < c.size() - 1) {
			if (i < c.size() - 2 && c.get(i + 2) == 0) {
				i++;
			}
			if (i != c.size() - 1) {
				jump++;
			}
			i++;
		}
		return jump;
	}

}
