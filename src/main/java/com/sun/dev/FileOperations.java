package com.sun.dev;

import java.io.*;

/**
 * Created by senorita on 2/2/2017.
 */
public class FileOperations {
    File file = new File("myFile.txt");
    public void createFile(){
        System.out.println("get File Name:"+file.getAbsoluteFile());
        System.out.println(System.getProperty("user.dir"));
        try {
            FileWriter fileWriter = new FileWriter("myFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String content = "Hi this is Suraj";
            bufferedWriter.write(content);
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void readFile(){
        try {
            InputStream inputStream = new FileInputStream("myFile.txt");
            System.out.println(inputStream.read());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        FileOperations fileOperations = new FileOperations();
        fileOperations.createFile();
        fileOperations.readFile();
    }
}
