# Chapter 1 教学笔记
---

## 1.1 What is Computer Science?

- **核心**：用计算（**computation**）来解决问题（**problem solving**）的学科  
  <!-- 用计算来解决问题，设计算法（algorithm）让机器执行 -->

---

## 1.2 Computers and programs

### a) 二进制（Binary）与 bit

- 计算机底层用 **0/1** 表示信息，单个 0 或 1 叫 **bit**（binary digit）

**示例序列：**

| Binary | Decimal |
|------:|--------:|
| 0     | 0       |
| 1     | 1       |
| 10    | 2       |
| 11    | 3       |
| 100   | 4       |
| 101   | 5       |
| 110   | 6       |
| 111   | 7       |

**bit 数 = 二进制串长度：**
- `1`：长度 1 → **1 bit**
- `10`：长度 2 → **2 bits**
- `1110`：长度 4 → **4 bits**

---

### b) 计算机语言的直觉：开关（Switch）与 0/1

- **switch**：open / closed → 1 / 0  
  <!-- 想象一个控制灯泡的开关：开=有电流=灯亮；关=无电流=灯灭；开和关可代表 1 和 0 -->

#### 3-bit 决策树（类比）

```text
                       ---| 1
                   | 1 ---| 0
            | 1 ---|   ---| 1
            |      | 0 ---| 0
        ---        
            |      | 1 ---| 1
            | 0 ---|   ---| 0
                   | 0 ---| 1
                       ---| 0
```

- 3 个开关（3 bits）一共有：  
  `000 001 010 011 100 101 110 111` → **2^3 个组合**
- 现在常见电脑是 **64 bits**：可以表达 **2^64** 种不同组合

<!-- 开关一多，我们就能用 0/1 组合表达非常多的信息——这就是计算机最底层的编码方式 -->
<!-- 强调：理解计算机底层是 0 和 1，它“只读懂”0 和 1 -->

---

### c) 计算机原理：Processor（CPU）和 Memory（内存）的交互

- **Processor / CPU（处理器）**：执行命令（instructions）
- **Memory（内存）**：存储“指令”和“数据”（instructions & data）

**它们如何交互：**
- 教材动画：**1.2.2 Computer processor and memory**  
  <!-- 可以把 memory 想象成一个 box：里面既有要执行的命令，也有已经存在的数据 -->

---

### d) 计算机内存：把“白话步骤”转化成 0/1（编码）

- 计算机只能直接处理 **0/1**，所以“白话指令”必须被翻译成机器能执行的形式

**白话任务例子：**
1. Multiply 20 by 40  
2. Multiply result by 52  
3. Output result on screen  

- 需要三个层级（直觉版）：  
  **白话（Human-readable） → 汇编（Assembly） → 机器码（0/1, Machine language）**

<!-- 这里的重点是：计算机本身不理解中文/英文句子，它只执行“被编码后的指令” -->

---

### e) 计算机指令（Instruction）示例：像“配方一样”的操作

- 数据和指令都在 memory 里  
- 当我们要做计算时，通常要：从 memory 取数据 → 做运算 → 把结果写回 memory

**指令格式（类汇编，示意）：**
- `Add X, #num, Y`：把内存地址 `X` 的数据与数字 `num` 相加，结果存到 `Y`
- `Sub X, #num, Y`：用内存地址 `X` 的数据减去 `num`，结果存到 `Y`
- `Mul X, #num, Y`：把内存地址 `X` 的数据乘以 `num`，结果存到 `Y`
- `Div X, #num, Y`：把内存地址 `X` 的数据除以 `num`，结果存到 `Y`
- `Jmp Z`：告诉处理器下一条指令在内存地址 `Z`

**小练习（按顺序执行）：**
1. `Mul 97, #9, 98`
2. `Div 98, #5, 98`
3. `Add 98, #32, 99`

- 教材动画：
  - **1.2.3 Memory stores instructions and data as 0s and 1s**
  - **1.2.4 Processor executing instructions**

<!-- 这一段你可以强调：地址 X/Y/Z 可以理解成“柜子编号”；柜子里放的是数据或指令 -->

---

### f) 书写计算机语言：从 0/1 到 Java

#### 语言层级（从底到高）

1. **Machine language（机器语言）**
   - 直接写 **0/1**：最难写、最难读

2. **Assembly language（汇编语言）**
   - 更接近机器的指令形式，例如：  
     `Mul 97, #9, 98`

3. **High-level language（高级语言）**（例如 **Java**）
   - 更接近人类表达与数学表达，例如：  
     `c = 20 * 9`

#### Compiler（编译器）

- **Compiler**：把 high-level language → 转成可执行程序（机器能跑的形式）

- 教材动画：**1.2.6 Program compilation and execution**

<!-- 这里的“97/98”可以解释为：97号位置存着20，98号位置存着c -->

---

## 1.3 Computer tour

- 计算机由 **硬件（hardware）** 与 **软件（software）** 组成
- 常见硬件部件（直觉级别）：
  - **CPU / Processor（处理器）**：执行指令
  - **Memory / RAM（内存）**：临时存放指令与数据
  - **Storage（存储）**：长期保存数据（硬盘/SSD）
  - **I/O（输入输出）**：键盘、鼠标、显示器、网络等

---

## 1.4 What is an Algorithm

- **Algorithm（算法）**：一组清晰的步骤（instructions），按步骤执行就能解决某个问题

**例子：找出最高的人（Highest Height）**
- 给你一个班级的身高表
- 目标：找出长得最高的那个人

---

## 1.5 Programming

- 程序（program）由一系列指令组成，通常按顺序从上到下执行

### Basic instruction types are（按顺序执行从上到下）

- **Input（输入）**：键盘输入，文件输入等等
- **Process（处理）**：计算，比如 `x + y`
- **Output（输出）**：把计算结果输出到屏幕，文件等等

**示例（pseudocode / 伪代码）：**
```text
x = Get next input
y = Get next input
z = x + y
Put z to output
```

- 练习：**1.5.2: A basic computer program**
---

## 1.6 – 1.9 Programming basics

- **Java**：High-level language（高级语言）
- **JDK**：把 Java 程序转化为可以执行的程序

### Hello World

- 所有程序从 `main()` 函数开始运行
- 每一条 instruction 后需要带分号 `;`
- 打印：
  - `System.out.println()`：打印并换行
  - `System.out.print()`：打印但不换行

**参考格式：**
```java
public class Main {
    public static void main(String[] args) {
        // to do:
    }
}
```

### Basic input（Scanner）

- 很多程序会需要输入值，这里需要引入工具：**Scanner**
- 固定参考格式：
```java
import java.util.Scanner;

int wage;
Scanner scnr = new Scanner(System.in);
wage = scnr.nextInt();
```

**例子：询问你的身高（参考格式）**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int height;
        Scanner scnr = new Scanner(System.in);

        // to do:
    }
}
```

---

## 1.10 Comments and whitespace

### Comments（注释）

- Single-line comment（单行注释）：在单行用 `//`
- Multi-line comment（多行注释）：在多行用：
```java
/*
    ...
*/
```

- 模块化写代码：不同模块提行提升简洁度

---

## 1.11 Why whitespace matters

- **Whitespace（空白字符）**：空格、换行、缩进等
- 在很多语言里，空白不影响运行结果，但会强烈影响 **可读性（readability）**
- 好的缩进与分段：
  - 更容易看懂程序结构
  - 更容易 debug（找错误）

---

## 1.12 Errors and warnings

### Syntax error（语法错误）

- **定义**：违反语言的语法规则（syntax rules）
- **特点**：编译器（compiler）直接拒绝编译，程序跑不起来
- **典型**：漏 `;`、括号不配对、引号没关、关键字大小写错
- 例子：**1.12.1: Syntax errors often exist before the reported line**

### Logic error（逻辑错误）= bug

- **定义**：程序能编译、能运行，但结果不对
- **典型**：把 `*` 写成 `+`，公式写错，顺序写错

### Warning（警告）

- **定义**：编译器觉得“可能有问题”，但仍然能生成程序

---

## 1.13 Problem solving（计算机思维）

- 一位组织者希望一个 **64 人会议**的开始，让每个人依次互相问候 **30 秒**。  
- 请指出该方案是否能在不占用过多时间的情况下达到目的。

---

## 1.14 Why programming

## 1.15 Language history