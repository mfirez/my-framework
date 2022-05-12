package com.saucedemo.page;

import com.saucedemo.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = ".submit-button.btn_action")
    public WebElement loginButton;


    public void login(){
        String username= ConfigurationReader.get("username");
        String password =ConfigurationReader.get("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
