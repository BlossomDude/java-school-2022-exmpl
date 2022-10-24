package ru.croc.task4;

public class Task4 {
    public static void main(String[] args) {

        String yesCommString = "/*\n" +                                 //Переменная с кодом
                " * My first ever program in Java!\n" +
                " */\n" +
                "class Hello { // class body starts here \n" +
                "  \n" +
                "  /* main method */\n" +
                "  public static void main(String[] args/* we put command line arguments here*/) {\n" +
                "    // this line prints my first greeting to the screen\n" +
                "    System.out.println(\"Hi!\"); // :)\n" +
                "  }\n" +
                "} // the end\n" +
                "// to be continued...\n";

        String noCommString = noComm(yesCommString);                     //Вызываем метод удаления комментариев

        System.out.println(noCommString);                                //Вывод
    }

    public static String noComm (String str) {                           //Метод для удаления коментов, используем regex

        //Удаляем многострочные комментарии
        String noCommString1 = str.replaceAll("\\/\\*([\\S\\s]+?)\\*\\/", "");

        //Удаляем однострочные комментарии
        String noCommString = noCommString1.replaceAll("\\/\\/([\\S\\s]+?)\\n","");

        //Возвращаем строку
        return noCommString;
    }
}
