## 1) For Loop（for 循环）

**for loop** 适合：**已经知道大概要重复多少次**，或者每次按固定规律变化的情况。

基本结构：

~~~java
for (initialization; condition; update) {
    // repeated code
}
~~~

三部分分别是：

- **initialization（初始化）**：开始前执行一次
- **condition（条件）**：每轮前检查
- **update（更新）**：每轮后执行

---

## 2) while 和 for 很像

很多时候，`for` 和 `while` 可以互相改写。

### a) Using while
~~~java
int count = 0;

while (count < 5) {
    System.out.println(count);
    count++;
}
~~~

### b) Using for
~~~java
for (int count = 0; count < 5; count++) {
    System.out.println(count);
}
~~~

这两个程序输出一样：

~~~text
0
1
2
3
4
~~~

---

## 3) for loop 如何执行（How a for loop works）

例子：

~~~java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
~~~

执行顺序：

1. 先执行 `int i = 0`
2. 检查 `i < 5`
3. 如果为 `true`，执行循环体
4. 执行 `i++`
5. 再回去检查条件
6. 条件为 `false` 时结束

---

## 4) 为什么 for loop 很常用（Why for loops are useful）

`for` loop 把最关键的三件事都写在一行里：

- **start（从哪开始）**
- **stop（到哪结束）**
- **step（每次怎么变）**

所以当次数比较明确时，`for` 往往比 `while` 更清楚。

例子：打印 1 到 5

~~~java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
~~~

---

## 5) 常见 for loop 例子（Common for loop patterns）

### a) Count up
~~~java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
~~~

### b) Count down
~~~java
for (int i = 5; i >= 1; i--) {
    System.out.println(i);
}
~~~

### c) Count by 2
~~~java
for (int i = 0; i <= 10; i += 2) {
    System.out.println(i);
}
~~~

### d) Repeat a message
~~~java
for (int i = 1; i <= 3; i++) {
    System.out.println("Welcome!");
}
~~~

---

## 6) Counter and accumulator（计数器和累加器）

例子：求 1 到 5 的和

~~~java
int sum = 0;

for (int i = 1; i <= 5; i++) {
    sum += i;
}

System.out.println(sum); // 15
~~~

这里：

- `i` 是 **counter（计数器）**
- `sum` 是 **accumulator（累加器）**

---

## 7) Nested for Loops（for 循环嵌套）

**nested loop**：循环里面再放一个循环。

最常见的理解方式：

- **outer loop（外层循环）** 控制行数
- **inner loop（内层循环）** 控制每一行做几次

记住：

> **外层走一轮，内层完整执行一遍。**

### a) 打印矩形

~~~java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 4; col++) {
        System.out.print("*");
    }
    System.out.println();
}
~~~

输出：

~~~text
****
****
****
~~~

这里：

- 外层控制一共 3 行
- 内层控制每行打印 4 个 `*`

---

### b) 打印递增三角形

~~~java
for (int row = 1; row <= 4; row++) {
    for (int col = 1; col <= row; col++) {
        System.out.print("*");
    }
    System.out.println();
}
~~~

输出：

~~~text
*
**
***
****
~~~

这里的关键是：

~~~java
col <= row
~~~

意思是：**第几行，就打印几个 `*`。**

---

### c) 打印数字三角形

~~~java
for (int row = 1; row <= 4; row++) {
    for (int col = 1; col <= row; col++) {
        System.out.print(col);
    }
    System.out.println();
}
~~~

输出：

~~~text
1
12
123
1234
~~~

---

## 8) while 和 for 怎么选（Choosing between while and for）

### a) 用 `while` 的情况

当你只知道“继续条件”，不知道具体要执行几次时：

- 用户不断输入直到正确
- 一直读取数据直到结束
- 一直处理直到满足某条件

### b) 用 `for` 的情况

当你知道次数，或者是固定范围的计数时：

- 从 1 数到 10
- 打印 20 次
- 每次加 2
- 控制行列，打印图形

---

## 9) 常见错误（Common mistakes）

### a) Off-by-one error（差一错误）

~~~java
for (int i = 1; i < 5; i++) {
    System.out.println(i);
}
~~~

输出是：

~~~text
1
2
3
4
~~~

如果想打印到 5，应该写：

~~~java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
~~~

---

### b) Wrong update direction（更新方向写反）

~~~java
for (int i = 5; i >= 1; i++) {
    System.out.println(i);
}
~~~

这里想倒数，却写成了 `i++`，会出问题。  
应该写成：

~~~java
for (int i = 5; i >= 1; i--) {
    System.out.println(i);
}
~~~

---

### c) Changing the wrong variable（改错变量）

~~~java
int count = 0;
int x = 10;

while (count < 5) {
    System.out.println(count);
    x++;
}
~~~

这里更新的是 `x`，不是 `count`，所以循环不会结束。

---

### d) 在嵌套循环里看错变量

~~~java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 4; col++) {
        System.out.print(row);
    }
    System.out.println();
}
~~~

输出：

~~~text
1111
2222
3333
~~~

虽然内层循环在控制次数，但打印的是 `row`，不是 `col`。  
写嵌套循环时一定要分清：

- 谁控制次数
- 谁被打印出来

---

## 10) Loop vocabulary（循环核心词汇）

- **loop** = 循环
- **iteration** = 一次循环 / 一次迭代
- **condition** = 条件
- **infinite loop** = 死循环
- **counter** = 计数器
- **accumulator** = 累加器
- **update** = 更新
- **initialization** = 初始化
- **nested loop** = 嵌套循环
- **outer loop** = 外层循环
- **inner loop** = 内层循环

---