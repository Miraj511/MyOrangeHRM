package com.example.aqua_orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SearchUserPage {
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    private WebElement inputActive;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonSearch;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/div")
    private WebElement divHaq;



    public SearchUserPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    
    public SearchUserPage searchUserName(String name){
        inputActive.click();
        inputActive.sendKeys(name);
        return this;
    }
    public SearchUserPage clickSearch(){
        buttonSearch.click();
        return this;
    }
    public boolean isUserFound(String name) {
        return divHaq.getText().equals(name);
    }

}
