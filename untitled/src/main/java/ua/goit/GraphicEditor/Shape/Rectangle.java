package ua.goit.GraphicEditor.Shape;

import ua.goit.GraphicEditor.Actions.Color;

public class Rectangle extends Shape{

    private String name = "Rectangle";
    private double a;
    private double b;

    public Rectangle(double a, double b, Color color) {
        this.a = a;
        this.b = b;
        this.color = color;
        if ( a !=0 || b !=0 || a > b || b > a ){
            System.out.println("New Rectangle created : a = " + a + ", b = " + b);
        } else {
            System.out.println("Can't create new Rectangle with zero values or impossible create this Rectangle");
        }
    }

    public double getA() {

        return a;
    }

    public double getB() {

        return b;
    }

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public void move() {

        System.out.println("Rectangle is moving");
    }

    @Override
    public void copy() {

        System.out.println("Rectangle copied");
    }

    @Override
    public void remove() {

        System.out.println("Rectangle removed");
    }

    @Override
    public void paste() {

        System.out.println("Rectangle pasted");
    }

    @Override
    public void draw() {
        System.out.println("Draw new Rectangle");
    }

    @Override
    public double[] scale(double value) {
        return new double[] {a*value, b*value};
    }
}
