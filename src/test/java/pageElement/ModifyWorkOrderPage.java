package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ModifyWorkOrderPage extends BasePage{
    /**
     * @param baseDriver
     */
    public ModifyWorkOrderPage(BaseDriver baseDriver) {
        super(baseDriver);
    }
    public WebElement getThemeInput(){
        return findElement(getBy("workOrderThemeOfModify"));
    }
    public WebElement getDescInput(){
        return findElement(getBy("workOrderDescOfModify"));
    }
    public WebElement getReceiverDownList(){
        return findElement(getBy("workOrderReceiverDownListOfModify"));
    }
    private List<WebElement> getAllReceiver(){
        return findElements(getBy("workOrderAllReceiverOfModify"));
    }
    public WebElement getOneReceiver(String value){
        return getOneOfElementOfDownList(value, getAllReceiver());
    }
    public WebElement getStatusDownList(){
        return findElement(getBy("workOrderStatusDownListOfModify"));
    }
    private List<WebElement> getAllStatus(){
        return findElements(getBy("workOrderAllStatusOfModify"));
    }
    public WebElement getOneStatus(String value){
        return getOneOfElementOfDownList(value, getAllStatus());
    }
    public List<WebElement> getAllFile(){
        return findElements(getBy("allFileInModify"));
    }
    public WebElement getFileName(int index, List<WebElement> allFile){
        return allFile.get(index - 1).findElement(getBy("fileNameOfModify"));
    }
    public WebElement getRemove(int index, List<WebElement> allFile){
        return allFile.get(index - 1).findElement(getBy("deleteFileOfModify"));
    }
    public WebElement getAddFile(){
        return findElement(getBy("addFileOfModify"));
    }
    public WebElement getReplyButton(){
        return findElement(getBy("replyOfModify"));
    }
    public WebElement getSystemCheckBox(){
        return findElement(getBy("replyModal"), getBy("checkBoxOfSystemInfo"));
    }
    public WebElement getEmailCheckBox(){
        return findElement(getBy("replyModal"), getBy("checkBoxOfEmailInfo"));
    }
    public WebElement getReplyInput(){
        return findElement(getBy("replyModal"), getBy("replyInput"));
    }
    public WebElement getAddFileInModal(){
        return findElement(getBy("replyModal"), getBy("addFileOfReplyModal"));
    }
    public WebElement confirmYes(){
        return findElement(getBy("replyModal"), getBy("confirmYesOfReplyModal"));
    }
    public WebElement confirmNo(){
        return findElement(getBy("replyModal"), getBy("confirmNoOfReplyModal"));
    }
    public WebElement submitOfModify(){
        return findElement(getBy("workOrderSubmitOfModify"));
    }
    public WebElement getReturnOfModify(){
        return findElement(getBy("workOrderReturnButtonOfModify"));
    }


}
