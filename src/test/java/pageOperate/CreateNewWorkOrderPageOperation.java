package pageOperate;

import base.BaseDriver;
import pageElement.CreateNewWorkOrderPage;

public class CreateNewWorkOrderPageOperation {
    private CreateNewWorkOrderPage createNewWorkOrderPage;
    public CreateNewWorkOrderPageOperation(BaseDriver baseDriver){
        this.createNewWorkOrderPage = new CreateNewWorkOrderPage(baseDriver);
    }
    public void sendKeysToThemeInput(String value){
        createNewWorkOrderPage.sendKeys(createNewWorkOrderPage.getThemeInput(),value);
    }
    public void sendKeysToDescInput(String value){
        createNewWorkOrderPage.sendKeys(createNewWorkOrderPage.getDescInput(), value);
    }
    public void selectOneStatus(String value){
        createNewWorkOrderPage.clickWebElement(createNewWorkOrderPage.selectOneStatus(value));
    }
    public void selectOneReceiver(String value){
        createNewWorkOrderPage.clickWebElement(createNewWorkOrderPage.selectOneReceiver(value));
    }
    public void clickAddFile(){
        createNewWorkOrderPage.clickWebElement(createNewWorkOrderPage.getAddFileButton());
    }
    public void clickSubmit(){
        createNewWorkOrderPage.clickWebElement(createNewWorkOrderPage.getSubmitButton());
    }
    public void clickReturn(){
        createNewWorkOrderPage.clickWebElement(createNewWorkOrderPage.getReturnButton());
    }
    public void clickReceiverDownList(){
        createNewWorkOrderPage.clickWebElement(createNewWorkOrderPage.getReceiverDownList());
    }
    public void clickStatusDownList(){
        createNewWorkOrderPage.clickWebElement(createNewWorkOrderPage.getStatusDownList());
    }
}
