package day4;

public class TypeCastExample {

	public static void main(String[] args) {

		// Double > float > long > int > byte > short

		long l;

		int i = 76345;

		l = i;
		
		l = 3579834l;
		
		i = (int) l;
		
		double d = 56.4876;
		
		l = (long) d;
		
		System.out.println(l);
	}

}
