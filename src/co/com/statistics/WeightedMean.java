package co.com.statistics;

public class WeightedMean {

	public static void main(String[] args) {
		int x[] = { 10, 40, 30, 50, 20 };
		int w[] = { 1, 2, 3, 4, 5 };
		
		System.out.println(weightedMean(x,w));

	}
	
	private static double weightedMean(int x[],int w[]) {
		
		double sum = 0;
		double div = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i]*w[i];
			div += w[i];
		}
		return sum/div;
	}

}
