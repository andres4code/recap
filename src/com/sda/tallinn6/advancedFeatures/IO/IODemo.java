package com.sda.tallinn6.advancedFeatures.IO;

import java.io.*;
/*
This exercise is an example of how a random text can be written into existing txt file and also read in console
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/andreskolbassov/Desktop/javalearntext.txt";//file location
        writeTextToFile(fileName, "Hello Text, i am boogeyman");//what is written in the file
        printFileText(fileName);

    }
    public static void writeTextToFile(String fileName, String text) throws IOException{//is called in main method(WRITE
        File file = new File(fileName);//creates new file object, but why?

        FileWriter fileWriter = new FileWriter(file, true);//creates new filewriter object

        fileWriter.write(text);//writes text to file

        fileWriter.close();//closes filewriter
    }

    public static void printFileText(String fileName){//is called in main method(READS text in CONSOLE)
        File file = new File(fileName);
        System.out.println(file.exists());

        try (FileReader fileReader = new FileReader(file)) {//creates new filereader object
            int i;//initializes variable i
            do {
                i = fileReader.read();
                if(i != -1) {
                    char ch = (char) i;
                    System.out.print(ch);
                }
            }
            while (i != -1);


        } catch (FileNotFoundException e) {//cathes exception, and then does the following to replace the exception text
            System.out.println("The specified file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
