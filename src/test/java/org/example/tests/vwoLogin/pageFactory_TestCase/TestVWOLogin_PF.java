package org.example.tests.vwoLogin.pageFactory_TestCase;

import org.example.base.CommonToAllTest;
import org.example.driver.DriverManager;
import org.example.listeners.RetryAnalyser;
import org.example.pages.pageFactory.LoginPage_PF;
import org.example.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Test(retryAnalyzer = RetryAnalyser.class)
public class TestVWOLogin_PF extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF.class);

    @Test
    public void testLoginNegativeVWO_PF() {

        logger.info("Starting the Testcases Page Factory");


        WebDriver driver = DriverManager.getDriver();
        driver.get(PropertiesReader.readKey("url"));
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        logger.info("End of the Testcase!!");

        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));



    }
}
