package org.example.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileDownloadExecutor {

    private static final String CSS_TO_FILE_EXECUTOR_PAGE = "a[href='/download']";
    private static final String XPATH_TO_DB_FILE = "//a[contains(@href, 'db.txt')]";

    public static void downloadDbFile(WebDriver driver) {
        WebElement fileDownloadPage = driver.findElement(By.cssSelector(CSS_TO_FILE_EXECUTOR_PAGE));
        fileDownloadPage.click();
        WebElement dbFile = driver.findElement(By.xpath(XPATH_TO_DB_FILE));
        dbFile.click();
    }
}
