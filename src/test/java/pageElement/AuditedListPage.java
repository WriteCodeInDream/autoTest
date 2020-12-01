package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AuditedListPage  extends BasePage{
    /**
     * @param baseDriver 浏览器驱动
     */
    public AuditedListPage(BaseDriver baseDriver) {
        super(baseDriver);
    }


    public WebElement getInputOfQuestion(){
        return findElement(getBy("selectInputOfQuestionInAudited"));
    }
    public WebElement getInputOfAnswer(){
        return findElement(getBy("selectInputOfAnswerInAudited"));
    }

    public WebElement getDownListOfSortType(){
        return findElement(getBy("downListOfSortTypeInAudited"));
    }

    private List<WebElement> getAllSortType(){
        return findElements(getBy("allListOfSortTypeInAudited"));
    }

    public WebElement getOneSortType(String value){
        return getOneOfElementOfDownList(value,getAllSortType());
    }

    public WebElement getAuditedTime(){
        return findElement(getBy("auditedTimeInAudited"));
    }

    public WebElement getDownListOfAuditedStatus(){
        return findElement(getBy("downListOfAuditedStatusInAudited"));
    }

    private List<WebElement> getAllAuditedStatus(){
        return findElements(getBy("allListOfAuditedStatusInAudited"));
    }

    public WebElement getOneAuditedStatus(String value){
        return getOneOfElementOfDownList(value,getAllAuditedStatus());
    }

    public WebElement getSearchButton(){
        return findElement(getBy("selectButtonInAudited"));
    }

    public WebElement getResetButton(){
        return findElement(getBy("resetButtonInAudited"));
    }

    public WebElement getRollbackButton(){
        return findElement(getBy("rollbackButtonInAudited"));
    }
    public List<WebElement> getAllRowKnowledge(){
        return findElements(getBy("oneRowKnowledgeInAudited"));
    }
    public List<WebElement> getAllCheckBox(){
        return findElements(getBy("checkBoxInAudited"));
    }

    public WebElement getStandardQuestionInTable(List<WebElement> elements, int index){
        return elements.get(index-1).findElement(getBy("standardQuestionOfTableInAudited"));
    }
    public WebElement getStandardAnswerInTable(List<WebElement> elements, int index){
        return elements.get(index-1).findElement(getBy("standardAnswerOfTableInAudited"));
    }
    public WebElement getSortTypeInTable(List<WebElement> elements, int index){
        return elements.get(index-1).findElement(getBy("sortTypeOfTableInAudited"));
    }
    public WebElement getAuditedTimeInTable(List<WebElement> elements, int index){
        return elements.get(index-1).findElement(getBy("auditedTimeOfTableInAudited"));
    }
    public WebElement getAuditedStatusInTable(List<WebElement> elements, int index){
        return elements.get(index-1).findElement(getBy("auditedStatusOfTableInAudited"));
    }
    public WebElement getAuditedPeopleInTable(List<WebElement> elements, int index){
        return elements.get(index-1).findElement(getBy("auditedManOfTableInAudited"));
    }
    public WebElement getRollbackInTable(List<WebElement> elements, int index){
        return elements.get(index-1).findElement(getBy("rollbackButtonOfTable"));
    }

    /**
     * 知识数量
     * @return 返回页面结果总值
     */
    public WebElement getPageTotal(){
        return findElement(getBy("pageTotal"));
    }

}
