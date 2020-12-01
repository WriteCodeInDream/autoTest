package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class KnowledgeStudyPage extends BasePage{
    /**
     * @param baseDriver 浏览器
     */
    public KnowledgeStudyPage(BaseDriver baseDriver) {
        super(baseDriver);
    }

    public WebElement getQuestionInput(){
       return findElement(getBy("questionInputInStudy"));
    }
     public WebElement getCreateTimeInput(){
        return findElement(getBy("answerInputInStudy"));
     }

     public WebElement getSelectButton(){
        return findElement(getBy("selectButtonInStudy"));
     }

     public WebElement getResetButton(){
        return findElement(getBy("resetButtonInStudy"));
     }

     public List<WebElement> getAllKnowledge(){
        return findElements(getBy("allKnowledgeInStudy"));
     }
     public WebElement getQuestionInTable(List<WebElement> allKnowledge,int index){
        return allKnowledge.get(index-1).findElement(getBy("questionInTableOfStudy"));
     }
     public WebElement getAnswerInTable(List<WebElement> allKnowledge, int index){
        return allKnowledge.get(index - 1).findElement(getBy("answerInTableOfStudy"));
     }
     public WebElement getRecordTime(List<WebElement> allKnowledge, int index){
        return  allKnowledge.get(index - 1).findElement(getBy("recordTime"));
     }

     public WebElement getRecordButton(List<WebElement> allKnowledge, int index){
        return allKnowledge.get(index - 1).findElement(getBy("recordInStudy"));
     }
     public WebElement getIgnoreButton(List<WebElement> allKnowledge, int index){
        return allKnowledge.get(index - 1).findElement(getBy("ignoreInStudy"));
     }
     public WebElement getDeleteButton(List<WebElement> allKnowledge, int index){
        return allKnowledge.get(index - 1).findElement(getBy("deleteInStudy"));
     }
}
