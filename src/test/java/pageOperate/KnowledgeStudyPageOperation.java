package pageOperate;

import base.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElement.KnowledgeStudyPage;

import java.util.List;

public class KnowledgeStudyPageOperation {
    private KnowledgeStudyPage knowledgeStudyPage;
    private List<WebElement> allKnowledge;
    public KnowledgeStudyPageOperation(BaseDriver baseDriver){
        this.knowledgeStudyPage = new KnowledgeStudyPage(baseDriver);
        this.allKnowledge = knowledgeStudyPage.getAllKnowledge();
    }

    public void sendKeysToQeustion(String value){
        knowledgeStudyPage.sendKeys(knowledgeStudyPage.getQuestionInput(), value);
    }
    public void sendKeysToRecordTime(String value){
        knowledgeStudyPage.sendKeys(knowledgeStudyPage.getCreateTimeInput(), value);
    }
    public void clickSelectButton(){
        knowledgeStudyPage.clickWebElement(knowledgeStudyPage.getSelectButton());
    }
    public void clickReserButton(){
        knowledgeStudyPage.clickWebElement(knowledgeStudyPage.getResetButton());
    }
    public String getTextOfQuestion(int index){
        return knowledgeStudyPage.getText(knowledgeStudyPage.getQuestionInTable(allKnowledge,index));
    }
    public String getTextOfAnswer(int index){
        return knowledgeStudyPage.getText(knowledgeStudyPage.getAnswerInTable(allKnowledge,index));
    }
    public String getTextOfRecordTime(int index){
        return knowledgeStudyPage.getText(knowledgeStudyPage.getRecordTime(allKnowledge,index));
    }
    public void clickRecordButton(int index){
        knowledgeStudyPage.clickWebElement(knowledgeStudyPage.getRecordButton(allKnowledge, index));
    }
    public void clickIgnoreButton(int index){
        knowledgeStudyPage.clickWebElement(knowledgeStudyPage.getIgnoreButton(allKnowledge, index));
    }
    public void clickDeleteButton(int index){
        knowledgeStudyPage.clickWebElement(knowledgeStudyPage.getDeleteButton(allKnowledge, index));
    }

}
