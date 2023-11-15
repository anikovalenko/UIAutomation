package org.example.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EnterAdExecutor {

    private static final String XPATH_TO_PAGE = "//a[@href='/entry_ad']";
    private static final String XPATH_TO_CLOSE_LINK = "//div[@class='modal-footer']/p";
    private static final String XPATH_TO_CLICK_HERE_LINK = "//a[@id='restart-ad']";

    public static void openPage(WebDriver driver) {
        WebElement entryAdPage = driver.findElement(By.xpath(XPATH_TO_PAGE));
        entryAdPage.click();
    }

    public static void closeModal(WebDriver driver) throws InterruptedException {
        WebElement closeButton = driver.findElement(By.xpath(XPATH_TO_CLOSE_LINK));
        Thread.sleep(2000);
        closeButton.click();
    }

    public static void openModal(WebDriver driver) {
//        Thread.sleep(2000);
//        FluentWait wait = new FluentWait<>(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickHereButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(XPATH_TO_CLICK_HERE_LINK))));
//        WebElement clickHereButton = driver.findElement(By.xpath(XPATH_TO_CLICK_HERE_LINK));
        clickHereButton.click();
    }
}
