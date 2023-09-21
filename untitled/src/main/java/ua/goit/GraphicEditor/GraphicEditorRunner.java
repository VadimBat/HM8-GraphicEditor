package ua.goit.GraphicEditor;

import ua.goit.GraphicEditor.Actions.Color;
import ua.goit.GraphicEditor.Shape.Ellipse;
import ua.goit.GraphicEditor.Tool.Direction;
import ua.goit.GraphicEditor.Shape.Rectangle;
import ua.goit.GraphicEditor.Shape.Rhombus;
import ua.goit.GraphicEditor.Shape.Shape;
import ua.goit.GraphicEditor.Tool.*;

import java.util.Arrays;

public class GraphicEditorRunner {
    public static void main(String[] args) {
        Surface testSurface = new Surface(0,0);
        Surface surface = new Surface(1920,1080);
        Point point = new Point(5,3);
        Shape rectangle = new Rectangle(5,12, Color.RED);
        Text rectangleText = new Text(Color.BLACK,15);
        double[] newScale = rectangleText.scale(0.8);
        System.out.println("newScale = " + Arrays.toString(newScale));
        Connector vector = new Vector(8, Direction.RIGHT);
        Shape Rhombus = new Rhombus(12,7,Color.YELLOW);
        Text rhombusText = new Text(Color.BLACK,12);
        Shape ellipse = new Ellipse(0,0, Color.BLUE);
    }
}
