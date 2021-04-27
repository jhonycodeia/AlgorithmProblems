package co.com.algoritms.easy;



import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class ConcurrencyHistogram {

	public static void main(String[] args) {
		
		int[] myArray = {1,2,2,4,5,6,7,8,8,8};		
		
		concurrency(myArray);		
	}
	
	/** Metodo encargado de realizar la agrupacion de numeros
	 * @param array {@code int[]} arreglo de numeros
	 * @param size {@code int} tamaño del histograma
	 * @since  JDK1.8
	 * @author jsarria
	 * @category Big-O(N)
	 */
	public static void  concurrency(int array[]) {
		//Se realiza la agrupacion de numeros por una llave en comun
		Map<Integer, List<Integer>> numberMap = IntStream.of(array)
		        .boxed().collect(Collectors.groupingBy(Integer::intValue));
		
		int number = 0;
		for (Integer i : numberMap.keySet()) {
			if(number<numberMap.get(i).size()) {
				number = i;
			}
		}
		
		System.out.println("Longest: "+numberMap.get(number).size());
		System.out.println("Number: "+number);
	}

}
