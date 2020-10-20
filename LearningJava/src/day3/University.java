package day3;

public class University {
	
	//final variable cannot be reassigned a value
	final String ORG_NAME = "QA Tech HUb";
	
	static String universityName = "SimpliLearn";
	
	String studentName;
	
	static {
		System.out.println("First thing to execute");
		
		universityName = "SimpliLearn QA and DevOps";
	}
	
	static void updateUniversityName(String newUniversityName) {
		

		
		universityName = newUniversityName;
		
		//Non static fields cannot be updated in a static method
		// studentName = "Saurabh";
		
		System.out.println(universityName);
	}
	
	//final method cannot be over-ridden
	final void normalMethod() {
		
		universityName = "QA";
		
		
	}
	

}
