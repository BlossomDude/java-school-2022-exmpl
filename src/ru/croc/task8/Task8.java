package ru.croc.task8;

import java.io.*;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;                                                                                             //count
        File dir =new File("C:\\Program Files\\IdeaProjects\\LearnJava\\src\\ru\\croc\\task8\\text");     //путь
        try{
            Scanner s = new Scanner(new FileReader(dir));                                                          //сканнер
            while (s.hasNextLine()) count += s.nextLine().split("\s+").length;                               //считаем слова
        }
        catch(FileNotFoundException e){                                                                            //обрабатываем
            System.out.println(e.getMessage());
        }

        System.out.println(count);                                                                                 //выводим
    }
}
