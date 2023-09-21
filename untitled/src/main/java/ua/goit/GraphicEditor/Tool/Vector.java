package ua.goit.GraphicEditor.Tool;

public class Vector extends Connector{
    private final Direction direction;
    private String name = "Vector";
    private double length;

    public Vector(double length, Direction direction) {
        this.length = length;
        this.direction = direction;
        if (length>0){
            System.out.println("Vector created, vector length = " + length + ", direction = " + direction);
        } else {
            System.out.println("Can't create vector");
        }
    }

    public double getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("Draw new Direction");
    }

    @Override
    public void move() {
        System.out.println("Direction is moving");
    }

    @Override
    public void copy() {
        System.out.println("Direction copied");
    }

    @Override
    public void remove() {
        System.out.println("Direction removed");
    }

    @Override
    public void paste() {
        System.out.println("Direction pasted");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
