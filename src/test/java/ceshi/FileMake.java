package ceshi;


import java.io.File;
import java.io.IOException;

public class FileMake {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/1/1.txt");//创建了一个对象 ==> 描述了一个路径
        File filePath = new File ("D:\\1\\2013");
        filePath.mkdirs();
        file.createNewFile();
    }

}
