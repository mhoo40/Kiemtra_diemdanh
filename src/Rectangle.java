public class Rectangle extends Shape {
    protected int width;
    protected int length;

    public Rectangle(int x, int y, int width, int length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }

    /**
     * Gets length.
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Gets width.
     * @return w
     */
    public double getWidth() {
        return width;
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
        System.out.println("Removed.");
    }

    /**
     * Gets string.
     */
    @Override
    public boolean theSame(Object o) {
        if (o instanceof Rectangle) {
            Rectangle newO = (Rectangle) o;
            return (width == newO.getWidth() && length == newO.getLength()
                    && x == newO.getX() && y ==newO.getY());
        }
        return false;
    }
}
