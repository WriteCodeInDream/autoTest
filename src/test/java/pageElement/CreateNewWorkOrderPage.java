package pageElement;

import base.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CreateNewWorkOrderPage extends BasePage{
    /**
     * @param baseDriver
     */
    public CreateNewWorkOrderPage(BaseDriver baseDriver) {
        super(baseDriver);
    }
    public WebElement getThemeInput(){
        return findElement(getBy("workOrderThemeOfCreateNew"));
    }
    public WebElement getDescInput(){
        return findElement(getBy("workOrderDescOfCreateNew"));
    }
    public WebElement getReceiverDownList(){
        return findElement(getBy("workOrderReceiverDownListOfCreateNew"));
    }
    private List<WebElement> getAllReceiver(){
        return findElements(getBy("workOrderAllReceiverOfCreateNew"));
    }
    public WebElement selectOneReceiver(String value){
        return getOneOfElementOfDownList(value, getAllReceiver());
    }
    public WebElement getStatusDownList(){
        return findElement(getBy("workOrderStatusDownListOfCreateNew"));
    }
    private List<WebElement> getAllStatus(){
        return findElements(getBy("workOrderAllStatusOfCreateNew"));
    }
    public WebElement selectOneStatus(String value){
        return getOneOfElementOfDownList(value , getAllStatus());
    }
    public WebElement getAddFileButton(){
        return findElement(getBy("workOrderAddFileOfCreateNew"));
    }
    public WebElement getSubmitButton(){
        return findElement(getBy("workOrderSubmitOfCreateNew"));
    }
    public WebElement getReturnButton(){
        return findElement(getBy("workOrderReturnOfCreateNew"));
    }
}
