package day3;

public class FirefoxDriver implements WebDriver {

	@Override
	public void get(String url) {
		System.out.println("Firefox Browser - Navigate to URL");
		
	}

	@Override
	public String getTitle() {
		
		return "Firefox Browser - Navigate to URL";
	}

	@Override
	public void close() {
		
		System.out.println("Firefox Browser - Close Browser");
		
	}
	
	public void FirefoxBrowserSetting() {
		System.out.println("Firefox Browser Settings");
	}

}
