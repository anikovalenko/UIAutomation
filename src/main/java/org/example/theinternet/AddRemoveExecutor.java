package org.example.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveExecutor {

    public static final String XPATH_TO_PAGE = "//a[@href='/add_remove_elements/']";
    public static final String XPATH_TO_ADD_BUTTON = "//button[@onClick='addElement()']";
    public static final String XPATH_TO_DELETE_BUTTON = "//button[@class='added-manually'][3]";
    public static final String CSS_TO_DELETE_BUTTON = "button[class='added-manually']:nth-child(3)";


    public static void enterAddRemovePage(WebDriver driver) {
        WebElement addRemovePage = driver.findElement(By.xpath(XPATH_TO_PAGE));
        addRemovePage.click();
    }

    public static void clickOnAddButton(WebDriver driver) throws InterruptedException {
        WebElement addElementButton = driver.findElement(By.xpath(XPATH_TO_ADD_BUTTON));
        addElementButton.click();
        Thread.sleep(2000);
    }

    public static void clickOnDeleteButton(WebDriver driver) {
        //WebElement deleteButton = driver.findElement(By.cssSelector(CSS_TO_DELETE_BUTTON));
        WebElement deleteButton = driver.findElement(By.xpath(XPATH_TO_DELETE_BUTTON));
        deleteButton.click();
    }
}
