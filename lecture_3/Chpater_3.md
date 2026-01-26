# Chapter 3

## Main Idea

我们已经会写表达式了（Chapter 2）。  
Chapter 3 要学的是：怎么把表达式变成
- 更强的工具（Tools）：`Math` 方法来解决真实问题（Real-world）：salary / pizza party / lab

---

## 1) 给一个 int，怎么拿到每一位数字？

例子：`5341`

- `5341 % 10 = 1`  → ones digit（个位）
- `5341 / 10 = 534` → 去掉个位（remove ones digit）
- 然后继续重复同样操作

---

## 2) 拆四位数示例：thousands / hundreds / tens / ones

假设输入是四位数 `n`：

~~~java
Scanner sc = new Scanner(System.in);
// 输入一个四位数（example: 5341）
int n = sc.nextInt();

int ones = n % 10;
n = n / 10;
int tens = n % 10;
n = n / 10;

int hundreds = n % 10;
n = n / 10;

int thousands = n % 10;
System.out.println(thousands + " " + hundreds + " " + tens + " " + ones);
~~~

---

## 3) 十进制转二进制：用 / 和 %（除 2 取余）

举例：把 13 转成二进制 -> 1101

步骤（一直 /2，记录 %2）：
- 13 % 2 = 1，13 / 2 = 6  
- 6 % 2 = 0，6 / 2 = 3  
- 3 % 2 = 1，3 / 2 = 1  
- 1 % 2 = 1，1 / 2 = 0  
把余数倒过来：`1101`