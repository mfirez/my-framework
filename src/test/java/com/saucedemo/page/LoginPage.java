package com.saucedemo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = ".submit-button.btn_action")
    public WebElement loginButton;

}
