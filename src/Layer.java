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

    public void removeDup() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get((j)))) {
                    shapes.get(j).remove();
                    shapes.remove(j);
                }
            }
        }
    }
}
