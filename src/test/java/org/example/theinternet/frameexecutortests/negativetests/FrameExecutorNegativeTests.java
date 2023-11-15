package org.example.theinternet.frameexecutortests.negativetests;

import org.example.theinternet.FrameExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class FrameExecutorNegativeTests {
    static WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");

    @BeforeAll
    public static void validateFrameOpening() {
        FrameExecutor.openFrames(driver);
    }

    @Test
    public void validateForbiddingUsageFrameWithoutSwitchingOnIt() {
        Assertions.assertThrows(NoSuchElementException.class,
                () -> FrameExecutor.useMiddleFrameWithoutSwitchingOnIt(driver));
    }
}
