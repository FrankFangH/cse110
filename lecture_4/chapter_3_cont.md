先说说你上次在群里问到的问题：

# Java `printf`（`%` 格式化输出）
---

## 1) 基本用法（Basic Usage）

```java
System.out.printf("Hello %s", "Frank");  // Hello Frank
```

- 第一个参数：**格式字符串 format string**
- 后面参数：按顺序填入 `%...` 占位符

---

## 2) 占位符（Format Specifier）结构

**通用结构：**

```
%[flags][width][.precision]conversion
```

常见写法：
- `%d`
- `%f`
- `%.2f`
- `%s`
- `%c`
- `%b`
- `%n`

---

## 3) 最常用 conversion（转换符号）

| conversion | 英文 | 适合类型 | 例子 |
|---|---|---|---|
| `%d` | decimal integer | `int`, `long` | `printf("%d", 12)` → `12` |
| `%f` | floating-point | `float`, `double` | `printf("%f", 1.2)` → `1.200000` |
| `%.2f` | 2 decimal places | `double` | `0.514` → `0.51` |
| `%s` | string | `String` / any object | `printf("%s", "hi")` |
| `%c` | character | `char` | `printf("%c", 'A')` |
| `%b` | boolean | `boolean` | `printf("%b", true)` |
| `%n` | newline | 无 | 换行（推荐用 `%n`） |

---

## 4) `.precision`（精度）

### 对 `%f`：小数位数（decimal places）
```java
System.out.printf("%.2f%n", 3.14159); // 3.14
System.out.printf("%.0f%n", 3.14159); // 3
```

### 对 `%s`：最多输出字符数（max length）
```java
System.out.printf("%.3s%n", "abcdef"); // abc
```

---

## 5) `width`（宽度）与对齐

- 默认右对齐
- `-` 表示左对齐

```java
System.out.printf("|%5d|%n", 12);   // |   12|
System.out.printf("|%-5d|%n", 12);  // |12   |
```

---

## 6) 常见 flags（标记）

| flag | 英文 | 作用 | 例子 |
|---|---|---|---|
| `-` | left-justify | 左对齐 | `%-10s` |
| `+` | show sign | 正数也显示 `+` | `%+d` |
| `0` | zero padding | 用 0 补齐宽度 | `%05d` |
| `,` | grouping | 千分位分隔 | `%,d` |

```java
System.out.printf("%05d%n", 42);     // 00042
System.out.printf("%+d%n", 42);      // +42
System.out.printf("%,d%n", 1234567); // 1,234,567
```

---

## 7) 打印百分号 `%`：用 `%%`

```java
System.out.printf("Discount: 25%%%n"); // Discount: 25%
```

---

## 8) 多个变量：按顺序匹配

```java
int area = 180;
double gallons = 0.514;
int cans = 1;

System.out.printf("Wall area : %d square feet%n", area);
System.out.printf("Paint needed : %.2f gallons%n", gallons);
System.out.printf("Cans needed : %d can(s)%n and %.2f", cans, gallons);
```

---

## 10) 速记

```java
System.out.printf("%d%n", intValue);      // 整数
System.out.printf("%.2f%n", dblValue);    // 两位小数
System.out.printf("%s%n", strValue);      // 字符串
System.out.printf("%c%n", chValue);       // 字符
System.out.printf("%% %n");               // 打印 %
```

## 4) 内置强大工具：Math methods（数学方法）

常用的 5 个：

~~~java
System.out.println(Math.abs(-7));       // 7
System.out.println(Math.sqrt(81));      // 9.0
System.out.println(Math.pow(2, 5));     // 32.0
System.out.println(Math.max(3, 10, 2));    // 10
System.out.println(Math.min(3, 10, 4));    // 3

~~~

---

## 5) 小练习，计算两点距离（Distance）

给两点 `(x1, y1)` 和 `(x2, y2)`  
距离公式：`sqrt((dx)^2 + (dy)^2)`

~~~java
int x1 = 2, y1 = 3;
int x2 = 8, y2 = 10;

int dx = x2 - x1;
int dy = y2 - y1;

double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
System.out.println(dist);
~~~

---

## 6) Characters（char）

### char 是什么？
- `char`：single character（单个字符）
- char literal 用单引号：`'A'`, `'7'`, `'?'`

### 重点：char 底层是“数字编号”（ASCII code）-> 用ASCII表格
你可以把 `char` cast 成 `int` 看编号：

~~~java
char c = 'A';
System.out.println(c);        // A
System.out.println((int)c);   // 65（常见）

int a = 65;
System.out.println((char)(a + 1)); // B
~~~

---

## 7) Strings + Primitive vs Reference

### Primitive type（基本类型）
Primitive：box 里装的是东西本体（value）。

Examples:
- `int`, `double`, `char`, `boolean`

### Reference type（引用类型）
Reference：box 里装的是“东西放在哪”的address

Examples:
- `String`
- arrays（如 `int[]`）
- 任何你以后写的 `class`

两个柜子

- 101 -> int      -> 打开，直接就是int
- 102 -> string   -> 打开，里面是一张纸条，告诉你需要去103找这个string -> 去103，打开，里面是string

---

## String immutability（不可变）

String 不能被“原地修改”（cannot be modified in place）。  
每次你“改动”，都会创建一个新的 String：

~~~java
String s = "Frank";
s = s + "!";
System.out.println(s); // Frank!
~~~

## String toolbox（常用方法）

~~~java
// length
String s = "Frank";
System.out.println(s.length()); // 5

// charAt (0-based index)
System.out.println(s.charAt(0)); // 'F'
System.out.println(s.charAt(4)); // 'k'
// 如果 i 越界会报错：StringIndexOutOfBoundsException

// substring [a, b)
String u = "abcdef";
System.out.println(u.substring(1, 4)); // "bcd"
System.out.println(u.substring(3));    // "def"

// indexOf：找到返回第一次出现的位置，否则返回 -1
String t = "banana";
System.out.println(t.indexOf("na")); // 2
System.out.println(t.indexOf("x"));  // -1
~~~