package ua.goit.GraphicEditor.Tool;

import ua.goit.GraphicEditor.Actions.Drawable;

public class Point implements Drawable {
    private String name = "Point";
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("New Point created");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void draw() {
        System.out.println("Draw new point");
    }
}
