package co.com.algoritms.easy;

import java.util.stream.LongStream;

public class AVeryBigSum {

	public static void main(String[] args) {
		long ar[] = {1000000001,1000000002, 1000000003, 1000000004, 1000000005};
		
		System.out.println(aVeryBigSum(ar));

	}
	
	private static long aVeryBigSum(long[] ar) {
		return LongStream.of(ar).sum();
    }

}
