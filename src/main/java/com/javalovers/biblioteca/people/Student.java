package com.javalovers.biblioteca.people;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student {

    public Student() {
    }
    
    
    
public void read(File file) throws FileNotFoundException, IOException{
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line;
    while((line = bufferedReader.readLine()) != null){
        System.out.println(line);
    }
}
}

