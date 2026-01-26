# Chapter Notes — Expressions, Variables,
---

## 1) Expression（表达式）

**Expression（表达式）**：一段代码能 **evaluate to a value（求值为一个值）**。

Examples:
- `3 + 4`
- `"Hi" + name`
- `x + y`

---

## 2) Variables & Assignments（变量与赋值）

### a) Declaration（声明）
只告诉类型和名字（type + name），不赋值：

~~~java
int age;
~~~

### b) Initialization（初始化）
第一次给值（first assignment / initial value）：

~~~java
int age = 20;
~~~

### c) Assignment（赋值 / 更新）
之后更新变量的值（re-assign / update）：

~~~java
age = 21;
~~~

---

## 3) Uninitialized Variable 会编译错误

打印未初始化变量会出错（compile-time error）：

~~~java
int a;
// System.out.println(a); // 编译错误：variable a might not have been initialized
a = 10;
System.out.println(a); // 10
~~~

---

## 4) Type Conversion（类型转换）与 Integer Division（整数除法）

### 问题：为什么平均值会算错？
当 `int / int -> int`（integer division，截断 truncate）：

~~~java
int a = 80, b = 90, c = 100;
System.out.println((a + b + c) / 3);  // 90（这组刚好整除）
~~~

---

## 5) Compound Assignment（复合赋值写法）

~~~java
int x = 10;
x += 3;   // x = x + 3
x *= 2;   // x = x * 2
x %= 5;   // x = x % 5
~~~

---

## 6) Identifiers（标识符）

**Identifier（标识符）**：你给程序里“东西”起的名字（names in code）。  
常见三类：**变量名（variable names）**、**方法名（method names）**、**类名（class names）**。

Examples（变量名 identifiers）：

~~~java
int age = 20;
double gpa = 3.85;
String studentName = "Frank";
boolean isActive = true;
~~~

---

## 7) int 的补充：Range & Overflow（范围与溢出）

`int` 是 32-bit signed integer，范围（range）：
- `-2,147,483,648` 到 `2,147,483,647`

超过范围会 **overflow（溢出）**：不会报错，会 wrap around：

~~~java
int a = 2147483647;
System.out.println(a);      // 2147483647
System.out.println(a + 1);  // -2147483648 (overflow)
~~~

---

## 8) double 的补充：Precision Error（精度误差）

`double` 存在精度问题：很多小数无法用二进制精确表示（floating-point representation）。

~~~java
double x = 0.1 + 0.2;
System.out.println(x); // 常见输出：0.30000000000000004
~~~

---

## 9) Constant Variables（常量）— `final`

**Constant variable（常量）**：值不能被修改（cannot be reassigned），通常用于：
- 税率（tax rate）
- 圆周率（pi）
- 配置值（configuration values）
- 防止别人不小心改掉（prevent accidental changes）

~~~java
final double TAX_RATE = 0.08875;
System.out.println(TAX_RATE);
~~~
