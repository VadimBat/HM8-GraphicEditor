package ua.goit.GraphicEditor.Shape;

import ua.goit.GraphicEditor.Actions.Color;

public class Ellipse extends Shape{

    private String name = "Ellipse";
    private double r1;
    private double r2;

    public Ellipse(double r1, double r2, Color color) {
        this.r1 = r1;
        this.r2 = r2;
        this.color = color;
        if ( r1 !=0 && r2 !=0 ){
            System.out.println("New Ellipse created : r1 = " + r1 + ", r2 = " + r2 + ", color = " + color);
        } else if ( r1 > r2 && r2 > r1 ){
            System.out.println("New Ellipse created : r1 = " + r1 + ", r2 = " + r2 + ", color = " + color);
        } else {
            System.out.println("Can't create new Ellipse with zero values or impossible create this Ellipse");
        }
    }

    public double getR1() {
        return r1;
    }

    public double getR2() {
        return r2;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move() {
        System.out.println("Ellipse is moving");
    }

    @Override
    public void copy() {
        System.out.println("Ellipse copied");
    }

    @Override
    public void remove() {
        System.out.println("Ellipse removed");
    }

    @Override
    public void paste() {
        System.out.println("Ellipse pasted");
    }

    @Override
    public void draw() {
        System.out.println("Draw new Ellipse");
    }

    @Override
    public double[] scale(double value) {
        return new double[] {r1*value, r2*value};
    }
}
