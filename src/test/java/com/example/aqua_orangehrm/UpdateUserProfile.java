package com.example.aqua_orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateUserProfile {
    public Object iIconFill;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[6]/div/button[2]")
    private WebElement selectUpdate;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[1]/div[2]/i")
    private WebElement selectTextArrow;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[3]")
    private WebElement selectUserRoleEss;
    @FindBy(xpath ="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[2]/i")
    private WebElement clickDropdown;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    private WebElement selectStatusEnabled;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    private WebElement typeEmployeeName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement typeUserName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    private WebElement clickSaveButton;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/p[2]")
    private WebElement successfullyUpdated;


    public UpdateUserProfile(WebDriver driver) {
        PageFactory.initElements(driver, this);}

    public UpdateUserProfile selectUpdate(){
        selectUpdate.click();
        return this;
    }
    public UpdateUserProfile selectTextArrow(){
        selectTextArrow.click();
        selectUserRoleEss.click();
        return this;
    }
    public UpdateUserProfile clickDropdown(){
        clickDropdown.click();
        selectStatusEnabled.click();
        return this;
    }
    public UpdateUserProfile typeEmployeeName(String userName){
        typeEmployeeName.sendKeys(userName);
        typeEmployeeName.click();
        return this;
    }
    public UpdateUserProfile typeUserName(String Name){
        typeUserName.click();
        typeUserName.sendKeys(Name);
        return this;
    }
    public UpdateUserProfile clickSaveButton() throws InterruptedException {
        Thread.sleep(2000);
        clickSaveButton.click();
        return this;
    }
    public boolean isUserUpdateProfile() throws InterruptedException {
        Thread.sleep(2000);
        return successfullyUpdated.getText().equals("Successfully Updated");

    }
}
