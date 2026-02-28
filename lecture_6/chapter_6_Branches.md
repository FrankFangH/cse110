# Chapter Notes — Branching & Decisions（分支与条件判断）
---

## 0) Big Idea（核心概念）

**Branching（分支） / Decision-making（决策）**：程序根据条件（condition）选择不同路径执行。  
核心工具：
- `if / else if / else`（branches）
- 逻辑运算符（logical operators）：`&&` `||` `!`
- `boolean`（布尔类型）
- `switch`（多分支选择）
- 字符串与字符比较（String / char operations）
- 短路求值（short-circuit evaluation）

---

## 1) 6.1 If-else branches (general)（if-else 基础）

### a) if statement（单分支）
~~~java
if (condition) {
    // runs only if condition is true
}
~~~

### b) if-else（双分支）
~~~java
if (condition) {
    // true branch
} else {
    // false branch
}
~~~

### c) if - else if - else（多分支链）
**Rule（规则）**：从上到下检查，命中第一个 `true` 就执行并停止（first true branch wins）。

~~~java
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}
~~~

### d) Block（代码块）与缩进
- `{}` 决定分支包含哪些语句
- 没有 `{}` 时，`if` 只控制下一行（common bug）

---

## 2) 6.2 Detecting equal values with branches（判断相等）

### a) Numbers: `==`（数值相等）
~~~java
int a = 5, b = 5;
if (a == b) {
    System.out.println("equal");
}
~~~

### b) `=` vs `==`（赋值 vs 比较）
- `=` is assignment（赋值）
- `==` is equality test（相等判断）

### c) `!=` not equal（不等）
~~~java
if (x != 0) {
    System.out.println("non-zero");
}
~~~

---

## 3) 6.3 Detecting ranges with branches (general)（范围判断：基础）

### a) “at least / at most” patterns（常用句型）
- at least 10：`x >= 10`
- greater than 10：`x > 10`
- at most 10：`x <= 10`
- less than 10：`x < 10`

### b) Inclusive vs Exclusive（包含 vs 不包含）
- `>=` / `<=` includes the boundary（包含边界）
- `>` / `<` excludes the boundary（不包含边界）

---

## 4) 6.4 Detecting ranges with branches（用分支写范围）

### Example: letter grade（分数段）
~~~java
if (score >= 90) {
    grade = "A";
} else if (score >= 80) {
    grade = "B";
} else if (score >= 70) {
    grade = "C";
} else if (score >= 60) {
    grade = "D";
} else {
    grade = "F";
}
~~~

**Key idea（关键点）**：写“从大到小”的区间更自然（descending ranges）。

---

## 5) 6.5 Detecting ranges using logical operators（逻辑运算判断范围）

### a) AND `&&`（且：两边都要 true）
区间：`low <= x && x <= high`

~~~java
if (age >= 13 && age <= 19) {
    System.out.println("teen");
}
~~~

### b) OR `||`（或：任一 true）
~~~java
if (day.equals("Sat") || day.equals("Sun")) {
    System.out.println("weekend");
}
~~~

### c) NOT `!`（非：取反）
~~~java
boolean isMember = false;
if (!isMember) {
    System.out.println("guest");
}
~~~

---

## 6) 6.6 Detecting ranges with gaps（有缺口的范围）

### a) Outside a range（不在区间内）
- outside [10, 20] ：`x < 10 || x > 20`

~~~java
if (x < 10 || x > 20) {
    System.out.println("outside");
}
~~~

### b) Union of intervals（两个区间合并）
例如：`x in [0,10] or [20,30]`

~~~java
if ((x >= 0 && x <= 10) || (x >= 20 && x <= 30)) {
    System.out.println("in allowed ranges");
}
~~~

---

## 7) 6.7 Detecting multiple features with branches（多特征判断）

### a) Nested if（嵌套分支）
~~~java
if (isStudent) {
    if (gpa >= 3.5) {
        System.out.println("honors");
    } else {
        System.out.println("regular");
    }
} else {
    System.out.println("not a student");
}
~~~

### b) Flattened else-if（减少嵌套）
~~~java
if (!isStudent) {
    System.out.println("not a student");
} else if (gpa >= 3.5) {
    System.out.println("honors");
} else {
    System.out.println("regular");
}
~~~

---

## 8) 6.8 Common branching errors（常见分支错误）

### a) Using `=` instead of `==`（把赋值当比较）
~~~java
// if (x = 5) { } // compile error in Java (condition must be boolean)
~~~

### b) Missing braces（漏大括号）
~~~java
if (x > 0)
    System.out.println("positive");
    System.out.println("always prints"); // NOT controlled by if!
~~~

### c) Overlapping ranges（区间重叠）
错误示例（第二个永远不会到）：
~~~java
if (score >= 60) {
    ...
} else if (score >= 70) {
    ... // unreachable
}
~~~

### d) Wrong order（顺序错误）
应该先检查更“严格”的条件（more specific first）。

---

## 9) 6.9 Example: Toll calculation（例：过路费计算）

Example logic：
- car: $2.50
- truck: $5.00
- if peak hour: +$1.00

~~~java
double toll = 0.0;

if (type.equals("car")) {
    toll = 2.50;
} else if (type.equals("truck")) {
    toll = 5.00;
} else {
    toll = 3.00; // default
}

if (isPeak) {
    toll += 1.00;
}

System.out.printf("Toll: %.2f%n", toll);
~~~

## 11) 6.11 Switch statements（switch 语句）

### a) Basic switch（基本结构）
~~~java
switch (day) {
    case "Mon":
        System.out.println("Work");
        break;
    case "Sat":
    case "Sun":
        System.out.println("Rest");
        break;
    default:
        System.out.println("Unknown");
}
~~~

### b) `break` is critical（break 很关键）
没有 `break` 会 **fall-through（贯穿执行）** 到下一个 case。

---

## 12) 6.12 Boolean data type（布尔类型）

- `boolean` only has `true` / `false`

~~~java
boolean isAdult = age >= 18;
if (isAdult) {
    System.out.println("adult");
}
~~~

### Common mistake（常见错）
Java 不允许把 int 当 boolean 用：
~~~java
// if (x) { } // compile error
~~~

---

## 13) 6.13 String comparisons（字符串比较）

### a) `equals`（内容相等）
~~~java
String s = "hi";
if (s.equals("hi")) {
    System.out.println("match");
}
~~~

### b) `==` compares references（== 比引用）
~~~java
String a = new String("hi");
String b = new String("hi");
System.out.println(a == b);      // false (reference)
System.out.println(a.equals(b)); // true  (content)
~~~

### c) `compareTo`（字典序）
~~~java
System.out.println("apple".compareTo("banana")); // < 0
System.out.println("cat".compareTo("cat"));      // 0
System.out.println("dog".compareTo("cat"));      // > 0
~~~

---

---

## 15) 6.15 Character operations（字符操作）

### a) `char` is numeric（字符本质是整数编码）
~~~java
char c = 'A';
System.out.println((int)c); // 65
~~~

### b) char arithmetic（字符运算）
~~~java
System.out.println((char)('A' + 2)); // 'C'
System.out.println('a' - 'A');       // 32
~~~

### c) Useful methods（常用 Character 方法）
~~~java
char ch = '7';
System.out.println(Character.isDigit(ch));  // true
System.out.println(Character.isLetter(ch)); // false
System.out.println(Character.toUpperCase('b')); // 'B'
~~~
---

## 20) 6.20 Java example: Salary calculation with branches（例：工资计算）

Example rule：
- hourly rate: `rate`
- hours <= 40: normal pay
- hours > 40: overtime 1.5x for extra hours

~~~java
double pay;
if (hours <= 40) {
    pay = hours * rate;
} else {
    double overtime = hours - 40;
    pay = 40 * rate + overtime * rate * 1.5;
}
System.out.printf("Pay: %.2f%n", pay);
~~~

---

# Labs / Individual Assignments（6.23–6.32）

## 23) Lab 04 — Interstate Highway（高速公路编号）
Typical idea（常见规则）：
- I-1 to I-99: primary
  - odd: north/south
  - even: east/west
- I-100 to I-999: auxiliary
  - last two digits indicate primary highway

(按你课程的具体题面改规则与输出格式)

---

## 24) Smallest of 2（两个数最小）
~~~java
int min;
if (a < b) min = a;
else min = b;
~~~

## 25) Largest of 2（两个数最大）
~~~java
int max;
if (a > b) max = a;
else max = b;
~~~

## 26) Smallest of 3（三个数最小）
~~~java
int min = a;
if (b < min) min = b;
if (c < min) min = c;
~~~

## 27) Largest of 3（三个数最大）
~~~java
int max = a;
if (b > max) max = b;
if (c > max) max = c;
~~~

## 28) Longest of 2 Strings（两个字符串最长）
~~~java
String longer;
if (s1.length() >= s2.length()) longer = s1;
else longer = s2;
~~~

## 29) Longest of 3 Strings（三个字符串最长）
~~~java
String longest = s1;
if (s2.length() > longest.length()) longest = s2;
if (s3.length() > longest.length()) longest = s3;
~~~

## 30) Greater Lesser Equal（大小关系）
~~~java
if (a > b) {
    System.out.println("Greater");
} else if (a < b) {
    System.out.println("Lesser");
} else {
    System.out.println("Equal");
}
~~~

## 31) Is Sorted（是否已排序：升序）
For three numbers a, b, c:
~~~java
boolean sorted = (a <= b) && (b <= c);
System.out.println(sorted);
~~~

## 32) Print Sorted（打印排序后的三个数）
Idea（思路）：用分支把三数排列出来（many cases），或用交换（swap）三次：
~~~java
if (a > b) { int t = a; a = b; b = t; }
if (b > c) { int t = b; b = c; c = t; }
if (a > b) { int t = a; a = b; b = t; }
System.out.println(a + " " + b + " " + c);
~~~

---
