package pageOperate;

import base.BaseDriver;
import pageElement.WorkOrderMyResolvePage;

public class WorkOrderMyResolvePageOperation extends WorkOrderCommonPageOperation{
    private WorkOrderMyResolvePage workOrderMyResolvePage;
    public WorkOrderMyResolvePageOperation(BaseDriver baseDriver){
        super(baseDriver);
    }

    public void sendKeysToTheme(String value){
        workOrderMyResolvePage.sendKeys(workOrderMyResolvePage.getWorkOrderThemeInput(),value);
    }
    public void sendKeysToNumber(String value){
        workOrderMyResolvePage.sendKeys(workOrderMyResolvePage.getWorkOrderNumberInput(),value);
    }
    public void sendKeysToCreator(String value){
        workOrderMyResolvePage.sendKeys(workOrderMyResolvePage.getCreatorInput(),value);
    }
    public void clickStatusDownList(){
        workOrderMyResolvePage.clickWebElement(workOrderMyResolvePage.getStatusDownList());
    }
    public void selectOneStatus(String value){
        workOrderMyResolvePage.clickWebElement(workOrderMyResolvePage.selectOneStatus(value));
    }
}
