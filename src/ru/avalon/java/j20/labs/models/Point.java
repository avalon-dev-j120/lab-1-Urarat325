package ru.avalon.java.j20.labs.models;

public class Point<T extends Number>  {

    private final T x;

    private final T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public double distanceTo(Point point) {
        float dx = x.floatValue() - point.x.floatValue();
        float dy = y.floatValue() - point.y.floatValue();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
