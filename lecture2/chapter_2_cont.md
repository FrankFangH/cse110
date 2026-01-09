# Chapter 2 cont
---

## 2.4 Mixed Expressions & Results 表达式混合应用）

### a) 先看 3 行经典例子

~~~java
System.out.println(2 + 3 * 4);         // 14
System.out.println("Sum: " + 1 + 2);   // Sum: 12
System.out.println(7 / 2);             // 3
~~~
---

### b) 运算顺序（Operator Precedence）

**常用优先级从高到低：**
1. `()` 括号（parentheses）
2. `!` 取反（NOT, unary）
3. `* / %` 乘除余（multiplicative）
4. `+ -` 加减（additive）
5. `< <= > >=` 大小比较（relational）
6. `== !=` 相等/不等（equality）
7. `&&` AND
8. `||` OR

**同级时：**大多数是 **从左到右（left-to-right）** 计算

---

### c) 同一个表达式，不同括号=不同结果

~~~java
System.out.println(2 + 3 * 4);       // 14
System.out.println((2 + 3) * 4);     // 20

System.out.println(20 / 5 / 2);      // 2
System.out.println(20 / (5 / 2));    // 10

System.out.println(5 / 2);           // 2
System.out.println(5.0 / 2);         // 2.5
System.out.println(5 / 2.0);         // 2.5

System.out.println(10.0 / 2 / 5);    // 1.0
~~~

---

## 2.5 Mixed with Logical Operators（加入逻辑运算）

### a) 逻辑运算优先级：`!` > `&&` > `||`

---

### b) 同级链式 vs 混合

- **同级链式（same precedence）**：从左到右  
  `A && B && C`  → `((A && B) && C)`

- **混合（mixed）**：`&&` 比 `||` 优先  
  `A || B && C`  等价于  `A || (B && C)`

~~~java
System.out.println(true || false && !true);
        // !true -> false
        // false && false -> false
        // true || false -> true
        // 输出: true
~~~

---

### c) 更复杂的混合表达式（算术 + 比较 + 逻辑）

~~~java
System.out.println(2 + 3 * 4 < 10 && true);
        // 3*4=12, 2+12=14
        // 14 < 10 -> false
        // false && true -> false
        // 输出: false
System.out.println(((2 % 6) + 1) * 10 != 30 || true);
        // 2%6=2, 2+1=3, 3*10=30
        // 30 != 30 -> false
        // false || true -> true
        // 输出: true
System.out.println(2 > 0 || 10 < 0 && 1 > 0);
        // 2>0 -> true
        // true || (...) -> true  （注意短路 short-circuit）
        // 输出: true
~~~

---

## 2.6 Short-Circuit（短路特性）

> Java 的 `&&` 和 `||` 是 **short-circuit operators（短路运算符）**  
> 有时会 **直接决定程序是否崩溃**（比如除以 0）

### 规则总结（背下来）
- `A && B`
  - 如果 `A` 是 `false` → 整体必 `false` → **B 不会执行**
  - 如果 `A` 是 `true`  → 还不确定 → **必须执行 B**

- `A || B`
  - 如果 `A` 是 `true`  → 整体必 `true` → **B 不会执行**
  - 如果 `A` 是 `false` → 还不确定 → **必须执行 B**

---

### 例子：同样都写了 `10 / x`，有的安全，有的直接炸掉

~~~java
int x = 0;

System.out.println(x != 0 && (10 / x > 1));
        // false

System.out.println(x == 0 || (10 / x > 1));
        // true

System.out.println(x != 0 || (10 / x > 1));
        // 直接崩溃（ArithmeticException）出错

System.out.println(x == 0 && (10 / x > 1));
        // 直接崩溃（ArithmeticException）出错
~~~

---

## 2.7 String Concatenation & Escape Sequences（字符串拼接与转义）

### a) String concatenation（字符串拼接）
- 用 `+` 拼接 String（concatenate）

~~~java
public class Main {
    public static void main(String[] args) {
        String first = "Frank";
        String last = "Evans";
        System.out.println(first + " " + last); // Frank Evans
    }
}
~~~

---

### b) String + number（String 和数字拼接的坑）

一旦出现 String，后面的 `+` 就更像 “拼接” 而不是 “加法”：

~~~java
public class Main {
    public static void main(String[] args) {
        System.out.println("3" + 1);     // 31
        System.out.println("3" + 1.0);   // 31.0

        int x = 1;
        int y = 2;

        System.out.println("Sum: " + x + y);       // Sum: 12
        System.out.println("Sum: " + (x + y));     // Sum: 3
    }
}
~~~

---

### c) Escape sequences（转义字符）常用清单

- `\n`：new line（换行）
- `\"`：双引号

~~~java
System.out.println("Line1\nLine2");
System.out.println("He said: \"Hello\"");
~~~

---

### d) 要点：String 比较别用 `==`

- `==` 比的是 **地址（reference）**，不是内容
---

## 2.8 Type Casting（类型转换）

### a) Widening conversion（扩展转换 / 自动提升）
> 从“小范围”到“大范围”通常自动发生（Java 自动帮你）

例子：`int -> double`

~~~java
int a = 7;
double b = a;              // 自动：7 -> 7.0
System.out.println(b);      // 7.0

System.out.println(5 / 2.5); // 2.0 （int 5 自动提升为 double）
~~~

---

### b) Narrowing conversion（缩小转换 / 强制转换）
> 从“大范围”到“小范围”要你明确写出来（cast）

写法：`(type) value`

~~~java
double x = 3.99;
int y = (int) x;           // 截断（truncate）：直接丢小数部分
System.out.println(y);     // 3

int a = 5;
int b = 2;

System.out.println(a / b);              // 2
System.out.println((double) a / b);     // 2.5
System.out.println(a / (double) b);     // 2.5
~~~

---

## 2.9 Expressions 的可读性（Readability）与变量使用规则

### a) 可读性：把复杂表达式拆开（强烈推荐）

~~~java
double a=1, b=2, c=3, d=4, e=5, f=6, g=7, h=8, i=9, j=10;
double result1 = (a*b + c*d - e) / (f + g*h - i*j);

double numerator = a*b + c*d - e;
double denominator = f + g*h - i*j;
double result2 = numerator / denominator;

System.out.println(result1);
System.out.println(result2);
~~~

---

### b) 用括号明确意图（尤其是平均值、百分比、折扣等）

~~~java
int a = 80;
int b = 90;
int c = 100;

double avg = (a + b + c) / 3.0;  // 用 3.0 强制 double
System.out.println(avg);         // 90.0
~~~

---

### c) **变量没赋值就用，直接会出错**

~~~java
    int x; 
    // System.out.println(x); 
    // 编译错误（常见报错）：variable x might not have been initialized

    x = 10;
    System.out.println(x); // 10
~~~

---

### d) 命名规则（Naming conventions）
- Java 常用：**lowerCamelCase（小驼峰）**
  - ✅ `totalPrice`, `studentCount`, `taxRate`
  - 尽量别用：`a`, `b`（除非数学推导或临时变量）
- 名字要表达含义：`taxRate` 比 `t` 更好

---

### e) 修改变量的值（Update a variable）

~~~java
public class Main {
    public static void main(String[] args) {
        int height = 5;

        height = height + 5;
        System.out.println(height); // 10

        height += 5;                // 等价于 height = height + 5
        System.out.println(height); // 15
    }
}
~~~

再看一个连续更新的例子：

~~~java
public class Main {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("x=" + x); // x=10
        x = x + 1;
        System.out.println("x=" + x); // x=11
        x = x * 2;
        System.out.println("x=" + x); // x=22
    }
}
~~~

