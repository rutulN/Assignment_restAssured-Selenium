package bootcamp;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import java.io.File;
import java.io.IOException;public class ScreenShot {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://api.jquery.com/dblclick/");
File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
try {
FileUtils.copyFile(screenshot, new File("C:\\User\\homePageScreenshot.png"));
}
catch (IOException e) {
System.out.println(e.getMessage());
}
driver.close();
}
}

