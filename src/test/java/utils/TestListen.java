package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import testCase.BaseCase;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListen extends TestListenerAdapter {
    private String filePath;
    private String fileName;

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        super.onTestFailure(iTestResult);
        System.out.println(iTestResult);
        takeScreenShot(iTestResult);
    }

    private void takeScreenShot(ITestResult iTestResult) {
        BaseCase baseCase = (BaseCase) iTestResult.getInstance();
        WebDriver driver = baseCase.driver.getDriver();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        StringBuilder pathSb = new StringBuilder();
        pathSb.append("D:\\自动化测试截图\\");
        pathSb.append(sdf.format(currentDate));
        pathSb.append("\\");
        filePath = pathSb.toString();
        File storeFile = new File(filePath);
        if(!storeFile.exists()){
            storeFile.mkdirs();
        }
        StringBuilder nameSb = new StringBuilder();
        nameSb.append(iTestResult.getMethod().getMethodName());
        nameSb.append("_");
        nameSb.append(System.currentTimeMillis());
        nameSb.append(".png");
        fileName = nameSb.toString();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try  {
            FileInputStream shot = new FileInputStream(screenshot);
            File screenShot = new File(filePath, fileName);
            FileOutputStream out = new FileOutputStream(screenShot);
            BufferedOutputStream testFile = new BufferedOutputStream(out);
            byte[] bytes = new byte[1024];
            int numberRead;
                while ((numberRead = shot.read(bytes)) != -1) {
                    testFile.write(bytes,0,numberRead);
                }
            testFile.close();out.close();shot.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        super.onTestSuccess(iTestResult);
        takeScreenShot(iTestResult);
    }
}
