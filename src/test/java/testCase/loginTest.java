package testCase;

import base.BaseDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageHandle.LoginPageHandle;
import utils.GetConfigUtils;

import java.util.Properties;

/**
 * 登录页面的测试，不包含验证码
 */
public class loginTest {
    /**
     * 测试前准备，实例化driver，窗口最大化
     *
     */
    private Properties pr;
    private BaseDriver driver;
    private LoginPageHandle login;

    @BeforeClass
    public void beginTest(){
        /**
         * 读取配置文件,确定测试地址以及测试浏览器
         */
        pr = GetConfigUtils.getProperties("testConfig.properties");
        String testBrowser = getConfig("testBrowser");
        String testUrl = getConfig("testUrl");
        driver = new BaseDriver(testBrowser);
        driver.pageMax();
        driver.getUrl(testUrl);
        login = new LoginPageHandle(driver);
    }

    /**
     * 测试未注册账号登录(账号密码都错误)
     */
    @Test(priority = 5)
    public void testLoginUnNormalCaseOne(){
        String username = getConfig("unRegisterName");
        String password = getConfig("unCorrectPassword");
        login.login(username, password);
        // TODO 增加判断条件
    }

    /**
     *测试用户名为空登录
     */
    @Test(priority = 4)
    public void testLoginUnNormalCaseTwo(){
        String password = getConfig("password");
        login.login(" ", password);
    }

    /**
     * 测试密码为空登录
     */
    @Test(priority = 3)
    public void testLoginUnNormalCaseThree(){
        String username = getConfig("usernameRegister");
        login.login(username," ");
    }

    /**
     * 用户名正常，密码错误
     */
    @Test(priority = 2)
    public void testLoginUnNormalCaseFour(){
        String username = getConfig("usernameRegister");
        String password = getConfig("unCorrectPassword");
        login.login(username, password);
    }
    /**
     * 用户名错误，密码正确
     */
    @Test(priority = 1)
    public void testLoginUnNormalCaseFive(){
        String username = getConfig("unRegisterName");
        String password = getConfig("password");
        login.login(username, password);
    }

    /**
     * 测试正常登录
     */
    @Test(priority = 6)
    public void testLoginNormal(){
        String username = getConfig("username");
        String password = getConfig("password");
        login.login(username, password);
        // TODO 增加判断条件
    }

    /**
     * 读取配置文件
     * @param key key值
     * @return 返回value
     */
    public String getConfig(String key){

        return GetConfigUtils.getValue(pr, key);
    }

    @AfterClass
    public void closeBrowser(){
        if (driver != null){
            driver.closeDriver();
        }
    }

}
