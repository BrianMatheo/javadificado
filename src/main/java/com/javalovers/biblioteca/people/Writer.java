package com.javalovers.biblioteca.people;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Writer {

    public Writer() {
    }
    
    public void write (File file, String text) throws IOException{
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter, true);
        printWriter.print(text);
        printWriter.close();
    }
    
    public void exist (File file) throws IOException{
        if(file.exists()){
            System.out.println("ya existia");
        }
        else{
            file.createNewFile();
            System.out.println("nuevo archivo creado");
        }
    }
    
}
