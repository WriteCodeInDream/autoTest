package pageOperate;

import base.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElement.WorkOrderCommonPage;

import java.util.List;

public class WorkOrderCommonPageOperation {
    private WorkOrderCommonPage workOrderCommonPage;
    private List<WebElement> allWorkOrder;
    public WorkOrderCommonPageOperation(BaseDriver baseDriver){
        this.workOrderCommonPage = new WorkOrderCommonPage(baseDriver);
        this.allWorkOrder = workOrderCommonPage.getAllWorkOrder();
    }
    public void clickAllMenu(){
        workOrderCommonPage.clickWebElement(workOrderCommonPage.getAllWorkOrderMenu());
    }
    public void clickMyCreateMenu(){
        workOrderCommonPage.clickWebElement(workOrderCommonPage.getMyCreateWorkOrderMenu());
    }
    public void clickMyUnResolveMenu(){
        workOrderCommonPage.clickWebElement(workOrderCommonPage.getMyUnResolveWorkOrderMenu());
    }
    public void clickMyResolveMenu(){
        workOrderCommonPage.clickWebElement(workOrderCommonPage.getMyResolveWorkOrderMenu());
    }

    public void clickSelectButton(){
        workOrderCommonPage.clickWebElement(workOrderCommonPage.getSelectButton());
    }
    public void clickResetButton(){
        workOrderCommonPage.clickWebElement(workOrderCommonPage.getResetButton());
    }

    public void clickExportButton(){
        workOrderCommonPage.clickWebElement(workOrderCommonPage.getExportButton());
    }

    public void clickCreateWorkOrderButton(){
        workOrderCommonPage.clickWebElement(workOrderCommonPage.getCreateWorkOrderButton());
    }
    public String getTextOfNumber(int index){
        return  workOrderCommonPage.getText(workOrderCommonPage.getWorkOrderNumberInTable(allWorkOrder,index));
    }
    public String getTextOfTheme(int index){
        return workOrderCommonPage.getText(workOrderCommonPage.getWorkOrderThemeInTable(allWorkOrder, index));
    }

    public String getTextOfCreator(int index){
        return workOrderCommonPage.getText(workOrderCommonPage.getCreatorInTable(allWorkOrder, index));
    }
    public String getTextOfCreateTime(int index){
        return workOrderCommonPage.getText(workOrderCommonPage.getCreateTimeInTable(allWorkOrder, index));
    }
    public String getTextOfStatus(int index){
        return workOrderCommonPage.getText(workOrderCommonPage.getStatusInTable(allWorkOrder, index));
    }
    public String getTextOfReceiver(int index){
        return workOrderCommonPage.getText(workOrderCommonPage.getReceiverInTable(allWorkOrder, index));
    }
    public void clickOneOperation(String value, int index){
        workOrderCommonPage.clickWebElement(workOrderCommonPage.getOneOperation(value, index));
    }

}

