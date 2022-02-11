package co.com.statistics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StandardDeviation {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(10, 40, 30, 50, 20);
		
		stdDev(arr);
	}

	public static void stdDev(List<Integer> arr) {
		
		Collections.sort(arr);
		double mean = mean(arr);
        double resultado = arr.stream().map(num->Math.pow((num-mean),2)).reduce((double) 0, Double::sum);
		
        resultado = Math.sqrt((resultado/arr.size()));
        
        System.out.println(resultado);
	}
	
	public static double mean(List<Integer> arr) {
		return arr.stream().reduce(0,Integer::sum)/arr.size();
	}

}
