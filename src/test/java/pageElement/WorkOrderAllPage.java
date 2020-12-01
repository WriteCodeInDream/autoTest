package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkOrderAllPage extends BasePage{
    /**
     * @param baseDriver
     */
    public WorkOrderAllPage(BaseDriver baseDriver) {
        super(baseDriver);
    }
    public WebElement getWorkOrderNumberInput(){
        return findElement(getBy("workOrderNumberInAll"));
    }
    public WebElement getWorkOrderThemeInput(){
        return findElement(getBy("workOrderThemeInAll"));
    }
    public WebElement getWorkOrderCreatorInput(){
        return findElement(getBy("workOrderCreatorInAll"));
    }
    public WebElement getStatusDownList(){
        return findElement(getBy("workOrderStatusDownListInAll"));
    }
    private List<WebElement> getAllStatus(){
        return findElements(getBy("workOrderAllStatusInAll"));
    }
    public WebElement selectOneStatus(String value){
        return getOneOfElementOfDownList(value, getAllStatus());
    }
    public WebElement getReceiverInput(){
        return findElement(getBy("workOrderReceiverInAll"));
    }
}
