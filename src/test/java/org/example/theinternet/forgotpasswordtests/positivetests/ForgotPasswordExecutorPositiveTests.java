package org.example.theinternet.forgotpasswordtests.positivetests;

import org.example.theinternet.ForgotPasswordExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordExecutorPositiveTests {

    WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");

    @Test
    public void validateEmailGiving() {
        ForgotPasswordExecutor.resetPassword(driver);
    }
}
