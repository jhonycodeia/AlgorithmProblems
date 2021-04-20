package co.com.algoritms.easy;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) {
		String text = "foo(bar(baz))blim";

		System.out.println(stringReverso(text));
		String result = "	foobazrabblim";
	}

	private static String stringReverso(String text) {
		Stack<Integer> left = new Stack<>();
		Queue<Integer> right = new ArrayDeque<>();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(') {
				left.add(i);
			} else if (text.charAt(i) == ')') {
				right.add(i);
			}
		}

		return reverse(text,left,right).replaceAll("[()]", "").toString();
	}

	private static String reverse(String text, Stack<Integer> left, Queue<Integer> right) {
		while (!left.isEmpty() && !right.isEmpty()) {

			int positionL = left.pop();
			int positionR = right.poll();

			text = text.replace(text.substring(positionL, positionR),reverse(text.substring(positionL, positionR)));
		}
		
		return text;
	}

	private static String reverse(String text) {
		return new StringBuilder(text).reverse().toString();
	}
}
