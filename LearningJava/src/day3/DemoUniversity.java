package day3;

public class DemoUniversity {
	
	static {
		System.out.println("I executed even before main");
	}

	public static void main(String[] args) {
		
		System.out.println(University.universityName);
		
		University.updateUniversityName("SimpleLearn QA");
	
	}

}
