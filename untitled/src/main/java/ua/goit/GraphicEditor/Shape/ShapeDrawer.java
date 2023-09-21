package ua.goit.GraphicEditor.Shape;

import ua.goit.GraphicEditor.Actions.Color;

public class ShapeDrawer {
    public static void main(String[] args) {
        Shape Rectangle = new Rectangle(5, 8, Color.WHITE);
        Shape Quad = new Quad(7, Color.RED);
        Shape Triangle = new Triangle(3,4,5, Color.YELLOW);
        Shape Circle = new Circle(9, Color.GREEN);
        Shape Ellipse = new Ellipse(2,4,Color.BLUE);
        Shape Rhombus = new Rhombus(3,6, Color.RED);

        System.out.println("Quad.getName() = " + Quad.getName());
    }
}
