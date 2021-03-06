package pageOperate;

import base.BaseDriver;
import pageElement.WorkOrderMyUnResolvePage;

public class WorkOrderMyUnResolvePageOperation extends WorkOrderCommonPageOperation{
    private WorkOrderMyUnResolvePage workOrderMyUnResolvePage;
    public WorkOrderMyUnResolvePageOperation(BaseDriver baseDriver){
        super(baseDriver);
    }

    public void sendKeysToNumber(String value){
        workOrderMyUnResolvePage.sendKeys(workOrderMyUnResolvePage.getWorkOrderNumberInput(),value);
    }
    public void sendKeysToTheme(String value){
        workOrderMyUnResolvePage.sendKeys(workOrderMyUnResolvePage.getWorkOrderThemeInput(),value);
    }
    public void sendKeysToCreator(String value){
        workOrderMyUnResolvePage.sendKeys(workOrderMyUnResolvePage.getWorkOrderCreatorInput(),value);
    }
}
