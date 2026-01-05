import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // 美国零钱换算，知识补充
        // Penny = 1 cent
        // Nickel = 5 cents
        // Dime = 10 cents
        // Quarter = 25 cents

        // 1 美元 = 100 cents (美分)

        // =========================================================
        // Ex 1: Penny Pinching 零钱统计（主要用运算符号 / 和 %）
        //
        // 邻居家的小美手里有很多的硬币，她分别有若干四种类型的硬币，分别是 Penny，
        // Nickel，Dime，Quarter。她现在想知道手中的硬币一共价值多少美金，但是她的数学
        // 不好，所以需要你写一个程序，分别询问她手中有多少Penny，Nickel，Dime，Quarter
        // ，计算出价值总和的美金。
        // 
        // Input: 
        //  - quarters, dimes, nickels, pennies (int)
        //
        // Example: 
        // 
        // Example (one possible run):
        // Number of quarters: 3
        // Number of dimes: 2
        // Number of nickels: 1
        // Number of pennies: 4
        // The total is 1 dollar(s) and 4 cent(s)
        // 因为 3 * 25 + 2 * 10 + 1 * 5 + 1 * 4 = 104
        // 100 cents就是1美元，那么这里就有1美元4美分
        // =========================================================
        
        // 在这里写你的回答：

        // =========================================================
        // Ex 2: Make Change 找零（主要用运算符号 / 和 %）
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

        scnr.close();
    }
}