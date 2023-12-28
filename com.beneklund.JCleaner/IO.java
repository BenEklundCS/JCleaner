package com.beneklund.JCleaner;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class IO {
    private Scanner scanner = new Scanner(System.in);

    // Singleton design pattern (also ensures I only have one Scanner instance)

    private static IO instance = null;

    public static synchronized IO getInstance()
    {
        if (instance == null)
            instance = new IO();
 
        return instance;
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public String getValidatedInput(ArrayList<String> validStrings) {
        String prompt = "Please enter input in this list of options: " + validStrings;
        String result;
        do {
            System.out.println(prompt);
            System.out.print("> ");
            result = getInput();
            prompt = "Invalid option, please try again: ";

        } while (!validStrings.contains(result));
        return result;
    }

    // File handling

    public void listFiles(String path) {
        File[] files = getFileList(path);
        printFileList(files);
    }

    public File[] getFileList(String path) {
        File directory = new File(path);
        File[] result = directory.listFiles();
        return result;
    }

    public void printFileList(File[] files) {
        for (File f : files) {
            System.out.println(f);
        }
    }

    public int deleteFilesAtDir(String path) { // Returns the number of deleted files

        int count = 0;

        File[] files = getFileList(path);
        
        for (File f : files) {
            if (!f.delete()) {
                System.out.println("Did not delete " + f.getName());
            }
            else {
                count++;
            }
        }

        return count;
    }

    // Pathing

    public String getDesktopPath() {
        return System.getProperty("user.home") + "/Desktop";
    }

    public String getDownloadsPath() {
        return System.getProperty("user.home") + "/Downloads";
    }
}
