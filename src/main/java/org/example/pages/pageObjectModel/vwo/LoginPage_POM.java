package org.example.pages.pageObjectModel.vwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM {
    WebDriver driver;
    public LoginPage_POM(WebDriver driver){
        this.driver=driver;

    }

    //page locators

    private final By username= By.id("login-username");
    private final By password=By.id("login-password");
    private final By signButton=By.id("js-login-btn");
    private final By errorMessage=By.id("js-notification-box-msg");


    //page actions

    public String loginToVWOLoginInvalidcreds(String user, String pwd)
    {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String error_message=driver.findElement(errorMessage).getText();
        return error_message;
    }

    public void loginToVWOLoginValidcreds(String user, String pwd)
    {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();


    }


}
