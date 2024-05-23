package com.javalovers.biblioteca.people;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cleaner {

    public Cleaner() {
    }
    
    public void exist (File file) throws IOException{
        if(file.exists()){
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter, true);
        printWriter.print("");
        printWriter.close();
        }
        else{
            System.out.println("no existe canalla");
        }
    }
}
