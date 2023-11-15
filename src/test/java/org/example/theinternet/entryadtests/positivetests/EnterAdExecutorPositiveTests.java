package org.example.theinternet.entryadtests.positivetests;

import org.example.theinternet.EnterAdExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EnterAdExecutorPositiveTests {

    static WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");
    private final String CSS_TO_MODAL = "div[class='modal']";

    @BeforeAll
    public static void openPage() {
        EnterAdExecutor.openPage(driver);
    }

    @Test
    public void validateClosingModal() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(CSS_TO_MODAL)));
        } catch (TimeoutException e) {
            Assertions.fail();
        }
        EnterAdExecutor.closeModal(driver);
        Thread.sleep(1000);
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement modal = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(CSS_TO_MODAL)));
            Assertions.fail("Modal is still opened");
        } catch (TimeoutException e) {
        }
    }

    @Test
    public void validateOpeningModal() {
        EnterAdExecutor.openModal(driver);
    }
}
