package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Home {

    private WebDriver driver;

    private By flightBtn = By.xpath("//a[normalize-space()='Flights']");

    public Home (WebDriver driver){
        this.driver = driver;
    }


    public void NavigateToFlight(){
        driver.findElement(flightBtn).click();

    }

}
