package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkOrderMyCreatePage extends BasePage{
    /**
     * @param baseDriver
     */
    public WorkOrderMyCreatePage(BaseDriver baseDriver) {
        super(baseDriver);
    }
    public WebElement getWorkOrderNumber(){
        return findElement(getBy("workOrderNumberInMyCreate"));
    }
    public WebElement getWorkOrderTheme(){
        return findElement(getBy("workOrderThemeInMyCreate"));
    }
    public WebElement getStatusDownList(){
        return findElement(getBy("workOrderStatusDownListInMyCreate"));
    }
    private List<WebElement> getAllStatus(){
        return findElements(getBy("workOrderAllStatusInMyCreate"));
    }
    public WebElement SelectOneStatus(String value){
        return getOneOfElementOfDownList(value,getAllStatus());
    }
    public WebElement getReceiverInput(){
        return findElement(getBy("workOrderReceiverInMyCreate"));
    }


}
