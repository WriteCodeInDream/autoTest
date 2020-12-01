package pageOperate;

import base.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElement.AuditedListPage;

import java.util.List;

public class AuditedPageOperation {
    private AuditedListPage auditedListPage;
    private List<WebElement> allKnowledge;
    public AuditedPageOperation(BaseDriver baseDriver){
        this.auditedListPage = new AuditedListPage(baseDriver);
        this.allKnowledge  = auditedListPage.getAllRowKnowledge();
    }

    public void sendKeysToQuestionInput (String value){
        auditedListPage.sendKeys(auditedListPage.getInputOfQuestion(),value);
    }

    public void sendKeysToAnsweiInput(String value){
        auditedListPage.sendKeys(auditedListPage.getInputOfAnswer(),value);
    }

    public void clickDownListOfSortType(){
        auditedListPage.clickWebElement(auditedListPage.getDownListOfSortType());
    }

    public void selectOneSortType(String value){
        auditedListPage.clickWebElement(auditedListPage.getOneSortType(value));
    }
    public void sendAuditedTime(String value){
        auditedListPage.sendKeys(auditedListPage.getAuditedTime(),value);
    }

    public void clickDowmListOfStatus(){
        auditedListPage.clickWebElement(auditedListPage.getDownListOfAuditedStatus());
    }
    public void selectOneAuditedStatus(String value){
        auditedListPage.clickWebElement(auditedListPage.getOneAuditedStatus(value));
    }

    public void clickSearch(){
        auditedListPage.clickWebElement(auditedListPage.getSearchButton());
    }
    public void clickReset(){
        auditedListPage.clickWebElement(auditedListPage.getResetButton());
    }

    public void clickBatchRollback(){
        auditedListPage.clickWebElement(auditedListPage.getRollbackButton());
    }

    public void selectCheckBox(int[] operationKnowledge){
        List<WebElement> allCheckBox = auditedListPage.getAllCheckBox();
        for(int i = 0; i < operationKnowledge.length; i++){
            WebElement checkBox = allCheckBox.get(operationKnowledge[1]);
            if(!auditedListPage.isSelected(checkBox)){
                auditedListPage.clickWebElement(checkBox);
            }
        }
    }

    public String getTextOfQuestion(int index){
        return auditedListPage.getText(auditedListPage.getStandardQuestionInTable(allKnowledge,index));
    }
    public String getTextOfAnswer(int index){
        return auditedListPage.getText(auditedListPage.getStandardAnswerInTable(allKnowledge,index));
    }
    public String getTextOfAuditedTime(int index){
        return auditedListPage.getText(auditedListPage.getAuditedTimeInTable(allKnowledge,index));
    }
    public String getTextOfAuditedMan(int index){
        return auditedListPage.getText(auditedListPage.getAuditedPeopleInTable(allKnowledge,index));
    }
    public String getTextOfSortType(int index){
        return auditedListPage.getText(auditedListPage.getSortTypeInTable(allKnowledge,index));
    }

    public String getTestOfStatus(int index){
        return auditedListPage.getText(auditedListPage.getAuditedStatusInTable(allKnowledge,index));
    }

    public void clickRollback(int index){
        auditedListPage.clickWebElement(auditedListPage.getRollbackInTable(allKnowledge,index));
    }
}
