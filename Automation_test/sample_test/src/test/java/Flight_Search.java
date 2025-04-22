import base.BaseTest;
import org.testng.annotations.Test;
import pages.Flights;
import pages.Home;
import pages.Results;

import java.util.concurrent.TimeUnit;

public class Flight_Search  extends BaseTest {

    @Test
    public void searchFlight(){

        Home home = new Home(driver);
        Flights flights = new Flights(driver);
        Results results = new Results(driver);

        home.NavigateToFlight();
        flights.inputFlightForm("CDMX");
        flights.inputFlightTo("La Habana");
        flights.inputDeparting();
        flights.inputReturning();
        flights.clickOnSearch();
        results.validateResults();

    }


}
