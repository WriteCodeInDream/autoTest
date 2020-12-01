package pageOperate;

import base.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElement.RecycleDeptPage;

import java.util.List;

public class RecycleDeptPageOperation {
    private List<WebElement> allKnowledge;
    private RecycleDeptPage recycleDeptPage;
    public RecycleDeptPageOperation(BaseDriver baseDriver){
        this.recycleDeptPage = new RecycleDeptPage(baseDriver);
        this.allKnowledge = recycleDeptPage.getAllRowKnowledge();
    }
    public  void sendKeysToQuestion(String value){
        recycleDeptPage.sendKeys(recycleDeptPage.getQuestionInput(),value);
    }

    public void sendKeysToAnswer(String value){
        recycleDeptPage.sendKeys(recycleDeptPage.getAnswerInput(),value);
    }

    public void clickSortTypeDownList(){
        recycleDeptPage.clickWebElement(recycleDeptPage.getSortTypeDownList());
    }
    public void selectOneSortType(String value){
        recycleDeptPage.clickWebElement(recycleDeptPage.selectOneSortType(value));
    }
    public void sendKeysToRecycleTime(String value){
        recycleDeptPage.sendKeys(recycleDeptPage.getRecycleTimeInput(),value);
    }
    public void clickSearchButton(){
        recycleDeptPage.clickWebElement(recycleDeptPage.getSearchButton());
    }
    public void clickResetButton(){
        recycleDeptPage.clickWebElement(recycleDeptPage.getResetButton());
    }
    public void clickBatchOperation(){
        recycleDeptPage.clickWebElement(recycleDeptPage.getBatchOperation());
    }
    public void selectOnOperation(String value){
        recycleDeptPage.clickWebElement(recycleDeptPage.getOneBatchOperation(value));
    }

    public void selectCheckBox(int[] checkBox){
        List<WebElement> allCheckBox = recycleDeptPage.getAllCheckBox();
        for(int i = 0; i < checkBox.length; i++){
            WebElement checkBoxEle = allCheckBox.get(checkBox[i]);
            if(!recycleDeptPage.isSelected(checkBoxEle)){
                recycleDeptPage.clickWebElement(checkBoxEle);
            }
        }
    }

    public String getTextOfQuestion(int index){
        return recycleDeptPage.getText(recycleDeptPage.getQuestionInTable(allKnowledge, index));
    }

    public String getTextOfAnswer(int index){
        return recycleDeptPage.getText(recycleDeptPage.getAnswerInTable(allKnowledge, index));
    }

    public String getTextOfSortType(int index){
        return recycleDeptPage.getText(recycleDeptPage.getSortTypeInTable(allKnowledge, index));
    }
    public String getTextOfRecycleTime(int index){
        return recycleDeptPage.getText(recycleDeptPage.getRecycleTimeInTable(allKnowledge, index));
    }

    public String getTextOfOperator(int index){
        return recycleDeptPage.getText(recycleDeptPage.getOperatorInTable(allKnowledge,index));
    }

    public void clickRecover(int index){
        recycleDeptPage.clickWebElement(recycleDeptPage.getRecoverButtonInTable(allKnowledge, index));
    }

    public void clickDelete(int index){
        recycleDeptPage.clickWebElement(recycleDeptPage.getDeleteButtonInTable(allKnowledge, index));
    }
}
