package pageElement;

import base.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;
import java.util.List;

public class SortTypePage extends BasePage {
    /**
     * @param baseDriver
     */
    public SortTypePage(BaseDriver baseDriver) {
        super(baseDriver);
    }

    public WebElement getSortTypeInput(){
        return findElement(getBy("sortTypeNameInput"));
    }
    public WebElement getSelectButton(){
        return findElement(getBy("selectButtonInSortType"));
    }
    public WebElement getResetButton(){
        return findElement(getBy("resetButtonInSortType"));
    }
    public WebElement getAddSortTypeButton(){
        return findElement(getBy("addButtonInSortType"));
    }
    public List<WebElement> getAllSortType(){
        return findElements(getBy("allSortType"));
    }

   public WebElement getSortType(List<WebElement> allSortType, int index){
        return allSortType.get(index - 1).findElement(getBy("sortTypeInTableOfType"));
   }
   public WebElement getRelatedKnowledge(List<WebElement> allSortType, int index){
        return allSortType.get(index - -1).findElement(getBy("relatedKnowledgeOfType"));
   }
   public WebElement getStatus(List<WebElement> allSortType, int index){
        return allSortType.get(index - 1).findElement(getBy("statusOfType"));
   }
   public WebElement getModifyButton(List<WebElement> allSortType, int index){
        return allSortType.get(index - 1).findElement(getBy("modifyOfType"));
   }
   public WebElement getDeleteButton(List<WebElement> allSortType, int index){
        return allSortType.get(index - 1).findElement(getBy("deleteOfType"));
   }
}
