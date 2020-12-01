package pageHandle;

import base.BaseDriver;
import pageOperate.LoginPageOperate;

public class LoginPageHandle{
    private BaseDriver baseDriver;
    private LoginPageOperate loginPageOperate;
    public LoginPageHandle(BaseDriver baseDriver){
        this.baseDriver = baseDriver;
        this.loginPageOperate = new LoginPageOperate(baseDriver);
    }
    public void login(String username, String password){
        loginPageOperate.sendUserName(username);
        loginPageOperate.sendPassword(password);
        loginPageOperate.clickLoginButton();
    }
    public void getUrl(){
        baseDriver.getUrl("http://demo.esbot.cn/user/login");
    }
    public void getUrl(String path){
        baseDriver.getUrl(path);
    }
}
