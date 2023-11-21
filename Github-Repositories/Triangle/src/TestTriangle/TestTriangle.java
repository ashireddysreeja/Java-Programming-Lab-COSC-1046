
package TestTriangle;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true/false): ");
        
        boolean filled = input.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);
            System.out.println("The Perimeter of the triangle is: " + triangle.getPerimeter());
            System.out.println("Triangle Info:\n" + triangle.toString());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}

class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        color = "white";
        filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nFilled: " + filled;
    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("IllegalTriangleException: The triangle cannot be created.");
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
        return "Triangle dimensions with Side 1 = " + side1 +
                ", Side 2 = " + side2 + ", Side 3 = " + side3 + "\nPerimeter: " + getPerimeter() + "\n" +
                super.toString();
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("IllegalTriangleException: The triangle cannot be created.");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}