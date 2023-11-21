import java.util.*;

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

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("The Perimeter of the triangle is: " + triangle.getPerimeter());
        System.out.println("Triangle Info: " + triangle.toString());

        input.close();
    }
}
