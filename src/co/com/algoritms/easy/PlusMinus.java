package co.com.algoritms.easy;

import java.util.stream.IntStream;

public class PlusMinus {

	public static void main(String[] args) {
		
		int arr[] = {-4,3,-9,0,4,1};

		plusMinus(arr);
	}

	private static void plusMinus(int[] arr) {
		System.out.println(((double)IntStream.of(arr).filter(num-> num>0).count()/arr.length));
		System.out.println(((double)IntStream.of(arr).filter(num-> num<0).count()/arr.length));
		System.out.println(((double)IntStream.of(arr).filter(num-> num==0).count()/arr.length));
		
    }
}
