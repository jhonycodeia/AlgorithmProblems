package co.com.algoritms.easy;

public class NumberLineJumps {

	public static void main(String[] args) {
		System.out.println(kangaroo(0,3,4,2));
		System.out.println(kangaroo(0,2,5,3));

	}
	
	private static String kangaroo(int x1, int v1, int x2, int v2) {
		
		if(v1>v2 && (x1-x2) % (v2-v1)==0) {
			return "YES";
		}
		else {
			return "NO";
		}
		
    }

}
