package testCase;

import base.BaseDriver;
import utils.GetSystemMessage;

public class BaseCase {
    public BaseDriver driver;
//    public BaseCase(String baseDriver){
//        this.driver = new BaseDriver(baseDriver);
//    }

    public BaseDriver initDriver(String browser){
        return new BaseDriver(browser);
    }

    /**
     * 获取系统响应消息
     */
    public String getSysTemResponse(){
        return new GetSystemMessage(driver).getMessage();
    }
}
