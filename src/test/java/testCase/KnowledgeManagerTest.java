package testCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageHandle.PreAuditedPageHandle;
import testEnum.EnumKnowledge;
import testEnum.SystemMessage;
import testEnum.User;
import utils.*;

import java.util.Properties;

@Listeners({TestListen.class})
public class KnowledgeManagerTest extends BaseCase{

    private LoginUtils login;
    private Properties pr;
    private PreAuditedPageHandle pre;


    @BeforeClass
    public void beginTest(){
        login = new LoginUtils();
        driver = login.loginToPage(User.USER_ADMIN);
        pr = GetConfigUtils.getProperties("testConfig.properties");
        TimeWaitingMethod.TimeWaiting(1000);
        driver.getUrl(GetConfigUtils.getValue(pr, "knowledgeManageUrl"));
        driver.setImplicitlyWait();
        pre = new PreAuditedPageHandle(driver);

    }

    /**
     * 测试正常新增知识：包含相似答案以及相似问题
     */
    @Test
    public void testAddKnowledgeOne(){
        pre.testAddKnowledge("宠物",EnumKnowledge.SIMILAR_STANDARD);
        Assert.assertEquals(SystemMessage.SUCCESS_ADD, getSysTemResponse());
    }

    /**
     * 测试正常新增知识：不包含相似答案以及相似问题
     */
    @Test
    public void testAddKnowledgeNormalTwo() {
        pre.testAddKnowledge("宠物",EnumKnowledge.NORMAL);
        Assert.assertEquals(SystemMessage.SUCCESS_ADD, getSysTemResponse());
    }

    /**
     * 测试正常新增知识，含相似答案
     */
    @Test
    public void testAddKnowledgeNormalThree() {
        pre.testAddKnowledge("宠物", EnumKnowledge.SIMILAR_ANSWER_STANDARD);
        Assert.assertEquals(SystemMessage.SUCCESS_ADD, getSysTemResponse());
    }

    /**
     * 测试正常新增知识，含标准问题
     */
    @Test
    public void testAddKnowledgeNormalFour(){
        pre.testAddKnowledge("宠物", EnumKnowledge.SIMILAR_QUESTION_STANDARD);
        Assert.assertEquals(SystemMessage.SUCCESS_ADD, getSysTemResponse());
    }

    /**
     * 测试非正常新增知识，知识分类为空
     */
    @Test
    public void testAddKnowledgeUnNormalOne(){
        pre.testAddKnowledge(" ", EnumKnowledge.NORMAL);
        Assert.assertEquals(SystemMessage.SORT_TYPE_EMPTY, getSysTemResponse());
    }

    /**
     * 测试非正常新增知识，标准问题为空
     */
    @Test
    public void testAddKnowledgeUnNormalTwo(){
        pre.testAddKnowledge("宠物", EnumKnowledge.STANDARD_QUESTION_NULL);
        Assert.assertEquals(SystemMessage.STANDARD_QUESTION_EMPTY, getSysTemResponse());
    }

    /**
     * 测试非正常新增知识，标准答案为空
     */
    @Test
    public void testAddKnowledgeUnNormalThree(){
        pre.testAddKnowledge("宠物", EnumKnowledge.STANDARD_ANSWER_NULL);
        Assert.assertEquals(SystemMessage.STANDARD_ANSWER_EMPTY, getSysTemResponse());
    }

    /**
     * 测试非正常新增知识，相似问题为空
     */
    @Test
    public void testAddKnowledgeUnNormalFour(){
        pre.testAddKnowledge("宠物", EnumKnowledge.SIMILAR_QUESTION_HAS_NULL);
        Assert.assertEquals(SystemMessage.SIMILAR_QUESTION_EMPTY, getSysTemResponse());
    }

    /**
     * 测试非正常新增知识，相似答案为空
     */
    @Test
    public void testAddKnowledgeUnNormalFive(){
        pre.testAddKnowledge("宠物", EnumKnowledge.SIMILAR_ANSWER_NULL);
        Assert.assertEquals(SystemMessage.SIMILAR_ANSWER_EMPTY, getSysTemResponse());
    }

    /**
     * 测试非正常新增知识，相似问题与标准问题一致
     */
    @Test
    public void testAddKnowledgeUnNormalSix(){
        pre.testAddKnowledge("宠物", EnumKnowledge.SIMILAR_QUESTION_SAME_WITH_STANDARD);
        Assert.assertEquals(SystemMessage.SIMILAR_QUESTION_SAME_WITH_STANDARD, getSysTemResponse());
    }

    /**
     * 测试非正常新增知识，相似问题与相似问题一致
     */
    @Test
    public void testAddKnowledgeUnNormalSeven(){
        pre.testAddKnowledge("宠物", EnumKnowledge.SIMILAR_QUESTION_SAME_WITH_SELF);
    }

    /**
     *测试非正常新增知识，标准问题已存在
     */
    @Test
    public void testAddKnowledgeUnNormalEight(){
        pre.testAddKnowledge("宠物", EnumKnowledge.STANDARD_QUESTION_EXITS);
        Assert.assertEquals(SystemMessage.STANDARD_QUESTION_EXIT, getSysTemResponse());
    }

    @AfterClass
    public void endTest(){
        driver.closeDriver();
    }



}
