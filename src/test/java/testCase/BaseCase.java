package testCase;

import base.BaseDriver;

public class BaseCase {
    public BaseDriver driver;
//    public BaseCase(String baseDriver){
//        this.driver = new BaseDriver(baseDriver);
//    }

    public BaseDriver initDriver(String browser){
        return new BaseDriver(browser);
    }
}
