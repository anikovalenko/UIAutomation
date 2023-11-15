package org.example.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.MouseEvent;
import java.util.List;

public class HoverExecutor {
    private static final String CSS_TO_HOVERS_PAGE = "a[href='/hovers']";
    private static final String CSS_TO_IMAGES = "img[alt='User Avatar']";

    public static void openHoversPage(WebDriver driver) {
        WebElement hoversPage = driver.findElement(By.cssSelector(CSS_TO_HOVERS_PAGE));
        hoversPage.click();
    }

    public static void doHoverEffect(WebDriver driver) {
        List<WebElement> images = driver.findElements(By.cssSelector(CSS_TO_IMAGES));
        for (WebElement image : images) {
            Actions actions = new Actions(driver);
//            MouseEvent mouseEvent = new MouseEvent()
        }
    }
}
