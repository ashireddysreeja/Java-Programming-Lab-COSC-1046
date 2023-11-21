import java.io.*;
import java.util.Random;

class IllegalTriangleException extends Exception {
    private static final long serialVersionUID = 1L;

	public IllegalTriangleException() {
        super("IllegalTriangleException: The triangle cannot be created.");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

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

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
    	
        return side3;
    }
}

public class TestTriangle {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("sides.txt")) {
            // Generate and write three random integers between 1 and 10 to sides.txt
            Random rand = new Random();
            for (int i = 0; i < 3; i++) {
                int randomSide = rand.nextInt(10) + 1;
                writer.println(randomSide);
            }
        } catch (IOException e) {
            System.out.println("IOException: Unable to write to sides.txt");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("sides.txt"))) {
            double side1 = Double.parseDouble(reader.readLine());
            double side2 = Double.parseDouble(reader.readLine());
            double side3 = Double.parseDouble(reader.readLine());

            try {
                // Create a Triangle object using the read side lengths
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Triangle created with sides: " + side1 + ", " + side2 + ", " + side3);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("IOException: Unable to read from sides.txt");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid format in sides.txt");
        }
    }
}