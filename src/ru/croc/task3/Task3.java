package ru.croc.task3;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();                                   //Принимаем на вход строку чисел
        String[] stringArray = input.split(" ");                  //Разделяем строку сплитом и получаем массив строк

        int[] array = strToIntArray(stringArray);                       //Вызов метода конвертации в int массив
        int[] mainArray = sort(array);                                  //Вызов метода сортировки

        System.out.print("[");
        for(int i = 0; i < mainArray.length; i++){
            System.out.print(mainArray[i]+ ", " );
        }
        System.out.println("\b\b]");                                    //Вывод результата
    }

    public static int[] strToIntArray(String[] stringArray){            //Функция переводящая массив String в массив int

        int[] array = new int[stringArray.length];

        for(int i = 0; i < array.length; i++){                          //Парсим данные в массив int
            array[i] = Integer.parseInt(stringArray[i]);
        }
        return array;
    }

    public static int[] sort(int[] array){
        int exchange = 0;

        for (int left = 0; left < array.length; left++) {
            int min = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            exchange = array[left];
            array[left] = array[min];
            array[min] = exchange;

        }

;
        return array;
    }
}
