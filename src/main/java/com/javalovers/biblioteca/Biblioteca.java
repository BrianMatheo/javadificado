package com.javalovers.biblioteca;

import com.javalovers.biblioteca.people.Cleaner;
import com.javalovers.biblioteca.people.Student;
import com.javalovers.biblioteca.people.Writer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String name1 = "libro1";
        String pathname1 = "./" + name1 + ".txt";
        String name2 = "libro2";
        String pathname2 = "./" + name2 + ".txt";
        File file = new File(pathname1);
        File file2 = new File(pathname2);
        ArrayList<File> data = new ArrayList<>();
        data.add(file);
        data.add(file2);
        System.out.println("Que eres?");
        System.out.println("escritor, estudiante, limpiador");
        Student student = new Student();
        String me = scanner.next();
        switch(me){
            case "escritor":
                System.out.println("escribe el titulo de tu obra para crearla, si existe se te indicará");
                String name3 = scanner.next();
                String pathname3 = "./" + name3 + ".txt";
                File file3 = new File(pathname3);
                Writer writer = new Writer();
                writer.exist(file3);
                data.add(file3);
                System.out.println("escribe algo en ese libro!");
                String texto = scanner.next();
                writer.write(file3, texto);
                student.read(file3);
                break;
            case "estudiante":
                System.out.println("que tan largo es el libro 1" + file.length());
                student.read(file);
                break;
            case "limpiador":
                System.out.println("elige que libro borrar, si existe se borra");
                String name4 = scanner.next();
                String pathname4 = "./" + name4 + ".txt";
                File file4 = new File(pathname4);
                Cleaner cleaner = new Cleaner();
                cleaner.exist(file4);
                break;
            default:
                System.out.println("nada");
                break;
        }
    }
}
