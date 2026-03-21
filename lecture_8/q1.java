import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of days Semi has worked: ");
        int semiDays = input.nextInt();

        System.out.print("Please enter the number of hours Semi has worked: ");
        int semiHours = input.nextInt();

        System.out.print("Please enter the number of minutes Semi has worked: ");
        int semiMinutes = input.nextInt();

        System.out.print("Please enter the number of days Daniel has worked: ");
        int danielDays = input.nextInt();

        System.out.print("Please enter the number of hours Daniel has worked: ");
        int danielHours = input.nextInt();

        System.out.print("Please enter the number of minutes Daniel has worked: ");
        int danielMinutes = input.nextInt();

        int semiTotalMinutes = semiDays * 24 * 60 + semiHours * 60 + semiMinutes;
        int danielTotalMinutes = danielDays * 24 * 60 + danielHours * 60 + danielMinutes;
        int totalMinutes = semiTotalMinutes + danielTotalMinutes;

        int totalDays = totalMinutes / (24 * 60);
        int remainingMinutesAfterDays = totalMinutes % (24 * 60);
        int totalHours = remainingMinutesAfterDays / 60;
        int totalRemainingMinutes = remainingMinutesAfterDays % 60;

        System.out.println("The total time both of them worked together is: "
                + totalDays + " days, "
                + totalHours + " hours and "
                + totalRemainingMinutes + " minutes.");

        input.close();
    }
}