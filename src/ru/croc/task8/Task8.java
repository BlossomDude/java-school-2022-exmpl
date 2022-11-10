package ru.croc.task8;

import java.io.*;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;

        File dir =new File("C:\\Program Files\\IdeaProjects\\LearnJava\\src\\ru\\croc\\task8\\text");
        try(Scanner s = new Scanner(new FileReader(dir));){
            while (s.hasNext()){
                String str = s.nextLine();
                if(str != null) count += str.split("\s+\n").length;
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println(count);
        System.exit(1);
    }
}