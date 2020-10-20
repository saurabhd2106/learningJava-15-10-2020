package day3.exceptionHandling;

public class DemoAmazon {

	public static void main(String[] args) {

		AmazonApp app = new AmazonApp();
		try {

			app.invokeBrowser("chrome");

			app.searchProduct();

			app.orderAProduct();

			app.payment();

			

		} catch (Exception e) {
			System.out.println("Order out of stock");
			e.printStackTrace();
		} finally {
			app.closeBrowser();
		}
		
		
	}
}
