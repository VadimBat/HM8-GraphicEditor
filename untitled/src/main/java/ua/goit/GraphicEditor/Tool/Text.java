package ua.goit.GraphicEditor.Tool;

import ua.goit.GraphicEditor.Actions.Color;
import ua.goit.GraphicEditor.Actions.Moveable;
import ua.goit.GraphicEditor.Actions.Scalable;

public class Text implements Scalable, Moveable {
    private final Color color;
    private double size;

    public Text (Color color, double size) {
        this.color = color;
        this.size = size;
        System.out.println("Text with: color - " + color + ", size - " + size);
    }

    @Override
    public void draw() {
        System.out.println("Create text");
    }

    @Override
    public void move() {
        System.out.println("Text is moving");
    }

    @Override
    public void copy() {
        System.out.println("Text copied");
    }

    @Override
    public void remove() {
        System.out.println("Text removed");
    }

    @Override
    public void paste() {
        System.out.println("Text pasted");
    }

    @Override
    public double[] scale(double value) {
        return new double[] {size*value};
    }
}
