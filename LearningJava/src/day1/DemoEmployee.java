package day1;

public class DemoEmployee {
	
	public static void main(String[] args) {
		
		Employee nikhil = new Employee();
		
		nikhil.salary = 100000;
		nikhil.bonus = 5000;
		
		nikhil.calculateSalary();
		
		/* Second Method ***************/
		
		
		Employee pranjal = new Employee();
		
		pranjal.salary = 50000;
		pranjal.bonus = 4000;
		
		int pranjalSalary = pranjal.calculateSalary1();
		
		System.out.println("Total Salary of PRanjal is - "+ pranjalSalary);
		
		int pranjalSalary2 = pranjal.calculateSalary(60000, 5000);
		
		System.out.println("Total Salary of PRanjal is - "+ pranjalSalary2);
		
		Employee nandha;
		
		nandha = new Employee(300000, 5900);
		
		nandha.calculateSalary();
		
	}

}
