package day3.exceptionHandling;

public class AmazonApp {

	public void invokeBrowser(String browserType) throws Exception {
		System.out.println("Invoke Browser");

		if (browserType.equals("chrome")) {

			System.out.println("Chrome Browser");

		} else if (browserType.equals("edge")) {
			System.out.println("Edge Browser");
		} else {
			throw new Exception("Invalid Browser Type - " + browserType);
		}
	}

	public void searchProduct() {
		System.out.println("Searching Product");
	}

	public void orderAProduct() throws Exception {

		int firstNumber = 10;

		for (int i = 5; i > 0; i--) {

			System.out.println(firstNumber / i);

		}

		System.out.println("All Divison done");
		System.out.println("Order Product");
	}

	public void payment() {
		System.out.println("Payment");
	}

	public void closeBrowser() {
		System.out.println("closing");
	}

}
