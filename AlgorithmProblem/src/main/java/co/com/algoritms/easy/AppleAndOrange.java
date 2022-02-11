package co.com.algoritms.easy;


import java.util.stream.IntStream;

public class AppleAndOrange {

	public static void main(String[] args) {
		
		int[] apples = {-2,2,1};
		int[] oranges = {5,-6};
		
		countApplesAndOranges(7,11,5,15,apples,oranges);

	}
	
	private static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		
		int countApples = (int)IntStream.of(apples).filter(p->a+p>=s && a+p<=t).count();
		int countOrages = (int)IntStream.of(oranges).filter(p->b+p>=s && b+p<=t).count();

		System.out.println(countApples);
		System.out.println(countOrages);

    }

}
