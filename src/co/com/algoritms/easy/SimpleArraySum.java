package co.com.algoritms.easy;

import java.util.stream.IntStream;

public class SimpleArraySum {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,10,11};

		System.out.println(simpleArraySum(ar));
	}
	
	private static int simpleArraySum(int[] ar) {
        return IntStream.of(ar).sum();
    }

}
