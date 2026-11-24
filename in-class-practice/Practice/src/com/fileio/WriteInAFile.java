package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInAFile {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = null;
        
        // Check exception raised at compile time
        try {
            fos = new FileOutputStream("testfile.txt");
            String toWrite = "The quick red fox jumped over the lazy dog.";
            fos.write(toWrite.getBytes());
            System.out.println("File written.");

        } catch (FileNotFoundException e) {
            System.out.println("File is not available: " + e);
        } catch (IOException e) {
            System.out.println("Failed to write to file: " + e);
        } finally {
            if(fos != null )
                fos.close();
            System.out.println("FOS closed.");
        }
    }
}
