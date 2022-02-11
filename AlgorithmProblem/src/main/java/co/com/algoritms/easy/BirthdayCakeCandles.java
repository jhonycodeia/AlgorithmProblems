package co.com.algoritms.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> candles = Arrays.asList(3,2,1,3);
		
		birthdayCakeCandles(candles);
	}
	
	public static int birthdayCakeCandles(List<Integer> candles) {
		
		Collections.sort(candles);
        int sum = 0;
        int last = candles.get(candles.size()-1);
        for(int i = candles.size()-1; i >= 0; i--){
            if(last == candles.get(i)){
            	sum = sum + 1;
            }else{
                break;
            }
        }
        return sum;
		
	}

}
