package day1;

public class Employee {

	int salary;

	int bonus;
	
	
	public Employee(){
		
		salary = 60000;
		
		bonus = 7000;
		
	}
	
	public Employee(int salary, int bonus){
		
		this.salary = salary;
		
		this.bonus = bonus;
		
		
	}

	public void calculateSalary() {

		int totalSalary = salary + bonus;

		System.out.println("Total Salary - " + totalSalary);

	}

	public int calculateSalary1() {

		int totalSalary = salary + bonus;

		return totalSalary;

	}

	public int calculateSalary(int salary, int bonus) {

		int totalSalary = this.salary + bonus;

		return totalSalary;

	}
}
