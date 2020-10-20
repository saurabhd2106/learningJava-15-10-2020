package day4;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<>();

		hashSet.add(10);

		hashSet.add(34);

		hashSet.add(14);
		
		hashSet.add(16);

		hashSet.add(39);

		hashSet.add(11);

		for (Integer temp : hashSet) {
			System.out.println(temp);
		}
		
		System.out.println("---------------------------------------");
		
		Set<Integer> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add(10);

		linkedHashSet.add(34);

		linkedHashSet.add(14);
		
		linkedHashSet.add(16);

		linkedHashSet.add(39);

		linkedHashSet.add(11);

		for (Integer temp : linkedHashSet) {
			System.out.println(temp);
		}
		
		System.out.println("---------------------------------------");
		
		Set<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

		treeSet.add(10);

		treeSet.add(34);

		treeSet.add(14);
		
		treeSet.add(16);

		treeSet.add(39);

		treeSet.add(11);

		for (Integer temp : treeSet) {
			System.out.println(temp);
		}
		
	}

}
