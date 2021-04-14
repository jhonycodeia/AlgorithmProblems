package co.com.edd.easy;

public class ArraysDS {

	public static void main(String[] args) {
		int array[] = { 1, 4, 3, 2 };

		array = reverseArray(array);

		for (int i : array) {
			System.out.print(i + ",");
		}

	}

	private static int[] reverseArray(int[] a) {

		int size = a.length;
		for (int i = 0, mid = size >> 1, j = size - 1; i < mid; i++, j--) {
			int aux = a[i];
			a[i] = a[j];
			a[j] = aux;
		}
		return a;

	}

}
