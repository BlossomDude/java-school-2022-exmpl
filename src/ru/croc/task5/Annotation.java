package ru.croc.task5;

public class Annotation {
    Figure figure;
    String name;

    @Override
    public String toString() { return figure.toString() + ": " + name;}         //Переопределяем метод toString

    public Annotation(Figure figure, String name){                              //Определяем конструктор
        this.figure = figure;
        this.name = name;
    }
}
