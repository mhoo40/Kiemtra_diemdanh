public abstract class Shape {
    protected int x;
    protected int y;
    public static double PI = Math.PI;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Gets area.
     */
    public abstract void draw();

    /**
     * Gets Perimeter.
     */
    public abstract void remove();

    /**
     * Gets boolean.
     */
    public abstract boolean theSame(Object o);

    /**
     * Gets area.
     * @param x as p
     * @param y as p
     */
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    };
}
