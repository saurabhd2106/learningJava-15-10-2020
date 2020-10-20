package day3.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExamples {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		/*List<Integer> arrayListFromList = new ArrayList<>();*/
		
		arrayList.add(10); //Adding the value at the last index
		
		arrayList.add(0, 12); //Add the value at particular index
		
		long startTime = System.currentTimeMillis();
		
		for(int i =0; i<=10E5; i++) {
			
			arrayList.add(0,i);
		}
		
		long stopTime = System.currentTimeMillis();
		
		System.out.println("Array list time taken - "+ (stopTime - startTime) + "ms");
		
		System.out.println(arrayList.size());
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		
		startTime = System.currentTimeMillis();
		
		for(int i =0; i<=10E5; i++) {
			
			linkedList.add(0,i);
		}
		
		 stopTime = System.currentTimeMillis();
		
		System.out.println("Linked list time taken - "+ (stopTime - startTime) + "ms");
		
		
		
		
	}

}
