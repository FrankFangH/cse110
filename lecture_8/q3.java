import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter this user's current XP: ");
        double xp = input.nextDouble();

        if (xp < 0.0 || xp > 50.0) {
            System.out.println("ERROR: Please enter a valid XP value.");
        } else if (xp < 18.0) {
            System.out.println("Level 1 Player (XP: " + xp + ")");
        } else if (xp < 25.0) {
            System.out.println("Level 2 Player (XP: " + xp + ")");
        } else if (xp < 30.0) {
            System.out.println("Level 3 Player (XP: " + xp + ")");
        } else if (xp < 40.0) {
            System.out.println("Level 4 Player (XP: " + xp + ")");
        } else {
            System.out.println("Level 5 Player (XP: " + xp + ")");
        }

        input.close();
    }
}