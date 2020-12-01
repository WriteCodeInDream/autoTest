package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkOrderMyResolvePage extends BasePage{
    /**
     * @param baseDriver
     */
    public WorkOrderMyResolvePage(BaseDriver baseDriver) {
        super(baseDriver);
    }
    public WebElement getWorkOrderNumberInput(){
        return findElement(getBy("workOrderNumberInMyResolve"));
    }
    public WebElement getWorkOrderThemeInput(){
        return findElement(getBy("workOrderThemeInMyResolve"));
    }
    public WebElement getCreatorInput(){
        return findElement(getBy("workOrderCreatorInMyResolve"));
    }
    public WebElement getStatusDownList(){
        return findElement(getBy("workOrderStatusDownListInMyResolve"));
    }
    private List<WebElement> getAllStatus(){
        return findElements(getBy("workOrderAllStatusInMyResolve"));
    }
    public WebElement selectOneStatus(String value){
        return getOneOfElementOfDownList(value,getAllStatus());
    }
}
