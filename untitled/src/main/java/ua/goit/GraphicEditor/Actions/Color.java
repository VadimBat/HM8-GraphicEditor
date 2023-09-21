package ua.goit.GraphicEditor.Actions;

public enum Color {
    BLACK("black"),
    WHITE("white"),
    RED("red"),
    GREEN("green"),
    BLUE("blue"),
    YELLOW("yellow");

    private String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

    public String getColor() {
        return color;
    }
}
