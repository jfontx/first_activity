# First Activity to evaluate the use of primitive types, conditionals, and loops

## Introduction

## Basics

Java is a statically-typed language, which means that the type of a variable is known at compile-time.
Assigning a value to a name is referred to as defining a variable.
A variable is defined by explicitly specifying its type.

```java
byte someByte = 10;
short someShortInt = 10;
int explicitVar = 10;
long someLongInteger = 1000000;
float numberF = 10.0f;
double numberD = 10.0;
boolean someCondition = true;
char someCharacter = 'c';
```

Updating a variable's value is done through the `=` operator.
Here, `=` does not represent mathematical equality.
It simply assigns a value to a variable.
Once defined, a variable's type can never change.

```java
int count = 1; // Assign initial value
count = 2;     // Update to new value

// Compiler error when assigning a different type
// count = false;
```

Java is an [object-oriented language][object-oriented-programming] and requires all functions to be defined in a _class_.
The `class` keyword is used to define a class.

```java
class Calculator {
    // ...
}
```

A function within a class is referred to as a _method_.
Each method can have zero or more parameters.
All parameters must be explicitly typed, there is no type inference for parameters.
Similarly, the return type must also be made explicit.
Values are returned from methods using the `return` keyword.
To allow a method to be called by other classes, the `public` access modifier must be added.

```java
class Calculator {
    public int add(int x, int y) {
        return x + y;
    }
}
```

Invoking/calling a method is done by specifying its class and method name and passing arguments for each of the method's parameters.

```java
int sum = new Calculator().add(1, 2);  // here the  "add" method has been called to perform the task of addition
```

Scope in Java is defined between the `{` and `}` characters.

Java supports two types of comments.
Single line comments are preceded by `//` and multiline comments are inserted between `/*` and `*/`.

[object-oriented-programming]: https://docs.oracle.com/javase/tutorial/java/javaOO/index.html

## Booleans

Booleans in Java are represented by the `boolean` type, which values can be either `true` or `false`.

Java supports three boolean operators:  

- `!` (NOT): negates the boolean  
- `&&` (AND): takes two booleans and results in true if they're both true  
- `||` (OR): results in true if any of the two booleans is true  

### Examples

```java
!true // => false
!false // => true
true && false // => false
true && true // => true
false || false // => false
false || true // => true
```

## Numbers

There are two different types of numbers in Java:

- Integers: numbers with no digits behind the decimal separator (whole numbers).
  Examples are `-6`, `0`, `1`, `25`, `976` and `-500000`.
- Floating-point numbers: numbers with zero or more digits behind the decimal separator.
  Examples are `-20.4`, `0.1`, `2.72`, `16.984025` and `1024.0`.

The two most common numeric types in Java are `int` and `double`.
An `int` is a 32-bit integer and a `double` is a 64-bit floating-point number.

Arithmetic is done using the standard arithmetic operators.
Numbers can be compared using the standard numeric comparison operators (eg. `5 > 4` and `4 <= 5`) and the equality (`==`) and inequality (`!=`) operators.

Java has two types of numeric conversions:

1. Implicit conversions: no data will be lost and no additional syntax is required.
2. Explicit conversions: data could be lost and additional syntax in the form of a _cast_ is required.

As an `int` has less precision than a `double`, converting from an `int` to a `double` is safe and is thus an implicit conversion.
However, converting from a `double` to an `int` could mean losing data, so that requires an explicit conversion.

to `cast` between types you just need to apply the following syntax.

```java
int j = 1;
double k = (double) j;
```

in this case `j` is being casted to a (double) so java will try to convert the type of `j` to the type that `k` accept.

## If-Else Statements

### The _if-then_ statement

The most basic control flow statement in Java is the _if-then_ statement.
This statement is used to only execute a section of code if a particular condition is `true`.
An _if-then_ statement is defined using the `if` clause:

```java
class Car {
    void drive() {
        // the "if" clause: the car needs to have fuel left to drive
        if (fuel > 0) {
            // the "then" clause: the car drives, consuming fuel
            fuel--;
        }
    }
}
```

In the above example, if the car is out of fuel, calling the `Car.drive` method will do nothing.

### The _if-then-else_ statement

The _if-then-else_ statement provides an alternative path of execution for when the condition in the `if` clause evaluates to `false`.
This alternative path of execution follows an `if` clause and is defined using the `else` clause:

```java
class Car {
    void drive() {
        if (fuel > 0) {
            fuel--;
        } else {
            stop();
        }
    }
}
```

In the above example, if the car is out of fuel, calling the `Car.drive` method will call another method to stop the car.

The _if-then-else_ statement also supports multiple conditions by using the `else if` clause:

```java
class Car {
    void drive() {
        if (fuel > 5) {
            fuel--;
        } else if (fuel > 0) {
            turnOnFuelLight();
            fuel--;
        } else {
            stop();
        }
    }
}
```

In the above example, driving the car when the fuel is less then or equal to `5` will drive the car, but it will turn on the fuel light.
When the fuel reaches `0`, the car will stop driving.

## The while and do-while Statements

The `while` statement continually executes a block of statements while a particular condition is `true`. Its syntax can be expressed as:

```java
while (expression) {
     statement(s)
}
```

The `while` statement evaluates *expression*, which must return a `boolean` value. If the expression evaluates to `true`, the `while` statement executes the *statement(s)* in the `while` block. The `while` statement continues testing the expression and executing its block until the expression evaluates to `false`. Using the `while` statement to print the values from 1 through 10 can be accomplished as in the following [WhileDemo](examples/WhileDemo.java) program:

```java
class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
```

You can implement an infinite loop using the `while` statement as follows:

```java
while (true){
    // your code goes here
}
```

The Java programming language also provides a `do-while` statement, which can be expressed as follows:

```java
do {
     statement(s)
} while (expression);
```

The difference between `do-while` and `while` is that `do-while` evaluates its expression at the bottom of the loop instead of the top. Therefore, the statements within the `do` block are always executed at least once, as shown in the following [DoWhileDemo](examples/DoWhileDemo.java) program:

```java
class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
```

## The for Statement

The `for` statement provides a compact way to iterate over a range of values. Programmers often refer to it as the "for loop" because of the way in which it repeatedly loops until a particular condition is satisfied. The general form of the `for` statement can be expressed as follows:

```java
for (*initialization*; *termination*; *increment*) {
    *statement(s)*
}
```

When using this version of the `for` statement, keep in mind that:

- The *initialization* expression initializes the loop; it's executed once, as the loop begins.
- When the *termination* expression evaluates to `false`, the loop terminates.
- The *increment* expression is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment *or* decrement a value.

The following program, [ForDemo](examples/ForDemo.java), uses the general form of the `for` statement to print the numbers 1 through 10 to standard output:

```java
class ForDemo {
    public static void main(String[] args){
         for(int i=1; i<11; i++){
              System.out.println("Count is: " + i);
         }
    }
}
```

The output of this program is:

```plaintext
Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Count is: 6
Count is: 7
Count is: 8
Count is: 9
Count is: 10
```

Notice how the code declares a variable within the initialization expression. The scope of this variable extends from its declaration to the end of the block governed by the `for` statement, so it can be used in the termination and increment expressions as well. If the variable that controls a `for` statement is not needed outside of the loop, it's best to declare the variable in the initialization expression. The names `i`, `j`, and `k` are often used to control `for` loops; declaring them within the initialization expression limits their lifespan and reduces errors.

The three expressions of the `for` loop are optional; an infinite loop can be created as follows:

```java
// infinite loop
for ( ; ; ) {
    // your code goes here
}
```

The `for` statement also has another form designed for iteration through [Collections](../../collections/index.html) and [arrays](arrays.html). This form is sometimes referred to as the *enhanced for* statement, and can be used to make your loops more compact and easy to read. To demonstrate, consider the following array, which holds the numbers 1 through 10:

```java
int[] numbers = {1,2,3,4,5,6,7,8,9,10};
```

The following program, [EnhancedForDemo](examples/EnhancedForDemo.java), uses the enhanced `for` to loop through the array:

```java
class EnhancedForDemo {
    public static void main(String[] args){
         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
    }
}
```

In this example, the variable `item` holds the current value from the numbers array. The output from this program is the same as before:

```plaintext
Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Count is: 6
Count is: 7
Count is: 8
Count is: 9
Count is: 10
```
We recommend using this form of the `for` statement instead of the general form whenever possible.

## Standard Math libraries.

To use or apply maths in java you need to use the standard library `Math`, this standard library have methods or functions such as `sqrt` -> square root, or `pow` -> power of a number, and so on.


# LINK: For more information about primitive types.
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"# First_Activityy" 
