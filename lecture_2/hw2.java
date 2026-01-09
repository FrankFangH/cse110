import java.util.Scanner;

public class hw2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        //不要运行，手算每一行输出

        int a = 9;
        int b = 4;
        int c = -7;
        double d = 2.5;

        System.out.println(a - b * 2 + c);
        System.out.println((a - b) * (2 + c));

        System.out.println(c / b);
        System.out.println(c % b);

        System.out.println(a / b * b);
        System.out.println(a * b / b);

        System.out.println((double)a / b);
        System.out.println((int)(d * b) / a);
        System.out.println((int)(d * (b / a)));

        System.out.println(a + b + "X" + c);
        System.out.println("X" + a + b + c);
        System.out.println("X" + (a + b) + c);
        System.out.println("Line1\t" + a + "\nLine2\t" + b);

        System.out.println("He said: \"" + a + "\"");

        System.out.println(a > b && b > 0);
        System.out.println(!(a > b) || (c < 0 && b == 4));

        int x = 0;
        System.out.println(x != 0 && (100 / x > 1));
        System.out.println(x == 0 || (100 / x > 1));

        int y = -3;
        System.out.println(y > 0 && (10 / y > 1));
        System.out.println(y <= 0 || (10 / y > 1));

        // Ex：2
        // 写一个小程序
        // 任务：询问用户一个商品原价 price（double）和折扣 discount（int，百分比）
        // 例如 price=80.0, discount=25 表示打 25% off
        // 计算最终价格 finalPrice，并打印出来
        //
        // 关键点：
        // 1) discount 是百分比，需要转成小数（例如 25 -> 0.25）

        // 在这里写你的回答：

        // Ex 3: Make Change
        //
        // 现在小美去便利店买东西，收银员需要“找零”。小美只想要最少数量的硬币（更方便携带）。
        // 你需要写一个程序：让用户输入一个金额（美元 + 美分），然后计算出如果用
        // Quarter, Dime, Nickel, Penny 来找零，分别需要多少个（按从大到小的顺序拆分）。
        //
        // 规则：
        // 1) 先尽量用 Quarter（25 cents）
        // 2) 剩下的再用 Dime（10 cents）
        // 3) 剩下的再用 Nickel（5 cents）
        // 4) 最后剩下的就是 Penny（1 cent）
        //
        // Input:
        //  - dollars (int)
        //  - cents (int)   // 0 ~ 99
        //
        // Output:
        //  - "X dollars and Y cents are: q quarters, d dimes, n nickels and p pennies"
        //
        // Example (one possible run):
        // Enter dollars: 1
        // Enter cents: 4
        // 1 dollars and 4 cents are: 4 quarters, 0 dimes, 0 nickels and 4 pennies
        //
        // 因为：
        // totalCents = 1 * 100 + 4 = 104
        // quarters = 104 / 25 = 4, remaining = 104 % 25 = 4
        // dimes    = 4 / 10   = 0, remaining = 4 % 10   = 4
        // nickels  = 4 / 5    = 0, remaining = 4 % 5    = 4
        // pennies  = remaining = 4
        // =========================================================
        
        // 在这里写你的回答：
    }
}