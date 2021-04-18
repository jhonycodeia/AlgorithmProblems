package co.com.algoritms.easy;

import java.util.Arrays;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {
		
		List<Integer> grades = Arrays.asList(73,67,38,33);
		
		System.out.println(gradingStudents(grades));

	}
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    
		for (int i = 0; i < grades.size(); i++) {
			grades.set(i, multiplo(grades.get(i)));
		}
		
		return grades;
	}
	
	public static int multiplo(int grade) {
		return grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5));
	}

}
