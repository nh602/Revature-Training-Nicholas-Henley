package com.fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFile {
    public static void main(String[] args) throws IOException {
        try ( 
            FileInputStream fis = new FileInputStream("testfile.txt"); 
            BufferedInputStream bis = new BufferedInputStream(fis) 
        ) {
            
            while(bis.available() > 0) {
                System.out.println((char)bis.read());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failed to find file: " + e);
        } catch (IOException e) {
            System.out.println("Failed to read from file: " + e);
        } 
    }
}
