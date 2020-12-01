package pageOperate;

import base.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageElement.PreAuditedPage;

import java.util.List;

public class PreAuditedPageOperation {
    private PreAuditedPage preAuditedPage;
    private List<WebElement> allKnowledgeInTable;

    /**
     *
     * @param baseDriver webDriver
     */
    public PreAuditedPageOperation(BaseDriver baseDriver){

        this.preAuditedPage = new PreAuditedPage(baseDriver);
        this.allKnowledgeInTable = preAuditedPage.allRowKnowledgeOfTable();
    }

    /**
     * 点击待审核列表
     */
    public void clickPreAudited(){
        preAuditedPage.clickWebElement(preAuditedPage.getPreAuditedList());
    }
    /**
     *  点击已审核列表
     */
    public void clickAudited(){
        preAuditedPage.clickWebElement(preAuditedPage.getAuditedList());
    }
    /**
     * 点击新增知识
     */
    public void clickCreateNewKnowledge(){
        preAuditedPage.clickWebElement(preAuditedPage.getCreateNewKnowledge());
    }

    /**
     * 点击导入知识
     */
    public void clickImportKnowledge(){
        preAuditedPage.clickWebElement(preAuditedPage.getImportKnowledge());
    }
    /**
     * 输入问题
     * @param value 问题关键字
     */
    public void sendQuestion(String value){
        preAuditedPage.sendKeys(preAuditedPage.getQuestionInput(), value);
    }
    /**
     * 输入答案
     * @param value 答案关键字
     */
    public void sendAnswer(String value){
        preAuditedPage.sendKeys(preAuditedPage.getAnswerInput(), value);
    }
    /**
     * 输入时间
     * @param value 时间 格式为"yyyy-mm-dd - yyyy-mm-dd"
     */
    public void sendCreateTime(String value){
        preAuditedPage.sendKeys(preAuditedPage.getCreateTimeInput(), value);
    }
    /**
     * 点击知识分类下拉列表
     */
    public void clickSortType(){
        preAuditedPage.clickWebElement(preAuditedPage.getKnowledgeType());
    }
    /**
     * 选择一个知识分类
     * @param value 分类
     */
    public void selectSortType(String value){
        preAuditedPage.getOneOfKnowledgeType(value).click();
    }
    /**
     * 点击批量操作
     */
    public void clickBatchOperation(){
        preAuditedPage.clickWebElement(preAuditedPage.getBatchOperation());
    }

    /**
     * 点击一个批量操作
     * @param value 批量操作名称
     */
    public void selectBatchOperation(String value){
        preAuditedPage.clickWebElement( preAuditedPage.getOneOfBatchOperation(value));
    }
    /**
     * 点击确认
     */
    public void clickConfirmYes(){
        preAuditedPage.clickWebElement(preAuditedPage.getConfirmYes());
    }

    /**
     * 点击取消
     */
    public void clickConfirmNo(){
        preAuditedPage.clickWebElement(preAuditedPage.getConfirmNo());
    }
    /**
     * 获取当前总数
     */
    public Integer getSumOfTotal(){
        return Integer.parseInt(preAuditedPage.getText(preAuditedPage.getPageTotal()).split(" ")[1]);
    }
    /**
     * 点击查询
     */
    public void clickSelectFromPreAudited(){
        preAuditedPage.clickWebElement(preAuditedPage.getSelectFromPreAudited());
    }
    /**
     * 点击重置
     */
    public void clickResetFromPreAudited(){
        preAuditedPage.clickWebElement(preAuditedPage.getResetFromPreAudited());
    }



    public void clickDownListOfSortType(WebElement modalType){
        preAuditedPage.clickWebElement(preAuditedPage.getSortType(modalType));
    }

    /**
     *
     * @param value 分类名称
     */
    public void selectTypeOfCreateNew(String value, WebElement modalType){
        preAuditedPage.clickWebElement(preAuditedPage.getOneSortTypeOfModal(value,modalType));
    }

    /**
     *
     * @param value 标准问题
     */
    public void sendStandardQuestion(String value, WebElement  modalType){
        preAuditedPage.clearValue(preAuditedPage.getStandardQuestion(modalType));
        preAuditedPage.sendKeys(preAuditedPage.getStandardQuestion(modalType),value);
    }

    /**
     *
     * @param hasSimilarQuestion 是否有相似问题
     * @param value 标准答案
     */
    public void sendStandardAnswer(boolean hasSimilarQuestion, String value, WebElement modalType){
        WebElement standardAnswerInput = preAuditedPage.getStandardAnswer(modalType, hasSimilarQuestion);
        WebElement element = standardAnswerInput.findElement(preAuditedPage.getBy("inputOfAnswer"));
        preAuditedPage.clearValue(element);
        element = standardAnswerInput.findElement(preAuditedPage.getBy("inputOfAnswer"));
        preAuditedPage.sendKeys(element,value);
    }


    /**
     *
     * @param similarQuestionList 相似问题列表
     */
    public void sendSimilarQuestion(List<String> similarQuestionList, WebElement modalType){
    List<WebElement> elements = preAuditedPage.getSimilarQuestionList(modalType);
    int i = 0;
    for(WebElement element : elements){
        preAuditedPage.clearValue(element.findElement(preAuditedPage.getBy("similarQuestionDivInput")));
        element.findElement(preAuditedPage.getBy("similarQuestionDivInput")).sendKeys(similarQuestionList.get(i));
        i++;
    }
    }



    /**
     *
     * @param hasSimilarQuestion 是否有相似问题
     * @param similarAnswerList 相似答案列表
     */
    public void sendSimilarAnswer(boolean hasSimilarQuestion, List<String> similarAnswerList, WebElement modalType){
        List<WebElement> elements = preAuditedPage.getSimilarAnswer(modalType,hasSimilarQuestion);
        int i = 0;
        for(WebElement element : elements){
            element.findElement(preAuditedPage.getBy("inputOfAnswer")).clear();
            element.findElement(preAuditedPage.getBy("inputOfAnswer")).sendKeys(similarAnswerList.get(i));
            i++;
        }
    }

    /**
     * 点击新增相似问题
     */
    public void clickAddNewSimilarQuestion(WebElement modalType){
        preAuditedPage.clickWebElement(preAuditedPage.getCreateSimilarQuestion(modalType));
    }

    /**
     * 点击删除相似问题
     */
    private void clickDecreaseSimilarQuestion(WebElement modalType){
        preAuditedPage.clickWebElement(preAuditedPage.getDecreaseSimilarQuestion(modalType));
    }

    /**
     *  删除或者新增相似答案
     * @param hasSimilarQuestion 是否有相似问题
     * @param isCreate 是否为新增
     */
    public void clickAddOrDecreaseSimilarAnswer(boolean hasSimilarQuestion, boolean isCreate, WebElement modalType){
        preAuditedPage.clickWebElement(preAuditedPage.
                getCreateOrDecreaseSimilarAnswer(hasSimilarQuestion,modalType,isCreate));
    }


    public void clickCreateNewTypeInCreateKnowledge(WebElement modalType){
        preAuditedPage.clickWebElement(preAuditedPage.getCreateNewSortType(modalType));
    }
    public void clickConfirmYes(WebElement modalType){
        preAuditedPage.clickWebElement(preAuditedPage.getConfirmYes(modalType));
    }


    /**
     *
     */
    public void sendCreateNewType(String value, WebElement modalType){
        preAuditedPage.sendKeys(modalType.findElement(preAuditedPage.
                getBy("createNewTypeInKnowledgeManagement")),value);
    }


    public void clickSelectSortType(WebElement modalType){
        preAuditedPage.clickWebElement(modalType.findElement(preAuditedPage.
                getBy("statueOfCreateNewTypeInKnowledgeManagement")));
    }

    public void selectStatusOfSortType(String value,WebElement modalType){
        preAuditedPage.getOneOfElementOfDownList(value,modalType.findElements(preAuditedPage.
                getBy("selectStatusOfSortTypeInKnowledgeManagement"))).click();
    }

    /**
     *  获取标准问题文本
     */
    public String getTextOfQuestionInTable(int index){
        return preAuditedPage.getText(preAuditedPage.getStandardQuestionOfOneTable(index,allKnowledgeInTable));
    }
    /**
     * 获取标准答案文本
     */
    public String getTextOfAnswerInTable(int index){
        return preAuditedPage.getText(preAuditedPage.getStandardAnswerOfTable(index, allKnowledgeInTable));
    }

    /**
     * 获取分类文本
     */
    public String  getTextOfSortTypeInTable(int index){
        return preAuditedPage.getText(preAuditedPage.getSortTypeOfTable(index,allKnowledgeInTable));
    }

    /**
     *  获取创建时间文本
     */
    public String getTextOfCreateTimeInTable(int index){
        return preAuditedPage.getText(preAuditedPage.getCreateTimeOfTable(index,allKnowledgeInTable));
    }

    /**
     * 获取创建人文本
     */
    public String getTextOfCreatorInTable(int index){
       return preAuditedPage.getText(preAuditedPage.getCreatorOfTable(index,allKnowledgeInTable));
    }

    /**
     * 点击编辑按钮
     */

    public void clickModifyInTable(int index){
        preAuditedPage.clickWebElement(preAuditedPage.getAuditedOperationOfTable(index,allKnowledgeInTable));
    }

    /**
     * 点击通过按钮
     */
    public void clickPassInTable(int index){
        preAuditedPage.clickWebElement(preAuditedPage.getPassOperationOfTable(index,allKnowledgeInTable));
    }

    /**
     * 点击不通过按钮
     */
    public void clickNoPassInTable(int index){
        preAuditedPage.clickWebElement(preAuditedPage.getNoPassOperationOfTable(index,allKnowledgeInTable));
    }

    /**
     *  点击删除按钮
     */
    public void clickDeleteInTable(int index){
        preAuditedPage.clickWebElement(preAuditedPage.getDeleteOperationOfTable(index,allKnowledgeInTable));
    }


    private int getSizeOfModifyDiv(WebElement webElement){
        return webElement.findElements(By.xpath("div[2]/form/div")).size();
    }

    private boolean hasSimilarQuestion(WebElement modifyKnowledgeModal){
            String labelText =(modifyKnowledgeModal.
                    findElement(preAuditedPage.getBy("modifyModalThreeLabel")).getText());
            return "相似问题：".equals(labelText);

    }


    private boolean hasSimilarAnswer(WebElement modifyKnowledgeModal){
        int size = getSizeOfModifyDiv(modifyKnowledgeModal);
        if( size == 5){
            return true;
        }else{
            String labelText =(modifyKnowledgeModal.
                    findElement(preAuditedPage.getBy("modifyModalFourLabel")).getText());
            return "相似答案：".equals(labelText);
        }
    }

    public void changeCountOfSimilarQuestionOrAnswer(int countOfSimilarQuestionAfter, int countOfSimilarAnswerAfter,
                                                     WebElement modifyKnowledgeModal) {

        if(hasSimilarQuestion(modifyKnowledgeModal)){
            int countOfSimilarQuestionBefore = preAuditedPage.getSimilarQuestionList(modifyKnowledgeModal).size();
            if(countOfSimilarQuestionAfter < countOfSimilarQuestionBefore){
                for(int i = countOfSimilarQuestionAfter; i < countOfSimilarQuestionBefore; i++){
                    clickDecreaseSimilarQuestion(modifyKnowledgeModal);
                }
            }else{
                for(int i = countOfSimilarQuestionBefore; i <  countOfSimilarQuestionAfter; i++ ){
                    clickAddNewSimilarQuestion(modifyKnowledgeModal);
                }
            }
        }else{
            for(int i = 0; i<countOfSimilarQuestionAfter; i++){
                clickAddNewSimilarQuestion(modifyKnowledgeModal);
            }
        }
        if(hasSimilarAnswer(modifyKnowledgeModal)){
            int countOfSimilarAnswerBefore = preAuditedPage.
                    getSimilarAnswer(modifyKnowledgeModal,hasSimilarQuestion(modifyKnowledgeModal)).size();
            if(countOfSimilarAnswerAfter < countOfSimilarAnswerBefore){
                for(int i = countOfSimilarAnswerAfter; i < countOfSimilarAnswerBefore; i++){
                    clickAddOrDecreaseSimilarAnswer(hasSimilarQuestion(modifyKnowledgeModal),false, modifyKnowledgeModal);
                }
            }else{
                for(int i = countOfSimilarAnswerBefore; i < countOfSimilarAnswerAfter; i++){
                    clickAddOrDecreaseSimilarAnswer(hasSimilarQuestion(modifyKnowledgeModal),true, modifyKnowledgeModal);
                }
            }
        }else{
            for(int i = 0; i < countOfSimilarAnswerAfter; i++){
                clickAddOrDecreaseSimilarAnswer(hasSimilarQuestion(modifyKnowledgeModal),true , modifyKnowledgeModal);
            }
        }



    }

    public void selectCheckBox(int[] a){
        List<WebElement> allCheckBox = preAuditedPage.getAllCheckBox();
        for(int i = 0; i < a.length; i++){
            WebElement checkBox = allCheckBox.get(a[i]);
            if(!preAuditedPage.isSelected(checkBox)){
                preAuditedPage.clickWebElement(checkBox);
            }
        }
    }

    /**
     * 获取新增分类模态框
     * @return 创建分类模态框
     */
    public WebElement getCreateSortType(){
        return preAuditedPage.getCreateNewSortTypeModal();
    }


    /**
     *  获取编辑知识模态框
     */
    public WebElement getModifyModal(){
        return preAuditedPage.getModifyKnowledgeModal();
    }

    public WebElement getCreateNewModal(){
        return preAuditedPage.getCreateNewKnowledgeModal();
    }
}
