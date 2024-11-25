package com.example.interviewpreparation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FileWriterPractice {

    public static void main(String ... args){
        // give the file a name
        String fileName = "testFile.txt";
        // put the file in a directory
        String filePath = ".";
        // Create a file
        createFile(fileName, filePath);
        // get all the files in that directory
        getFilesInPath(filePath);
    }
    private static void createFile(String filePath, String fileName) {
        File directory = new File(filePath);
        if(!directory.exists())
            directory.mkdir();
        //create the file
        File file = new File(String.valueOf(directory), fileName);
        // write to file
        try{
            FileWriter writer = new FileWriter(file);
            writer.write("This is a test file");
            System.out.println("File has been successfully created");
        } catch (IOException e) {
            System.out.println("There has been an error writing to the file");
           e.printStackTrace();
        }

    }

    private static void getFilesInPath(String filePath) {
        File directory = new File(filePath);

        if (directory.exists()&& directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files.length > 0 && files != null)
                Arrays.sort(files, Comparator.comparing(File::getName));
            //Arrays.sort(files, (f1, f2)-> f1.getName().compareTo(f2.getName()));
            for(File file: files)
                System.out.println(file.getName());


        }
    }

    public static void sortTest(List<String> names){
        Collections.sort(names, Comparator.naturalOrder());
        //Collections.sort(names, (n1, n2)-> n1.compareTo(n2));
    }
}
