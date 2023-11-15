package org.example.theinternet.horizontalslidertests.positivetests;

import org.example.theinternet.HorizontalSliderExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPositiveTests {

    WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");

    @Test
    public void validateSliderUsage() {
        HorizontalSliderExecutor.useSlider(driver);

    }
}
