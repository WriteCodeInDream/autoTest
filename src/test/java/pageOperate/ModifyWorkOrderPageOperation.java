package pageOperate;

import base.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElement.ModifyWorkOrderPage;

import java.util.List;

public class ModifyWorkOrderPageOperation {
    private ModifyWorkOrderPage modifyWorkOrderPage;
    private List<WebElement> allFile;
    public ModifyWorkOrderPageOperation(BaseDriver baseDriver){
        this.modifyWorkOrderPage = new ModifyWorkOrderPage(baseDriver);
        this.allFile = modifyWorkOrderPage.getAllFile();
    }

    public String  getTextOfTheme(){
        return modifyWorkOrderPage.getText(modifyWorkOrderPage.getThemeInput());
    }
    public void sendKeysToTheme(String value){
        modifyWorkOrderPage.sendKeys(modifyWorkOrderPage.getThemeInput(),value);
    }
    public String getTextOfDesc(){
        return modifyWorkOrderPage.getText(modifyWorkOrderPage.getDescInput());
    }
    public void sendKeysToDesc(String value){
        modifyWorkOrderPage.sendKeys(modifyWorkOrderPage.getDescInput(),value);
    }
    public void clickReceiverDownList(){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getReceiverDownList());
    }
    public void selectOneReceiver(String value){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getOneReceiver(value));
    }
    public void clickStatusDownList(){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getStatusDownList());
    }
    public void selectOneStatus(String value){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getOneStatus(value));
    }
    public String getFileName(int index){
        return modifyWorkOrderPage.getText(modifyWorkOrderPage.getFileName(index, allFile));
    }
    public void clickRemoveFile(int index){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getRemove(index, allFile));
    }
    public void clickAddFile() {
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getAddFile());
    }
    public void clickReply(){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getReplyButton());
    }
    public void clickSystemInfo(){
        if(!modifyWorkOrderPage.isSelected(modifyWorkOrderPage.getSystemCheckBox())){
            modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getSystemCheckBox());
        }
    }
    public void clickEmailInfo(){
        if (!modifyWorkOrderPage.isSelected(modifyWorkOrderPage.getEmailCheckBox())){
            modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getEmailCheckBox());
        }
    }
    public void sendKeysToReplyInput(String value){
        modifyWorkOrderPage.sendKeys(modifyWorkOrderPage.getReplyInput(),value);
    }
    public void clickAddFileInReply(){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getAddFileInModal());
    }
    public void clickConfirmYes(){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.confirmYes());
    }
    public void clickConfirmNo(){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.confirmNo());
    }
    public void clickSubmit(){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.submitOfModify());
    }
    public void clickReturn(){
        modifyWorkOrderPage.clickWebElement(modifyWorkOrderPage.getReplyButton());
    }
}
