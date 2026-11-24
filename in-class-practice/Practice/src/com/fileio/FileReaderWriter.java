package com.fileio;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class FileReaderWriter {
    public static void main(String[] args){
        try (FileWriter fw = new FileWriter("writtenfile.txt");
             FileReader fr = new FileReader("writtenfile.txt")) 
        {
            fw.write("Hello!");
            fw.close();

            int i = fr.read();
            while(i != -1) {
                System.out.print((char) i);
                i = fr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
