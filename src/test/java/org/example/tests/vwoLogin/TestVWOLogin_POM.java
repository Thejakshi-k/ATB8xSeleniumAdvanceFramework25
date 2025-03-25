package org.example.tests.vwoLogin;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.pages.pageObjectModel.vwo.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLogin_POM {

//  @Owner("TEJU")
//  @Description("Verify that invalid creds give error message");
    @Test

    public void testLoginNegativeVWO(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        LoginPage_POM loginPagePom=new LoginPage_POM(driver);
        String error_message=loginPagePom.loginToVWOLoginInvalidcreds("admin","123");
        assertThat(error_message).isNotBlank().isNotEmpty().isNotEmpty();
        Assert.assertEquals(error_message,"Your email, password, IP address or location did not match");
        driver.quit();

    }
}
