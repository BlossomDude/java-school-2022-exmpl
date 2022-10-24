package ru.croc.task3;
import java.io.IOException;
import java.util.Scanner;

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

        int min = array[0];                                              //Переменная мин. числа
        int max = array[array.length-1];                                 //Переменная макс. числа
        int exchange = 0;                                                //Переменная для размена

        for (int i = 1; i < array.length; i++){
            if(min > array[i]) {
                exchange = min;
                min = array[i];
                array[i] = exchange;                                     //Цикл нахождения мин. и макс. чисел
            }
            if(max < array[i]){
                exchange = max;
                max = array[i];
                array[i] = exchange;
            }
        }

        array[0] = min;                                                  //Присваиваем массиву значения
        array[array.length-1] = max;

        return array;
    }
}
