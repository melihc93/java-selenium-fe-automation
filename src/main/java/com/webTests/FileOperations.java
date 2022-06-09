package com.webTests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    
    public void WriteLogs(String Title, String Price){
        try {
            File myOutputFile = new File("output.txt");
            if (myOutputFile.createNewFile()) {
                System.out.println("\nFile created: " + myOutputFile.getName());
                try {
                    FileWriter logtoFileWriter = new FileWriter("output.txt");
                    logtoFileWriter.write(Title+"\n");
                    logtoFileWriter.write(Price);
                    logtoFileWriter.close();
                    System.out.println("Successfully wrote to output file!");
                } catch (IOException f) {
                    System.out.println("An error occured!");
                    f.printStackTrace();
                }
            }
            else {
                System.out.println("File already exist.");;
            }
        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }

    public String[] ReadLogs(){
        String[] testArray = {null, null};
        try {
            File myTextFile = new File("output.txt");
            Scanner myReader = new Scanner(myTextFile);
            int i = 0;
            while(myReader.hasNextLine()) {
                String testData = myReader.nextLine();
                System.out.println(testData + "  ===> test data successfully taken from file!");
                testArray[i] = testData;
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
        return testArray;

    }
}
