import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        // Ex 1 写一个时间转换器，你需要要求用户输入小时，然后把它变为分钟。比如，
        //      用户输入1.5小时，你需要打印出90.0分钟。请考虑使用double数据类型
        Scanner scan = new Scanner(System.in);
        double hour = scan.nextDouble();

        System.out.println(hour * 60.0);

        // Ex 1 写一个时间转换器，你需要要求用户输入分钟，然后把它变为小时。比如，
        //      用户输入90分钟，你需要打印出1.5小时。请考虑使用double数据类型
        double minute = scan.nextDouble();

        double hour_pre = minute / 60.0;
        System.out.println(hour_pre);
    }
}