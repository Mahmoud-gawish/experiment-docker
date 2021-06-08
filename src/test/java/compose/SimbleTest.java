package compose;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.tools.io.ReportManager;

public class SimbleTest {

	public static WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver, "https://altibbi.com/");
	}

	@Test
	public void f() {
		ReportManager.log("new test case ");
	}

}
