package testCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.GetConfigUtils;
import utils.LoginUtils;
import testEnum.User;

import java.util.Properties;


public class IndexTest extends BaseCase{
    private LoginUtils login;
    private Properties pr;

    @BeforeClass
    public void beginTest(){
        login = new LoginUtils();
        driver = login.loginToPage(User.USER_ADMIN);
        pr = GetConfigUtils.getProperties("testConfig.properties");
        driver.getUrl(GetConfigUtils.getValue(pr, "indexUrl"));
    }

    @AfterClass
    public void endTest(){
        driver.closeDriver();
    }






}
