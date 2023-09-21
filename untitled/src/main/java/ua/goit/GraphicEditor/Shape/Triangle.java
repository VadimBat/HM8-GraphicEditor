package ua.goit.GraphicEditor.Shape;

import ua.goit.GraphicEditor.Actions.Color;

public class Triangle extends Shape{

    private String name = "Triangle";

    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c, Color color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        if ( a !=0 && b !=0 && c != 0 ){
            System.out.println("New Triangle created : a = " + a + ", b = " + b + ", c = " + c + ", color = " + color);
        } else if ( a + b > c || a + c > b || b + c > a ) {
            System.out.println("New Triangle created : a = " + a + ", b = " + b + ", c = " + c + ", color = " + color);
        } else {
            System.out.println("Can't create new Triangle with zero values or impossible create this Triangle");
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move() {
        System.out.println("Triangle is moving");
    }

    @Override
    public void copy() {
        System.out.println("Triangle copied");

    }

    @Override
    public void remove() {
        System.out.println("Triangle removed");
    }

    @Override
    public void paste() {
        System.out.println("Triangle pasted");
    }

    @Override
    public void draw() {
        System.out.println("Draw new Triangle");
    }

    @Override
    public double[] scale(double value) {
        return new double[] {a*value, b*value, c*value};
    }
}
