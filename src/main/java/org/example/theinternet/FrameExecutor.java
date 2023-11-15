package org.example.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class FrameExecutor {
    private static final String XPATH_TO_FRAMES_PAGE = "//a[@href='/frames']";
    private static final String XPATH_TO_NESTED_FRAMES = "//a[@href='/nested_frames']";
    private static final String XPATH_TO_MIDDLE_TEXT = "//div[text()='MIDDLE']";


    public static void openFrames(WebDriver driver) {
        WebElement framesPage = driver.findElement(By.xpath(XPATH_TO_FRAMES_PAGE));
        framesPage.click();
        WebElement nestedFrames = driver.findElement(By.xpath(XPATH_TO_NESTED_FRAMES));
        nestedFrames.click();
    }

    public static void useMiddleFrameWithoutSwitchingOnIt(WebDriver driver) {
        WebElement middleText = driver.findElement(By.xpath(XPATH_TO_MIDDLE_TEXT));
        System.out.println(middleText.getText());
    }

    public static void useFrameAfterSwitchingOnIt(WebDriver driver, String ... frameNames) {
        Arrays.stream(frameNames)
                .forEach(frameName -> driver.switchTo().frame(frameName));
    }
}
