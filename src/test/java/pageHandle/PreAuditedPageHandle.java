package pageHandle;


import base.BaseDriver;

import org.openqa.selenium.WebElement;
import pageOperate.PreAuditedPageOperation;

import testEnum.EnumKnowledge;
import utils.TimeWaitingMethod;

import java.util.List;


public class PreAuditedPageHandle {

    private PreAuditedPageOperation preAuditedPageOperation;
    public PreAuditedPageHandle(BaseDriver baseDriver){
        this.preAuditedPageOperation = new PreAuditedPageOperation(baseDriver);
    }

    /**
     *  新增知识
     * @param sortType 问题分类
     */
    public void testAddKnowledge(String sortType, EnumKnowledge knowledge){
        WebElement createNewKnowledgeModal;
        preAuditedPageOperation.clickCreateNewKnowledge();
        createNewKnowledgeModal = preAuditedPageOperation.getCreateNewModal();
        TimeWaitingMethod.TimeWaiting(2000);
        if(!(null == sortType || sortType.length() == 0 || sortType.equals(" "))){
            preAuditedPageOperation.clickDownListOfSortType(createNewKnowledgeModal);
            preAuditedPageOperation.selectTypeOfCreateNew(sortType,createNewKnowledgeModal);
        }
        // 点击添加相似问题
        if(null != knowledge.similarQuestion){
            for(int i = 0; i<knowledge.similarQuestion.size(); i++){
                preAuditedPageOperation.clickAddNewSimilarQuestion(createNewKnowledgeModal);
            }
            preAuditedPageOperation.sendSimilarQuestion(knowledge.similarQuestion, createNewKnowledgeModal);
        }

        // 点击添加相似答案
        if(null != knowledge.similarAnswer){
            for (int i = 0; i<knowledge.similarAnswer.size(); i++){
                preAuditedPageOperation.clickAddOrDecreaseSimilarAnswer(null == knowledge.similarQuestion?false:knowledge.similarQuestion.size()>0,
                        true, createNewKnowledgeModal);
            }
            preAuditedPageOperation.sendSimilarAnswer(null == knowledge.similarQuestion?false:knowledge.similarQuestion.size()>0, knowledge.similarAnswer
                    ,createNewKnowledgeModal);
        }

        preAuditedPageOperation.sendStandardQuestion(knowledge.question,createNewKnowledgeModal);
        preAuditedPageOperation.sendStandardAnswer(null == knowledge.similarQuestion?false:knowledge.similarQuestion.size()>0,knowledge.answer
        , createNewKnowledgeModal);
        preAuditedPageOperation.clickConfirmYes(createNewKnowledgeModal);
        preAuditedPageOperation.clickConfirmNo(createNewKnowledgeModal);
    }

    /**
     *  新增一个知识分类
     * @param  value 分类的名称
     * @param status 分类的状态
     */
    public void createNewSortTypeInCreateKnowledge(String value, String status){
        preAuditedPageOperation.clickCreateNewKnowledge();
        TimeWaitingMethod.TimeWaiting(2000);
        WebElement createNewKnowledgeModal = preAuditedPageOperation.getCreateNewModal();
        preAuditedPageOperation.clickCreateNewTypeInCreateKnowledge(createNewKnowledgeModal);
        WebElement createNewSortTypeModal = preAuditedPageOperation.getCreateSortType();
        preAuditedPageOperation.sendCreateNewType(value,createNewSortTypeModal);
        preAuditedPageOperation.clickSelectSortType(createNewSortTypeModal);
        preAuditedPageOperation.selectStatusOfSortType(status,createNewSortTypeModal);
        preAuditedPageOperation.clickConfirmYes(createNewSortTypeModal);
    }

    /**
     *  待审核列表查询
     * @param question 问题关键字
     * @param answer 答案关键字
     * @param sortType 分类
     * @param createData 创建时间
     */
    public void selectInKnowledgePreAuditedPage(String question, String answer, String sortType, String createData){
        preAuditedPageOperation.sendQuestion(question);
        preAuditedPageOperation.sendAnswer(answer);
        preAuditedPageOperation.clickSortType();
        preAuditedPageOperation.selectSortType(sortType);
        preAuditedPageOperation.sendCreateTime(createData);
        preAuditedPageOperation.clickSelectFromPreAudited();
    }

    /**
     * 导入知识
     */
    public void importKnowledge(){
        preAuditedPageOperation.clickImportKnowledge();


    }

    /**
     *
     * @param question 问题
     * @param answer 答案
     * @param sortType 知识分类
     * @param similarQuestion 相似问题
     * @param similarAnswer 相似答案
     */
    public void modifyKnowledge(String question, String answer, String sortType, List<String> similarQuestion
    , List<String> similarAnswer){
        preAuditedPageOperation.clickModifyInTable(1);
        WebElement modifyKnowledgeModal = preAuditedPageOperation.getModifyModal();
        preAuditedPageOperation.changeCountOfSimilarQuestionOrAnswer(similarQuestion.size(),similarAnswer.size(),
                modifyKnowledgeModal);
        TimeWaitingMethod.TimeWaiting(2000);
        preAuditedPageOperation.clickDownListOfSortType(modifyKnowledgeModal);
        preAuditedPageOperation.selectTypeOfCreateNew(sortType,modifyKnowledgeModal);
        preAuditedPageOperation.sendStandardQuestion(question,modifyKnowledgeModal);
        TimeWaitingMethod.TimeWaiting(1000);

        preAuditedPageOperation.sendStandardAnswer(similarQuestion.size()>0,answer,modifyKnowledgeModal);
        preAuditedPageOperation.sendSimilarQuestion(similarQuestion,modifyKnowledgeModal);
        preAuditedPageOperation.sendSimilarAnswer(similarQuestion.size()>0, similarAnswer,
                modifyKnowledgeModal);
        preAuditedPageOperation.clickConfirmYes(modifyKnowledgeModal);

    }

    /**
     * 审核通过
     * @param confirm 是否确认操作
     * @param index 第（index+1）个知识
     */
    public void testAuditedPass(boolean confirm,int index){
        preAuditedPageOperation.clickPassInTable(index);
        if(confirm){
            preAuditedPageOperation.clickConfirmYes();
        }else{
            preAuditedPageOperation.clickConfirmNo();
        }

    }

    /**
     * 审核不通过
     * @param confirm 是否确认操作
     * @param index 第（index+1）个知识
     */
    public void testAuditedNoPass(boolean confirm,int index){
        preAuditedPageOperation.clickNoPassInTable(index);
        if(confirm){
            preAuditedPageOperation.clickConfirmYes();
        }else{
            preAuditedPageOperation.clickConfirmNo();
        }
    }

    /**
     * 删除知识
     * @param confirm 是否确认操作
     * @param index 第（index+1）个知识
     */
    public void testDelete(boolean confirm,int index){
        preAuditedPageOperation.clickDeleteInTable(index);
        if(confirm){
            preAuditedPageOperation.clickConfirmYes();

        }else{
            preAuditedPageOperation.clickConfirmNo();
        }
    }

    public void testBatchOperation(String typeOfBatchOperation,int[] operationKnowledge,boolean confirm){

        // 勾选数据
        preAuditedPageOperation.selectCheckBox(operationKnowledge);
        preAuditedPageOperation.clickBatchOperation();
        TimeWaitingMethod.TimeWaiting(800);
        preAuditedPageOperation.selectBatchOperation(typeOfBatchOperation);
        if(operationKnowledge.length > 0 || typeOfBatchOperation.equals("全部")){
            if(confirm){
                preAuditedPageOperation.clickConfirmYes();

            }else{
                preAuditedPageOperation.clickConfirmNo();
            }
        }


    }


    }

