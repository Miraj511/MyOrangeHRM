package com.example.aqua_orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(css = "input[name='username']")
    private WebElement inputUsername;

    @FindBy(css = "input[name='password']")
    private WebElement inputPassword;

    @FindBy(css = "button[class$='orangehrm-login-button']")
    private WebElement buttonLogin;

    @FindBy(css = "p[class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement pInvalidCredentials;

    public LoginPage setInputUsername(String userName){
        inputUsername.click();
        inputUsername.sendKeys(userName);
        return this;
    }
   
     public LoginPage setInputPassword(String password){
        inputPassword.click();
        inputPassword.sendKeys(password);
        return this;
}
     public LoginPage clickLogin(){
        buttonLogin.click();
        return this;
}
     public boolean isUserNotLogin(){
        return pInvalidCredentials.getText().equals("Invalid credentials");
}
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

