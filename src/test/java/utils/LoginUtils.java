package utils;

import base.BaseDriver;
import pageHandle.LoginPageHandle;

import java.util.Properties;

public class LoginUtils {
    private static BaseDriver driver;
    private LoginPageHandle login;
    private Properties pr;
    public LoginUtils(){
    }

    public BaseDriver loginToPage(User user){
        pr = GetConfigUtils.getProperties("testConfig.properties");
        String testBrowser = getConfig("testBrowser");
        String testUrl = getConfig("testUrl");
        driver = new BaseDriver(testBrowser);
        driver.pageMax();
        driver.getUrl(testUrl);
        login = new LoginPageHandle(driver);
        login.login(user.username,user.password);
        return driver;
    }


    /**
     * 读取配置文件
     * @param key key值
     * @return 返回value
     */
    public String getConfig(String key){

        return GetConfigUtils.getValue(pr, key);
    }
}
