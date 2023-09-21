package ua.goit.GraphicEditor.Shape;

import ua.goit.GraphicEditor.Actions.Color;
import ua.goit.GraphicEditor.Actions.Moveable;
import ua.goit.GraphicEditor.Actions.Scalable;

public abstract class Shape implements Moveable, Scalable {
    String name;
    Color color;
    double sizeValues;

    public abstract String getName();
}
