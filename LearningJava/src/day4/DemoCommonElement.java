package day4;

import day1.Employee;

public class DemoCommonElement {

	public static void main(String[] args) {
		
		CommonElement<String> str = new CommonElement<>();
		
		str.value = "Saurabh";
		
		str.showType();
		
		CommonElement<Integer> num = new CommonElement<>();
		
		num.value = 45;
		
		num.showType();
		
		CommonElement<Employee> employee = new CommonElement<>();
		
	

	}

}
