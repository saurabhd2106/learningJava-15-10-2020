package day2;

public class Employee {

	private int salary;

	private int bonus;
	
	static int employeeCount;
	
	
	public Employee(){
		
		salary = 60000;
		
		bonus = 7000;
		
	}
	
	
	//Write only access
	public void setSalary(int salary) {
		
		if(salary >= 0) {
			this.salary = salary;
		}
		
	}
	
	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		
		if(bonus>=0) {
			
		this.bonus = bonus;
		
		}
	}


	//Read only access
	public int getSalary() {
		return salary;
	}
	
	public Employee(int salary, int bonus){
		
		if(salary>=0) {
			
		this.salary = salary;
		
		}
		
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
