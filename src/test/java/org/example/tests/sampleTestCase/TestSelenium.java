package org.example.tests.sampleTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium {
    @Test

    public void test_VWOlogin(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}
