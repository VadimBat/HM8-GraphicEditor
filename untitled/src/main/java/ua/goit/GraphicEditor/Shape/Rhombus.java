package ua.goit.GraphicEditor.Shape;

import ua.goit.GraphicEditor.Actions.Color;

public class Rhombus extends Shape{
    private String name = "Rhombus";
    private double d1;
    private double d2;

    public Rhombus(double d1, double d2, Color color) {
        this.d1 = d1;
        this.d2 = d2;
        this.color = color;
        if ( d1 !=0 || d2 !=0 ){
            System.out.println("New Rhombus created : d1 = " + d1 + ", d2 = " + d2 + ", color = " + color);
        } else {
            System.out.println("Can't create new Rhombus with zero values");
        }
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("Rhombus is moving");
    }

    @Override
    public void copy() {
        System.out.println("Rhombus copied");
    }

    @Override
    public void remove() {
        System.out.println("Rhombus removed");
    }

    @Override
    public void paste() {
        System.out.println("Rhombus pasted");
    }

    @Override
    public void draw() {
        System.out.println("Draw new Rhombus");
    }

    @Override
    public double[] scale(double value) {
        return new double[] {d1*value, d2*value};
    }
}
