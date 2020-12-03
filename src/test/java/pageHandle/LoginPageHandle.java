package pageHandle;

import base.BaseDriver;
import pageOperate.LoginPageOperate;

public class LoginPageHandle{
    private LoginPageOperate loginPageOperate;
    public LoginPageHandle(BaseDriver baseDriver){
        this.loginPageOperate = new LoginPageOperate(baseDriver);
    }
    public void login(String username, String password){
        loginPageOperate.sendUserName(username);
        loginPageOperate.sendPassword(password);
        loginPageOperate.clickLoginButton();
    }
}
