import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ex1 直接写出output
        System.out.printf("A:%d", 7 / 2);              // A:3
        System.out.printf("B:%s", "hi" + 1 + 2);       // B:hi12
        System.out.printf("C:%d%n", 1 + 2);            // C:3
        System.out.printf("%.2f%n", 2.675);            // 2.68
        System.out.printf("%.0f%n", 3.999);            // 4

        int dx = -3;
        int dy = 4;
        double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        System.out.printf("%.1f%n", dist);             // 5.0

        char c = 'A';
        System.out.println((int) c);                   // 65
        System.out.println((char) (c + 2));            // C
        System.out.println('a' - 'A');                 // 32

        String t = "banana";
        System.out.println(t.length());                // 6
        System.out.println(t.charAt(1));               // a
        System.out.println(t.substring(2, 5));         // nan
        System.out.println(t.indexOf("na"));           // 2
        System.out.println(t.indexOf("x"));            // -1

        // Ex2 Problem 2 — Weather Report
        // 输入三天温度（double），输出平均温度、最大温差、方差（都保留1位小数）

        double temperature_1 = scan.nextDouble();      // 第一天
        double temperature_2 = scan.nextDouble();      // 第二天
        double temperature_3 = scan.nextDouble();      // 第三天

        double mean = (temperature_1 + temperature_2 + temperature_3) / 3.0; // 平均值

        double maxTemp = Math.max(temperature_1, Math.max(temperature_2, temperature_3)); // 最大值
        double minTemp = Math.min(temperature_1, Math.min(temperature_2, temperature_3)); // 最小值
        double maxDiff = maxTemp - minTemp; // 最大温差

        double variance = (
                Math.pow(temperature_1 - mean, 2) +
                Math.pow(temperature_2 - mean, 2) +
                Math.pow(temperature_3 - mean, 2)
        ) / 3.0; // 总体方差（population variance）

        System.out.printf("Average temperature: %.1f%n", mean);             // 平均温度
        System.out.printf("Maximum temperature difference: %.1f%n", maxDiff); // 最大温差
        System.out.printf("Variance: %.1f%n", variance);                    // 方差

        // Ex3 Problem 3 - String
        // 把 "lucy chen" 转成 "Lucy Chen"
        // 要求：用 string tools + ASCII 思路

        String fullName = "lucy chen";

        int spaceIndex = fullName.indexOf(" ");        // 空格位置 = 4

        char first1 = fullName.charAt(0);              // 'l'
        char first2 = fullName.charAt(spaceIndex + 1); // 'c'

        char upper1 = (char) (first1 - 32);            // 'L'（ASCII: 小写转大写减32）
        char upper2 = (char) (first2 - 32);            // 'C'

        String rest1 = fullName.substring(1, spaceIndex);   // "ucy"
        String rest2 = fullName.substring(spaceIndex + 2);  // "hen"

        String resultName = upper1 + rest1 + " " + upper2 + rest2; // "Lucy Chen"
        System.out.println(resultName);                // Lucy Chen

        scan.close();
    }
}
