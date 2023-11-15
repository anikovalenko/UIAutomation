package org.example.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GeolocationExecutor {
    private static final String CSS_TO_GEOLOCATION_PAGE = "a[href='/geolocation']";
    private static final String XPATH_TO_BUTTON = "//button[@onclick='getLocation()']";
    private static final String XPATH_TO_SEE_ON_GOOGLE = "//a[contains(@href,'maps')]";

    public static void shareGeolocation(WebDriver driver) {
        WebElement geolocationPage = driver.findElement(By.cssSelector(CSS_TO_GEOLOCATION_PAGE));
        geolocationPage.click();
        WebElement locationSharingButton = driver.findElement(By.xpath(XPATH_TO_BUTTON));
        locationSharingButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement openInMapButton = wait
                        .until(ExpectedConditions
                                .presenceOfElementLocated(By.xpath(XPATH_TO_SEE_ON_GOOGLE)));
        openInMapButton.click();
    }
}
