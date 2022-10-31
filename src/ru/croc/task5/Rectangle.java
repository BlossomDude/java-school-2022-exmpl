package ru.croc.task5;

public class Rectangle extends Figure {
    int X0;
    int Y0;
    int X1;
    int Y1;

    public String toString() {
        return "R (" + X0 + ", " + Y0 + "), (" + X1 + ", " + Y1 + ")";
    }

    public Rectangle(int x0, int y0, int x1, int y1){
        X0 = x0;
        Y0 = y0;
        X1 = x1;
        Y1 = y1;
    }
}
