package org.example.theinternet.disappearingtests.positivetests;

import org.example.theinternet.DisappearingElementsExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class DisappearingElementsExecutorPositiveTests {
    static WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");

    @BeforeAll
    @Test
    public static void openPage() {
        DisappearingElementsExecutor.enterToPage(driver);
    }

    @Test
    public void validateElementDisappearing() {
        for (int i = 0; i < 5; i++) {
            DisappearingElementsExecutor.refreshPage(driver);
        }
    }
}
