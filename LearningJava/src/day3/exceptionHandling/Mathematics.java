package day3.exceptionHandling;

public class Mathematics {

	public static void main(String[] args) {

		int firstnumber = 10;

		try {

			for (int i = 5; i > 0; i--) {

				System.out.println(firstnumber / i);

			}

			System.out.println("All Divison done");

			int[] arr = new int[5];

			arr[5] = 10;

		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Exception Occured");
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {

			System.out.println("Exception Occured");
			e.printStackTrace();
		} catch (Exception e) {
			
			System.out.println("In Exception block");
			e.printStackTrace();
		}

	}

}
