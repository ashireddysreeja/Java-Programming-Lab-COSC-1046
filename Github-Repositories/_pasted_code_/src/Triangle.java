import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("IllegalTriangleException: The triangle cannot be created.");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException();
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3
                + "\nPerimeter = " + getPerimeter() + "\n" + super.toString();
    }

    public static void main(String[] args) {
        try {
            Scanner fileInput = new Scanner(new File("sides.txt"));

            int side1 = fileInput.nextInt();
            int side2 = fileInput.nextInt();
            int side3 = fileInput.nextInt();

            fileInput.close();

            Triangle triangle = new Triangle(side1, side2, side3);

            System.out.println("\nTriangle information:");
            System.out.println(triangle);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}