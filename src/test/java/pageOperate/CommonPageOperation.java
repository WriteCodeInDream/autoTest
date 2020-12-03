package pageOperate;

import base.BaseDriver;
import pageElement.CommonPage;

public class CommonPageOperation {
    public  CommonPage cp;
    public CommonPageOperation(BaseDriver baseDriver){
        this.cp = new CommonPage(baseDriver);
    }

    public String getTextOfSysMessage(){
        return cp.getText(cp.messageElement());
    }
}
