package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;
import utils.GetByLocator;

public class LoginPage extends BasePage{
    /**
     * @param baseDriver 浏览器
     */
    public LoginPage(BaseDriver baseDriver) {
        super(baseDriver);
    }
    /**
     * 获取登录输入框
     */
    public WebElement getLoginInput(){
        return findElement(GetByLocator.getByLocator("loginInput"));
    }
    /**
     * 获取密码输入框
     */
    public WebElement getPasswordInput(){
        return findElement(GetByLocator.getByLocator("passwordInput"));
    }
    /**
     * 获取登录按钮
     */
    public WebElement getLoginButton(){
        return findElement(GetByLocator.getByLocator("LoginButton"));
    }

}
