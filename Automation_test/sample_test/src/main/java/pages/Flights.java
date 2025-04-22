package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class Flights {
    private WebDriver driver;

    private By flightFrom = By.id("flight-from");
    private By flightTo = By.id("flight-to");
    private By departing = By.xpath("//input[@id='departing']");
    private By returning = By.xpath("//input[@id='returning']");
    private By searchBtn = By.xpath("//button[normalize-space()='Search']");

    public Flights(WebDriver driver){
        this.driver = driver;
    }

    public void inputFlightForm(String origin){
        driver.findElement(flightFrom).sendKeys(origin);
    }
    public void inputFlightTo(String destino){
        driver.findElement(flightTo).sendKeys(destino);
    }
    public void inputDeparting(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);
        driver.findElement(returning).sendKeys(formattedDate);

    }
    public void inputReturning(){
        int afterDays = 5;
        DateFormat returnDate = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, afterDays );
        String toDate = returnDate.format(cal.getTime());

        driver.findElement(departing).sendKeys(toDate);
    }
    public void clickOnSearch(){
        driver.findElement(searchBtn).click();

    }
}
