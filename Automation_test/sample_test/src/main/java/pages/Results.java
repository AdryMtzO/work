package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Results {
    private WebDriver driver;

    private By resultPage = By.xpath("//h1[normalize-space()='Results']");

    public Results(WebDriver driver){
        this.driver = driver;
    }

    public void validateResults(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        try {
            if (driver.findElement(resultPage).isDisplayed()) {
                System.out.println("Flight Search completed");
            } else {
                System.out.println("Error");
            }
        } catch (Exception e){
            System.out.println("Error");
        }

    }
}
