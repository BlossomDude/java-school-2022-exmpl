package ru.croc.task2;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);                                          //Инициализируем сканнер
        double byteInput = in.nextDouble();                                           //Присвоим входные данные
        in.close();

        convert(byteInput);
    }

    public static void convert(double byteInput){                                     //Метод для конвертации байтов

        int grade = 0;                                                                //Инициализируем грейд (разрядность)

        while (byteInput >= 1024){                                                    //Цикл для определения разрядности
            byteInput /= 1024;                                                        //и вычисления
            grade++;
        }

        switch (grade){                                                               //Перебираем в порядке возрастания
            case 0:                                                                   //разрядность и исходя из этого
                System.out.println(String.format("%.1f", byteInput) + " B");          //выводим ответ
                break;
            case 1:
                System.out.println(String.format("%.1f", byteInput) + " KB");
                break;
            case 2:
                System.out.println(String.format("%.1f", byteInput) + " MB");
                break;
            case 3:
                System.out.println(String.format("%.1f", byteInput) + " MB");
                break;
            case 4:
                System.out.println(String.format("%.1f", byteInput) + " GB");
                break;
            case 5:
                System.out.println(String.format("%.1f", byteInput) + " TB");
                break;
        }
    }
}
