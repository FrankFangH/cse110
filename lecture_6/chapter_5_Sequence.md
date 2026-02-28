# Chapter Notes — Sequence（顺序结构）
---

## 0) Big Idea（核心概念）

**Sequence（顺序结构）**：程序默认按 **top-to-bottom execution（从上到下逐行执行）**。  
每一行都会在上一行的 **current state（当前状态）** 基础上继续运行，所以 **行的顺序会影响结果**。

---

## 1) Why is Sequence Important?（为什么顺序重要？）

### a) Same lines, different order → different output（同样的语句，顺序不同结果不同）

~~~java
int x = 3;
x = x + 1;
x = x * 2;
System.out.println(x); // 8
~~~

~~~java
int x = 3;
x = x * 2;
x = x + 1;
System.out.println(x); // 7
~~~

---

## 2) Common Patterns With Variables（变量的常见模式）

### a) Update / Reassign（更新变量）
形式：`x = x + something`

~~~java
int score = 10;
score = score + 5;   // 15
score = score - 3;   // 12
~~~

### c) Accumulator（累加器）
**Accumulator（累加器）**：把多个值累计成一个总结果（sum / total）。

~~~java
int sum = 0;
sum += 4;
sum += 10;
sum += 2;
System.out.println(sum); // 16
~~~

### d) Counter（计数器）
**Counter（计数器）**：记录次数（how many times）。

~~~java
int count = 0;
count++;
count++;
System.out.println(count); // 2
~~~

### e) Temporary Variable（临时变量）
**Temporary variable（临时变量）**：保存中间值，避免覆盖导致丢数据。

~~~java
int a = 5;
int b = 9;

int temp = a;
a = b;
b = temp;

System.out.println("a=" + a + ", b=" + b); // a=9, b=5
~~~

---

## 3) Swap Two Variables（交换两个变量）

### a) Correct swap with temp（标准三行交换）
~~~java
int a = 1;
int b = 2;

int temp = a;
a = b;
b = temp;

System.out.println(a + " " + b); // 2 1
~~~

### b) Common mistake（常见错误：覆盖丢失）
~~~java
int a = 1;
int b = 2;

a = b;
b = a; // WRONG: original a is already lost

System.out.println(a + " " + b); // 2 2
~~~

## 5) Tracing a Program（程序跟踪 / Dry Run）

**Trace / Dry Run（跟踪执行）**：不运行程序，也能按行推导变量变化并预测输出。  
技巧：写 **trace table（跟踪表）**，每执行一行就更新变量值。

### a) Integer Division matters（整数除法影响结果）
~~~java
int x = 10;
int y = 3;

x = x / y;   // integer division: 10/3 -> 3
y = y + x;   // 3 + 3 -> 6

System.out.println(x); // 3
System.out.println(y); // 6
~~~

### b) Mixed expressions（混合表达式 / 类型提升）
~~~java
int a = 7;
double b = 2;

double c = a / b;   // int promoted to double, 7/2.0 -> 3.5
System.out.println(c); // 3.5
~~~

---