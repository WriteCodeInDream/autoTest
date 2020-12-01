package testCase;

import base.BaseDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import utils.LoginUtils;
import utils.User;



public class indexTest {
    private LoginUtils login;
    private BaseDriver driver;

    @BeforeClass
    public void beginTest(){
        login = new LoginUtils();
        driver = login.loginToPage(User.USER_ADMIN);
        driver.closeDriver();
    }






}
