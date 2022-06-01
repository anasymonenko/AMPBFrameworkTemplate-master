package runner;

import driver.SingletonDriver;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(JUnitPlatform.class)
@SelectPackages("put your packages here")

public class TestRunner {
}
