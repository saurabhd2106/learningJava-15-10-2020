package day2.inheritanceExample;

public class Car extends Machine{
	
	
	public Car() {
		
		super(10);
		
		System.out.println("Constructor of car class");
	}
	
	public void restart() {
		
		start();
		
		engineSize = 10;
		
		System.out.println("Restart");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop method from class car");
	}

}
