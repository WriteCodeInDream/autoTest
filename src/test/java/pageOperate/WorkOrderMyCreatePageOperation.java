package pageOperate;

import base.BaseDriver;
import pageElement.WorkOrderMyCreatePage;

public class WorkOrderMyCreatePageOperation {
    private WorkOrderMyCreatePage workOrderMyCreatePage;
    public WorkOrderMyCreatePageOperation(BaseDriver baseDriver){
        this.workOrderMyCreatePage = new WorkOrderMyCreatePage(baseDriver);
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
