package ua.goit.GraphicEditor.Tool;

import ua.goit.GraphicEditor.Actions.Moveable;

public abstract class Connector implements Moveable {
    String name;
    double length;
    public abstract String getName();
}
