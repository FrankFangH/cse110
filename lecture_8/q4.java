import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Please enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Please enter value of c: ");
        double c = input.nextDouble();

        if (a == 0.0) {
            if (b == 0.0) {
                if (c == 0.0) {
                    System.out.println("This equation has an infinite number of solutions.");
                } else {
                    System.out.println("This equation has no solution.");
                }
            } else {
                double x = -c / b;
                System.out.println("This equation has 1 solution: x = " + x);
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant < 0.0) {
                System.out.println("This equation has no real solutions.");
            } else if (discriminant == 0.0) {
                double x = -b / (2 * a);
                System.out.println("This equation has 1 solution: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("This equation has 2 solutions: x = " + x1 + " and x = " + x2);
            }
        }

        input.close();
    }
}