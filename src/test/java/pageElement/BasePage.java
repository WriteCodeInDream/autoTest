package pageElement;

import base.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.GetByLocator;

import java.util.List;

public class BasePage {
    private BaseDriver baseDriver;
    /**
     *
     * @param baseDriver
     */
    public BasePage(BaseDriver baseDriver){
        this.baseDriver = baseDriver;
    }

    /**
     *获取单个元素
     */
    public WebElement findElement(By by){
        return baseDriver.findElement(by);
    }
    /**
     *获取一组元素
     */
    public List<WebElement> findElements(By by){
        return baseDriver.findElements(by);
    }
    /**
     *元素点击
     */
    public void clickWebElement(WebElement webElement){
        webElement.click();
    }
    /**
     * 获取元素的文本值
     */
    public String getText(WebElement webElement){
        return webElement.getText();
    }
    /**
     * 元素值发送
     */
    public void sendKeys(WebElement webElement,String value){
        webElement.clear();
        webElement.sendKeys(value);
    }
    /**
     * 文本输入框值情况
     */
    public void clearValue(WebElement webElement){
        webElement.clear();
    }

    /**
     * 通过父节点获取子节点的一个元素
     * @param lastBy 父节点
     * @param by 子节点
     */
    public WebElement findElement(By lastBy,By by){
        WebElement element = baseDriver.findElement(lastBy);
        return element.findElement(by);
    }
    /**
     * 通过父节点获取一组子节点
     * @param lastBy 父节点
     * @param by 子节点
     */
    public List<WebElement> findElements(By lastBy, By by){
        WebElement element = baseDriver.findElement(lastBy);
        return element.findElements(by);
    }
    /**
     * 判断元素是否展示
     */
    public boolean isDisplay(WebElement element){
        return element.isDisplayed();
    }

    /**
     * 判断元素是否可用
     */
    public boolean isEnable(WebElement element){
        return element.isEnabled();
    }
    /**
     * 判断元素是否已勾选
     */
    public boolean isSelected(WebElement element){
        return element.isSelected();
    }


    public WebElement getOneOfElementOfDownList(String text , List<WebElement> webElements){
        for(WebElement webElement : webElements){
            if(webElement.getText().equals(text)){
                return webElement;
            }
        }
        throw new RuntimeException("没有找到“"+text+"”请检查元素是否输入正确");
    }
    /**
     *
     */
    public WebElement switchToModal(String modalName, By modalBy){
        List<WebElement> modals = findElements(modalBy);
        for(WebElement modal : modals){
            if(modal.findElement(By.xpath("div[1]/div")).getText().equals(modalName)){
                return modal;
            }
        }
        throw new RuntimeException("没有找到名字为“"+modalName+"”的模态框，请检查是否名称输入有误");
    }

    public WebElement findElementInModal(WebElement modal, By elementBy){
        return modal.findElement(elementBy);
    }
    public List<WebElement> findElementsInModal(WebElement modal, By elementBy){
        return modal.findElements(elementBy);
    }

    /**
     *  简化获取By
     * @param value 传入值
     * @return 返回一个By对象
     */
    public By getBy(String value){
        return GetByLocator.getByLocator(value);
    }
}
