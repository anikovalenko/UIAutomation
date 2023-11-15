package org.example.theinternet.dataproviders;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.IdentifiedRegion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverProvider {

    public static WebDriver openChromeDriver(String url){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
