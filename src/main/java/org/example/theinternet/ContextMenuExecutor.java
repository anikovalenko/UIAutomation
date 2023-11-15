package org.example.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuExecutor {
    private static final String XPATH_TO_CONTEXT_AREA_PAGE = "//a[@href='/context_menu']";
    private static final String CSS_TO_AREA = "div[id='hot-spot']";

    public static void rightClickOnArea(WebDriver driver) {
        WebElement contextMenuPage = driver.findElement(By.xpath(XPATH_TO_CONTEXT_AREA_PAGE));
        contextMenuPage.click();
        WebElement area = driver.findElement(By.cssSelector(CSS_TO_AREA));
        Actions actions = new Actions(driver);
        actions.contextClick(area).perform();
    }
}
