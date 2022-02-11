package co.com.algoritms.easy;

public class Staircase {

	public static void main(String[] args) {
		staircase(6);
	}
	
	private static void staircase(int n) {
		int inicio = n-1;
		StringBuilder message = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < inicio; k++) {
				message.append(" ");
			}
			for (int j = inicio; j < n; j++) {
				message.append("#");
			}
			inicio--;
			message.append("\n");
		}		
		System.out.println(message.toString());
    }
	

}
