package org.example.theinternet.frameexecutortests.positivetests;

import org.example.theinternet.FrameExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FrameExecutorPositiveTests {
    static WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");


    @BeforeAll
    public static void validateFrameOpening() {
        FrameExecutor.openFrames(driver);
    }

    @Test
    public void validateAllowingUsageOfFrameAfterSwitchingOnIt() {
        Assertions.assertThrows(NoSuchElementException.class,
                () -> FrameExecutor.useMiddleFrameWithoutSwitchingOnIt(driver));
        FrameExecutor.useFrameAfterSwitchingOnIt(driver, "frame-top", "frame-left");
        String text = driver.findElement(By.tagName("body")).getText();
        Assertions.assertEquals("LEFT", text);
    }
}
