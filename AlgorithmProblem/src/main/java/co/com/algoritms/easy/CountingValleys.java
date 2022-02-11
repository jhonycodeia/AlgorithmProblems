package co.com.algoritms.easy;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int countingValleys(int steps, String path) {

		int v = 0; // # of valleys
		int lvl = 0; // current level
		
		for (char c : path.toCharArray()) {
			if (c == 'U')
				++lvl;
			else if (c == 'D')
				--lvl;
			// if we just came UP to sea level
			if (lvl == 0 && c == 'U')
				++v;

		}
		return v;
	}

}
