import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).equals(shape)) {
                shapes.get(i).remove();
                shapes.remove(i);
            }
        }
    }
}
