# Exercises you must do

In the path src/main/java/Main.java (this file) you must edit and solve each problem.

## addTwoNumbers
```java
	public int addTwoNumbers(int a, int b) {
	}
```
For this one you need to make the function return the sum of the two values a, and b.

## multiplyTwoNumbers

```java
	public int multiplyTwoNumbers(int a, int b) {
	}
```
This one you need to make the function return the multiplication for the two values a, and b.

## divideTwoNumbers
```java
	public float divideTwoNumbers(int a, int b) {
	}
```
This one you need to make the function return the division between the two values a, and b.

## substractTwoNumbers
```java
	public int substractTwoNumbers(int a, int b) {
	}
```
This one you need to make the function return the substraction between the two values a, and b.

## isNumberEven
```java
	public boolean isNumberEven(int a){
	}
```
This one must return `true` if a is even or `false` if a is not. For this use `%` that is the `mod` operator this will check the remain of the division for example `a % b` will be the remainder for the division between a, and b.

## calculateFirstRightDigit
```java
	public int calculateFirstRightDigit(int a){
	}
```
This one must return the first right digit of a number `a` for example:
* if the number is 10 the result is 0.
* if the number is 12 the result is 2.

## celciusToFahrenheit
```java
	public float celciusToFahrenheit(float a){
	}
```
This one must return the conversion from celsius temperature to fahrenheit. For that use the following formula:

F = C * 9/5 + 32``

## areaOfATriangle
```java
	public float areaOfATriangle(float height, float base){
	}
```
this one must return the calculation of the area of a triangle. For this use the formula:

`A = b * h / 2`


## isLeapYear
```java
	public boolean isLeapYear(int year){
	}
```
We add a Leap Day on February 29, almost every four years. The leap day is an extra, or intercalary, day and we add it to the shortest month of the year, February. In the Gregorian calendar three criteria must be taken into account to identify leap years:

1. The year can be evenly divided by 4;
2. If the year can be evenly divided by 100, it is NOT a leap year, unless;
3. The year is also evenly divisible by 400. Then it is a leap year.

This means that in the Gregorian calendar, the years 2000 and 2400 are leap years, while 1800, 1900, 2100, 2200, 2300 and 2500 are NOT leap years.

you need to write a function that returns `true` when is leap year, and `false` if not.

## isPrime
```java
	public boolean isPrime(int year){
	}
```
This is very simple just create within the function a way to check if a number is prime or not. Remember a prime number just have 2 divisors, 1, and itself. This function must return a `true` if it is prime, `false` if not.

## calculateFactorial
```java
    public int calculateFactorial(int number){
    }
```
This functions must calculate the factorial of a number - `!n`, the factorial of a number if define as follows:

1. if n = 0 then !n = 1 -> !0 = 1.
2. if n != 0 then !n = 1 * 2 * 3 * ... * (n - 1) -> 2! = 1 * 2 = 2.

## calculateLastNFibonnacci
```java
    public int calculateLastNFibonnacci(int n){
    }
```
This function must calculate the last N number of the fibonacci series. The fibonacci series is calculated as follows:

1 1 2 3 5 8 13 ....

For this series to be calculated you need the first two value values in this case 1, and the other 1.

1. A_1 = 1
2. A_2 = 1
3. A_3 = A_1 + A_2 = 2
4. A_4 = A_3 + A_2 = 3
5. A_5 = A_4 + A_3 = 5
6. A_6 = A_5 + A_4 = 8

So for simplicy to calculate the n number of the fibonacci series we need to know the two previous ones, and sum it.

For this function you need to calculate the N number of the series where N can be any int number.

For example the 6th will be in this case 8. The 3th will be 2, an so on.

## getNumberOfDigits
```java
    public int getNumberOfDigits(int number){
    }
```
For this function you need to calculate the number of digits that a number have. To do this use the `DIV` function, keep in mind that in java to use this function you must use the Math standard library, you can use it with `Math.floorDiv(some_number, some_number)`.

Example:
    846 div 10 = 84 div 10 = 8 div 10 = 0
    how many times did we apply div to the number until we have 0? -> 3 so the number of digits is 3.

## rotateNumber
```java
    public int rotateNumber(int number){
    }
```
For this function you need to invert a number, any number. For example -> 10 will be 1, 12 will be 21, 321 will be 123. You can do this with `%` and `Math.floorDiv()` and the following tip:

123 = 1 * 10 ^ 2 + 2 * 10 ^ 1 + 3 * 10 ^ 0

## sumOffirstNNumbersMultiplesOfFiveOrThree
```java
    public int sumOffirstNNumbersMultiplesOfFiveOrThree(int N){
    }
```
For this you just need to sum the first N numbers that are multiples of 5 or 3.


GOOD LUCK!