
public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        return (x >= this.x - width / 2 && x <= this.x + width / 2 && y >= this.y - height / 2 && y <= this.y + height / 2);
    }

    public boolean contains(MyRectangle2D r) {
        double x1 = r.getX() - r.getWidth() / 2;
        double x2 = r.getX() + r.getWidth() / 2;
        double y1 = r.getY() - r.getHeight() / 2;
        double y2 = r.getY() + r.getHeight() / 2;

        return (contains(x1, y1) && contains(x2, y2));
    }

    public boolean overlaps(MyRectangle2D r) {
        double x1 = r.getX() - r.getWidth() / 2;
        double x2 = r.getX() + r.getWidth() / 2;
        double y1 = r.getY() - r.getHeight() / 2;
        double y2 = r.getY() + r.getHeight() / 2;

        return !(x + width / 2 < x1 || x - width / 2 > x2 || y + height / 2 < y1 || y - height / 2 > y2);
    }

    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Contains (3, 3): " + r1.contains(3, 3));
        System.out.println("Contains (4, 5, 10.5, 3.2): " + "r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)");
        System.out.println("Overlaps (3, 5, 2.3, 5.4): " + "r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)");
    }
}
