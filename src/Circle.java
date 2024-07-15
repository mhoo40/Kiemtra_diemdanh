public class Circle extends Shape {
    protected double radius;

    /**
     * Constructs.
     * @param x as r
     * @param y as r
     * @param radius as r
     */
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Gets string.
     */
    @Override
    public void draw() {
        System.out.format("Draw at (%d, %d).\n", this.x, this.y);
    }

    /**
     * Gets string.
     */
    @Override
    public void remove() {
        System.out.format("Removed at (%d, %d).\n", this.x, this.y);
    }

    /**
     * Gets string.
     */
    @Override
    public boolean theSame(Object o) {
        if (o instanceof Circle) {
            Circle newO = (Circle) o;
            return (radius == newO.getRadius()
                    && x == newO.getX() && y ==newO.getY());
        }
        return false;
    }
}
