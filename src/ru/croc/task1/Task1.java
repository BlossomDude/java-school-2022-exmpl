package ru.croc.task1;
import java.util.Scanner;
import java.lang.Math;

public class Task1 {
        static class Point {                                                  //Определяем вспомогательный класс Point.
            double x;
            double y;
        }

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);                              //Создаем объект класса Scanner.

            Point a = new Point();                                            //Присваивание координат первой вершине.
            System.out.println("Введите координату х вершины №1:");
            a.x = in.nextDouble();
            System.out.println("Введите координату y вершины №1:");
            a.y = in.nextDouble();

            Point b = new Point();                                            //Присваивание координат второй вершине.
            System.out.println("Введите координату х вершины №2");
            b.x = in.nextDouble();
            System.out.println("Введите координату y вершины №2");
            b.y = in.nextDouble();

            Point c = new Point();                                            //Присваивание координат третьей вершине.
            System.out.println("Введите координату х вершины №3");
            c.x = in.nextDouble();
            System.out.println("Введите координату y вершины №3");
            c.y = in.nextDouble();

            in.close();                                                       //Закрываем сканнер.

            double AB = segmentResult(a.x, a.y, b.x, b.y);
            double BC = segmentResult(b.x,b.y, c.x, c.y);                     //Вычисляем отрезки треугольника  .
            double CA = segmentResult(c.x, c.y, a.x, a.y);

            double semiPer = semiPerimetr(AB, BC, CA);                        //Вычисляем полупериметр.

            double areaTriangle = areaResult(semiPer, AB, BC, CA);            //Вычисляем площадь треугольника.

            System.out.println("Площадь треугольника: " + String.format("%.1f",areaTriangle));

        }

        //Метод для вычисления длина отрезка между двумя точками.
        public static double segmentResult(double firstX, double firstY, double secondX, double secondY) {
            return Math.sqrt(Math.pow(secondX - firstX, 2) + Math.pow(secondY - firstY, 2));
        }

        //Метод для вычисления полупериметра, он нужен для вычисления площади по формуле Герона.
        public static double semiPerimetr(double abSide, double bcSide, double caSide){
            return 0.5 * (abSide + bcSide + caSide);
        }

        //Метод для вычисления площади треугольника по формуле Герона.
        public static double areaResult(double semiPer, double abSide, double bcSide, double caSide){
            return Math.sqrt(semiPer * (semiPer - abSide)*(semiPer - bcSide)*(semiPer - caSide));
        }
}
