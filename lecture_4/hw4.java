import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ex1 直接写出output
        System.out.printf("A:%d", 7/2);
        System.out.printf("B:%s", "hi" + 1 + 2);
        System.out.printf("C:%d%n", 1 + 2);
        System.out.printf("%.2f%n", 2.675);
        System.out.printf("%.0f%n", 3.999);

        int dx = -3;
        int dy = 4;
        double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        System.out.printf("%.1f%n", dist);

        char c = 'A';
        System.out.println((int)c);
        System.out.println((char)(c + 2));
        System.out.println('a' - 'A');

        String t = "banana";
        System.out.println(t.length());
        System.out.println(t.charAt(1));
        System.out.println(t.substring(2, 5));
        System.out.println(t.indexOf("na"));
        System.out.println(t.indexOf("x"));

        // Ex2 Problem 2 — Weather Report 
        // 用scan让用户输入给定三天温度（double），打印出平均温度，最大温度差(尝试用Math.max和Math.min)，和方差。
        // 所有的结果都需要保留一位小数。

        double temperature_1 = scan.nextDouble(); // 第一天的温度
        // 从这里开始写答案


        // Ex3 Problem 3 - String
        String fullName = "lucy chen"; // 给定一个String：lucy chen
        // 你需要使用string tool，例如：charAt(），substring(2, 5)，indexOf("na")等把lucy chen转换成Lucy Chen
        // 把首字母大写
        // 提示：把char转换成int，用ASCII表格来解决问题。
    }
}