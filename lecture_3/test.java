import java.util.Scanner;

public class test {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        final double CM_TO_M = 0.01;

        System.out.print("Height (cm): ");
        double heightCm = sc.nextDouble();

        System.out.print("Weight (kg): ");
        double weightKg = sc.nextDouble();

        double heightM = heightCm * CM_TO_M;
        double bmi = weightKg / (heightM * heightM);

        System.out.println("BMI = " + bmi);

        System.out.println("------------");

        System.out.println(-7/4);

        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        int a = 65;
        System.out.println((char) (a + 1));
    }
}