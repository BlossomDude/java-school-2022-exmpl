package ru.croc.task6;

class Circle extends Figure {

    private int X0;
    private int Y0;
    private int R;

    public Circle(int x0, int y0, int r) throws Exception {
        if(r < 0){
            throw new Exception("Ошибка ввода радиуса!");
        }
        X0 = x0;
        Y0 = y0;
        R= r;
    }
    @Override
    public String toString() {
        return "C (" + X0 + ", " + Y0 + "), " + R;
    }
    @Override
    public boolean containsPoint(int x,int y) {
        return (Math.pow((x - X0), 2) + Math.pow((y - Y0), 2)) <= Math.pow(R, 2);
    }

    @Override
    public void move(int dx, int dy) {
        Y0 += dy;
        X0 += dx;
    }
}
