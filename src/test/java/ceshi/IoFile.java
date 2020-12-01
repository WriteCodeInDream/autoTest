package ceshi;

import java.io.*;

public class IoFile {
    public static void main(String [] args){

    moveFile("C:\\Users\\Wulj\\Desktop\\文件源.txt","C:\\Users\\Wulj\\Desktop\\ceshi.txt");

    }

    public static void moveFile(String resource, String target){
        File resourceFile = new File(resource);
        File targetFile = new File(target);
        FileInputStream fileInputStream = null;
        FileOutputStream outputStream ;
        BufferedOutputStream bos = null;
        try {
            fileInputStream = new FileInputStream(resourceFile);
            outputStream = new FileOutputStream(targetFile);
            bos = new BufferedOutputStream(outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte [] bytes = new byte[1024];
        int numberRead;
        try {
            while ((numberRead = fileInputStream.read(bytes)) != -1) {
            bos.write(bytes,0,numberRead);
            }
            fileInputStream.close();
            bos.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
