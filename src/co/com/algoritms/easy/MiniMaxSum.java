package co.com.algoritms.easy;

import java.util.stream.IntStream;

public class MiniMaxSum {

	public static void main(String[] args) {
		int arr[] = {793810624,895642170,685903712,623789054,468592370};
		miniMaxSum(arr);
	}
	
	private static void miniMaxSum(int[] arr) {

		long menor = Long.MAX_VALUE;
		long mayor = Long.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			long sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if(i!=j) {
					sum += arr[j];
				}
			}
			if(menor>=sum) {
				menor = sum;
			}
			if(mayor<=sum) {
				mayor=sum;
			}		
		}
		
		System.out.println(menor+" "+mayor);
		
		
    }

}
