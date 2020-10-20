package day4;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		
		Object[] data = new Object[10];
		
		
		ArrayList<Object> test = new ArrayList<>();
		
		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(10);

		arrayList.add(70);
		arrayList.add(90);
		arrayList.add(30);
		arrayList.add(20);
		arrayList.add(40);

		for(Integer temp : arrayList) {
			
			System.out.println(temp);
			
		}
	}

}
