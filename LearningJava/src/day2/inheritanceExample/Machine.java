package day2.inheritanceExample;

public class Machine {

	int tyreSize;

	protected int engineSize;

	public Machine() {
		System.out.println("Constructor of Machine Class");
	}

	public Machine(int engineSize) {

		this.engineSize = engineSize;

		System.out.println("Constructor of Machine Class with Parameter");
	}

	public void start() {
		System.out.println("Start");
	}

	void stop() {
		System.out.println("Stop");
	}

}
