package com.example.aqua_orangehrm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocationManagementTest extends BaseTest {
    private LocationSearchPage locationSearchPage;
    private AddLocationPage addLocationpage;
private UpdateLocationPage updateLocationPage;
    @Test
    public void locationSearchPage() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewLocations");
        locationSearchPage = new LocationSearchPage(driver);
        locationSearchPage.typeNames("Canadian Regional HQ")
                .clickSearch();
        Assert.assertTrue(locationSearchPage.isNameValid("Canadian Regional HQ"));

    }

    @Test
    public void locationCitySearch() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewLocations");
        locationSearchPage = new LocationSearchPage(driver);
        locationSearchPage.typeCity("Texas")
                .clickSearch();
        Assert.assertTrue(locationSearchPage.isCityValid("Texas"));

    }

    @Test
    public void locationNameCitySearch() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewLocations");
        locationSearchPage = new LocationSearchPage(driver);
        locationSearchPage.typeCity("Texas")
                .typeNames("Texas R&D")
                .clickSearch();
        Assert.assertTrue(locationSearchPage.isCityValid("Texas"));
        Assert.assertTrue(locationSearchPage.isNameValid("Texas R&D"));

    }

    @Test
    public void addLocationpage() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveLocation");
        addLocationpage = new AddLocationPage(driver);

        addLocationpage.typename("Bd Science Technology"+getRandomKey(8))
        .typeCity("Dhaka")
        .typePostalCode("5200")
        .typePhoneNumber("01714600963")
        .typeAddress("Dhanmondi,Dhaka")
        .typeStateName("Dinajpur")
        .selectDropdown()
        .selectCountry()
        .typeFaxNumber("01722982383")
        .typeNote("I Work here")
        .clickSave();
        Assert.assertTrue(addLocationpage.isAddLocationSave());
    }

@Test
public void UpdateProfile() throws InterruptedException {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveLocation/3)");
    updateLocationPage = new UpdateLocationPage(driver);
    updateLocationPage
            .addNewAddress("Dhanmondi,Dhaka")
            .clickSaveButton();
    Assert.assertTrue(updateLocationPage.isUpdateValid());

    }
}