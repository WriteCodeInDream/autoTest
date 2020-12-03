package pageOperate;

import base.BaseDriver;
import pageElement.WorkOrderMyCreatePage;

public class WorkOrderMyCreatePageOperation extends WorkOrderCommonPageOperation{
    private WorkOrderMyCreatePage workOrderMyCreatePage;
    public WorkOrderMyCreatePageOperation(BaseDriver baseDriver){
        super(baseDriver);
    }
    public void sengKeysToTheme(String value){
        workOrderMyCreatePage.sendKeys(workOrderMyCreatePage.getWorkOrderTheme(),value);
    }
    public void sendKeysToNumber(String value){
        workOrderMyCreatePage.sendKeys(workOrderMyCreatePage.getWorkOrderNumber(),value);
    }
    public void sendKeysToReceiver(String value){
        workOrderMyCreatePage.sendKeys(workOrderMyCreatePage.getReceiverInput(), value);
    }
    public void clickStatusDownList(){
        workOrderMyCreatePage.clickWebElement(workOrderMyCreatePage.getStatusDownList());
    }
    public void selectOneStatus(String value){
        workOrderMyCreatePage.clickWebElement(workOrderMyCreatePage.SelectOneStatus(value));
    }
}
