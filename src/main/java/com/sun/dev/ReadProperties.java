package com.sun.dev;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by senorita on 2/1/2017.
 */
public class ReadProperties {
    Properties properties = new Properties();
    public void loadProperties() {
        try {
            InputStream input = new FileInputStream("src/main/resources/testdata.properties");
            properties.load(input);
        }catch (Exception e) {
            System.out.print(e);
        }
        String Name = properties.getProperty("Name");
        System.out.println(Name);
    }

    public static void main(String[] args) {
        ReadProperties readProperties = new ReadProperties();
        readProperties.loadProperties();
    }
}
