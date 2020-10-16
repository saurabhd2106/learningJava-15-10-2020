package day2.inheritanceExample;

public class DemoMachine {
	
	public static void main(String[] args) {
		
		Machine mac = new Machine(10);
		
		mac.engineSize = 3784;
		
		mac.start();
		mac.stop(); //machine
		
		//-----------------------
		
		
		Car alto = new Car();
		
		alto.start();
		
		alto.stop();	//Car
		
		alto.restart();
		
		//--------------------------
		
		Machine bmw = new Car();
		
		bmw.start();
		
		bmw.stop(); //Car
		
		
		
		
		
		
		
	}

}
