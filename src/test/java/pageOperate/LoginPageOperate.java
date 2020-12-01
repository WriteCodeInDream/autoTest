package pageOperate;

import base.BaseDriver;
import pageElement.LoginPage;

public class LoginPageOperate {
    private LoginPage loginPage;
    public LoginPageOperate(BaseDriver webDriver){
        this.loginPage = new LoginPage(webDriver);
    }
    /**
     *
     */
    public void sendUserName(String username){
        loginPage.sendKeys(loginPage.getLoginInput(),username);
    }

    /**
     *
     */
    public void sendPassword(String password){
        loginPage.sendKeys(loginPage.getPasswordInput(),password);
    }

    public void clickLoginButton(){
        loginPage.clickWebElement(loginPage.getLoginButton());
    }
}
