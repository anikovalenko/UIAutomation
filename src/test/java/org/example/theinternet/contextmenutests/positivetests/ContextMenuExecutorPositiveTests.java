package org.example.theinternet.contextmenutests.positivetests;

import org.example.theinternet.ContextMenuExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class ContextMenuExecutorPositiveTests {
    static WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");

    @Test
    public void validateAlertOpening() throws InterruptedException {
        ContextMenuExecutor.rightClickOnArea(driver);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
}
