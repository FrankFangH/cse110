# Chapter 2 教学笔记
---

## 2.1 & 2.2 What are Java Data Types?

- Java 的数据类型大致分两类：  
  **Primitive Types（基本类型）** 和 **Reference Types（引用类型）**

---

### a) Primitive Types（基本类型）

> **特点**：变量里直接存“值”（value）

- `int`：整数（integer），如 `-3, 0, 42`
- `double`：小数（floating-point），如 `3.14, -0.5`
- `char`：单个字符（character），如 `'A', '7', '?'`
- `boolean`：真假（true/false），如 `true, false`

**注意：**
- `char` 用 **单引号**：`'A'`
- `String` 用 **双引号**：`"frank"`（String 不是 primitive）

<!-- 'A' vs "A"；前者是 char，后者是 String -->

---

### b) Reference Types（引用类型）— 存的是地址（address）

> **特点**：变量里存的不是数据本体，而是指向数据的 **地址（reference / address）**

- `String`：字符串（text），例如 `"frank"`

<!-- primitive 像“把东西放口袋” reference 像“口袋里放一张写着储物柜编号的纸” -->

---

### c) Java 里需要预先声明变量（Declare before use）

- Java 是强类型语言（strongly typed）：  
  **你必须先告诉 Java 变量是什么类型，才能使用它。**

#### 变量声明（declaration）规则

- 只声明（还没给值）：
  - `数据类型 + 你取名 + ;`
  - 例：`int wage;`

- 声明并赋值（initialization / assignment）：
  - `数据类型 + 你取名 + = + 值;`
  - 例：`String name = "frank";`

---

### d) Basic input（Scanner）

- 很多程序需要从键盘输入（input），Java 常用工具是：**Scanner**
- 固定参考格式（最常见写法）：

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wage;
        Scanner scnr = new Scanner(System.in);
        wage = scnr.nextInt();
    }
}
```

### e) Scanner：不同数据类型，对应不同读取方法

- `int` → `nextInt()`
- `double` → `nextDouble()`
- `boolean` → `nextBoolean()`
- `String` → `nextLine()`

<!-- 提醒：nextInt/nextDouble 会把“数字”读走；nextLine 读“一整行文本”。 -->

## 2.3 Operators（运算符 Operators）

---

### a) Arithmetic Operators（算术运算符）

- `+` 加（addition）
- `-` 减（subtraction）
- `*` 乘（multiplication）
- `/` 除（division）
- `%` 取余（remainder）

**重点提醒：**
- 如果两边都是 `int`，那么 `/` 是 **整数除法（integer division）**：只保留整数部分
- `%` 常用来做：奇偶判断、拆数字、时间换算

代码示例：

~~~java
public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 6;
        int z;

        z = x + y;
        System.out.println(z); // 7

        z = y / x;
        System.out.println(z); // 6

        z = y % x;
        System.out.println(z); // 0

        // int / int -> int
        System.out.println(5 / 2); // 2

        // double / int -> double
        double a = 1.0;
        System.out.println(a / x); // 1.0
        System.out.println(x / a); // 1.0
    }
}
~~~

<!-- 注意：int a = 1.0 是不合法的，要用 double a = 1.0 -->

---

### b) Assignment Operator（赋值运算符）

- `=` 是 **赋值（assignment）**，不是数学等号
- 作用：把右边表达式的值，放到左边变量里

例子：

~~~java
int x = 7;   // 把 7 赋给 x
x = 10;      // 更新 x 的值
~~~

**注意：**
- 左边必须是变量（variable），右边可以是表达式（expression）
- `x = x + 1;` 表示 “x 自己加 1，再存回 x”

---

### c) Comparison Operators（比较运算符 / 判断运算符）

> **比较运算结果一定是 boolean**：`true` 或 `false`

- `==` 等于（equal to）
- `!=` 不等于（not equal to）
- `<` 小于（less than）
- `<=` 小于等于（less than or equal to）
- `>` 大于（greater than）
- `>=` 大于等于（greater than or equal to）

代码示例（Comparison demo）：

~~~java
public class Main {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age >= 18); // true
        System.out.println(age == 18); // false
        System.out.println(age != 18); // true
    }
}
~~~

---

### d) Logical Operators（逻辑运算符）

> 逻辑运算符用于 **boolean 表达式（boolean expressions）**  
> 常用于：多个条件组合（比如 if 里）

- `&&` AND（且）：两边都为 `true` 才为 `true`
- `||` OR（或）：只要有一边为 `true` 就为 `true`
- `!` NOT（非）：取反（true ↔ false）

代码示例（Logical demo）：

~~~java
public class Main {
    public static void main(String[] args) {
        boolean hasID = true;
        boolean oldEnough = true;

        System.out.println(hasID && oldEnough); // true

        hasID = true;
        oldEnough = false;
        System.out.println(hasID && oldEnough); // false

        System.out.println(hasID || oldEnough); // true

        System.out.println(!oldEnough); // true
    }
}
~~~
