import base.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login {

    public static void main(String[] args){
        for (int i = 0; i < 2 ; i++) {
            runDriver();
        }

        }

    public static void runDriver(){
        BaseDriver driver = new BaseDriver("chrome");
        driver.getUrl("http://192.168.99.116/pm607/approval/index");
    }
}
