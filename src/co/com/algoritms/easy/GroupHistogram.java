package co.com.algoritms.easy;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class GroupHistogram {

	public static void main(String[] args) {
		
		int[] myArray = {1,2,1,3,3,1,2,1,5,1};		
		
		histograma(myArray,5);		
	}
	
	/** Metodo encargado de realizar la agrupacion de numeros
	 * @param array {@code int[]} arreglo de numeros
	 * @param size {@code int} tamaño del histograma
	 * @since  JDK1.8
	 * @author jsarria
	 * @category Big-O(N)
	 */
	public static void histograma(int array[],int size) {
		//Se realiza la agrupacion de numeros por una llave en comun
		Map<Integer, List<Integer>> numberMap = IntStream.of(array)
		        .boxed().collect(Collectors.groupingBy(Integer::intValue));
		//Se imprimen el numero de asteriscos de acuerdo al cantidad de numeros en el arreglo
		for (int i = 1; i <=size; i++) {
			if(numberMap.containsKey(i)) {
				System.out.println(i+": "+print(numberMap.get(i).size()));
			}
			else {
				System.out.println(i+": "+print(0));
			}
			
		}
	}
	
	/** Metodo encargado de realizar la construcion del histograma
	 * @param number {@code int} cantidad de * a incluir
	 * @return {@code String} la cantidad de * que indique {@code number}
	 * @since  JDK1.8
	 * @author jsarria
	 * @category Big-O(N)
	 */
	public static String print(int number) {
		return Stream.generate(()-> "*").limit(number).collect(Collectors.joining());
	}

}
