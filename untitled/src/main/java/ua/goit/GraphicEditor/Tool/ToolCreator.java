package ua.goit.GraphicEditor.Tool;

import ua.goit.GraphicEditor.Actions.Color;

public class ToolCreator {
    public static void main(String[] args) {
        Surface surface = new Surface(500,200);
        Connector line = new Line(6);
        line.draw();
        line.move();
        line.copy();
        line.paste();
        Connector vector = new Vector(4, Direction.LEFT);
        Text text = new Text(Color.BLACK, 5);
    }
}
