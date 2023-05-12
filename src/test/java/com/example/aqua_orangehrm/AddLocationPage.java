package com.example.aqua_orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Name;

public class AddLocationPage {



    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")
    private WebElement typeName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
    private WebElement typeCity;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/input")
    private WebElement typePostalCode;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[5]/div/div[2]/input")
    private WebElement typePhoneNumber;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[7]/div/div[2]/textarea")
    private WebElement typeAddress;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    private WebElement typeStateName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div[1]/div[2]/i")
    private WebElement selectDropdown;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div[2]/div[2]")
    private WebElement selectCountryName;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[6]/div/div[2]/input")
    private WebElement typeFaxNumber;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[8]/div/div[2]/textarea")
    private WebElement typeNote;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
    private WebElement clickSave;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/p[2]")
    private WebElement SuccessfullySaved;


    public AddLocationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

public AddLocationPage typename(String Name){
    typeName.click();
    typeName.sendKeys(Name);
    return this;}
public AddLocationPage typeCity(String name){
    typeCity.click();
    typeCity.sendKeys(name);
    return this;
    }
public AddLocationPage typePostalCode(String postalCode){
        typePostalCode.click();
        typePostalCode.sendKeys(postalCode);
        return this;
}
public AddLocationPage typePhoneNumber(String number){
        typePhoneNumber.click();
        typePhoneNumber.sendKeys(number);
        return this;
}
    public AddLocationPage typeAddress(String address){
        typeAddress.click();
        typeAddress.sendKeys(address);
        return this;
    }
    public AddLocationPage typeStateName(String name){
        typeStateName.click();
        typeStateName.sendKeys(name);
        return this;
    }
    public AddLocationPage selectDropdown(){
        selectDropdown.click();
        return this;
    }
    public AddLocationPage selectCountry() {
        selectCountryName.click();
        return this;
    }
    public AddLocationPage typeFaxNumber(String number){
        typeFaxNumber.click();
        typeFaxNumber.sendKeys(number);
        return this;
    }
    public AddLocationPage typeNote(String note){
        typeNote.click();
        typeNote.sendKeys(note);
        return this;
    }
    public AddLocationPage clickSave(){
        clickSave.click();
        return this;
    }
    public boolean isAddLocationSave() throws InterruptedException {
        Thread.sleep(2000);
        return SuccessfullySaved.getText().equals("Successfully Saved");
    }







}


