package com.example.aqua_orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateLocationPage {
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[7]/div/button[2]")
    private WebElement updateProfile;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[7]/div/div[2]/textarea")
    private WebElement addNewAddress;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
    private WebElement clickSaveButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/p[2]")
    private WebElement updateSuccessfullyPage;
    public UpdateLocationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    public UpdateLocationPage updateProfile(){
        updateProfile.click();
        return this;
    }
    public UpdateLocationPage addNewAddress(String name){
        addNewAddress.click();
        addNewAddress.sendKeys(name);
        return this;
    }
    public UpdateLocationPage clickSaveButton() throws InterruptedException {
        Thread.sleep(2000);
        clickSaveButton.click();
        return this;
    }
    public boolean isUpdateValid() throws InterruptedException {
        Thread.sleep(2000);
        return updateSuccessfullyPage.getText().equals("Successfully Updated");
    }
}
