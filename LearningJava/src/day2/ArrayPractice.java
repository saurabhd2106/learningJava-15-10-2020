package day2;

import java.util.Random;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
		
		int[] num = new int[10];
		
		Random random = new Random();
		
		for(int i=0; i<num.length; i++) {
			num[i] = random.nextInt(100);
		}
		
		for(int temp : num) {
			System.out.println(temp);
		}
		
		System.out.println("------------------------");
		
		int max = num[0];
		
		for(int i=1; i<num.length; i++) {
			
			if(max < num[i]) {
				max = num[i];
			}
			
		}
		
		System.out.println(max);
	}

}
