package ru.croc.task5;

public class Task5 {
    public static void main(String[] args) {
        Annotation[] annotations = new Annotation[]{
                new Annotation(new Circle(50, 50, 5), "Circle"),
                new Annotation(new Rectangle(10, 10, 20, 20), "Rectangle")};

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
