package co.com.algoritms.easy;

import java.util.Arrays;

public class SumTwoNumbers {

	public static void main(String[] args) {
		int[] myArray = {1,3,4,2,7,0};

		System.out.println(findSum(myArray,10));
	}
	
	/** Metodo encargado de realizar la busqueda de 2 numeros sumados sean igual {@code sum}
	 * @param array {@code int[]} arreglo de numeros
	 * @param sum {@code int} resultado buscado de la suma
	 * @return {@code String} el par de numeros que sumado a+b= {@code sum}
	 * @since  JDK1.8
	 * @author jsarria
	 * @category Big-O(logN)
	 */
	public static String findSum(int[] array, int sum) {
	    
	    Arrays.sort(array);
	    
	    for (int i = 0; i < array.length; i += 1) {
	    	//Se realiza la resta para saber el numero faltante de la suma
	        int reduce = sum - array[i];
	        //Se busca si el numero resultado ya se recorrio
	        if (Arrays.binarySearch(array,reduce)>0) {
	            return reduce+" "+array[i];
	        }
	    }
	    return "no hay";
	}

}
