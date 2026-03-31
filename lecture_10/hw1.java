import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double G = 6 * Math.pow(10, -11);
        System.out.print("Enter the mass of the first object: ");
        double mass1 = input.nextDouble();
        System.out.print("Enter the radius of the first object: ");
        double radius1 = input.nextDouble();
        System.out.print("Enter the mass of the second object: ");
        double mass2 = input.nextDouble();
        System.out.print("Enter the radius of the second object: ");
        double radius2 = input.nextDouble();
        System.out.print("Enter the distance between the surfaces of both objects: ");
        double surfaceDistance = input.nextDouble();

        double centerDistance = radius1 + radius2 + surfaceDistance;
        double force = G * mass1 * mass2 / (centerDistance * centerDistance);

        System.out.println("The force of gravitation between these two objects is " + force + " N.");
    }
}