package testCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageHandle.PreAuditedPageHandle;
import pageOperate.CommonPageOperation;
import testEnum.EnumKnowledge;
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

    @Test
    public void testAddKnowledge(){
        pre.testAddKnowledge("宠物",EnumKnowledge.ENUM_KNOWLEDGE_SIMILAR_QUESTION_STANDARD);
        System.out.println(new GetSystemMessage(driver).getMessage());

    }

    @AfterClass
    public void endTest(){
        driver.closeDriver();
    }

}
