package org.example.theinternet.geolocationtests.positivetests;

import org.example.theinternet.GeolocationExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class GeolocationExecutorPositiveTests {

    WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");

    @Test
    public void validateSharingLocation(){
        String initialURL = driver.getCurrentUrl();
        Assertions.assertFalse(initialURL.contains("maps"));
        GeolocationExecutor.shareGeolocation(driver);
        String finalURL = driver.getCurrentUrl();
        Assertions.assertTrue(finalURL.contains("maps"));
    }
}
