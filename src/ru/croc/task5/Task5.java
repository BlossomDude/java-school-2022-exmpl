package ru.croc.task5;

public class Task5 {
    public static void main(String[] args) {
        Annotation[] annotations = new Annotation[]{                                               //Создаем массив аннотаций
                new Annotation(new Circle(50, 50, 5), "Circle"),                     // и вводим данные
                new Annotation(new Rectangle(10, 10, 20, 20), "Rectangle")};

        for (Annotation annotation : annotations) {                                                //Вывод через for each
            System.out.println(annotation);
        }
    }
}
