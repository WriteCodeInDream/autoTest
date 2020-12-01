package pageElement;

import base.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.GetByLocator;

import java.util.List;


public class PreAuditedPage extends BasePage{
    /**
     * @param baseDriver 传入driver
     */
    public PreAuditedPage(BaseDriver baseDriver) {
        super(baseDriver);
    }

    /**
     * 待审核列表
     */
    public WebElement getPreAuditedList(){
        return findElement(getBy("preAuditedList"));
    }
    /**
     * 已审核列表
     */
    public WebElement getAuditedList(){
        return findElement(getBy("auditedList"));
    }
    /**
     * 已审核列表新增知识
     */
    public WebElement getCreateNewKnowledge(){
        return findElement(getBy("createNewKnowledgeButton"));
    }
    /**
     * 已审核列表导入知识
     */
    public WebElement getImportKnowledge(){
        return findElement(getBy("importKnowledgeButton"));
    }

    /**
     * 二次确认弹窗确定
     */
    public WebElement getConfirmYes(){
        return findElement(getBy("confirmYesButton"));
    }
    /**
     * 二次确认弹窗取消
     */
    public WebElement getConfirmNo(){
        return findElement(getBy("confirmNoButton"));
    }
    /**
     * 批量操作
     */
    public WebElement getBatchOperation(){
        return findElement(getBy("batchOperation"));
    }
    /**
     * 所有批量操作
     */
    private List<WebElement> getAllBatchOperations(){
        return findElements(getBy("allBatchOperation"));
    }
    /**
     * 获取一个批量操作类型
     */
    public WebElement getOneOfBatchOperation(String typeOfOperation){
        return getOneOfElementOfDownList(typeOfOperation,getAllBatchOperations());
    }
    /**
     * 问题关键字输入框
     */
    public WebElement getQuestionInput(){
        return findElement(getBy("questionInput"));
    }
    /**
     * 答案关键字输入框
     */
    public WebElement getAnswerInput(){
        return findElement(getBy("answerInput"));
    }
    /**
     * 创建时间输入框
     */
    public WebElement getCreateTimeInput(){
        return findElement(getBy("createTimeInput"));
    }
    /**
     * 知识分类
     */
    public WebElement getKnowledgeType(){
        return findElement(getBy("knowledgeType"));
    }

    /**
     * 获取所有的分类
     * @return 返回所有的分类
     */
    private List<WebElement> getKnowledgeTypeUl(){
        return findElements(getBy("knowledgeTypeUl"));
    }
    /**
     * 获取一个分类
     */
    public WebElement getOneOfKnowledgeType(String replyType){
        return getOneOfElementOfDownList(replyType, getKnowledgeTypeUl());
    }

    /**
     * 查询
     * @return 查询按钮
     */
    public WebElement getSelectFromPreAudited(){
        return findElement(getBy("selectFromPreAudited"));
    }

    /**
     * 重置
     * @return 返回重置按钮
     */
    public WebElement getResetFromPreAudited(){
        return findElement(getBy("resetFromPreAudited"));
    }


    /**
     * 知识数量
     * @return 返回页面结果总值
     */
    public WebElement getPageTotal(){
        return findElement(getBy("pageTotal"));
    }

    /**
     * 获取新增知识模态框
     */
    public WebElement getCreateNewKnowledgeModal(){
        return switchToModal("新增知识库", getBy("modalName"));
    }

    /**
     * 获取新增分类模态框
     */
    public WebElement getCreateNewSortTypeModal(){
        return switchToModal("新增知识分类", getBy("modalName"));
    }

    /**
     * 获取导入模态框
     */

    public WebElement getImportKnowledgeModal(){
        return switchToModal("预料导入", getBy("modalName"));
    }
    /**
     * 获取编辑知识模态框
     */
    public WebElement getModifyKnowledgeModal(){
        return switchToModal("编辑知识库", getBy("modalName"));
    }
    /**
     * 分类输入框
     * @param webElement 新增知识模态框
     * @return 分类输入框，点击展开下拉列表
     */
    public WebElement getSortType(WebElement webElement){
       return webElement.findElement(getBy("sortTypeOfCreateNewInput"));
    }

    /**
     *
     * @param webElement 新增知识模态框
     * @return 所有的分类下拉选项
     */
    private List<WebElement> getAllSortType(WebElement webElement){
        return webElement.findElements(getBy("listOfAllSortType"));
    }

    /**
     *
     * @param sortTypeName 分类的名字
     * @return 分类元素
     */
    public WebElement getOneSortTypeOfModal(String sortTypeName,WebElement modalType){
        return getOneOfElementOfDownList(sortTypeName, getAllSortType(modalType));
    }

    /**
     *
     * @param webElement 新增知识模态框
     * @return 新增知识按钮
     */
    public WebElement getCreateNewSortType(WebElement webElement){
        return webElement.findElement(getBy("sortTypeOfCreateNewTypeButton"));
    }

    /**
     *
     * @param webElement 标准知识模态框
     * @return 标准问题输入框
     */
    public WebElement getStandardQuestion(WebElement webElement){
        return webElement.findElement(getBy("standardQuestion"));
    }

    /**
     *
     * @param webElement 标准知识模态框
     * @return 相似问题
     */
    public List<WebElement> getSimilarQuestionList(WebElement webElement){
        return webElement.findElements(getBy("similarQuestionDivs"));
    }

    /**
     *
     * @param webElement 新增知识模态框
     * @return 新增相似问题按钮
     */
    public WebElement getCreateSimilarQuestion(WebElement webElement){
        return webElement.findElement(getBy("createSimilarQuestion"));
    }

    /**
     *
     * @param webElement 新增知识模态框
     * @return 减少相似问题
     */
    public WebElement getDecreaseSimilarQuestion(WebElement webElement){
        return webElement.findElement(getBy("decreaseSimilarQuestion"));
    }

    /**
     *
     * @param hasSimilarQuestion 是否有相似问题
     * @param webElement 新增问题模态框
     * @param create 是新增还是删除相似答案
     * @return 删除相似知识或者新增相似知识按钮
     */
    public WebElement getCreateOrDecreaseSimilarAnswer(boolean hasSimilarQuestion,WebElement webElement,boolean create){

        if(hasSimilarQuestion){
            if(create){
                //如果是有相似问题并且要新增相似问题
                return webElement.findElement(getBy("situationOfFour"))
                        .findElement(getBy("similarAnswer"));
            }else{
                // 有相似问题但是要删减
                return webElement.findElements(getBy("situationOfFive")).get(0)
                        .findElement(getBy("similarAnswer"));
            }
        }else{
            if (create){
                // 无相似问题新增
                return webElement.findElement(getBy("situationOfThree")).findElement(getBy("similarAnswer"));
            }else{
                // 无相似问题删减
                return webElement.findElements(getBy("situationOfFour")).get(0)
                        .findElement(getBy("similarAnswer"));
            }
        }

    }
    /**
     *
     * @param webElement 知识新增模态框
     * @param hasSimilarQuestion 是否有相似问题
     * @return 获取标准答案输入框
     */
    public WebElement getStandardAnswer(WebElement webElement, boolean hasSimilarQuestion){
        if (hasSimilarQuestion){
            return webElement.findElement(getBy("situationOfFour"));
        }else {
            return webElement.findElement(getBy("situationOfThree"));
        }
    }

    /**
     *
     * @param webElement 新增知识模态框
     * @param hasSimilarQuestion 是否有相似答案
     * @return 所有的相似问题
     */
    public List<WebElement> getSimilarAnswer(WebElement webElement, boolean hasSimilarQuestion){
        if (hasSimilarQuestion){
            return webElement.findElements(getBy("situationOfFive"));
        }else {
            return webElement.findElements(getBy("situationOfFour"));
        }
    }

    /**
     *
     * @param webElement 模态框
     * @return 模态框的确认保存按钮
     */
    public WebElement getConfirmYes(WebElement webElement){
        return webElement.findElement(getBy("confirmOfModal"));
    }

    /**
     *
     * @param webElement 模态框
     * @return 模态框的取消按钮
     */
    public WebElement getConfirmNo(WebElement webElement){
        return webElement.findElement(getBy("cancelOfModal"));
    }


    public List<WebElement> allRowKnowledgeOfTable(){
        return findElements(getBy("oneRowKnowledge"));
    }

    /**
     *
     * @param index 第几列知识
     * @param webElements 所有列知识
     * @return 标准问题文本
     */
    public WebElement getStandardQuestionOfOneTable(int index, List<WebElement> webElements){
        return webElements.get(index-1).findElement(getBy("standardQuestionOfTable"));
    }

    /**
     *
     * @param index 第几列知识
     * @param webElements 所有列知识
     * @return 标准答案文本
     */
    public WebElement getStandardAnswerOfTable(int index, List<WebElement> webElements){
        return webElements.get(index-1).findElement(getBy("standardAnswerOfTable"));
    }

    /**
     *
     * @param index 第几列知识
     * @param webElements 所有列知识
     * @return 分类文本
     */
     public WebElement getSortTypeOfTable(int index, List<WebElement> webElements){
        return webElements.get(index-1).findElement(getBy("sortTypeOfTable"));
    }

    /**
     *
     * @param index 第几列知识
     * @param webElements 所有列知识
     * @return 创建时间文本
     */
     public WebElement getCreateTimeOfTable(int index, List<WebElement> webElements){
        return webElements.get(index-1).findElement(getBy("createTimeOfTable"));
    }

    /**
     *
     * @param index 第几列知识
     * @param webElements 所有列知识
     * @return 分类文本
     */
     public WebElement getCreatorOfTable(int index, List<WebElement> webElements){
        return webElements.get(index-1).findElement(getBy("creatorOfTable"));
    }

    /**
     *
     * @param index 第几列知识
     * @param webElements 所有列知识
     * @return 编辑
     */
     public WebElement getAuditedOperationOfTable(int index, List<WebElement> webElements){
        return webElements.get(index-1).findElement(getBy("modifyOfTable"));
    }

    /**
     *
     * @param index 第几列知识
     * @param webElements 所有列知识
     * @return 通过按钮
     */
    public WebElement getPassOperationOfTable(int index, List<WebElement> webElements){
        return webElements.get(index-1).findElement(getBy("passOfTable"));
    }

    /**
     *
     * @param index 第几列知识
     * @param webElements 所有列知识
     * @return 不通过按钮
     */
    public WebElement getNoPassOperationOfTable(int index, List<WebElement> webElements){
        return webElements.get(index-1).findElement(getBy("noPassOfTable"));
    }

    /**
     *
     * @param index 第几列知识
     * @param webElements 所有列知识
     * @return 删除按钮
     */
    public WebElement getDeleteOperationOfTable(int index, List<WebElement> webElements){
        return webElements.get(index-1).findElement(getBy("deleteOfTable"));
    }

    /**
     *
     */
    public List<WebElement> getAllCheckBox(){
        return findElements(getBy("checkBox"));
    }

}
