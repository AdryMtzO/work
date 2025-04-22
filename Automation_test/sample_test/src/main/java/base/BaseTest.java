package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected  WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\adrym\\OneDrive\\Desktop\\Automation_test\\sample_test\\src\\test\\resources\\638532054517960156_392238\\site\\index.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

   @AfterMethod
    public void teardowns(){
        if (driver != null ){
            driver.quit();
        }
    }

}
