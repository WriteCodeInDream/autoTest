package pageOperate;

import base.BaseDriver;
import org.openqa.selenium.WebElement;
import pageElement.SortTypePage;

import java.util.List;

public class SortTypePageOperation {
    private SortTypePage sortTypePage;
    private List<WebElement> allSortType;
    public SortTypePageOperation(BaseDriver baseDriver) {
        this.sortTypePage = new SortTypePage(baseDriver);
        this.allSortType = sortTypePage.getAllSortType();
    }
    public void sendKeysToSortTypeInput(String value){
        sortTypePage.sendKeys(sortTypePage.getSortTypeInput(),value);
    }
    public void clickSelectButton(){
        sortTypePage.clickWebElement(sortTypePage.getSelectButton());
    }
    public void clickResetButton(){
        sortTypePage.clickWebElement(sortTypePage.getResetButton());
    }
    public void clickAllNewButton(){
        sortTypePage.clickWebElement(sortTypePage.getAddSortTypeButton());
    }
    public String getTextOfSortType(int index){
        return sortTypePage.getText(sortTypePage.getSortType(allSortType,index));
    }
    public String getTextOfRelatedSum(int index){
        return sortTypePage.getText(sortTypePage.getRelatedKnowledge(allSortType,index));
    }
    public String getStatus(int index){
        return sortTypePage.getText(sortTypePage.getStatus(allSortType,index));
    }
    public void clickModify(int index){
        sortTypePage.clickWebElement(sortTypePage.getModifyButton(allSortType, index));
    }
    public void clickDeleteButton(int index){
        sortTypePage.clickWebElement(sortTypePage.getDeleteButton(allSortType,index));
    }
}
