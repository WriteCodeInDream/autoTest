package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseDriver {
    private WebDriver baseDiver;
    public BaseDriver(String driverType){
        SelectDiver selectDiver = new SelectDiver(driverType);
        this.baseDiver = selectDiver.selectDriver();
    }

    /**
     *获取driver
     */
    public WebDriver getDriver(){
        return baseDiver;
    }
    /**
     *获取单个元素
     */
    public WebElement findElement(By by){
            return baseDiver.findElement(by);
    }

    /**
     * 获取一组元素
     * @param by
     * @return 返回list集合
     */
    public List<WebElement> findElements(By by){
        return baseDiver.findElements(by);
    }

    /**
     * 定位
     * @param url
     */
    public void getUrl(String url){
        baseDiver.get(url);
    }
    /**
     *
     */

    public void closeDriver(){
        baseDiver.close();
    }

    /**
     * 获取所有的窗口
     * @return
     */
    public List<String> getWindowsHandles(){
        Set<String> windowHandlesSet = baseDiver.getWindowHandles();
        return new ArrayList<>(windowHandlesSet);
    }

    /**
     * 获取当前窗口
     * @return
     */
    public String getWindowsHandle(){
        return baseDiver.getWindowHandle();
    }
    /**
     * 获取所有模态框
     */
    public List<WebElement> getActiveModal(By by){
     return baseDiver.findElements(by);
    }

    /**
     * 退回至上一操作页面
     */
    public void back(){
        baseDiver.navigate().back();
    }
    /**
     * 刷新页面
     */
    public void refresh(){
        baseDiver.navigate().refresh();
    }
    /**
     *
     */
    public void deleteAllCookies(){
        baseDiver.manage().deleteAllCookies();
    }
    /**
     * 页面最大化
     */
    public void pageMax(){
        baseDiver.manage().window().maximize();
    }
    /**
     *
     */
    public void switchToHandle(String handleName){
        baseDiver.switchTo().window(handleName);
    }
    /**
     *
     */
    public void switchToDefaultCotent(){
        baseDiver.switchTo().defaultContent();
    }

    /**
     * 设置隐式等待
     */
    public void setImplicitlyWait(){
        baseDiver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    }


}
