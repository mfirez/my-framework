package com.saucedemo.tests.day1;

import com.saucedemo.page.LoginPage;
import com.saucedemo.page.ProductsPage;
import com.saucedemo.tests.TestBase;
import com.saucedemo.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends TestBase{

    @Test
    public void loginTest() throws InterruptedException {


        LoginPage loginPage = new LoginPage();
        loginPage.login();

        /*
        loginPage.usernameInput.sendKeys(ConfigurationReader.get("username"));
        Thread.sleep(2000);

        loginPage.passwordInput.sendKeys(ConfigurationReader.get("password"));
        Thread.sleep(2000);

        loginPage.loginButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/inventory.html"));

         */

    }


}
