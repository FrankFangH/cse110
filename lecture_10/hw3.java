import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");
        int n = input.nextInt();

        int count = 0;
        int oddNumber = 1;

        while (count < n) {
            System.out.println(oddNumber);
            oddNumber = oddNumber + 2;
            count++;
        }
    }
}