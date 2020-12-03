package pageOperate;

import base.BaseDriver;
import pageElement.WorkOrderAllPage;

public class WorkOrderAllPageOperation extends WorkOrderMyCreatePageOperation{
    private WorkOrderAllPage workOrderAllPage;
    public WorkOrderAllPageOperation(BaseDriver baseDriver){
        super(baseDriver);
    }

    public void sendKeysToNumberInput(String value){
        workOrderAllPage.sendKeys(workOrderAllPage.getWorkOrderNumberInput(), value);
    }

    public void sendKeysToThemeInput(String value){
        workOrderAllPage.sendKeys(workOrderAllPage.getWorkOrderThemeInput(),value);
    }
    public void sendKeysToCreatorInput(String value){
        workOrderAllPage.sendKeys(workOrderAllPage.getWorkOrderCreatorInput(),value);
    }
    public void sendKeysToReceiverInput(String value){
        workOrderAllPage.sendKeys(workOrderAllPage.getReceiverInput(),value);
    }
    public void clickStatusDownList(){
        workOrderAllPage.clickWebElement(workOrderAllPage.getStatusDownList());
    }
    public void selectOneStatus(String value){
        workOrderAllPage.clickWebElement(workOrderAllPage.selectOneStatus(value));
    }
}
