package day2;

public class ArrayExamples {
	
	public static void main(String[] args) {
		
		int[] num = new int[5];
		
		num[0] = 10;
		
		num[1] = 7;
		
		num[2] = 79;
		num[3] = 17;
		num[4] = 78;
		
		System.out.println(num[4]);
		
		System.out.println("-----------------------------------");
		
		for(int i=0; i < num.length; i++ ) {
			System.out.println(num[i]);
		}
		
		System.out.println("-----------------------------------");
		
		for(int temp: num) {
			System.out.println(temp);
		}
		
		int arraySize = num.length;
		
		int size = 0;
		
		while(size < arraySize) {
			
			System.out.println(num[size]);
			
			size = size + 1;
		}
		
		
		
	}

}
