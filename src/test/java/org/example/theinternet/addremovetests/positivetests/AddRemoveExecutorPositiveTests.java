package org.example.theinternet.addremovetests.positivetests;

import org.example.theinternet.AddRemoveExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class AddRemoveExecutorPositiveTests {
    static WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");


    @BeforeAll
    @Test
    public static void validateOpeningAddRemovePage(){
        AddRemoveExecutor.enterAddRemovePage(driver);
    }

    @Test
    public void validateCreatingDeleteButtonExistence() throws InterruptedException {
        AddRemoveExecutor.clickOnAddButton(driver);
    }

    @Test
    @AfterAll
    public static void navigateBack(){
        driver.navigate().back();
    }
}
