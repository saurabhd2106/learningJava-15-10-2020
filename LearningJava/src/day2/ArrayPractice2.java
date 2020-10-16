package day2;

import java.util.Random;

public class ArrayPractice2 {
	
	public static void main(String[] args) {
		
		int[] num = new int[100];	
		

		Random random = new Random();
		
		for(int i=0; i<num.length; i++) {
			num[i] = random.nextInt(10);
		}
		
		int[] count = new int[10];
		
		for(int i=0; i<num.length; i++) {
			
			count[num[i]]++;
		}
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Count of "+ i + " = " + count[i]);
		}
		
	}

}
