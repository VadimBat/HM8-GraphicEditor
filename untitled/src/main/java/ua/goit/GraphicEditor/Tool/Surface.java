package ua.goit.GraphicEditor.Tool;

public class Surface {
    private double width;
    private double height;

    public Surface(double width, double height) {
        this.width = width;
        this.height = height;
        if ( width > 0 && height > 0 ) {
            System.out.println("New Surface created");
        } else {
            System.out.println("Can't create Surface");
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
