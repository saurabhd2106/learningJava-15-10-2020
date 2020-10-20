package day2;

public class DemoEmployee1 {
	
	public static void main(String[] args) {
		
		Employee mohit = new Employee();
		
		Employee.employeeCount = 10;
		
		mohit.setSalary(20000);
		
		mohit.calculateSalary();
		
		System.out.println(mohit.employeeCount);
	}

}
