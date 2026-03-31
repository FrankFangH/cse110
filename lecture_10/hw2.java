import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double EPSILON = 0.00001;

        System.out.print("Length of the first side: ");
        double a = input.nextDouble();

        System.out.print("Length of the second side: ");
        double b = input.nextDouble();

        System.out.print("Length of the third side: ");
        double c = input.nextDouble();

        boolean abEqual = Math.abs(a - b) <= EPSILON;
        boolean acEqual = Math.abs(a - c) <= EPSILON;
        boolean bcEqual = Math.abs(b - c) <= EPSILON;

        boolean isEquilateral = abEqual && acEqual;
        boolean isIsosceles = abEqual || acEqual || bcEqual;

        double z = Math.max(a, Math.max(b, c));
        double x, y;

        if (Math.abs(z - a) <= EPSILON) {
            x = b;
            y = c;
        } else if (Math.abs(z - b) <= EPSILON) {
            x = a;
            y = c;
        } else {
            x = a;
            y = b;
        }

        boolean isRight = Math.abs(x * x + y * y - z * z) <= EPSILON;

        if (isEquilateral) {
            System.out.println("equilateral triangle");
        } else if (isIsosceles && isRight) {
            System.out.println("isosceles right triangle");
        } else if (isIsosceles) {
            System.out.println("isosceles triangle that is not a right triangle");
        } else {
            System.out.println("normal triangle");
        }
    }
}
