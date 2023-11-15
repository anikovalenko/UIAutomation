package org.example.theinternet.filedownloadertests.positivetests;

import org.example.theinternet.FileDownloadExecutor;
import org.example.theinternet.dataproviders.ChromeDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileDownloadExecutorPositiveTests {

    WebDriver driver = ChromeDriverProvider.openChromeDriver("https://the-internet.herokuapp.com/");

    @Test
    public void verifyFileDownloading() throws InterruptedException {
        FileDownloadExecutor.downloadDbFile(driver);
        Thread.sleep(3000);
        File downloadsPackage = new File("C:/Users/HP/Downloads");
        if (downloadsPackage.exists() && downloadsPackage.isDirectory()) {
            File[] files = downloadsPackage.listFiles();
            for (File file : files) {
                if(file.isFile() && (file.getName()).equals("db.txt")){
                    System.out.println("Success");
                }
            }
        }
    }
}
