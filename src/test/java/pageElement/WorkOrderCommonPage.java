package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkOrderCommonPage extends BasePage{
    /**
     * @param baseDriver
     */
    public WorkOrderCommonPage(BaseDriver baseDriver) {
        super(baseDriver);
    }
    public WebElement getAllWorkOrderMenu(){
        return findElement(getBy("allWorkOrderMenu"));
    }
    public WebElement getMyCreateWorkOrderMenu(){
        return findElement(getBy("myCreateWorkOrderMenu"));
    }
    public WebElement getMyUnResolveWorkOrderMenu(){
        return findElement(getBy("myUnResolveWorkOrderMenu"));
    }
    public WebElement getMyResolveWorkOrderMenu(){
        return findElement(getBy("myResolveWorkOrderMenu"));
    }
    public WebElement getSelectButton(){
        return findElement(getBy("selectButtonInWorkOrder"));
    }
    public WebElement getResetButton(){
        return findElement(getBy("resetButtonInWorkOrder"));
    }
    public WebElement getExportButton(){
        return findElement(getBy("exportButtonInWorkOrder"));
    }
    public WebElement getCreateWorkOrderButton(){
        return findElement(getBy("createWorkOrder"));
    }
    public List<WebElement> getAllWorkOrder(){
        return findElements(getBy("allWorkOrderOfTable"));
    }
    public WebElement getWorkOrderNumberInTable(List<WebElement> allWorkOrder, int index){
        return allWorkOrder.get(index - 1).findElement(getBy("workOrderNumberInTable"));
    }
    public WebElement getWorkOrderThemeInTable(List<WebElement> allWorkOrder, int index){
        return allWorkOrder.get(index - 1).findElement(getBy("workOrderThemeInTable"));
    }
    public WebElement getCreateTimeInTable(List<WebElement> allWorkOrder, int index){
        return allWorkOrder.get(index - 1).findElement(getBy("workOrderCreateTimeInTable"));
    }
    public WebElement getCreatorInTable(List<WebElement> allWorkOrder, int index){
        return allWorkOrder.get(index - 1).findElement(getBy("workOrderCreatorInTable"));
    }
    public WebElement getStatusInTable(List<WebElement> allWorkOrder, int index){
        return allWorkOrder.get(index - 1).findElement(getBy("workOrderStatusInTable"));
    }
    public WebElement getReceiverInTable(List<WebElement> allWorkOrder, int index){
        return allWorkOrder.get(index - 1).findElement(getBy("workOrderReceiverInTable"));
    }
    private List<WebElement> getAllOperation(List<WebElement> allWorkOrder, int index){
        return allWorkOrder.get(index - 1).findElements(getBy("workOrderAllOperation"));
    }
    public WebElement getOneOperation( String value, int index){
        List<WebElement> webElements = getAllOperation(getAllWorkOrder(),index);
        return getOneOfElementOfDownList(value,webElements);
    }
}
