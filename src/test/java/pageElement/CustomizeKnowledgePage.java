package pageElement;

import base.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomizeKnowledgePage extends  BasePage{

    /**
     * @param baseDriver 浏览器
     */
    public CustomizeKnowledgePage(BaseDriver baseDriver) {
        super(baseDriver);
    }

    public WebElement getCustomizeKnowledgeButton(){
        return findElement(getBy("customizeKnowledge"));
    }

    public WebElement getRecycleDeptButton(){
        return findElement(getBy("recycleDept"));
    }

    public WebElement getReloadButton(){
        return findElement(getBy("reloadKnowledge"));
    }

    public WebElement getExportButton(){
        return findElement(getBy("exportKnowledge"));
    }
    public WebElement getPublicKnowledge(){
        return findElement(getBy("publicKnowledge"));
    }

    public WebElement getQuestionInput(){
        return findElement(getBy("questionInputInCustomize"));
    }

    public WebElement getAnswerInput(){
        return findElement(getBy("answerInputInCustomize"));
    }
    public WebElement getHotHitDownList(){
        return findElement(getBy("hotHitDownListInCustomize"));
    }
    public List<WebElement> getAllHotHitType(){
        return findElements(getBy("allHotListInCustomize"));
    }

    public WebElement getOneHotHit(String value){
        return getOneOfElementOfDownList(value,getAllHotHitType());
    }

    public WebElement getSortTypeDownList(){
        return findElement(getBy("sortTypeDownListInCustomize"));
    }
    public List<WebElement> getAllSortType(){
        return findElements(getBy("allSortTypeInCustomize"));
    }

    public WebElement getOneSortType(String value){
        return getOneOfElementOfDownList(value, getAllSortType());
    }
    public WebElement getModifyTimeInput(){
        return findElement(getBy("modifyTimeInputInCustomize"));
    }
    public WebElement getStatusDownList(){
        return findElement(getBy("statusDownListInCustomize"));
    }
    public List<WebElement> getAllStatus(){
        return findElements(getBy("allStatusInCustomize"));
    }
    public WebElement getOneStatus(String value){
        return getOneOfElementOfDownList(value,getAllStatus());
    }
    public WebElement getSelectButton(){
        return findElement(getBy("selectButtonInCustomize"));
    }
    public WebElement getResetButton(){
        return findElement(getBy("resetButtonInCustomize"));
    }
    public WebElement getOperationDownList(){
        return findElement(getBy("batchOperationDownListInCustomize"));
    }
    public List<WebElement> getAllOperationType(){
        return findElements(getBy("allBatchOperationInCustomize"));
    }
    public WebElement getOneOperationType(String value){
        return getOneOfElementOfDownList(value, getAllOperationType());
    }
    public List<WebElement> getAllRowKnowledge(){
        return findElements(getBy("allRowKnowledgeInCustomize"));
    }
    public List<WebElement> getAllCheckBox(){
        return findElements(getBy("allCheckBoxInCustomize"));
    }
    public WebElement getQuestionInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("questionOfTableInCustomize"));
    }
    public WebElement getAnswerInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("answerOfTableInCustomize"));
    }
    public WebElement getSortTypeInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("sortTypeOfTableInCustomize"));
    }
    public WebElement getStatusInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("statusOfTableInCustomize"));
    }
    public WebElement getHotHitInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("hitHotOfTableInCustomize"));
    }
    public WebElement getOperatorInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("operatorOfTableInCustomize"));
    }
    public WebElement getModifyTimeInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("modifyTimeOfTableInCustomize"));
    }
    public WebElement getModifyButtonInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("modifyOfTableInCustomize"));
    }
    public WebElement getChangeStatusButtonInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("changeStatusOfTableInCustomize"));
    }
    public WebElement getRecycleButtonInTable(List<WebElement> allRowKnowledge, int index){
        return allRowKnowledge.get(index-1).findElement(getBy("recycleOfTableInCustomize"));
    }

}
