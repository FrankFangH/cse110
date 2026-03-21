## Question 1: Collective Timetables

Suppose Semi and Daniel, two hardworking course assistants, each worked for a certain amount of time, and we want to calculate the total time both of them worked.

Write a program that reads the number of **days**, **hours**, and **minutes** each of them worked, and prints the total time both of them worked together as **days, hours, and minutes**.

### Input

Your program should ask for:

- the number of days Semi has worked
- the number of hours Semi has worked
- the number of minutes Semi has worked
- the number of days Daniel has worked
- the number of hours Daniel has worked
- the number of minutes Daniel has worked

### Output

Your program should print the total time both of them worked together in the format:

`X days, Y hours and Z minutes`

```text
Please enter the number of days Semi has worked: 2
Please enter the number of hours Semi has worked: 12
Please enter the number of minutes Semi has worked: 15
Please enter the number of days Daniel has worked: 3
Please enter the number of hours Daniel has worked: 15
Please enter the number of minutes Daniel has worked: 20
The total time both of them worked together is: 6 days, 3 hours and 35 minutes.
```
### Notes

- You may assume that all inputs are nonnegative integers.
- Remember that:
  - 60 minutes = 1 hour
  - 24 hours = 1 day


## Question 2: Graduation Eligibility

**Note:** Selection statements (`if`, `else if`, `else`) are not allowed for this problem.

Suppose you are asked to write a program that determines whether a student can graduate.

The program should print `true` if the student meets the graduation requirements, and `false` otherwise.

A student may graduate if **any one** of the following conditions is true:

- The student has accumulated **64 or more credits** and is an **approved senior**, or
- The student has accumulated **40 or more credits** and has **special permission from their advisor**, or
- The student has **special permission from the dean**, regardless of how many credits they have

You may assume that the user will always enter:
- `'y'` for **yes**
- `'n'` for **no**

### Input
Your program should ask the user:

- whether they have permission from the dean
- whether they have permission from their advisor
- whether they hold senior status
- how many credits they have

### Output
Your program should print whether the student can graduate in the format:

`This student can graduate: true`

or

`This student can graduate: false`

### Example Run 1

```text
Do you have permission from the dean? [y/n] n
Do you have permission from your advisor? [y/n] n
Do you hold senior status? [y/n] y
How many credits do you have? 20
This student can graduate: false
```

### Example Run 2

```text
Do you have permission from the dean? [y/n] n
Do you have permission from your advisor? [y/n] n
Do you hold senior status? [y/n] y
How many credits do you have? 65
This student can graduate: true
```

### Example Run 3

```text
Do you have permission from the dean? [y/n] n
Do you have permission from your advisor? [y/n] y
Do you hold senior status? [y/n] n
How many credits do you have? 50
This student can graduate: true
```
  
## Question 3: XP Level Classifier

Suppose we are developing a video game where a player's level is determined by their current experience points (**XP**).

Write a program that reads the user's current XP and outputs their current level.

The level ranges are shown below:

- **Level 1:** below 18.0
- **Level 2:** 18.0 to 24.9
- **Level 3:** 25.0 to 29.9
- **Level 4:** 30.0 to 39.9
- **Level 5:** 40.0 to 50.0

Note that valid XP values must be between **0.0** and **50.0**, inclusive.

### Input

Your program should ask the user to enter the player's current XP.

### Output

- If the XP value is valid, print the player's level in the format:

`Level X Player (XP: value)`

- If the XP value is not valid, print:

`ERROR: Please enter a valid XP value.`

### Example Run 1

```text
Enter this user's current XP: 44.2
Level 5 Player (XP: 44.2)
```

### Example Run 2

```text
Enter this user's current XP: 83.1719
ERROR: Please enter a valid XP value.
```

### Example Run 3


```text
Enter this user's current XP: 7
Level 1 Player (XP: 7.0)
```

### Example Run 4

```text
Enter this user's current XP: 26.4
Level 3 Player (XP: 26.4)
```

### Notes

- XP may be entered as an integer or a decimal number.
- Your program should check whether the XP is within the valid range before determining the level.
- Be careful with boundary values such as **18.0**, **25.0**, **30.0**, **40.0**, and **50.0**.

## Question 4: Quadratic Equation Classifier

Write a program that asks the user to input three floating-point numbers: **a**, **b**, and **c**. These values represent the parameters of the quadratic equation:

`ax² + bx + c = 0`

Your program should classify the equation as one of the following:

- **Infinite number of solutions**
  - For example, `a = 0`, `b = 0`, `c = 0`
- **No solution**
  - For example, `a = 0`, `b = 0`, `c = 4`
- **No real solution**
  - For example, `a = 1`, `b = 0`, `c = 4`
- **One real solution**
  - If there is exactly one real solution, print the solution
- **Two real solutions**
  - If there are two real solutions, print both solutions

### Hint

If `a ≠ 0` and the equation has real solutions, you can use the quadratic formula:

`x = (-b ± sqrt(b² - 4ac)) / (2a)`

The number of real solutions depends on the value of the discriminant:

`b² - 4ac`

- If the discriminant is **positive**, there are **two real solutions**
- If the discriminant is **zero**, there is **one real solution**
- If the discriminant is **negative**, there are **no real solutions**

### Input

Your program should ask the user to enter:

- the value of `a`
- the value of `b`
- the value of `c`

### Output

Your program should classify the equation and print the appropriate message.

### Example Run

```text
Please enter value of a: 1
Please enter value of b: 4
Please enter value of c: 4
This equation has 1 solution: x = -2.0
```

### Notes

- You must handle the special case when `a = 0`, since the equation is no longer quadratic.
- Be careful to distinguish between:
  - no solution
  - no real solution
  - one real solution
  - two real solutions
- Use floating-point values throughout the program.