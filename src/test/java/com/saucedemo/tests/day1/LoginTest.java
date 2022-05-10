package com.saucedemo.tests.day1;

import com.saucedemo.page.LoginPage;
import com.saucedemo.tests.testNG.TestBase;
import com.saucedemo.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void loginTest() throws InterruptedException {


        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys(ConfigurationReader.get("username"));
        Thread.sleep(2000);

        loginPage.passwordInput.sendKeys(ConfigurationReader.get("password"));
        Thread.sleep(2000);

        loginPage.loginButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/inventory.html"));


    }
}
