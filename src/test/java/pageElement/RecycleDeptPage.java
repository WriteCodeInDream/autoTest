package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RecycleDeptPage extends BasePage {
    /**
     * @param baseDriver 浏览器名称
     */
    public RecycleDeptPage(BaseDriver baseDriver) {
        super(baseDriver);
    }

    public WebElement getQuestionInput(){
        return findElement(getBy("questionInputInRecycle"));
    }

    public WebElement getAnswerInput(){
        return findElement(getBy("answerInputInRecycle"));
    }
    public WebElement getSortTypeDownList(){
        return findElement(getBy("sortTypeDownListInRecycle"));
    }

    private List<WebElement> getAllSortType(){
        return findElements(getBy("allSortTypeInRecycle"));
    }

    public WebElement selectOneSortType(String value){
        return getOneOfElementOfDownList(value,getAllSortType());
    }
    public WebElement getRecycleTimeInput(){
        return findElement(getBy("recycleTimeInputInRecycle"));
    }
    public WebElement getSearchButton(){
        return findElement(getBy("searchButtonInRecycle"));
    }
    public WebElement getResetButton(){
        return findElement(getBy("resetButtonInRecycle"));
    }
    public WebElement getBatchOperation(){
        return findElement(getBy("batchOperationDownListInRecycle"));
    }
    private List<WebElement> getAllBatchOperation(){
        return findElements(getBy("allBatchOperationInRecycle"));
    }
    public WebElement getOneBatchOperation(String value){
        return getOneOfElementOfDownList(value,getAllBatchOperation());
    }
    public List<WebElement> getAllCheckBox() {
        return findElements(getBy("allCheckBoxInRecycle"));
    }
    public List<WebElement> getAllRowKnowledge(){
        return findElements(getBy("allRowKnowledgeInRecycle"));
    }
    public WebElement getQuestionInTable(List<WebElement> allRowKnowledge,int index ){
        return allRowKnowledge.get(index-1).findElement(getBy("questionOfTableInRecycle"));
    }
    public WebElement getAnswerInTable(List<WebElement> allRowKnowledge,int index ){
        return allRowKnowledge.get(index-1).findElement(getBy("answerOfTableInRecycle"));
    }
    public WebElement getSortTypeInTable(List<WebElement> allRowKnowledge,int index ){
        return allRowKnowledge.get(index-1).findElement(getBy("sortTypeOfTableInRecycle"));
    }
    public WebElement getRecycleTimeInTable(List<WebElement> allRowKnowledge,int index ){
        return allRowKnowledge.get(index-1).findElement(getBy("recycleTimeOfTableInRecycle"));
    }
    public WebElement getOperatorInTable(List<WebElement> allRowKnowledge,int index ){
        return allRowKnowledge.get(index-1).findElement(getBy("operatorOfTableInRecycle"));
    }
    public WebElement getRecoverButtonInTable(List<WebElement> allRowKnowledge,int index ){
        return allRowKnowledge.get(index-1).findElement(getBy("recoverOfTableInRecycle"));
    }
    public WebElement getDeleteButtonInTable(List<WebElement> allRowKnowledge,int index ){
        return allRowKnowledge.get(index-1).findElement(getBy("deleteOfTableInRecycle"));
    }

}
