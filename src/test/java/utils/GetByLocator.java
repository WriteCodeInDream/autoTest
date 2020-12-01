package utils;


import org.openqa.selenium.By;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetByLocator{
    /**
     *
     * @param elementName
     * @return
     */
    public static By getByLocator(String elementName){
        InputStream in = GetByLocator.class.getClassLoader().getResourceAsStream("element.properties");
        Properties pr = new Properties();
        try {
            pr.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String valueOfByStr = pr.getProperty(elementName);
        String typeOfBy = valueOfByStr.split(">")[0];
        String valueOfBy = valueOfByStr.split(">")[1];
        if (typeOfBy.equalsIgnoreCase("id")){
            return By.id(valueOfBy);
        }
        if (typeOfBy.equalsIgnoreCase("name")){
            return By.name(valueOfBy);
        }
        if (typeOfBy.equalsIgnoreCase("className")){
            return By.className(valueOfBy);
        }
        if (typeOfBy.equalsIgnoreCase("linkText")){
            return By.linkText(valueOfBy);
        }
        if (typeOfBy.equalsIgnoreCase("tagName")){
            return By.tagName(valueOfBy);
        }
        else{
            return By.xpath(valueOfBy);
        }
    }
}
