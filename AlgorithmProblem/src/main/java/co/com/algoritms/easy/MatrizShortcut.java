package co.com.algoritms.easy;

import java.util.*;

public class MatrizShortcut {

	public static void main(String[] args) {
		
		Integer location = null;
		int a[][] = { { 1, 2, 5 }, { 2, 5, 3 }, { 5, 1, 7 } };
		int num = 3;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < num; i++) {
			location = menor(a, i, location);
			System.out.print(a[location][i] + " ");
		}

	}

	private static int menor(int a[][], int column, Integer location) {
		int numero = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (numero >= a[i][column]) {
				numero = Integer.min(numero, a[i][column]);
				if (location != null) {
					int result = Math.abs(location - i);
					if (result <= 1) {
						index = i;
					}
				} else {
					index = i;
				}
			}
		}
		return index;
	}

}
