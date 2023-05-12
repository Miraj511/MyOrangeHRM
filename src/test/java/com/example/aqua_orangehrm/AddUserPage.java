package com.example.aqua_orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
    public AddUserPage(WebDriver driver) {PageFactory.initElements(driver, this);}


   @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    private WebElement selectUserRole;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]/span")
    private WebElement selectAdmin;
   @FindBy(xpath ="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")
    private WebElement selectStatus;
   @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]/span")
   private WebElement selectEnabled;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement inputUserName;


    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    private WebElement InputEmployeeNameCh;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/span")
    private WebElement inputEmployeeName;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
    private WebElement inputActivePassword;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    private WebElement inputConPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonSave;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/p[2]")
    private WebElement addSuccessFully;




    
   public AddUserPage selectUserRole(){
       selectUserRole.click();
       selectAdmin.click();
       return this;
   }
   public AddUserPage selectStatus(){
       selectStatus.click();
       selectEnabled.click();
       return this;
   }
   public AddUserPage inputUserName(String userName){
       inputUserName.sendKeys(userName);
       return this;
   }
   public AddUserPage putEmployeeName(){
       InputEmployeeNameCh.sendKeys("ch");
       inputEmployeeName.click();
       return this;
   }
   public AddUserPage inputActivePassword(String passWord){
       inputActivePassword.sendKeys(passWord);
       inputConPassword.sendKeys(passWord);
       return this;
   }
   public AddUserPage clickSave() throws InterruptedException {
       Thread.sleep(2000);
       buttonSave.click();
       return this;
   }
   public boolean isUserSave() throws InterruptedException {
       Thread.sleep(2000);
       return addSuccessFully.getText().equals("Successfully Saved");
   }





}
