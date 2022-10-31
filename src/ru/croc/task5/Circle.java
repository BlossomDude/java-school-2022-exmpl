package ru.croc.task5;

class Circle extends Figure{
    int X0;
    int Y0;
    int R;

    @Override
    public String toString() { return "C (" + X0 + ", " + Y0 + "), " + R;}

    public Circle(int x, int y, int r){
        X0 = x;
        Y0 = y;
        R = r;
    }

}
