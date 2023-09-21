package ua.goit.GraphicEditor.Shape;

import ua.goit.GraphicEditor.Actions.Color;

public class Circle extends Shape {

    private String name = "Circle";
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
        if ( radius != 0 ){
            System.out.println("New Circle created : radius = " + radius + ", color = " + color);
        } else {
            System.out.println("Can't create new Circle with zero value");
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move() {
        System.out.println("Circle is moving");
    }

    @Override
    public void copy() {
        System.out.println("Circle copied");
    }

    @Override
    public void remove() {
        System.out.println("Circle removed");

    }

    @Override
    public void paste() {
        System.out.println("Circle pasted");
    }

    @Override
    public void draw() {
        System.out.println("Draw new Circle");
    }

    @Override
    public double[] scale(double value) {
        return new double[] {radius*value};
    }
}
