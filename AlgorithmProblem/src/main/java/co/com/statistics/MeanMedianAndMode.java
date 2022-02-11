package co.com.statistics;

import java.util.Arrays;

public class MeanMedianAndMode {

	public static void main(String[] args) {
		int data[] = {64630,11735,14216,99233,14470,4978,73429,38120,51135,67060};
		
		System.out.format("%.1f\n", mean(data,data.length));
        System.out.format("%.1f\n",median(data,data.length));
        System.out.println(mode(data, data.length));
	}

	public static double mean(int arr[], int n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		double ans = (double) sum / (long) n;
		return ans;
	}

	public static double median(int arr[], int n) {
		Arrays.sort(arr);
		int mid = n / 2;
		double ans = ((double) arr[mid] + (double) arr[mid - 1]) / 2;
		return ans;
	}

	public static int mode(int X[], int n) {
		int mode = 0, temp, count, max = 0;
		for (int i = 0; i < n; i++) {
			temp = X[i];
			count = 0;
			for (int j = 0; j < n; j++) {
				if (temp == X[j]) {
					count++;
				}
				if (count > max) {
					max = count;
					if (max == 1) {
						mode = X[0];
					}
					mode = temp;
				}
			}
		}
		return mode;
	}

}
