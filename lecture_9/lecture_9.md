# Chapter Notes — Loops（循环）
---

## 0) Big Idea（核心概念）

**Loop（循环）**：让程序在 **condition（条件）** 满足时，**repeat（重复执行）** 某一段代码。  

前一章 **Branches / Decisions（分支 / 条件判断）** 是：

> 程序决定 **走哪条路**

这一章 **Loops（循环）** 是：

> 程序决定 **这条路要不要再走一次**

---

## 1) Why are Loops Important?（为什么循环重要？）

如果没有 loop，很多重复任务都要手写很多遍。

### a) Repetition without loops（没有循环时只能重复写）
~~~java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
~~~

这样能做，但很笨，而且不容易改。

---

### b) Repetition with loops（用循环重复）
~~~java
int count = 0;

while (count < 5) {
    System.out.println("Hello");
    count++;
}
~~~

这样程序会重复执行 5 次。

---

## 2) Main Idea of a Loop（循环的核心思想）

一个 loop 通常包含三件事：

- **start value（初始值）**
- **condition（继续条件）**
- **update（更新）**

如果少了其中一个，就很容易写错，尤其容易写成 **infinite loop（死循环）**。

### a) Example structure（基本结构）
~~~java
int count = 0;           // start value

while (count < 5) {      // condition
    System.out.println(count);
    count++;             // update
}
~~~

---

## 3) While Loop（while 循环）

**while loop**：只要括号里的条件是 `true`，就一直重复执行。

基本形式：

~~~java
while (condition) {
    // repeated code
}
~~~

---

## 4) How a while loop runs（while 循环如何执行）

执行顺序：

1. 先检查 **condition（条件）**
2. 如果条件是 `true`，执行大括号里的代码
3. 执行完后，再回去检查条件
4. 如果条件还是 `true`，继续下一轮
5. 如果条件是 `false`，循环结束

---

### a) Example: count from 0 to 4
~~~java
int count = 0;

while (count < 5) {
    System.out.println(count);
    count++;
}
~~~

输出：

~~~text
0
1
2
3
4
~~~

---

## 5) Tracing a while loop（跟踪 while 循环）

### a) Trace / Dry Run（程序跟踪）
~~~java
int count = 0;

while (count < 3) {
    System.out.println("count = " + count);
    count++;
}
System.out.println("Done");
~~~

### b) Trace table（跟踪表）

| check condition | count value | output |
|---|---:|---|
| `count < 3` → true | 0 | `count = 0` |
| `count < 3` → true | 1 | `count = 1` |
| `count < 3` → true | 2 | `count = 2` |
| `count < 3` → false | 3 | `Done` |

---

## 6) Infinite Loop（死循环）

**Infinite loop（死循环）**：循环永远不会结束。

### a) Common mistake（常见错误：忘了更新变量）
~~~java
int count = 0;

while (count < 5) {
    System.out.println(count);
}
~~~

这里的问题是：`count` 从来没有变化。  
所以 `count < 5` 永远都还是 `true`，循环不会停。

---

### b) Correct version（正确写法）
~~~java
int count = 0;

while (count < 5) {
    System.out.println(count);
    count++;
}
~~~

---

## 7) Counter in loops（循环里的计数器）

**Counter（计数器）**：记录循环执行了多少次，或者当前进行到第几次。

~~~java
int count = 1;

while (count <= 5) {
    System.out.println("This is loop #" + count);
    count++;
}
~~~

输出：

~~~text
This is loop #1
This is loop #2
This is loop #3
This is loop #4
This is loop #5
~~~

---

## 8) Accumulator in loops（循环里的累加器）

**Accumulator（累加器）**：在循环中不断把值加到总数里。

### a) Sum from 1 to 5（把 1 到 5 加起来）
~~~java
int num = 1;
int sum = 0;

while (num <= 5) {
    sum = sum + num;
    num++;
}

System.out.println(sum); // 15
~~~

这里：

- `num` 是当前要加的数
- `sum` 是累加器

---

## 9) More while examples（更多 while 例子）

### a) Count up（递增计数）
~~~java
int n = 1;

while (n <= 5) {
    System.out.println(n);
    n++;
}
~~~

输出：

~~~text
1
2
3
4
5
~~~

---

### b) Count down（递减计数）
~~~java
int n = 5;

while (n >= 1) {
    System.out.println(n);
    n--;
}
~~~

输出：

~~~text
5
4
3
2
1
~~~

---

### c) Count by 2（每次加 2）
~~~java
int n = 0;

while (n <= 10) {
    System.out.println(n);
    n += 2;
}
~~~

输出：

~~~text
0
2
4
6
8
10
~~~

---

## 10) User-controlled loops（由用户输入控制的循环）

有时我们并不知道循环会执行几次。  
这时候 `while` 特别有用。

### a) Keep asking until correct（一直问到输入正确）
~~~java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

System.out.print("Enter password: ");
String password = sc.nextLine();

while (!password.equals("java123")) {
    System.out.print("Wrong password. Try again: ");
    password = sc.nextLine();
}

System.out.println("Access granted.");
~~~

这里的特点是：

- 不知道用户会输错几次
- 所以不适合提前固定次数
- 很适合用 `while`

---