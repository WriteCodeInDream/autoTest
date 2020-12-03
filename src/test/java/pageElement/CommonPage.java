package pageElement;

import base.BaseDriver;
import org.openqa.selenium.WebElement;

public class CommonPage extends BasePage{
    /**
     * @param baseDriver
     */
    public CommonPage(BaseDriver baseDriver) {
        super(baseDriver);
    }

    public WebElement messageElement(){
        return findElement(getBy("systemMessage"));
    }
}
