package utils;

import base.BaseDriver;
import pageOperate.CommonPageOperation;

public class GetSystemMessage {
    private  CommonPageOperation commonPageOperation;
    public GetSystemMessage(BaseDriver driver){
        this.commonPageOperation = new CommonPageOperation(driver);
    }
    public  String getMessage(){
        String message;
        while ((message = commonPageOperation.getTextOfSysMessage()).length() == 0){
            commonPageOperation.getTextOfSysMessage();
        }
       return message;
    }
}
