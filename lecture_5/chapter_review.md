# First Quarter 复习笔记

## 4) 数据类型（Data Types）

### 4.1 Primitive vs Reference
- **Primitive types（基本类型）**：变量里存的是值（value）
- **Reference types（引用类型）**：变量里存的是地址（reference/address）

考试常考：
- `'A'` 是 `char`（单引号）
- `"A"` 是 `String`（双引号）

---

## 5) 变量与赋值
- **Declaration（声明）**：`int age;`
- **Initialization（初始化）**：`int age = 20;`
- **Assignment / Update（赋值/更新）**：`age = 21;`
- **Uninitialized variable（未初始化变量）**：使用会编译错误（compile-time error）

---

## 7) 运算符（Operators）

### 7.1 Arithmetic operators（算术）
- `+ - * / %`
- **Integer division（整数除法）**：`int / int -> int`（truncate 截断）
- `%` 常用于：拆位、奇偶、时间换算

### 7.2 Assignment operator（赋值）
- `=` 是 assignment 不是数学等号
- `x = x + 1` 表示更新（update）

### 7.3 Comparison operators（比较）
- `== != < <= > >=`，结果一定是 `boolean`

### 7.4 Logical operators（逻辑）
- `&& || !`

---

## 8) 运算顺序与混合表达式（Operator Precedence / Mixed Expressions）

### 优先级（从高到低常用版）
1. `()` parentheses  
2. `!`
3. `* / %`  
4. `+ -`  
5. `< <= > >=`  
6. `== !=`  
7. `&&`  
8. `||`

- 同级一般 **left-to-right（从左到右）**

### 混合坑
- `"Sum: " + 1 + 2` → `"Sum: 12"`
- `"Sum: " + (1 + 2)` → `"Sum: 3"`

---

## 9) Short-circuit（短路）
- `A && B`：A 为 `false` → B 不执行
- `A || B`：A 为 `true` → B 不执行

用于避免崩溃（如除 0）：

```java
x != 0 && (10 / x > 1)
```

---

## 10) 字符串（String）

### 10.1 String concatenation
- `+` 一旦遇到 `String`，后面更像拼接（concatenate）

### 10.2 String methods（工具箱）
- `length()`
- `charAt(i)`（0-based index）
- `substring(a, b)`（左闭右开 \`[a, b)\`）
- `substring(a)`
- `indexOf(...)`（找不到返回 `-1`）

### 10.3 String comparison：`==` vs `equals`
- `==` 比的是 reference（地址）
- `equals()` 比的是 content（内容）

### 10.4 String immutability（不可变）
- `String` 不能原地改，每次“改”都会创建新 `String`

---

## 11) Type Casting（类型转换）+ 表达式结果

### 11.1 Widening conversion（自动提升）
- `int -> double` 自动发生

### 11.2 Narrowing conversion（强制转换 cast）
- `(int) 3.99` → `3`（truncate 截断）

---

## 12) 可读性与写法（Readability / Style）
- 复杂表达式拆成 `numerator / denominator`
- 用括号表达意图（average, percent, discount）
- 模块化空行分段

---

## 13) 数字拆位与进制直觉（/ 和 % 的应用）

### 13.1 拆位（ones/tens/hundreds/thousands）
- `n % 10` 取个位
- `n / 10` 去掉个位（integer division）

### 13.2 十进制转二进制（/2 与 %2）
- 不断除 2 取余，余数倒序

---

## 14) printf 格式化输出（printf / format specifier）

### 14.1 常用 specifiers
- `%d` int
- `%f` double/float
- `%.2f` 保留两位小数
- `%s` String
- `%c` char
- `%b` boolean
- `%n` newline（推荐）

### 14.2 width / flags / precision
- `%5d`, `%-5d`, `%05d`, `%,d`, `%+d`
- 打印百分号：`%%`

---

## 15) Math methods（Math.*）
你讲过的常用：
- `Math.abs`
- `Math.sqrt`
- `Math.pow`
- `Math.max`
- `Math.min`

---

## 16) char 与 ASCII（char / ASCII code）
- `char` 底层可看作整数编码（常用 ASCII）
- `(int)c` 得编码
- `(char)(c + 1)` 做字符位移（character shift）

---

## 17) overflow 与 precision

### int overflow（溢出）
- 超过范围 wrap around，不报错

### double precision error（浮点精度误差）
- `0.1 + 0.2` 可能变 `0.30000000000000004`

# Study Guide 新补充考点整理

---

## 1) Java Identifiers

```java
int age = 10;
```

### 必须满足
- 只能包含：字母（A–Z a–z）、数字（0–9）、下划线 `_`、美元符号 `$`
- 不能以数字开头
- 不能有空格
- 不能用 `-` 连字符
- 不能是关键字 keyword（如 `int`, `double`, `class`, `public`…）

### 做题秒判法（看到就排除）
- 开头是数字（如 `1NAME`）
- 有空格（如 `My Variable` / `sum and difference`）
- 有 `-`（如 `a-bonus`）
- 有奇怪符号如 `!`、`&`（如 `!age`, `x & y`）

---

## 2) Primitive types

Java 的 8 个 primitive types：
- `byte`, `short`, `int`, `long`
- `float`, `double`
- `char`
- `boolean`

float, double
32个0和1组成的小数，而double是由64个0和1组成的小数，他们的用法是一样的。

但是在申明float的时候，有一个额外要求
```java
double a = 10.0;
float b = 10.0f; // 额外加上一个f
```

int / float → 结果是 float
int / double → 结果是 double
float / double → 结果是 double
---

## 3) Literals（字面量）

```java
int age = 10;
age = age + 2;
```

### A) float literal 规则（最常考）
- 带 `f` 或 `F` 后缀 才是 `float`
  - `5.25f` float
  - `5f` float
- 没有 `f/F` 的小数默认是 `double`
  - `5.25` double（不是 float）
  - `5.0` double

### B) char literal
- 单引号：`'A'`、`'\n'` 是 `char`
- 双引号：`"A"` 是 `String`

### C) boolean literal
- `true` / `false`（不加引号）
- `"true"` 是 `String` 不是 `boolean`

---

## 6) String.compareTo（新补充，必背）

`compareTo` 用来做 **字典序（lexicographic order）** 比较：

- `s1.compareTo(s2)`

返回值含义：
- `< 0`：`s1` “更小”（字典序更靠前）
- `= 0`：两个字符串内容完全一样
- `> 0`：`s1` “更大”

规则 1：从第 0 个字符开始，一个一个比 先比第 0 个字符 如果相同，再比第 1 个字符 直到遇到第一个不同的字符，就由那一位决定大小

规则 2：字符的大小取决于字符编码（通常可以按 ASCII 直觉） 一般你可以这样理解（足够应付考试）： 'A' 到 'Z' 比 'a' 到 'z' 小（大写排在小写前） 数字 '0'..'9' 通常又在字母前（看具体字符） 你不需要背 ASCII 表，但要知道大小写会影响排序。

规则 3：如果一个是另一个的前缀（prefix），短的更小 "app" < "apple" 因为前三个都一样，短的先结束 → 更小

"apple".compareTo("banana")
"cat".compareTo("car")

# Java String `.equals()` 讲解（必背）

## 1) `.equals()` 是干嘛的？
- `String` 是 **reference type（引用类型）**：变量里存的是 **地址/reference**，不是字符串内容本体。
- 所以：
  - `==` 比的是 **地址是否相同（same reference）**
  - `.equals()` 比的是 **内容是否相同（same content）**

---

### 例 2：同一个引用时，两者都为 true
\`\`\`
String a = "hi";
String b = a;

a == b        // true（同一个地址）
a.equals(b)   // true（内容一样）
\`\`\`


---

## 3) `.equals()` 怎么用？
语法：
\`\`\`
s1.equals(s2)
\`\`\`
返回类型：`boolean`（`true` / `false`）
---

### 坑 2：`.equals()` 区分大小写（case-sensitive）
\`\`\`
"Frank".equals("frank")   // false
\`\`\`

如果想不区分大小写（可选了解）：
\`\`\`
"Frank".equalsIgnoreCase("frank")   // true
\`\`\`

---

## 5) `.equals()` vs `compareTo()`（别混）
- `.equals()`：只回答 **是否相等**（true/false）
- `compareTo()`：回答 **排序关系**（< 0, = 0, > 0）

---
