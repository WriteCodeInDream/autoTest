package pageOperate;

import base.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElement.CustomizeKnowledgePage;

import java.util.List;

public class CustomizeKnowledgeOperation {
    private CustomizeKnowledgePage ckp;
    private List<WebElement> allRowKnowledge;
    public CustomizeKnowledgeOperation(BaseDriver baseDriver){
        this.ckp = new CustomizeKnowledgePage(baseDriver);
        this.allRowKnowledge = ckp.getAllRowKnowledge();
    }


    public void clickCustiomizeButton(){
        ckp.clickWebElement(ckp.getCustomizeKnowledgeButton());
    }
    public void clickRecycleDeptButton(){
        ckp.clickWebElement(ckp.getRecycleDeptButton());
    }
    public void clickReloadButton(){
        ckp.clickWebElement(ckp.getReloadButton());
    }
    public void clickExportButton(){
        ckp.clickWebElement(ckp.getExportButton());
    }
    public void clickPublicButton(){
        ckp.clickWebElement(ckp.getPublicKnowledge());
    }
    public void sendKeysToQuestion(String value){
        ckp.sendKeys(ckp.getQuestionInput(),value);
    }
    public void sendKeysToAnswer(String value){
        ckp.sendKeys(ckp.getAnswerInput(),value);
    }
    public void clickHotHitDownList(){
        ckp.clickWebElement(ckp.getHotHitDownList());
    }
    public void selectOneHotHit(String value){
        ckp.clickWebElement(ckp.getOneHotHit(value));
    }
    public void clickSortTypeDownList(){
        ckp.clickWebElement(ckp.getSortTypeDownList());
    }
    public void selectOneSortType(String value){
        ckp.getOneSortType(value);
    }

    public void sendKeysToModifyTime(String value){
        ckp.sendKeys(ckp.getModifyTimeInput(),value);
    }
    public void clickStatusDownList(){
        ckp.clickWebElement(ckp.getStatusDownList());
    }
    public void selectOneStatus(String value){
        ckp.getOneStatus(value);
    }
    public void clickSearchButton(){
        ckp.clickWebElement(ckp.getSelectButton());
    }

    public void clickResetButton(){
        ckp.clickWebElement(ckp.getResetButton());
    }
    public void clickBatchDownList(){
        ckp.clickWebElement(ckp.getOperationDownList());
    }
    public void selectOneOperation(String value){
        ckp.clickWebElement(ckp.getOneOperationType(value));
    }


    public void selectCheckBox(int[] operationKnowledge){
        List<WebElement> allRowKnowledgeCheckBox = ckp.getAllCheckBox();
        for(int i = 0; i < operationKnowledge.length; i++){
            WebElement checkBoxElement = allRowKnowledgeCheckBox.get(operationKnowledge[i]);
            if(!ckp.isSelected(checkBoxElement)){
                ckp.clickWebElement(checkBoxElement);
            }
        }
    }

    public String getTextOfQuestion(int index){
       return ckp.getText(ckp.getQuestionInTable(allRowKnowledge,index));
    }

    public String getTextOfAnswer(int index){
        return ckp.getText(ckp.getAnswerInTable(allRowKnowledge,index));
    }
    public String getTextOfSortType(int index){
        return ckp.getText(ckp.getSortTypeInTable(allRowKnowledge,index));
    }
    public String getTextOfStatus(int index){
        return ckp.getText(ckp.getStatusInTable(allRowKnowledge,index));
    }
    public String getTextOfHotHit(int index){
        return  ckp.getText(ckp.getHotHitInTable(allRowKnowledge,index));
    }
    public String getTextOfOperator(int index){
        return  ckp.getText(ckp.getOperatorInTable(allRowKnowledge,index));
    }
    public String getTextOfModifyTime(int index){
        return ckp.getText(ckp.getModifyTimeInTable(allRowKnowledge,index));
    }
    public void clickModify(int index){
        ckp.clickWebElement(ckp.getModifyButtonInTable(allRowKnowledge,index));
    }
    public void clickChangeStauts(int index){
        ckp.clickWebElement(ckp.getChangeStatusButtonInTable(allRowKnowledge,index));
    }
    public void clickRecycle(int index){
        ckp.clickWebElement(ckp.getRecycleButtonInTable(allRowKnowledge,index));
    }
}
