package com.example.aqua_orangehrm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserManagementTest extends BaseTest{

    private AddUserPage addUserPage;
    private UpdateUserProfile updateUserProfile;

private SearchUserPage canSearchPage;
    @Test
    public  void createUserTest() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");
        addUserPage= new AddUserPage(driver);
        addUserPage.selectUserRole()
                .selectStatus()
                .putEmployeeName()
                .inputUserName(getRandomKey(8))
                .inputActivePassword("Mk_1"+getRandomKey(5))
                .clickSave();
        Assert.assertTrue(addUserPage.isUserSave());
    }
   @Test
    public void canSearchUser() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        canSearchPage=new SearchUserPage(driver);
        canSearchPage.searchUserName("Aaliyah.Haq")
                .clickSearch();
        Thread.sleep(2000);
        Assert.assertTrue(canSearchPage.isUserFound("Aaliyah.Haq"));
   }
   @Test
   public void updateUserProfile() throws InterruptedException {
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        updateUserProfile = new UpdateUserProfile(driver);
       updateUserProfile.selectUpdate()
                  .typeUserName("AaliyahHaq1"+getRandomKey(8))
                    .clickSaveButton();
       Assert.assertTrue(updateUserProfile.isUserUpdateProfile());
   }



   }




