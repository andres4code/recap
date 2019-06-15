package com.sda.tallinn6.advancedFeatures.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NIODemo {
    public static void main(String[] args) throws IOException{
        String filePath = "/Users/andreskolbassov/Desktop/javalearntext.txt";
        writeTextToFile(filePath, Arrays.asList("Hello", "world"));
        printFileText(filePath);

    }

    public static void writeTextToFile(String filePath, List<String> content) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path, content, StandardOpenOption.APPEND);
    }

    public static void printFileText(String filePath){
        Path path = Paths.get(filePath);
        List<String> content = null;
        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : content){
            System.out.println(line);
        }
    }
}
