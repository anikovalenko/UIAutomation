package org.example.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordExecutor {
    private static final String XPATH_TO_FORGOT_PASSWORD_PAGE = "//a[@href='/forgot_password']";
    private static final String CSS_TO_EMAIL_FIELD = "input[name='email']";
    private static final String CSS_TO_SUBMIT_BUTTON = "button[type='submit']";

    public static void resetPassword(WebDriver driver){
        WebElement page = driver.findElement(By.xpath(XPATH_TO_FORGOT_PASSWORD_PAGE));
        page.click();
        WebElement emailField = driver.findElement(By.cssSelector(CSS_TO_EMAIL_FIELD));
        emailField.sendKeys("ani@gmail.com");
        WebElement submitButton = driver.findElement(By.cssSelector(CSS_TO_SUBMIT_BUTTON));
        submitButton.click();
    }

}
