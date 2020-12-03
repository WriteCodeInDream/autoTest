package utils;

import testCase.LoginTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetConfigUtils {
    static InputStream inputStream;
    static Properties pr;

    public static Properties getProperties(String path){
        inputStream = LoginTest.class.getClassLoader().getResourceAsStream(path);
        pr = new Properties();
        try {
            pr.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pr;
    }

    public static String getValue(Properties pr, String key){
        return pr.getProperty(key);
    }
}
