package com.example.aqua_orangehrm;

import com.fasterxml.jackson.core.sym.Name;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationSearchPage {
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    private WebElement typeName;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement typeCity;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div")
    private WebElement cityResult;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    private WebElement clickSearch;
     @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")
     private WebElement mdChowdhury;
    public LocationSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}

   public LocationSearchPage typeNames(String Name){
        typeName.click();
        typeName.sendKeys(Name);
        return this;
   }
   public LocationSearchPage typeCity(String Name){
        typeCity.click();
        typeCity.sendKeys(Name);
        return this;
    }
public LocationSearchPage clickSearch(){
        clickSearch.click();
        return this;
}
public boolean isCityValid(String City) throws InterruptedException {
        Thread.sleep(2000);
        return cityResult.getText().equals(City);
}

public  boolean isNameValid(String Name) throws InterruptedException {
        Thread.sleep(2000);
        return mdChowdhury.getText().equals(Name);
}
}
