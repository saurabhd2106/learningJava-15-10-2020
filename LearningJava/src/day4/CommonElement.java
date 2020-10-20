package day4;

public class CommonElement<T> {
	
	T value;
	
	public void showType() {
		String name = value.getClass().getName();
		
		System.out.println(name);
		
		
	}

}
