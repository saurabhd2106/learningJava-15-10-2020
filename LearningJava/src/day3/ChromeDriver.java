package day3;

public class ChromeDriver implements WebDriver {

	@Override
	public void get(String url) {
		System.out.println("Chrome Browser - Navigate to URL");
		
	}

	@Override
	public String getTitle() {
		
		return "Chrome Browser - Navigate to URL";
	}

	@Override
	public void close() {
		
		System.out.println("Chrome Browser - Close Browser");
		
	}
	
	public void chromeBrowserSetting() {
		System.out.println("Chrome Browser Settings");
	}

}
