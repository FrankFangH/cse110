import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        for (int i = input; i > 0; i--) {
            for (int j = input - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for (int i = 1; i < input; i++) {
            for (int j = input - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * (i+1) - 1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        
    }
}
