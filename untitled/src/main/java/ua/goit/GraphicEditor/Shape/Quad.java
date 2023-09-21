package ua.goit.GraphicEditor.Shape;

import ua.goit.GraphicEditor.Actions.Color;

public class Quad extends Shape{

    private String name = "Quad";
    private double a;

    public Quad(double a, Color color ) {
        this.a = a;
        this.color = color;
        if ( a !=0 ){
            System.out.println("New Quad created : a = " + a);
        } else {
            System.out.println("Can't create new Quad with zero value");
        }
    }

    public double getA() {
        return a;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move() {
        System.out.println("Quad is moving");
    }

    @Override
    public void copy() {
        System.out.println("Quad copied");
    }

    @Override
    public void remove() {
        System.out.println("Quad removed");
    }

    @Override
    public void paste() {
        System.out.println("Quad pasted");
    }

    @Override
    public void draw() {
        System.out.println("Draw new Quad");
    }

    @Override
    public double[] scale(double value) {
        return new double[] {a*value};
    }
}
