# Part 1 — Concept Check（基础概念题）

## Q1. What is a method?
用你自己的话解释：什么是 **method（方法）**？

### Standard Answer
A **method** is a named block of code that performs a specific task.

中文：  
**方法**就是一段有名字的代码，用来完成某个特定功能。

比如 `Math.max(3, 5)` 就是得出两个数中大的那一个。

### 最简单的写法
~~~java
public static (函数返回的值的类型) (你给他取名) (参数) {
    (内容)
}
~~~

---

## Q3. What is an argument?
什么是 **argument（实参）**？

### Standard Answer
An **argument** is the actual value passed into a method when the method is called.
  
**实参**就是调用方法时传进去的具体值。

例如：

~~~java
Math.max(3, 5);
~~~

这里的 `3` 和 `5` 就是 arguments。

---

## Q4. What is a parameter?
什么是 **parameter（形参）**？

### Standard Answer
A **parameter** is a variable in the method definition that receives the argument.

中文：  
**形参**是在方法定义里用来接收实参的变量。

例如：这是最简短的写法。相当于你在设计这个方法，你可以自由决定输入的是什么值、是什么种类，只不过要提前定义好。比如这里我们让 `name` 必须是 `String`。

~~~java
public static void greet(String name) {
    System.out.println("Hello " + name);
}
~~~

这里的 `name` 是 parameter。

---

## Q5. What is the difference between an argument and a parameter?
argument 和 parameter 的区别是什么？

### Standard Answer
- **Argument** = the actual value used in the method call
- **Parameter** = the variable declared in the method definition

例如：

~~~java
greet("Alice");
~~~

- `"Alice"` is the **argument**
- `name` is the **parameter**

---

## Q7 Main 方法

一个 Java 文件里只能有一个 `main` 方法。并且只会运行 `main` 函数里的 code！！！

这里的结构只是定义了 `greet`，真正的调用在 `main` 里写的 `greet("Alice")`。

~~~java
public class Main {
    public static void main(String[] args) {
        greet("Alice");
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
}
~~~

---

## Q6. What is a return value?
什么是 **return value（返回值）**？

### Standard Answer
A **return value** is the result sent back by a method.
 
返回值就是方法计算完成后“送回来”的结果。

例如：

~~~java
int bigger = Math.max(4, 9);
~~~

这里 `Math.max(4, 9)` 的返回值是 `9`。

~~~java
public class Main {
    public static void main(String[] args) {
        int a = sum(1, 2);
        System.out.println(a);
        System.out.println(sum(2, 5));
    }

    public static void sum(int a, int b) {
        return a + b;
    }
}
~~~

---

## Q7. What is the difference between a `void` method and a non-`void` method?
`void` 方法和非 `void` 方法有什么区别？

### Standard Answer
- A `void` method does not return a value.
- A non-`void` method returns a value.

中文：  
- `void` 方法只负责执行，不返回结果
- 非 `void` 方法会返回一个值

需要分清：在函数里你用 `print` 和 `return` 是两个完全不同的概念。

如果你在声明函数的时候给定会返回一个值，但是你没有 `return`，会出错。  
同样，如果你给定不会有返回值 `void`，但是你 `return` 了一个值，也会出错。  
（给出例子。）

## Example: `return` 和 `void` 的区别

下面先看两个**错误写法**，再看正确写法。

### 1. 错误示例：函数声明要返回 `int`，但没有 `return`

~~~java
public class Main {
    public static void main(String[] args) {
        int result = add(3, 4);
        System.out.println(result);
    }

    public static int add(int a, int b) {
        int sum = a + b;
    }
}
~~~

这个程序会报错，因为 `add` 被声明成了 `int` 方法，说明它必须返回一个 `int` 值，但函数最后没有 `return`。

---

### 2. 错误示例：函数声明是 `void`，但却 `return` 了一个值

~~~java
public class Main {
    public static void main(String[] args) {
        greet();
    }

    public static void greet() {
        return 5;
    }
}
~~~

这个程序也会报错，因为 `greet` 是 `void` 方法，表示它**不返回任何值**，所以不能写 `return 5;`。

---

### 3. 正确示例：`int` 方法要有 `return`

~~~java
public class Main {
    public static void main(String[] args) {
        int result = add(3, 4);
        System.out.println(result);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
~~~

运行结果：

~~~java
7
~~~

---

### 4. 正确示例：`void` 方法可以直接执行，不返回值

~~~java
public class Main {
    public static void main(String[] args) {
        greet();
    }

    public static void greet() {
        System.out.println("Hello!");
        return;
    }
}
~~~

运行结果：

~~~java
Hello!
~~~

这里的 `return;` 是可以写的，但它的意思只是“提前结束这个方法”，**不是返回一个值**。

---

### 总结

- 如果方法声明的是 `int`、`double`、`String` 等非 `void` 类型，那么必须 `return 一个对应类型的值`
- 如果方法声明的是 `void`，就**不能** `return 一个值`
- `void` 方法里可以写 `return;`，但只能表示“结束方法”，不能带值


## Q9. What is the output?

~~~java
public class Main {
    public static void main(String[] args) {
        greet("Alice");
        greet("Bob");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }
}
~~~

### Standard Answer

~~~java
Hello, Alice
Hello, Bob
~~~

### Explanation
- 第一次调用：`name = "Alice"`
- 第二次调用：`name = "Bob"`

---

## Q10. What is the output?

~~~java
public class Main {
    public static void main(String[] args) {
        int x = square(4);
        System.out.println(x);
    }

    public static int square(int n) {
        return n * n;
    }
}
~~~

### Standard Answer

~~~java
16
~~~

### Explanation
`square(4)` 返回 `4 * 4 = 16`，然后赋值给 `x`。

---

## Q11. What is the output?

~~~java
public class Main {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
~~~

### Standard Answer

~~~java
5
~~~

---

## Q12. What is the output?

~~~java
public class Main {
    public static void main(String[] args) {
        System.out.println(isEven(6));
        System.out.println(isEven(7));
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
~~~

### Standard Answer

~~~java
true
false
~~~

---

## Q13. What is the output?

~~~java
public class Main {
    public static void main(String[] args) {
        System.out.println("banana".length());
        System.out.println("banana".charAt(2));
    }
}
~~~

### Standard Answer

~~~java
6
n
~~~

### Explanation
- `"banana".length()` → `6`
- `"banana".charAt(2)` → 第 2 号索引字符，是 `n`

---

## Q14. What is the output?

~~~java
public class Main {
    public static void main(String[] args) {
        System.out.println("computer".substring(0, 3));
        System.out.println("student.edu".endsWith(".edu"));
    }
}
~~~

### Standard Answer

~~~java
com
true
~~~

---

# Part 3 — Find the Error（找错误）

## Q15. What is wrong with this code?

~~~java
public class Main {
    public static void main(String[] args) {
        sayHello;
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
~~~

### Standard Answer
错误在这里：

~~~java
sayHello;
~~~

应该写成：

~~~java
sayHello();
~~~

### Explanation
方法调用必须带括号 `()`。

---

## Q16. What is wrong with this code?

~~~java
public class Main {
    public static void main(String[] args) {
        int x = sayHello();
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
~~~

### Standard Answer
错误是把一个 `void` 方法当成有返回值的方法来使用了。

`sayHello()` 只是打印 `"Hello"`，它没有返回值，不能写成：

~~~java
int x = sayHello();
~~~

---

## Q17. What is wrong with this code?

~~~java
public class Main {
    public static void main(String[] args) {
        System.out.println(square(5));
    }

    public static int square(int x) {
        System.out.println(x * x);
    }
}
~~~

## Problem 1

What is the output of the following code?

~~~java
public class Main {
    public static void main(String[] args) {
        showStars(3);
    }

    public static void showStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
~~~

### Output
~~~java
***
~~~

---

## Problem 2

What is the output of the following code?

~~~java
public class Main {
    public static void main(String[] args) {
        showStars(2);
        showStars(4);
    }

    public static void showStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
~~~

### Output
~~~java
**
****
~~~

---

## Problem 3

What is the output of the following code?

~~~java
public class Main {
    public static void main(String[] args) {
        printNumbers(4);
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
~~~

### Output
~~~java
1 2 3 4 
~~~
