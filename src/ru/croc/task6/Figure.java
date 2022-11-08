package ru.croc.task6;

abstract class Figure implements Movable {
    private int x;
    private int y;
    abstract public boolean containsPoint(int x,int y);
    @Override
    abstract public String toString();

}
