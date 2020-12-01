package ceshi;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindFile {
    private static List<String> finallyList = new ArrayList<>();
    public static void main(String args[]){
        findAllFilePath("D:\\奇怪的文件",".txt");
        for(String filePath : finallyList){
            System.out.println(filePath);
        }
    }

    public static void findAllFilePath(String folderPath, String name){
        File[] folders = new File(folderPath).listFiles();
        for(File file : folders){
            if (file.isDirectory()){
                findAllFilePath(file.getAbsolutePath(),name);
            }else {
                if(file.getName().contains(name)){
                    finallyList.add(file.getAbsolutePath());
                }
            }
        }

    }
}
