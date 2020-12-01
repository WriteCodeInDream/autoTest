package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectDiver {
    private String driverType;
    public SelectDiver(String driverType){
        this.driverType = driverType;
    }
    public WebDriver selectDriver(){
        if("chrome".equalsIgnoreCase(driverType)){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Wulj\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
            return new ChromeDriver();
        }
        else if("fireFox".equalsIgnoreCase(driverType)){
            System.setProperty("","");
            return new FirefoxDriver();
        }else {
            System.setProperty("","");
            return new InternetExplorerDriver();
        }
    }
}
