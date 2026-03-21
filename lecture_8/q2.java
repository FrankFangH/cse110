import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Do you have permission from the dean? [y/n] ");
        String deanInput = input.next();

        System.out.print("Do you have permission from your advisor? [y/n] ");
        String advisorInput = input.next();

        System.out.print("Do you hold senior status? [y/n] ");
        String seniorInput = input.next();

        System.out.print("How many credits do you have? ");
        int credits = input.nextInt();

        boolean deanPermission = deanInput.equals("y");
        boolean advisorPermission = advisorInput.equals("y");
        boolean seniorStatus = seniorInput.equals("y");

        boolean canGraduate =
                deanPermission
                || (credits >= 64 && seniorStatus)
                || (credits >= 40 && advisorPermission);

        System.out.println("This student can graduate: " + canGraduate);

        input.close();
    }
}