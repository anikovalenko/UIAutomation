package org.example.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderExecutor {
    private final static String XPATH_TO_HORIZONTAL_SLIDER_PAGE = "//a[@href='/horizontal_slider']";
    private final static String XPATH_TO_SLIDER = "//input[@type='range']";

    public static void useSlider(WebDriver driver) {
        WebElement page = driver.findElement(By.xpath(XPATH_TO_HORIZONTAL_SLIDER_PAGE));
        page.click();
        WebElement slider = driver.findElement(By.xpath(XPATH_TO_SLIDER));
        for (int i = 0; i < 3; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
