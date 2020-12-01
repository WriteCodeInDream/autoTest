package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

public class WorkOrderMyUnResolvePage extends BasePage{
    /**
     * @param baseDriver
     */
    public WorkOrderMyUnResolvePage(BaseDriver baseDriver) {
        super(baseDriver);
    }
    public WebElement getWorkOrderNumberInput(){
        return findElement(getBy("workOrderNumberInMyUnResolve"));
    }
    public WebElement getWorkOrderThemeInput(){
        return findElement(getBy("workOrderThemeInMyUnResolve"));
    }
    public WebElement getWorkOrderCreatorInput(){
        return findElement(getBy("workOrderCreatorInMyUnResolve"));
    }
}
