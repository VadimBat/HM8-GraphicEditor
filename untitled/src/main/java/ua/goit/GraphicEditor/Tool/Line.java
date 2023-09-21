package ua.goit.GraphicEditor.Tool;

public class Line extends Connector{
    private String name = "Line";
    private double length;

    public Line(double length) {
        this.length = length;
        if (length>0){
            System.out.println("Line created, line length = " + length);
        } else {
            System.out.println("Can't create line");
        }
    }

    public double getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println("Draw new Line");
    }

    @Override
    public void move() {
        System.out.println("Line is moving");
    }

    @Override
    public void copy() {
        System.out.println("Line copied");
    }

    @Override
    public void remove() {
        System.out.println("Line removed");
    }

    @Override
    public void paste() {
        System.out.println("Line pasted");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
