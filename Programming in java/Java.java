/*
# Java 

Java "Hello, World!" Program

  class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello, World!"); 
      }
  }



Output

Hello, World!


public static void main(String[] args) { ... }

This is the main method. Every application in Java must contain the main method. The Java compiler starts executing the code from the main method.

How does it work? Good question. However, we will not discuss it in this article. After all, it's a basic program to introduce Java programming language to a newbie. We will learn the meaning of public, static, void, and how methods work? in later chapters.

For now, just remember that the main function is the entry point of your Java application, and it's mandatory in a Java program. The signature of the main method in Java is:
public static void main(String[] args) {
... .. ...
}


Things to take away

Every valid Java Application must have a class definition that matches the filename (class name and file name should be same).
 
The main method must be inside the class definition.

The compiler executes the codes starting from the main function.

This is a valid Java program that does nothing.

  public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here
    }
}



### Java JDK, JRE and JVM

In this tutorial, you will learn about JDK, JRE, and JVM. You will also learn the key differences between them.

#### What is JVM?

JVM (Java Virtual Machine) is an abstract machine that enables your computer to run a Java program.

When you run the Java program, Java compiler first compiles your Java code to bytecode. Then, the JVM translates bytecode into native machine code (set of instructions that a computer's CPU executes directly).

Java is a platform-independent language. It's because when you write Java code, it's ultimately written for JVM but not your physical machine (computer). Since JVM ​executes the Java bytecode which is platform-independent, Java is platform-independent.

                                Working of Java Program

Java      ---------------->  Java ByteCode  ------------>   Machine  ------------> Output
Program    java Compiler                          JVM         Code       CPU

#### How does Java program work?

#### What is JRE?

JRE (Java Runtime Environment) is a software package that provides Java class libraries, Java Virtual Machine (JVM), and other components that are required to run Java applications.

JRE is the superset of JVM.

JRE = JVM + Class Libraries
Java runtime environment


#### What is JDK?
JDK (Java Development Kit) is a software development kit required to develop applications in Java. When you download JDK, JRE is also downloaded with it.

In addition to JRE, JDK also contains a number of development tools (compilers, JavaDoc, Java Debugger, etc).

JDK contains JRE and other tools to develop Java applications.

JDK = JRE + Compilers + Debuggers
Java Development Kit


##### Relationship between JVM, JRE, and JDK.

JRE contains JVM and class libraries and JDK contains JRE, compilers, debuggers, and JavaDoc


JRE = JVM + Class Libraries

JDK = JRE + Compilers + Debuggers + JavaDocs



### Java Variables and Literals

#### Java Variables
A variable is a location in memory (storage area) to hold data.

To indicate the storage area, each variable should be given a unique name (identifier). Learn more about Java identifiers.

##### Create Variables in Java
Here's how we create a variable in Java,

int speedLimit = 80;
Here, speedLimit is a variable of int data type and we have assigned value 80 to it.

The int data type suggests that the variable can only hold integers. To learn more, visit Java data types.

In the example, we have assigned value to the variable during declaration. However, it's not mandatory.

You can declare variables and assign variables separately. For example,

int speedLimit;
speedLimit = 80;
Note: Java is a statically-typed language. It means that all variables must be declared before they can be used.

Change values of variables
The value of a variable can be changed in the program, hence the name variable. For example,

int speedLimit = 80;
... .. ...
speedLimit = 90; 
Here, initially, the value of speedLimit is 80. Later, we changed it to 90.

However, we cannot change the data type of a variable in Java within the same scope.

##### What is the variable scope?

Don't worry about it for now. Just remember that we can't do something like this:

int speedLimit = 80;
... .. ...
float speedLimit;
To learn more, visit: Can I change declaration type for a variable in Java?

##### Rules for Naming Variables in Java
Java programming language has its own set of rules and conventions for naming variables. Here's what you need to know:

Java is case sensitive. Hence, age and AGE are two different variables. For example,
 
int age = 24;
int AGE = 25;

System.out.println(age);  // prints 24
System.out.println(AGE);  // prints 25
Variables must start with either a letter or an underscore, _ or a dollar, $ sign. For example,
 
int age;  // valid name and good practice
int _age;  // valid but bad practice
int $age;  // valid but bad practice
Variable names cannot start with numbers. For example,
 
int 1age;  // invalid variables
Variable names can't use whitespace. For example,
 
int my age;  // invalid variables


Here, is we need to use variable names having more than one word, use all lowercase letters for the first word and capitalize the first letter of each subsequent word. For example, myAge.
When creating variables, choose a name that makes sense. For example, score, number, level makes more sense than variable names such as s, n, and l.
If you choose one-word variable names, use all lowercase letters. For example, it's better to use speed rather than SPEED, or sPEED.
##### There are 4 types of variables in Java programming language:

Instance Variables (Non-Static Fields)
Class Variables (Static Fields)
Local Variables
Parameters


#### Java literals
Literals are data used for representing fixed values. They can be used directly in the code. For example,

int a = 1;
float b = 2.5;
char c = 'F';
Here, 1, 2.5, and 'F' are literals.

Here are different types of literals in Java.

##### 1. Boolean Literals
In Java, boolean literals are used to initialize boolean data types. They can store two values: true and false. For example,

boolean flag1 = false;
boolean flag2 = true;
Here, false and true are two boolean literals.

##### 2. Integer Literals
An integer literal is a numeric value(associated with numbers) without any fractional or exponential part. There are 4 types of integer literals in Java:

binary (base 2)
decimal (base 10)
octal (base 8)
hexadecimal (base 16)
For example:

// binary
int binaryNumber = 0b10010;
// octal 
int octalNumber = 027;

// decimal
int decNumber = 34;

// hexadecimal 
int hexNumber = 0x2F; // 0x represents hexadecimal
// binary
int binNumber = 0b10010; // 0b represents binary
In Java, binary starts with 0b, octal starts with 0, and hexadecimal starts with 0x.

###### Note: Integer literals are used to initialize variables of integer types like byte, short, int, and long.

##### 3. Floating-point Literals
A floating-point literal is a numeric literal that has either a fractional form or an exponential form. For example,

class Main {
  public static void main(String[] args) {
    	
    double myDouble = 3.4;
    float myFloat = 3.4F;
 
    // 3.445*10^2
    double myDoubleScientific = 3.445e2;

    System.out.println(myDouble);  // prints 3.4
    System.out.println(myFloat);    // prints 3.4
    System.out.println(myDoubleScientific);   // prints 344.5
  }
}
Run Code
Note: The floating-point literals are used to initialize float and double type variables.

##### 4. Character Literals
Character literals are unicode character enclosed inside single quotes. For example,

char letter = 'a';
Here, a is the character literal.

We can also use escape sequences as character literals. For example, \b (backspace), \t (tab), \n (new line), etc.

##### 5. String literals
A string literal is a sequence of characters enclosed inside double-quotes. For example,

String str1 = "Java Programming";
String str2 = "Programiz";
Here, Java Programming and Programiz are two string literals.


### Java Data Types (Primitive)
In this tutorial, we will learn about all 8 primitive data types in Java with the help of examples.

Java Data Types
As the name suggests, data types specify the type of data that can be stored inside variables in Java.

Java is a statically-typed language. This means that all variables must be declared before they can be used.

int speed;
Here, speed is a variable, and the data type of the variable is int.

The int data type determines that the speed variable can only contain integers.

There are 8 data types predefined in Java, known as primitive data types.

Note: In addition to primitive data types, there are also referenced types (object type).

#### 8 Primitive Data Types
##### 1. boolean type
The boolean data type has two possible values, either true or false.
Default value: false.
They are usually used for true/false conditions.
Example 1: Java boolean data type
class Main {
  public static void main(String[] args) {
    	
    boolean flag = true;
    System.out.println(flag);    // prints true
  }
}
Run Code
##### 2. byte type
The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
If it's certain that the value of a variable will be within -128 to 127, then it is used instead of int to save memory.
Default value: 0
Example 2: 
Java byte data type
class Main {
  public static void main(String[] args) {

    byte range;
    range = 124;
    System.out.println(range);    // prints 124
  }
}
Run Code
##### 3. short type
The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
If it's certain that the value of a variable will be within -32768 and 32767, then it is used instead of other integer data types (int, long).
Default value: 0
Example 3:
 Java short data type
class Main {
  public static void main(String[] args) {
    	
    short temperature;
    temperature = -200;
    System.out.println(temperature);  // prints -200
  }
}
Run Code
##### 4. int type
The int data type can have values from -231 to 231-1 (32-bit signed two's complement integer).
If you are using Java 8 or later, you can use an unsigned 32-bit integer. This will have a minimum value of 0 and a maximum value of 232-1. To learn more, visit How to use the unsigned integer in java 8?
Default value: 0
Example 4: 
Java int data type
class Main {
  public static void main(String[] args) {
    	
    int range = -4250000;
    System.out.println(range);  // print -4250000
  }
}
Run Code
##### 5. long type
The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
If you are using Java 8 or later, you can use an unsigned 64-bit integer with a minimum value of 0 and a maximum value of 264-1.
Default value: 0
Example 5:
 Java long data type
class LongExample {
  public static void main(String[] args) {
    	
    long range = -42332200000L;
    System.out.println(range);    // prints -42332200000
  }
}
Run Code
Notice, the use of L at the end of -42332200000. This represents that it's an integer of the long type.

##### 6. double type
The double data type is a double-precision 64-bit floating-point.
It should never be used for precise values such as currency.
Default value: 0.0 (0.0d)
Example 6:
 Java double data type
class Main {
  public static void main(String[] args) {
    	
    double number = -42.3;
    System.out.println(number);  // prints -42.3
  }
}
Run Code
##### 7. float type
The float data type is a single-precision 32-bit floating-point. Learn more about single-precision and double-precision floating-point if you are interested.
It should never be used for precise values such as currency.
Default value: 0.0 (0.0f)
Example 7: 
Java float data type
class Main {
  public static void main(String[] args) {
    	
    float number = -42.3f;
    System.out.println(number);  // prints -42.3
  }
}
Run Code

Notice that we have used -42.3f instead of -42.3in the above program. It's because -42.3 is a double literal.

To tell the compiler to treat -42.3 as float rather than double, you need to use f or F.

If you want to know about single-precision and double-precision, visit Java single-precision and double-precision floating-point.

##### 8. char type
It's a 16-bit Unicode character.
The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
Default value: '\u0000'
Example 8: 
Java char data type
class Main {
  public static void main(String[] args) {
    	
    char letter = '\u0051';
    System.out.println(letter);  // prints Q
  }
}
Run Code
Here, the Unicode value of Q is \u0051. Hence, we get Q as the output.

Here is another example:

class Main {
  public static void main(String[] args) {
    	
    char letter1 = '9';
    System.out.println(letter1);  // prints 9
    	
    char letter2 = 65;
    System.out.println(letter2);  // prints A

  }
}
Run Code
Here, we have assigned 9 as a character (specified by single quotes) to the letter1 variable. However, the letter2 variable is assigned 65 as an integer number (no single quotes).

Hence, A is printed to the output. It is because Java treats characters as an integer and the ASCII value of A is 65. To learn more about ASCII, visit What is ASCII Code?.

### String type
Java also provides support for character strings via java.lang.String class. Strings in Java are not primitive types. Instead, they are objects. For example,

String myString = "Java Programming";
Here, myString is an object of the String class. To learn more, visit Java Strings.


#### Java Operators
In this tutorial, you'll learn about different types of operators in Java, their syntax and how to use them with the help of examples.

Operators are symbols that perform operations on variables and values. For example, + is an operator used for addition, while * is also an operator used for multiplication.

Operators in Java can be classified into 5 types:

Arithmetic Operators
Assignment Operators
Relational Operators
Logical Operators
Unary Operators
Bitwise Operators
##### 1. Java Arithmetic Operators
Arithmetic operators are used to perform arithmetic operations on variables and data. For example,

a + b;
Here, the + operator is used to add two variables a and b. Similarly, there are various other arithmetic operators in Java.

Operator	Operation
+	Addition
-	Subtraction
*	Multiplication
/	Division
%	Modulo Operation (Remainder after division)
Example 1: 
Arithmetic Operators
class Main {
  public static void main(String[] args) {
    
    // declare variables
    int a = 12, b = 5;

    // addition operator
    System.out.println("a + b = " + (a + b));

    // subtraction operator
    System.out.println("a - b = " + (a - b));

    // multiplication operator
    System.out.println("a * b = " + (a * b));

    // division operator
    System.out.println("a / b = " + (a / b));

    // modulo operator
    System.out.println("a % b = " + (a % b));
  }
}
Run Code
Output

a + b = 17
a - b = 7 
a * b = 60
a / b = 2 
a % b = 2 
In the above example, we have used +, -, and * operators to compute addition, subtraction, and multiplication operations.

/ Division Operator

Note the operation, a / b in our program. The / operator is the division operator.

If we use the division operator with two integers, then the resulting quotient will also be an integer. And, if one of the operands is a floating-point number, we will get the result will also be in floating-point.

In Java,

(9 / 2) is 4
(9.0 / 2) is 4.5
(9 / 2.0) is 4.5
(9.0 / 2.0) is 4.5
% Modulo Operator

The modulo operator % computes the remainder. When a = 7 is divided by b = 4, the remainder is 3.

Note: The % operator is mainly used with integers.

#### 2. Java Assignment Operators
Assignment operators are used in Java to assign values to variables. For example,

int age;
age = 5;
Here, = is the assignment operator. It assigns the value on its right to the variable on its left. That is, 5 is assigned to the variable age.

Let's see some more assignment operators available in Java.

Operator	Example	
Equivalent to
=	a = b;	a = b;
+=	a += b;	a = a + b;
-=	a -= b;	a = a - b;
*=	a *= b;	a = a * b;
/=	a /= b;	a = a / b;
%=	a %= b;	a = a % b;
Example 2: 
Assignment Operators
class Main {
  public static void main(String[] args) {
    
    // create variables
    int a = 4;
    int var;

    // assign value using =
    var = a;
    System.out.println("var using =: " + var);

    // assign value using =+
    var += a;
    System.out.println("var using +=: " + var);

    // assign value using =*
    var *= a;
    System.out.println("var using *=: " + var);
  }
}
Run Code
Output

var using =: 4
var using +=: 8 
var using *=: 32
#### 3. Java Relational Operators
Relational operators are used to check the relationship between two operands. For example,

// check if a is less than b
a < b;
Here, < operator is the relational operator. It checks if a is less than b or not.

It returns either true or false.

Operator	Description	Example
==	Is Equal To	3 == 5 returns false
!=	Not Equal To	3 != 5 returns true
>	Greater Than	3 > 5 returns false
<	Less Than	3 < 5 returns true
>=	Greater Than or Equal To	3 >= 5 returns false
<=	Less Than or Equal To	3 <= 5 returns true
Example 3: 
Relational Operators
class Main {
  public static void main(String[] args) {
    
    // create variables
    int a = 7, b = 11;

    // value of a and b
    System.out.println("a is " + a + " and b is " + b);

    // == operator
    System.out.println(a == b);  // false

    // != operator
    System.out.println(a != b);  // true

    // > operator
    System.out.println(a > b);  // false

    // < operator
    System.out.println(a < b);  // true

    // >= operator
    System.out.println(a >= b);  // false

    // <= operator
    System.out.println(a <= b);  // true
  }
}
Run Code
Note: Relational operators are used in decision making and loops.

#### 4. Java Logical Operators
Logical operators are used to check whether an expression is true or false. They are used in decision making.

Operator	Example	Meaning
&& (Logical AND)	expression1 && expression2	true only if both expression1 and expression2 are true
|| (Logical OR)	expression1 || expression2	true if either expression1 or expression2 is true
! (Logical NOT)	!expression	true if expression is false and vice versa
Example 4: 
Logical Operators
class Main {
  public static void main(String[] args) {

    // && operator
    System.out.println((5 > 3) && (8 > 5));  // true
    System.out.println((5 > 3) && (8 < 5));  // false

    // || operator
    System.out.println((5 < 3) || (8 > 5));  // true
    System.out.println((5 > 3) || (8 < 5));  // true
    System.out.println((5 < 3) || (8 < 5));  // false

    // ! operator
    System.out.println(!(5 == 3));  // true
    System.out.println(!(5 > 3));  // false
  }
}
Run Code

Working of Program

(5 > 3) && (8 > 5) returns true because both (5 > 3) and (8 > 5) are true.
(5 > 3) && (8 < 5) returns false because the expression (8 < 5) is false.
(5 < 3) || (8 > 5) returns true because the expression (8 > 5) is true.
(5 > 3) && (8 > 5) returns true because the expression (5 > 3) is true.
(5 > 3) && (8 > 5) returns false because both (5 < 3) and (8 < 5) are false.
!(5 == 3) returns true because 5 == 3 is false.
!(5 > 3) returns false because 5 > 3 is true.
#### 5. Java Unary Operators
Unary operators are used with only one operand. For example, ++ is a unary operator that increases the value of a variable by 1. That is, ++5 will return 6.

Different types of unary operators are:

###### Operator	Meaning
+	Unary plus: not necessary to use since numbers are positive without using it
-	Unary minus: inverts the sign of an expression
++	Increment operator: increments value by 1
--	Decrement operator: decrements value by 1
!	Logical complement operator: inverts the value of a boolean
Increment and Decrement Operators
Java also provides increment and decrement operators: ++ and -- respectively. ++ increases the value of the operand by 1, while -- decrease it by 1. For example,

int num = 5;

// increase num by 1
++num;
Here, the value of num gets increased to 6 from its initial value of 5.

Example 5: 
Increment and Decrement Operators
class Main {
  public static void main(String[] args) {
    
    // declare variables
    int a = 12, b = 12;
    int result1, result2;

    // original value
    System.out.println("Value of a: " + a);

    // increment operator
    result1 = ++a;
    System.out.println("After increment: " + result1);

    System.out.println("Value of b: " + b);

    // decrement operator
    result2 = --b;
    System.out.println("After decrement: " + result2);
  }
}
Run Code
Output

Value of a: 12
After increment: 13
Value of b: 12     
After decrement: 11
In the above program, we have used the ++ and -- operator as prefixes (++a, --b). We can also use these operators as postfix (a++, b++).

There is a slight difference when these operators are used as prefix versus when they are used as a postfix.

To learn more about these operators, visit increment and decrement operators.

#### 6. Java Bitwise Operators
Bitwise operators in Java are used to perform operations on individual bits. For example,

Bitwise complement Operation of 35

35 = 00100011 (In Binary)

~ 00100011 
  ________
   11011100  = 220 (In decimal)
Here, ~ is a bitwise operator. It inverts the value of each bit (0 to 1 and 1 to 0).

The various bitwise operators present in Java are:

Operator	Description
~	Bitwise Complement
<<	Left Shift
>>	Right Shift
>>>	Unsigned Right Shift
&	Bitwise AND
^	Bitwise exclusive OR
These operators are not generally used in Java. To learn more, visit Java Bitwise and Bit Shift Operators.

Other operators
Besides these operators, there are other additional operators in Java.

#### Java instanceof Operator
The instanceof operator checks whether an object is an instanceof a particular class. For example,

class Main {
  public static void main(String[] args) {

    String str = "Programiz";
    boolean result;

    // checks if str is an instance of
    // the String class
    result = str instanceof String;
    System.out.println("Is str an object of String? " + result);
  }
}
Run Code
Output

Is str an object of String? true
Here, str is an instance of the String class. Hence, the instanceof operator returns true. To learn more, visit Java instanceof.

#### Java Ternary Operator
The ternary operator (conditional operator) is shorthand for the if-then-else statement. For example,

variable = Expression ? expression1 : expression2
Here's how it works.

If the Expression is true, expression1 is assigned to the variable.
If the Expression is false, expression2 is assigned to the variable.
Let's see an example of a ternary operator.

class Java {
  public static void main(String[] args) {

    int februaryDays = 29;
    String result;

    // ternary operator
    result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
    System.out.println(result);
  }
}
Run Code
Output

#### Leap year
In the above example, we have used the ternary operator to check if the year is a leap year or not. To learn more, visit the Java ternary operator.

Now that you know about Java operators, it's time to know about the order in which operators are evaluated. To learn more, visit Java Operator Precedence.




### Java Basic Input and Output
In this tutorial, you will learn simple ways to display output to users and take input from users in Java.

Java Output
In Java, you can simply use

System.out.println(); or

System.out.print(); or

System.out.printf();
to send output to standard output (screen).

Here,

System is a class
out is a public static field: it accepts output data.
Don't worry if you don't understand it. We will discuss class, public, and static in later chapters.

Let's take an example to output a line.

class AssignmentOperator {
    public static void main(String[] args) {
    	
        System.out.println("Java programming is interesting.");   
    }
}
Run Code
Output:

Java programming is interesting.
Here, we have used the println() method to display the string.

##### Difference between println(), print() and printf()
print() - It prints string inside the quotes.
println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
printf() - It provides string formatting (similar to printf in C/C++ programming).
Example: 
print() and println()
class Output {
    public static void main(String[] args) {
    	
        System.out.println("1. println ");
        System.out.println("2. println ");
    	
        System.out.print("1. print ");
        System.out.print("2. print");
    }
}
Run Code
Output:

1. println 
2. println 
1. print 2. print
In the above example, we have shown the working of the print() and println() methods. To learn about the printf() method, visit Java printf().

Example: 
Printing Variables and Literals
class Variables {
    public static void main(String[] args) {
    	
        Double number = -10.6;
    	
        System.out.println(5);
        System.out.println(number);
    }
}
Run Code
When you run the program, the output will be:

5
-10.6
Here, you can see that we have not used the quotation marks. It is because to display integers, variables and so on, we don't use quotation marks.

Example:
 Print Concatenated Strings
class PrintVariables {
    public static void main(String[] args) {
    	
        Double number = -10.6;
    	
        System.out.println("I am " + "awesome.");
        System.out.println("Number = " + number);
    }
}
Run Code
Output:

I am awesome.
Number = -10.6
In the above example, notice the line,

System.out.println("I am " + "awesome.");

Here, we have used the + operator to concatenate (join) the two strings: "I am " and "awesome.".

And also, the line,

System.out.println("Number = " + number);
Here, first the value of variable number is evaluated. Then, the value is concatenated to the string: "Number = ".

#### Java Input
Java provides different ways to get input from the user. However, in this tutorial, you will learn to get input from user using the object of Scanner class.

In order to use the object of Scanner, we need to import java.util.Scanner package.


import java.util.Scanner;
To learn more about importing packages in Java, visit Java Import Packages.

Then, we need to create an object of the Scanner class. We can use the object to take input from the user.


// create an object of Scanner
Scanner input = new Scanner(System.in);

// take input from the user
int number = input.nextInt();
Example: 
Get Integer Input From the User
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
    }
}
Run Code
Output:

Enter an integer: 23
You entered 23
In the above example, we have created an object named input of the Scanner class. We then call the nextInt() method of the Scanner class to get an integer input from the user.

Similarly, we can use nextLong(), nextFloat(), nextDouble(), and next() methods to get long, float, double, and string input respectively from the user.

Note: We have used the close() method to close the object. It is recommended to close the scanner object once the input is taken.

Example: 
Get float, double and String Input
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);
    	
        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);
    	
        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
    }
}
Run Code
Output:

Enter float: 2.343
Float entered = 2.343
Enter double: -23.4
Double entered = -23.4
Enter text: Hey!
Text entered = Hey!
As mentioned, there are other several ways to get input from the user. To learn more about Scanner, visit Java Scanner.




### Java Expressions, Statements and Blocks
In this tutorial, you will learn about Java expressions, Java statements, difference between expression and statement, and Java blocks with the help of examples.

In previous chapters, we have used expressions, statements, and blocks without much explaining about them. Now that you know about variables, operators, and literals, it will be easier to understand these concepts.

#### Java Expressions
A Java expression consists of variables, operators, literals, and method calls. To know more about method calls, visit Java methods. For example,

int score; 
score = 90;
Here, score = 90 is an expression that returns an int. Consider another example,

Double a = 2.2, b = 3.4, result;
result = a + b - 3.4;
Here, a + b - 3.4 is an expression.

if (number1 == number2)
    System.out.println("Number 1 is larger than number 2");
Here, number1 == number2 is an expression that returns a boolean value. Similarly, "Number 1 is larger than number 2" is a string expression.

#### Java Statements
In Java, each statement is a complete unit of execution. For example,

int score = 9*5;
Here, we have a statement. The complete execution of this statement involves multiplying integers 9 and 5 and then assigning the result to the variable score.

In the above statement, we have an expression 9 * 5. In Java, expressions are part of statements.

#### Expression statements
We can convert an expression into a statement by terminating the expression with a ;. These are known as expression statements. For example,

// expression
number = 10
// statement
number = 10;
In the above example, we have an expression number = 10. Here, by adding a semicolon (;), we have converted the expression into a statement (number = 10;).

Consider another example,

// expression
++number
// statement
++number;

Similarly, ++number is an expression whereas ++number; is a statement.

#### Declaration Statements
In Java, declaration statements are used for declaring variables. For example,

Double tax = 9.5;
The statement above declares a variable tax which is initialized to 9.5.

Note: There are control flow statements that are used in decision making and looping in Java. You will learn about control flow statements in later chapters.

#### Java Blocks
A block is a group of statements (zero or more) that is enclosed in curly braces { }. For example,

class Main {
    public static void main(String[] args) {
    	
        String band = "Beatles";
    	
        if (band == "Beatles") { // start of block
            System.out.print("Hey ");
            System.out.print("Jude!");
        } // end of block
    }
}
Run Code
Output:

Hey Jude!
In the above example, we have a block if {....}.

Here, inside the block we have two statements:

System.out.print("Hey ");
System.out.print("Jude!");
However, a block may not have any statements. Consider the following examples,


class Main {
    public static void main(String[] args) {
    	
        if (10 > 5) { // start of block	
 
        } // end of block
    }
}
Run Code
This is a valid Java program. Here, we have a block if {...}. However, there is no any statement inside this block.

class AssignmentOperator {
    public static void main(String[] args) {  // start of block 	

    } // end of block
}
Run Code
Here, we have block public static void main() {...}. However, similar to the above example, this block does not have any statement.



##### Java Comments
In this tutorial, you will learn about Java comments, why we use them, and how to use comments in right way.

In computer programming, comments are a portion of the program that are completely ignored by Java compilers. They are mainly used to help programmers to understand the code. For example,

// declare and initialize two variables
int a =1;
int b = 3;

// print the output
System.out.println("This is output");
Here, we have used the following comments,

declare and initialize two variables
print the output
Types of Comments in Java
In Java, there are two types of comments:

single-line comment
multi-line comment
Single-line Comment
A single-line comment starts and ends in the same line. To write a single-line comment, we can use the // symbol. For example,

// "Hello, World!" program example
 
class Main {
    public static void main(String[] args) {    	
    {
        // prints "Hello, World!"
        System.out.println("Hello, World!");
    }
}
Run Code
Output:

Hello, World!
Here, we have used two single-line comments:

"Hello, World!" program example
prints "Hello World!"
The Java compiler ignores everything from // to the end of line. Hence, it is also known as End of Line comment.

Multi-line Comment

When we want to write comments in multiple lines, we can use the multi-line comment. To write multi-line comments, we can use the /*....*/ symbol. For example,

/* This is an example of  multi-line comment.
 * The program prints "Hello, World!" to the standard output.
 */
/*

class HelloWorld {
    public static void main(String[] args) {    	
    {	
        System.out.println("Hello, World!");
    }
}
Run Code
Output:

Hello, World!
Here, we have used the multi-line comment:

/* This is an example of multi-line comment.
* The program prints "Hello, World!" to the standard output.
*/
/*
This type of comment is also known as Traditional Comment. In this type of comment, the Java compiler ignores everything from /* to */.
/*
Use Comments the Right Way
One thing you should always consider that comments shouldn't be the substitute for a way to explain poorly written code in English. You should always write well structured and self explaining code. And, then use comments.

Some believe that code should be self-describing and comments should be rarely used. However, in my personal opinion, there is nothing wrong with using comments. We can use comments to explain complex algorithms, regex or scenarios where we have to choose one technique among different technique to solve problems.

###### Note: In most cases, always use comments to explain 'why' rather than 'how' and you are good to go.



### Java if...else Statement
In this tutorial, you will learn about control flow statements using Java if and if...else statements with the help of examples.

In programming, we use the if..else statement to run a block of code among more than one alternatives.

For example, assigning grades (A, B, C) based on the percentage obtained by a student.

if the percentage is above 90, assign grade A
if the percentage is above 75, assign grade B
if the percentage is above 65, assign grade C
##### 1. Java if (if-then) Statement
The syntax of an if-then statement is:

if (condition) {
  // statements
}
Here, condition is a boolean expression such as age >= 18.

if condition evaluates to true, statements are executed
if condition evaluates to false, statements are skipped
Working of if Statement
if the number is greater than 0, code inside if block is executed, otherwise code inside if block is skipped
Working of Java if statement
Example 1: 
Java if Statement
class IfStatement {
  public static void main(String[] args) {

    int number = 10;

    // checks if number is less than 0
    if (number < 0) {
      System.out.println("The number is negative.");
    }

    System.out.println("Statement outside if block");
  }
}
Run Code
Output

Statement outside if block
In the program, number < 0 is false. Hence, the code inside the parenthesis is skipped.

Note: If you want to learn more about about test conditions, visit Java Relational Operators and Java Logical Operators.

We can also use Java Strings as the test condition.

Example 2: 
Java if with String
class Main {
  public static void main(String[] args) {
    // create a string variable
    String language = "Java";

    // if statement
    if (language == "Java") {
      System.out.println("Best Programming Language");
    }
  }
}
Run Code
Output

Best Programming Language
In the above example, we are comparing two strings in the if block.

##### 2. Java if...else (if-then-else) Statement
The if statement executes a certain section of code if the test expression is evaluated to true. However, if the test expression is evaluated to false, it does nothing.

In this case, we can use an optional else block. Statements inside the body of else block are executed if the test expression is evaluated to false. This is known as the if-...else statement in Java.

The syntax of the if...else statement is:

if (condition) {
  // codes in if block
}
else {
  // codes in else block
}
Here, the program will do one task (codes inside if block) if the condition is true and another task (codes inside else block) if the condition is false.

How the if...else statement works?
If the condition is true, the code inside the if block is executed, otherwise, code inside the else block is executed
Working of Java if-else statements
Example 3: 
Java if...else Statement
class Main {
  public static void main(String[] args) {
    int number = 10;

    // checks if number is greater than 0
    if (number > 0) {
      System.out.println("The number is positive.");
    }
    
    // execute this block
    // if number is not greater than 0
    else {
      System.out.println("The number is not positive.");
    }

    System.out.println("Statement outside if...else block");
  }
}
Run Code
Output

The number is positive.
Statement outside if...else block
In the above example, we have a variable named number. Here, the test expression number > 0 checks if number is greater than 0.

Since the value of the number is 10, the test expression evaluates to true. Hence code inside the body of if is executed.


Now, change the value of the number to a negative integer. Let's say -5.

int number = -5;
If we run the program with the new value of number, the output will be:

The number is not positive.
Statement outside if...else block
Here, the value of number is -5. So the test expression evaluates to false. Hence code inside the body of else is executed.

##### 3. Java if...else...if Statement
In Java, we have an if...else...if ladder, that can be used to execute one block of code among multiple other blocks.

if (condition1) {
  // codes
}
else if(condition2) {
  // codes
}
else if (condition3) {
  // codes
}
.
.
else {
  // codes
}
Here, if statements are executed from the top towards the bottom. When the test condition is true, codes inside the body of that if block is executed. And, program control jumps outside the if...else...if ladder.

If all test expressions are false, codes inside the body of else are executed.

How the if...else...if ladder works?
If the first test condition if true, code inside first if block is executed, if the second condition is true, block inside second if is executed, and if all conditions are false, the else block is executed
Working of if...else...if ladder
Example 4: 
Java if...else...if Statement
class Main {
  public static void main(String[] args) {

    int number = 0;

    // checks if number is greater than 0
    if (number > 0) {
      System.out.println("The number is positive.");
    }

    // checks if number is less than 0
    else if (number < 0) {
      System.out.println("The number is negative.");
    }
    
    // if both condition is false
    else {
      System.out.println("The number is 0.");
    }
  }
}
Run Code
Output

The number is 0.
In the above example, we are checking whether number is positive, negative, or zero. Here, we have two condition expressions:

number > 0 - checks if number is greater than 0
number < 0 - checks if number is less than 0
Here, the value of number is 0. So both the conditions evaluate to false. Hence the statement inside the body of else is executed.

Note: Java provides a special operator called ternary operator, which is a kind of shorthand notation of if...else...if statement. To learn about the ternary operator, visit Java Ternary Operator.

##### 4. Java Nested if..else Statement
In Java, it is also possible to use if..else statements inside an if...else statement. It's called the nested if...else statement.

Here's a program to find the largest of 3 numbers using the nested if...else statement.

Example 5: 
Nested if...else Statement
class Main {
  public static void main(String[] args) {

    // declaring double type variables
    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

    // checks if n1 is greater than or equal to n2
    if (n1 >= n2) {

      // if...else statement inside the if block
      // checks if n1 is greater than or equal to n3
      if (n1 >= n3) {
        largest = n1;
      }

      else {
        largest = n3;
      }
    } else {

      // if..else statement inside else block
      // checks if n2 is greater than or equal to n3
      if (n2 >= n3) {
        largest = n2;
      }

      else {
        largest = n3;
      }
    }

    System.out.println("Largest Number: " + largest);
  }
}
Run Code
Output:

Largest Number: 4.5
In the above programs, we have assigned the value of variables ourselves to make this easier.

However, in real-world applications, these values may come from user input data, log files, form submission, etc.


### Java switch Statement
In this tutorial, you will learn to use the switch statement in Java to control the flow of your program’s execution with the help of examples.

The switch statement allows us to execute a block of code among many alternatives.

The syntax of the switch statement in Java is:

switch (expression) {

  case value1:
    // code
    break;
  
  case value2:
    // code
    break;
  
  ...
  ...
  
  default:
    // default statements
  }
How does the switch-case statement work?

The expression is evaluated once and compared with the values of each case.

If expression matches with value1, the code of case value1 are executed. Similarly, the code of case value2 is executed if expression matches with value2.
If there is no match, the code of the default case is executed.
Note: The working of the switch-case statement is similar to the Java if...else...if ladder. However, the syntax of the switch statement is cleaner and much easier to read and write.

Example: 
Java switch Statement
// Java Program to check the size
// using the switch...case statement

class Main {
  public static void main(String[] args) {

    int number = 44;
    String size;

    // switch statement to check size
    switch (number) {

      case 29:
        size = "Small";
        break;

      case 42:
        size = "Medium";
        break;

      // match the value of week
      case 44:
        size = "Large";
        break;

      case 48:
        size = "Extra Large";
        break;
      
      default:
        size = "Unknown";
        break;

    }
    System.out.println("Size: " + size);
  }
}
Run Code
Output:

Size: Large
In the above example, we have used the switch statement to find the size. Here, we have a variable number. The variable is compared with the value of each case statement.

Since the value matches with 44, the code of case 44 is executed.

size = "Large";
break;
Here, the size variable is assigned with the value Large.

Recommended Reading: Create a Simple Calculator Using the Java switch Statement

Flowchart of switch Statement
Flowchart of the Java switch statement
Flow chart of the Java switch statement
break statement in Java switch...case
Notice that we have been using break in each case block.

 ...
case 29:
  size = "Small";
  break;
...
The break statement is used to terminate the switch-case statement. If break is not used, all the cases after the matching case are also executed. For example,

class Main {
  public static void main(String[] args) {

    int expression = 2;

    // switch statement to check size
    switch (expression) {
      case 1:
        System.out.println("Case 1");

        // matching case
      case 2:
        System.out.println("Case 2");

      case 3:
        System.out.println("Case 3");

      default:
        System.out.println("Default case");
    }
  }
}
Run Code

Output

Case 2
Case 3      
Default case
In the above example, expression matches with case 2. Here, we haven't used the break statement after each case.

Hence, all the cases after case 2 are also executed.

This is why the break statement is needed to terminate the switch-case statement after the matching case. To learn more, visit Java break Statement.

default case in Java switch-case
The switch statement also includes an optional default case. It is executed when the expression doesn't match any of the cases. For example,

class Main {
  public static void main(String[] args) {
  
    int expression = 9;
    
    switch(expression) {
        
      case 2:
        System.out.println("Small Size");
        break;

      case 3:
        System.out.println("Large Size");
        break;
            
      // default case
      default:
        System.out.println("Unknown Size");
    }
  }
}
Run Code
Output

Unknown Size
In the above example, we have created a switch-case statement. Here, the value of expression doesn't match with any of the cases.

Hence, the code inside the default case is executed.

default:
  System.out.println("Unknown Size);
Note: The Java switch statement only works with:

#### Primitive data types: byte, short, char, and int
Enumerated types
String Class
Wrapper Classes: Character, Byte, Short, and Integer.




### Java for Loop
In this tutorial, we will learn how to use for loop in Java with the help of examples and we will also learn about the working of Loop in computer programming.

In computer programming, loops are used to repeat a block of code. For example, if you want to show a message 100 times, then rather than typing the same code 100 times, you can use a loop.

In Java, there are three types of loops.

for loop
while loop
do...while loop
This tutorial focuses on the for loop. You will learn about the other type of loops in the upcoming tutorials.

Java for Loop
Java for loop is used to run a block of code for a certain number of times. The syntax of for loop is:

for (initialExpression; testExpression; updateExpression) {
    // body of the loop
}
Here,

The initialExpression initializes and/or declares variables and executes only once.
The condition is evaluated. If the condition is true, the body of the for loop is executed.
The updateExpression updates the value of initialExpression.
The condition is evaluated again. The process continues until the condition is false.
To learn more about the conditions, visit Java relational and logical operators.

Working of for loop in Java with flowchart
Flowchart of Java for loop
Example 1: 
Display a Text Five Times
// Program to print a text 5 times

class Main {
  public static void main(String[] args) {

    int n = 5;
    // for loop  
    for (int i = 1; i <= n; ++i) {
      System.out.println("Java is fun");
    }
  }
}
Run Code
Output

Java is fun
Java is fun
Java is fun
Java is fun
Java is fun
Here is how this program works.

Iteration	Variable	Condition: i <= n	Action
1st	i = 1
n = 5	true	Java is fun is printed.
i is increased to 2.
2nd	i = 2
n = 5	true	Java is fun is printed.
i is increased to 3.
3rd	i = 3
n = 5	true	Java is fun is printed.
i is increased to 4.
4th	i = 4
n = 5	true	Java is fun is printed.
i is increased to 5.
5th	i = 5
n = 5	true	Java is fun is printed.
i is increased to 6.
6th	i = 6
n = 5	false	The loop is terminated.
Example 2: 
Display numbers from 1 to 5
// Program to print numbers from 1 to 5

class Main {
  public static void main(String[] args) {
  
    int n = 5;
    // for loop  
    for (int i = 1; i <= n; ++i) {
      System.out.println(i);
    }
  }
}
Run Code

Output

1
2
3
4
5
Here is how the program works.

Iteration	Variable	Condition: i <= n	Action
1st	i = 1
n = 5	true	1 is printed.
i is increased to 2.
2nd	i = 2
n = 5	true	2 is printed.
i is increased to 3.
3rd	i = 3
n = 5	true	3 is printed.
i is increased to 4.
4th	i = 4
n = 5	true	4 is printed.
i is increased to 5.
5th	i = 5
n = 5	true	5 is printed.
i is increased to 6.
6th	i = 6
n = 5	false	The loop is terminated.
Example 3: 
Display Sum of n Natural Numbers
// Program to find the sum of natural numbers from 1 to 1000.

class Main {
  public static void main(String[] args) {
      
    int sum = 0;
    int n = 1000;

    // for loop
    for (int i = 1; i <= n; ++i) {
      // body inside for loop
      sum += i;     // sum = sum + i
    }
       
    System.out.println("Sum = " + sum);
  }
}
Run Code
Output:

Sum = 500500
Here, the value of sum is 0 initially. Then, the for loop is iterated from i = 1 to 1000. In each iteration, iis added to sum and its value is increased by 1.

When i becomes 1001, the test condition is false and sum will be equal to 0 + 1 + 2 + .... + 1000.

The above program to add the sum of natural numbers can also be written as

// Program to find the sum of natural numbers from 1 to 1000.

class Main {
  public static void main(String[] args) {
      
    int sum = 0;
    int n = 1000;

    // for loop
    for (int i = n; i >= 1; --i) {
      // body inside for loop
      sum += i;     // sum = sum + i
    }
       
    System.out.println("Sum = " + sum);
  }
}
Run Code
The output of this program is the same as the Example 3.

Java for-each Loop
The Java for loop has an alternative syntax that makes it easy to iterate through arrays and collections. For example,

// print array elements 

class Main {
  public static void main(String[] args) {
      
    // create an array
    int[] numbers = {3, 7, 5, -5};
    
    // iterating through the array 
    for (int number: numbers) {
       System.out.println(number);
    }
  }
}
Run Code
Output

3
7
5
-5
Here, we have used the for-each loop to print each element of the numbers array one by one.

In the first iteration of the loop, number will be 3, number will be 7 in second iteration and so on.

To learn more, visit Java for-each Loop.

###### Java Infinite for Loop
If we set the test expression in such a way that it never evaluates to false, the for loop will run forever. This is called infinite for loop. For example,

// Infinite for Loop

class Infinite {
    public static void main(String[] args) {
      
        int sum = 0;

        for (int i = 1; i <= 10; --i) {
            System.out.println("Hello");
        }
    }
}
Run Code
Here, the test expression ,i <= 10, is never false and Hello is printed repeatedly until the memory runs out.



Java for-each Loop
In this tutorial, we will learn about the Java for-each loop and its difference with for loop with the help of examples.

In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList). It is also known as the enhanced for loop.

for-each Loop Sytnax
The syntax of the Java for-each loop is:

for(dataType item : array) {
    ...
}
Here,

array - an array or a collection
item - each item of array/collection is assigned to this variable
dataType - the data type of the array/collection
Example 1: 
Print Array Elements
// print array elements 

class Main {
  public static void main(String[] args) {
      
    // create an array
    int[] numbers = {3, 9, 5, -5};
    
    // for each loop 
    for (int number: numbers) {
      System.out.println(number);
    }
  }
}
Run Code
Output

3
9
5
-5
Here, we have used the for-each loop to print each element of the numbers array one by one.

In the first iteration, item will be 3.
In the second iteration, item will be 9.
In the third iteration, item will be 5.
In the fourth iteration, item will be -5.
Example 2: 
Sum of Array Elements
// Calculate the sum of all elements of an array

class Main {
 public static void main(String[] args) {
  
   // an array of numbers
   int[] numbers = {3, 4, 5, -5, 0, 12};
   int sum = 0;

   // iterating through each element of the array 
   for (int number: numbers) {
     sum += number;
   }
  
   System.out.println("Sum = " + sum);
 }
}
Run Code
Output:

Sum = 19

In the above program, the execution of the for each loop looks as:

Iteration	Variables
1	number = 3
sum = 0 + 3 = 3
2	number = 4
sum = 3 + 4 = 7
3	number = 5
sum = 7 + 5 = 12
4	number = -5
sum = 12 + (-5) = 7
5	number = 0
sum = 7 + 0 = 7
6	number = 12
sum = 7 + 12 = 19
As we can see, we have added each element of the numbers array to the sum variable in each iteration of the loop.

for loop Vs for-each loop
Let's see how a for-each loop is different from a regular Java for loop.

##### 1. Using for loop
class Main {
 public static void main(String[] args) {
    
   char[] vowels = {'a', 'e', 'i', 'o', 'u'};

   // iterating through an array using a for loop
   for (int i = 0; i < vowels.length; ++ i) {
     System.out.println(vowels[i]);
   }
 }
}
Run Code
Output:

a
e
i
o
u
##### 2. Using for-each Loop
class Main {
 public static void main(String[] args) {

   char[] vowels = {'a', 'e', 'i', 'o', 'u'};
  
   // iterating through an array using the for-each loop
   for (char item: vowels) {
     System.out.println(item);
   }
 }
}
Run Code
Output:

a
e
i
o
u
Here, the output of both programs is the same. However, the for-each loop is easier to write and understand.

This is why the for-each loop is preferred over the for loop when working with arrays and collections.





##### Java while and do...while Loop
In this tutorial, we will learn how to use while and do while loop in Java with the help of examples.

In computer programming, loops are used to repeat a block of code. For example, if you want to show a message 100 times, then you can use a loop. It's just a simple example; you can achieve much more with loops.

In the previous tutorial, you learned about Java for loop. Here, you are going to learn about while and do...while loops.

###### Java while loop
Java while loop is used to run a specific code until a certain condition is met. The syntax of the while loop is:

while (testExpression) {
    // body of loop
}
Here,

A while loop evaluates the textExpression inside the parenthesis ().
If the textExpression evaluates to true, the code inside the while loop is executed.
The textExpression is evaluated again.
This process continues until the textExpression is false.
When the textExpression evaluates to false, the loop stops.
To learn more about the conditions, visit Java relational and logical operators.

Flowchart of while loop
Flowchart of while loop in Java
Flowchart of Java while loop
Example 1: 
Display Numbers from 1 to 5
// Program to display numbers from 1 to 5

class Main {
  public static void main(String[] args) {

    // declare variables
    int i = 1, n = 5;

    // while loop from 1 to 5
    while(i <= n) {
      System.out.println(i);
      i++;
    }
  }
}
Run Code
Output

1
2
3
4
5
Here is how this program works.

Iteration	Variable	Condition: i <= n	Action
1st	i = 1
n = 5	true	1 is printed.
i is increased to 2.
2nd	i = 2
n = 5	true	2 is printed.
i is increased to 3.
3rd	i = 3
n = 5	true	3 is printed.
i is increased to 4.
4th	i = 4
n = 5	true	4 is printed.
i is increased to 5.
5th	i = 5
n = 5	true	5 is printed.
i is increased to 6.
6th	i = 6
n = 5	false	The loop is terminated
Example 2: 
Sum of Positive Numbers Only
// Java program to find the sum of positive numbers
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      
    int sum = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // take integer input from the user
    System.out.println("Enter a number");
    int number = input.nextInt();
	   
    // while loop continues 
    // until entered number is positive
    while (number >= 0) {
      // add only positive numbers
      sum += number;

      System.out.println("Enter a number");
      number = input.nextInt();
    }
	   
    System.out.println("Sum = " + sum);
    input.close();
  }
}
Run Code
Output

Enter a number
25
Enter a number
9
Enter a number
5
Enter a number
-3
Sum = 39
In the above program, we have used the Scanner class to take input from the user. Here, nextInt() takes integer input from the user.

The while loop continues until the user enters a negative number. During each iteration, the number entered by the user is added to the sum variable.

When the user enters a negative number, the loop terminates. Finally, the total sum is displayed.

Java do...while loop
The do...while loop is similar to while loop. However, the body of do...while loop is executed once before the test expression is checked. For example,

do {
    // body of loop
} while(textExpression);
Here,

The body of the loop is executed at first. Then the textExpression is evaluated.
If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
The textExpression is evaluated once again.
If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
This process continues until the textExpression evaluates to false. Then the loop stops.
Flowchart of do...while loop
Flowchart of do...while loop in Java
Flowchart of Java do while loop

Let's see the working of do...while loop.

Example 3: 
Display Numbers from 1 to 5
// Java Program to display numbers from 1 to 5

import java.util.Scanner;

// Program to find the sum of natural numbers from 1 to 100.

class Main {
  public static void main(String[] args) {

    int i = 1, n = 5;

    // do...while loop from 1 to 5
    do {
      System.out.println(i);
      i++;
    } while(i <= n);
  }
}
Run Code
Output

1
2
3
4
5
Here is how this program works.

Iteration	Variable	Condition: i <= n	Action
 	i = 1
n = 5	not checked	1 is printed.
i is increased to 2.
1st	i = 2
n = 5	true	2 is printed.
i is increased to 3.
2nd	i = 3
n = 5	true	3 is printed.
i is increased to 4.
3rd	i = 4
n = 5	true	4 is printed.
i is increased to 5.
4th	i = 5
n = 5	true	6 is printed.
i is increased to 6.
5th	i = 6
n = 5	false	The loop is terminated
Example 4: 
Sum of Positive Numbers
// Java program to find the sum of positive numbers
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      
    int sum = 0;
    int number = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);
	   
    // do...while loop continues 
    // until entered number is positive
    do {
      // add only positive numbers
      sum += number;
      System.out.println("Enter a number");
      number = input.nextInt();
    } while(number >= 0); 
	   
    System.out.println("Sum = " + sum);
    input.close();
  }
}
Run Code
Output 1

Enter a number
25
Enter a number
9
Enter a number
5
Enter a number
-3
Sum = 39
Here, the user enters a positive number, that number is added to the sum variable. And this process continues until the number is negative. When the number is negative, the loop terminates and displays the sum without adding the negative number.

Output 2

Enter a number
-8
Sum is 0
Here, the user enters a negative number. The test condition will be false but the code inside of the loop executes once.

###### Infinite while loop
If the condition of a loop is always true, the loop runs for infinite times (until the memory is full). For example,

// infinite while loop
while(true){
    // body of loop
}
Here is an example of an infinite do...while loop.

// infinite do...while loop
int count = 1;
do {
   // body of loop
} while(count == 1)
In the above programs, the textExpression is always true. Hence, the loop body will run for infinite times.

for and while loops
The for loop is used when the number of iterations is known. For example,

for (let i = 1; i <=5; ++i) {
   // body of loop
}
And while and do...while loops are generally used when the number of iterations is unknown. For example,

while (condition) {
    // body of loop
}




##### Java break Statement
In this tutorial, you will learn about the break statement, labeled break statement in Java with the help of examples.

While working with loops, it is sometimes desirable to skip some statements inside the loop or terminate the loop immediately without checking the test expression.

In such cases, break and continue statements are used. You will learn about the Java continue statement in the next tutorial.

The break statement in Java terminates the loop immediately, and the control of the program moves to the next statement following the loop.

It is almost always used with decision-making statements (Java if...else Statement).

Here is the syntax of the break statement in Java:

break;
How break statement works?
How break statement works in Java programming?
Working of Java break Statement
Example 1: 
Java break statement
class Test {
    public static void main(String[] args) {
      
        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates  
            if (i == 5) {
                break;
            }      
            System.out.println(i);
        }   
    }
}
Run Code
Output:

1
2
3
4
In the above program, we are using the for loop to print the value of i in each iteration. To know how for loop works, visit the Java for loop. Here, notice the statement,

if (i == 5) {
    break;
}
This means when the value of i is equal to 5, the loop terminates. Hence we get the output with values less than 5 only.

Example 2: 
Java break statement
The program below calculates the sum of numbers entered by the user until user enters a negative number.

To take input from the user, we have used the Scanner object. To learn more about Scanner, visit Java Scanner.

import java.util.Scanner;

class UserInputSum {
    public static void main(String[] args) {
      
        Double number, sum = 0.0;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);
      
        while (true) {
            System.out.print("Enter a number: ");

            // takes double input from user
            number = input.nextDouble();
         
            // if number is negative the loop terminates
            if (number < 0.0) {
                break;
            }
         
           sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}
Run Code
Output:

Enter a number: 3.2
Enter a number: 5
Enter a number: 2.3
Enter a number: 0
Enter a number: -4.5
Sum = 10.5
In the above program, the test expression of the while loop is always true. Here, notice the line,

if (number < 0.0) {
    break;
}
This means when the user input negative numbers, the while loop is terminated.

Java break and Nested Loop

In the case of nested loops, the break statement terminates the innermost loop.

The break statement terminates the innermost while loop in case of nested loops.
Working of break Statement with Nested Loops
Here, the break statement terminates the innermost while loop, and control jumps to the outer loop.

###### Labeled break Statement
Till now, we have used the unlabeled break statement. It terminates the innermost loop and switch statement. However, there is another form of break statement in Java known as the labeled break.

We can use the labeled break statement to terminate the outermost loop as well.

The labeled break statement is used to break the outermost loop.
Working of the labeled break statement in Java
As you can see in the above image, we have used the label identifier to specify the outer loop. Now, notice how the break statement is used (break label;).

Here, the break statement is terminating the labeled statement (i.e. outer loop). Then, the control of the program jumps to the statement after the labeled statement.

Here's another example:

while (testExpression) {
   // codes
   second:
   while (testExpression) {
      // codes
      while(testExpression) {
         // codes
         break second;
      }
   }
   // control jumps here
}
In the above example, when the statement break second; is executed, the while loop labeled as second is terminated. And, the control of the program moves to the statement after the second while loop.

Example 3: 
labeled break Statement
class LabeledBreak {
    public static void main(String[] args) {
   
        // the for loop is labeled as first   
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);
             
                // the break statement breaks the first for loop
                if ( i == 2)
                    break first;
            }
        }
    }
}
Run Code
Output:

i = 1; j = 1
i = 1; j = 2
i = 2; j = 1
In the above example, the labeled break statement is used to terminate the loop labeled as first. That is,

first:
for(int i = 1; i < 5; i++) {...}
Here, if we change the statement break first; to break second; the program will behave differently. In this case, for loop labeled as second will be terminated. For example,

class LabeledBreak {
    public static void main(String[] args) {
      
        // the for loop is labeled as first
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {

                System.out.println("i = " + i + "; j = " +j);
       
                // the break statement terminates the loop labeled as second   
                if ( i == 2)
                    break second;
            }
        }
    }
}
Run Code
Output:

i = 1; j = 1
i = 1; j = 2
i = 2; j = 1
i = 3; j = 1
i = 3; j = 2
i = 4; j = 1
i = 4; j = 2
Note: The break statement is also used to terminate cases inside the switch statement. To learn more, visit the Java switch statement.



##### Java continue Statement
In this tutorial, you will learn about the continue statement and labeled continue statement in Java with the help of examples.

While working with loops, sometimes you might want to skip some statements or terminate the loop. In such cases, break and continue statements are used.

To learn about the break statement, visit Java break. Here, we will learn about the continue statement.

Java continue
The continue statement skips the current iteration of a loop (for, while, do...while, etc).

After the continue statement, the program moves to the end of the loop. And, test expression is evaluated (update statement is evaluated in case of the for loop).

Here's the syntax of the continue statement.

continue;
Note: The continue statement is almost always used in decision-making statements (if...else Statement).

Working of Java continue statement
The working of continue statement with Java while, do...while, and for loop.
Working of Java continue Statement
Example 1: 
Java continue statement
class Main {
  public static void main(String[] args) {

    // for loop
    for (int i = 1; i <= 10; ++i) {

      // if value of i is between 4 and 9
      // continue is executed
      if (i > 4 && i < 9) {
        continue;
      }
      System.out.println(i);
    }
  }
}
Run Code
Output:

1
2
3
4
9
10
In the above program, we are using the for loop to print the value of i in each iteration. To know how for loop works, visit Java for loop. Notice the statement,

if (i > 4 && i < 9) {
    continue;
}
Here, the continue statement is executed when the value of i becomes more than 4 and less than 9.

It then skips the print statement for those values. Hence, the output skips the values 5, 6, 7, and 8.

Example 2: 
Compute the sum of 5 positive numbers
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Double number, sum = 0.0;
    // create an object of Scanner
    Scanner input = new Scanner(System.in);

    for (int i = 1; i < 6; ++i) {
      System.out.print("Enter number " + i + " : ");
      // takes input from the user
      number = input.nextDouble();

      // if number is negative
      // continue statement is executed
      if (number <= 0.0) {
        continue;
      }

      sum += number;
    }
    System.out.println("Sum = " + sum);
    input.close();
  }
}
Run Code
Output:

Enter number 1: 2.2
Enter number 2: 5.6
Enter number 3: 0
Enter number 4: -2.4
Enter number 5: -3
Sum = 7.8
In the above example, we have used the for loop to print the sum of 5 positive numbers. Notice the line,

if (number < 0.0) {
    continue;
}
Here, when the user enters a negative number, the continue statement is executed. This skips the current iteration of the loop and takes the program control to the update expression of the loop.

Note: To take input from the user, we have used the Scanner object. To learn more, visit Java Scanner.

##### Java continue with Nested Loop
In the case of nested loops in Java, the continue statement skips the current iteration of the innermost loop.

The continue statement skips the innermost loop while working with the nested loop in Java. 
Working of Java continue statement with Nested Loops
Example 3: 
continue with Nested Loop
class Main {
  public static void main(String[] args) {

    int i = 1, j = 1;

    // outer loop
    while (i <= 3) {

      System.out.println("Outer Loop: " + i);

      // inner loop
      while(j <= 3) {

        if(j == 2) {
          j++;
          continue;
        }

        System.out.println("Inner Loop: " + j);
        j++;
      }
      i++;
    }
  }
}
Run Code

Output

Outer Loop: 1
Inner Loop: 1
Inner Loop: 3
Outer Loop: 2
Outer Loop: 3
In the above example, we have used the nested while loop. Note that we have used the continue statement inside the inner loop.

if(j == 2) {
  j++;
  continue:
}
Here, when the value of j is 2, the value of j is increased and the continue statement is executed.

This skips the iteration of the inner loop. Hence, the text Inner Loop: 2 is skipped from the output.

Labeled continue Statement
Till now, we have used the unlabeled continue statement. However, there is another form of continue statement in Java known as labeled continue.

It includes the label of the loop along with the continue keyword. For example,

###### continue label;
Here, the continue statement skips the current iteration of the loop specified by label.

The labeled continue statement skips the current iteration of the loop specified by the label.
Working of the Java labeled continue Statement
We can see that the label identifier specifies the outer loop. Notice the use of the continue inside the inner loop.

Here, the continue statement is skipping the current iteration of the labeled statement (i.e. outer loop). Then, the program control goes to the next iteration of the labeled statement.

Example 4: 
labeled continue Statement
class Main {
  public static void main(String[] args) {

    // outer loop is labeled as first
    first:
    for (int i = 1; i < 6; ++i) {

      // inner loop
      for (int j = 1; j < 5; ++j) {
        if (i == 3 || j == 2)

          // skips the current iteration of outer loop
          continue first;
        System.out.println("i = " + i + "; j = " + j);
      }
    }
  }
}
Run Code
Output:

i = 1; j = 1
i = 2; j = 1
i = 4; j = 1
i = 5; j = 1
In the above example, the labeled continue statement is used to skip the current iteration of the loop labeled as first.

if (i==3 || j==2)
    continue first;
Here, we can see the outermost for loop is labeled as first,

first:
for (int i = 1; i < 6; ++i) {..}
Hence, the iteration of the outer for loop is skipped if the value of i is 3 or the value of j is 2.

Note: The use of labeled continue is often discouraged as it makes your code hard to understand. If you are in a situation where you have to use labeled continue, refactor your code and try to solve it in a different way to make it more readable.




### Java Arrays
In this tutorial, we will learn to work with arrays in Java. We will learn to declare, initialize, and access array elements with the help of examples.

An array is a collection of similar types of data.

For example, if we want to store the names of 100 people then we can create an array of the string type that can store 100 names.

String[] array = new String[100];
Here, the above array cannot store more than 100 names. The number of values in a Java array is always fixed.

How to declare an array in Java?
In Java, here is how we can declare an array.

dataType[] arrayName;
dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
arrayName - it is an identifier
For example,

double[] data;
Here, data is an array that can hold values of type double.

But, how many elements can array this hold?

Good question! To define the number of elements that an array can hold, we have to allocate memory for the array in Java. For example,

// declare an array
double[] data;

// allocate memory
data = new double[10];
Here, the array can store 10 elements. We can also say that the size or length of the array is 10.

In Java, we can declare and allocate the memory of an array in one single statement. For example,

double[] data = new double[10];
How to Initialize Arrays in Java?
In Java, we can initialize arrays during declaration. For example,

//declare and initialize and array
int[] age = {12, 4, 5, 2, 5};
Here, we have created an array named age and initialized it with the values inside the curly brackets.

Note that we have not provided the size of the array. In this case, the Java compiler automatically specifies the size by counting the number of elements in the array (i.e. 5).

In the Java array, each memory location is associated with a number. The number is known as an array index. We can also initialize arrays in Java, using the index number. For example,

// declare an array
int[] age = new int[5];

// initialize array
age[0] = 12;
age[1] = 4;
age[2] = 5;
..
Elements are stored in the array
Java Arrays initialization
Note:

Array indices always start from 0. That is, the first element of an array is at index 0.
If the size of an array is n, then the last element of the array will be at index n-1.
How to Access Elements of an Array in Java?
We can access the element of an array using the index number. Here is the syntax for accessing elements of an array,

// access array elements
array[index]
Let's see an example of accessing array elements using index numbers.

Example: 
Access Array Elements
class Main {
 public static void main(String[] args) {
  
   // create an array
   int[] age = {12, 4, 5, 2, 5};

   // access each array elements
   System.out.println("Accessing Elements of Array:");
   System.out.println("First Element: " + age[0]);
   System.out.println("Second Element: " + age[1]);
   System.out.println("Third Element: " + age[2]);
   System.out.println("Fourth Element: " + age[3]);
   System.out.println("Fifth Element: " + age[4]);
 }
}
Run Code
Output

##### Accessing Elements of Array:
First Element: 12
Second Element: 4
Third Element: 5
Fourth Element: 2
Fifth Element: 5

In the above example, notice that we are using the index number to access each element of the array.

We can use loops to access all the elements of the array at once.

##### Looping Through Array Elements
In Java, we can also loop through each element of the array. For example,

Example: 
Using For Loop
class Main {
 public static void main(String[] args) {
  
   // create an array
   int[] age = {12, 4, 5};

   // loop through the array
   // using for loop
   System.out.println("Using for Loop:");
   for(int i = 0; i < age.length; i++) {
     System.out.println(age[i]);
   }
 }
}
Run Code
Output

Using for Loop:
12
4
5
In the above example, we are using the for Loop in Java to iterate through each element of the array. Notice the expression inside the loop,

age.length
Here, we are using the length property of the array to get the size of the array.

We can also use the for-each loop to iterate through the elements of an array. For example,

Example: 
Using the for-each Loop
class Main {
 public static void main(String[] args) {
  
   // create an array
   int[] age = {12, 4, 5};

   // loop through the array
   // using for loop
   System.out.println("Using for-each Loop:");
   for(int a : age) {
     System.out.println(a);
   }
 }
}
Run Code
Output

Using for-each Loop:
12
4
5
Example: 
Compute Sum and Average of Array Elements
class Main {
 public static void main(String[] args) {

   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
   int sum = 0;
   Double average;
   
   // access all elements using for each loop
   // add each element in sum
   for (int number: numbers) {
     sum += number;
   }
  
   // get the total number of elements
   int arrayLength = numbers.length;

   // calculate the average
   // convert the average from int to double
   average =  ((double)sum / (double)arrayLength);

   System.out.println("Sum = " + sum);
   System.out.println("Average = " + average);
 }
}
Run Code
Output:

Sum = 36
Average = 3.6
In the above example, we have created an array of named numbers. We have used the for...each loop to access each element of the array.

Inside the loop, we are calculating the sum of each element. Notice the line,

int arrayLength = number.length;
Here, we are using the length attribute of the array to calculate the size of the array. We then calculate the average using:

average = ((double)sum / (double)arrayLength);
As you can see, we are converting the int value into double. This is called type casting in Java. To learn more about typecasting, visit Java Type Casting.

#### Multidimensional Arrays
Arrays we have mentioned till now are called one-dimensional arrays. However, we can declare multidimensional arrays in Java.

A multidimensional array is an array of arrays. That is, each element of a multidimensional array is an array itself. For example,

double[][] matrix = {{1.2, 4.3, 4.0}, 
      {4.1, -1.1}
};
Here, we have created a multidimensional array named matrix. It is a 2-dimensional array. To learn more, visit the Java multidimensional array.

Recommended Readings
Java Copy Array
Java Program to Print an Array
Java Program to Concatenate two Arrays
Java ArrayList to Array and Array to ArrayList
Java Dynamic Array




### Java Multidimensional Arrays
In this tutorial, we will learn about the Java multidimensional array using 2-dimensional arrays and 3-dimensional arrays with the help of examples.

Before we learn about the multidimensional array, make sure you know about Java array.

A multidimensional array is an array of arrays. Each element of a multidimensional array is an array itself. For example,

int[][] a = new int[3][4];
Here, we have created a multidimensional array named a. It is a 2-dimensional array, that can hold a maximum of 12 elements,

2-dimensional array in Java
2-dimensional Array
Remember, Java uses zero-based indexing, that is, indexing of arrays in Java starts with 0 and not 1.

Let's take another example of the multidimensional array. This time we will be creating a 3-dimensional array. For example,

String[][][] data = new String[3][4][2];
Here, data is a 3d array that can hold a maximum of 24 (3*4*2) elements of type String.

How to initialize a 2d array in Java?
Here is how we can initialize a 2-dimensional array in Java.

int[][] a = {
      {1, 2, 3}, 
      {4, 5, 6, 9}, 
      {7}, 
};
As we can see, each element of the multidimensional array is an array itself. And also, unlike C/C++, each row of the multidimensional array in Java can be of different lengths.

2d array example in Java with variable length
Initialization of 2-dimensional Array
Example: 
2-dimensional Array
class MultidimensionalArray {
    public static void main(String[] args) {

        // create a 2d array
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
}
Run Code
Output:

Length of row 1: 3
Length of row 2: 4
Length of row 3: 1
In the above example, we are creating a multidimensional array named a. Since each component of a multidimensional array is also an array (a[0], a[1] and a[2] are also arrays).


Here, we are using the length attribute to calculate the length of each row.

Example: 
Print all elements of 2d array Using Loop
class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
    }
}
Run Code
Output:

1
-2
3
-4
-5
6
9
7
We can also use the for...each loop to access elements of the multidimensional array. For example,

class MultidimensionalArray {
    public static void main(String[] args) {

        // create a 2d array
        int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }
    }
}
Run Code
Output:

1
-2
3
-4
-5
6
9
7
In the above example, we are have created a 2d array named a. We then used for loop and for...each loop to access each element of the array.

How to initialize a 3d array in Java?
Let's see how we can use a 3d array in Java. We can initialize a 3d array similar to the 2d array. For example,

// test is a 3d array
int[][][] test = {
        {
          {1, -2, 3}, 
          {2, 3, 4}
        }, 
        { 
          {-4, -5, 6, 9}, 
          {1}, 
          {2, 3}
        } 
};
Basically, a 3d array is an array of 2d arrays. The rows of a 3d array can also vary in length just like in a 2d array.

Example: 
3-dimensional Array
class ThreeArray {
    public static void main(String[] args) {

        // create a 3d array
        int[][][] test = {
            {
              {1, -2, 3}, 
              {2, 3, 4}
            }, 
            { 
              {-4, -5, 6, 9}, 
              {1}, 
              {2, 3}
            } 
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}
Run Code
Output:

1
-2
3
2
3
4
-4
-5
6
9
1
2
3





### Java Copy Arrays
In this tutorial, you will learn about different ways you can use to copy arrays (both one dimensional and two-dimensional) in Java with the help of examples.

In Java, we can copy one array into another. There are several techniques you can use to copy arrays in Java.

##### 1. Copying Arrays Using Assignment Operator
Let's take an example,

class Main {
    public static void main(String[] args) {
       
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
    }
}
Run Code
Output:

1, 2, 3, 4, 5, 6
In the above example, we have used the assignment operator (=) to copy an array named numbers to another array named positiveNumbers.

This technique is the easiest one and it works as well. However, there is a problem with this technique. If we change elements of one array, corresponding elements of the other arrays also change. For example,

class Main {
    public static void main(String[] args) {
      
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays
      
        // change value of first array
        numbers[0] = -1;

        // printing the second array
        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
    }
}
Run Code
Output:

-1, 2, 3, 4, 5, 6
Here, we can see that we have changed one value of the numbers array. When we print the positiveNumbers array, we can see that the same value is also changed.

It's because both arrays refer to the same array object. This is because of the shallow copy. To learn more about shallow copy, visit shallow copy.

Now, to make new array objects while copying the arrays, we need deep copy rather than a shallow copy.

#### 2. Using Looping Construct to Copy Arrays
Let's take an example:

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
      
        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }
      
         // converting array to string
        System.out.println(Arrays.toString(destination));
    }
}
Run Code
Output:

[1, 2, 3, 4, 5, 6]
In the above example, we have used the for loop to iterate through each element of the source array. In each iteration, we are copying elements from the source array to the destination array.

Here, the source and destination array refer to different objects (deep copy). Hence, if elements of one array are changed, corresponding elements of another array is unchanged.

Notice the statement,

System.out.println(Arrays.toString(destination));
Here, the toString() method is used to convert an array into a string. To learn more, visit the toString() method (official Java documentation).

#### 3. Copying Arrays Using arraycopy() method
In Java, the System class contains a method named arraycopy() to copy arrays. This method is a better approach to copy arrays than the above two.

The arraycopy() method allows you to copy a specified portion of the source array to the destination array. For example,

arraycopy(Object src, int srcPos,Object dest, int destPos, int length)

Here,

src - source array you want to copy
srcPos - starting position (index) in the source array
dest - destination array where elements will be copied from the source
destPos - starting position (index) in the destination array
length - number of elements to copy
Let's take an example:

// To use Arrays.toString() method
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] n1 = {2, 3, 12, 4, 12, -2};
      
        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
      
        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));  
      
        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));  
    }
}
Run Code
Output:

n2 = [2, 3, 12, 4, 12, -2]
n3 = [0, 12, 4, 0, 0]
In the above example, we have used the arraycopy() method,

System.arraycopy(n1, 0, n2, 0, n1.length) - entire elements from the n1 array are copied to n2 array
System.arraycopy(n1, 2, n3, 1, 2) - 2 elements of the n1 array starting from index 2 are copied to the index starting from 1 of the n3 array
As you can see, the default initial value of elements of an int type array is 0.

#### 4. Copying Arrays Using copyOfRange() method
We can also use the copyOfRange() method defined in Java Arrays class to copy arrays. For example,

// To use toString() and copyOfRange() method
import java.util.Arrays;

class ArraysCopy {
    public static void main(String[] args) {
      
        int[] source = {2, 3, 12, 4, 12, -2};
      
        // copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);      
        System.out.println("destination1 = " + Arrays.toString(destination1)); 
      
        // copying from index 2 to 5 (5 is not included) 
        int[] destination2 = Arrays.copyOfRange(source, 2, 5); 
        System.out.println("destination2 = " + Arrays.toString(destination2));   
    }
}
Run Code
Output

destination1 = [2, 3, 12, 4, 12, -2]
destination2 = [12, 4, 12]
In the above example, notice the line,

int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
Here, we can see that we are creating the destination1 array and copying the source array to it at the same time. We are not creating the destination1 array before calling the copyOfRange() method. To learn more about the method, visit Java copyOfRange.

#### 5. Copying 2d Arrays Using Loop
Similar to the single-dimensional array, we can also copy the 2-dimensional array using the for loop. For example,

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
      
        int[][] source = {
              {1, 2, 3, 4}, 
              {5, 6},
              {0, 2, 42, -4, 5}
              };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < destination.length; ++i) {

            // allocating space for each row of destination array
            destination[i] = new int[source[i].length];

            for (int j = 0; j < destination[i].length; ++j) {
                destination[i][j] = source[i][j];
            }
        }
     
        // displaying destination array
        System.out.println(Arrays.deepToString(destination));  
      
    }
}
Run Code
Output:

[[1, 2, 3, 4], [5, 6], [0, 2, 42, -4, 5]]
In the above program, notice the line,

System.out.println(Arrays.deepToString(destination);
Here, the deepToString() method is used to provide a better representation of the 2-dimensional array. To learn more, visit Java deepToString().

Copying 2d Arrays using arraycopy()
To make the above code more simpler, we can replace the inner loop with System.arraycopy() as in the case of a single-dimensional array. For example,

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
      
        int[][] source = {
              {1, 2, 3, 4}, 
              {5, 6},
              {0, 2, 42, -4, 5}
              };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < source.length; ++i) {

             // allocating space for each row of destination array
             destination[i] = new int[source[i].length];
             System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
        }
     
        // displaying destination array
        System.out.println(Arrays.deepToString(destination));      
    }
}
Run Code
Output:

[[1, 2, 3, 4], [5, 6], [0, 2, 42, -4, 5]]
Here, we can see that we get the same output by replacing the inner for loop with the arraycopy() method.




### Java Class and Objects
In this tutorial, you will learn about the concept of classes and objects in Java with the help of examples.

Java is an object-oriented programming language. The core concept of the object-oriented approach is to break complex problems into smaller objects.

An object is any entity that has a state and behavior. For example, a bicycle is an object. It has

States: idle, first gear, etc
Behaviors: braking, accelerating, etc.
Before we learn about objects, let's first know about classes in Java.

#### Java Class
A class is a blueprint for the object. Before we create an object, we first need to define the class.

We can think of the class as a sketch (prototype) of a house. It contains all the details about the floors, doors, windows, etc. Based on these descriptions we build the house. House is the object.

Since many houses can be made from the same description, we can create many objects from a class.

Create a class in Java
We can create a class in Java using the class keyword. For example,

class ClassName {
  // fields
  // methods
}
Here, fields (variables) and methods represent the state and behavior of the object respectively.

fields are used to store data
methods are used to perform some operations
For our bicycle object, we can create the class as

class Bicycle {

  // state or field
  private int gear = 5;

  // behavior or method
  public void braking() {
    System.out.println("Working of Braking");
  }
}
In the above example, we have created a class named Bicycle. It contains a field named gear and a method named braking().

Here, Bicycle is a prototype. Now, we can create any number of bicycles using the prototype. And, all the bicycles will share the fields and methods of the prototype.

Note: We have used keywords private and public. These are known as access modifiers. To learn more, visit Java access modifiers.

#### Java Objects
An object is called an instance of a class. For example, suppose Bicycle is a class then MountainBicycle, SportsBicycle, TouringBicycle, etc can be considered as objects of the class.

Creating an Object in Java
Here is how we can create an object of a class.

className object = new className();

// for Bicycle class
Bicycle sportsBicycle = new Bicycle();

Bicycle touringBicycle = new Bicycle();
We have used the new keyword along with the constructor of the class to create an object. Constructors are similar to methods and have the same name as the class. For example, Bicycle() is the constructor of the Bicycle class. To learn more, visit Java Constructors.


Here, sportsBicycle and touringBicycle are the names of objects. We can use them to access fields and methods of the class.

As you can see, we have created two objects of the class. We can create multiple objects of a single class in Java.

Note: Fields and methods of a class are also called members of the class.

Access Members of a Class
We can use the name of objects along with the . operator to access members of a class. For example,

class Bicycle {

  // field of class
  int gear = 5;

  // method of class
  void braking() {
    ...
  }
}

// create object
Bicycle sportsBicycle = new Bicycle();

// access field and method
sportsBicycle.gear;
sportsBicycle.braking();
In the above example, we have created a class named Bicycle. It includes a field named gear and a method named braking(). Notice the statement,

Bicycle sportsBicycle = new Bicycle();
Here, we have created an object of Bicycle named sportsBicycle. We then use the object to access the field and method of the class.

sportsBicycle.gear - access the field gear
sportsBicycle.braking() - access the method braking()
We have mentioned the word method quite a few times. You will learn about Java methods in detail in the next chapter.

Now that we understand what is class and object. Let's see a fully working example.

Example: 
Java Class and Objects
class Lamp {
  
  // stores the value for light
  // true if light is on
  // false if light is off
  boolean isOn;

  // method to turn on the light
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);

  }

  // method to turnoff the light
  void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
  }
}

class Main {
  public static void main(String[] args) {

    // create objects led and halogen
    Lamp led = new Lamp();
    Lamp halogen = new Lamp();

    // turn on the light by
    // calling method turnOn()
    led.turnOn();

    // turn off the light by
    // calling method turnOff()
    halogen.turnOff();
  }
}
Run Code
Output:

Light on? true
Light on? false
In the above program, we have created a class named Lamp. It contains a variable: isOn and two methods: turnOn() and turnOff().

Inside the Main class, we have created two objects: led and halogen of the Lamp class. We then used the objects to call the methods of the class.

led.turnOn() - It sets the isOn variable to true and prints the output.
halogen.turnOff() - It sets the isOn variable to false and prints the output.
The variable isOn defined inside the class is also called an instance variable. It is because when we create an object of the class, it is called an instance of the class. And, each instance will have its own copy of the variable.

That is, led and halogen objects will have their own copy of the isOn variable.

Example: Create objects inside the same class
Note that in the previous example, we have created objects inside another class and accessed the members from that class.

However, we can also create objects inside the same class.

class Lamp {
  
  // stores the value for light
  // true if light is on
  // false if light is off
  boolean isOn;

  // method to turn on the light
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);

  }

  public static void main(String[] args) {
    
    // create an object of Lamp
    Lamp led = new Lamp();

    // access method using object
    led.turnOn();
  }
}
Run Code
Output

Light on? true
Here, we are creating the object inside the main() method of the same class.





### Java Methods
In this tutorial, we will learn about Java methods, how to define methods, and how to use methods in Java programs with the help of examples.

Java Methods
A method is a block of code that performs a specific task.

Suppose you need to create a program to create a circle and color it. You can create two methods to solve this problem:

a method to draw the circle
a method to color the circle
Dividing a complex problem into smaller chunks makes your program easy to understand and reusable.

In Java, there are two types of methods:

###### User-defined Methods: We can create our own method based on our requirements.
###### Standard Library Methods: These are built-in methods in Java that are available to use.
Let's first learn about user-defined methods.

Declaring a Java Method
The syntax to declare a method is:

returnType methodName() {
  // method body
}
Here,

returnType - It specifies what type of value a method returns For example if a method has an int return type then it returns an integer value.

If the method does not return a value, its return type is void.
methodName - It is an identifier that is used to refer to the particular method in a program.
method body - It includes the programming statements that are used to perform some tasks. The method body is enclosed inside the curly braces { }.
For example,

int addNumbers() {
// code
}
In the above example, the name of the method is adddNumbers(). And, the return type is int. We will learn more about return types later in this tutorial.

This is the simple syntax of declaring a method. However, the complete syntax of declaring a method is

modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
  // method body
}
Here,

modifier - It defines access types whether the method is public, private, and so on. To learn more, visit Java Access Specifier.
static - If we use the static keyword, it can be accessed without creating objects.

For example, the sqrt() method of standard Math class is static. Hence, we can directly call Math.sqrt() without creating an instance of Math class.
parameter1/parameter2 - These are values passed to a method. We can pass any number of arguments to a method.
Calling a Method in Java
In the above example, we have declared a method named addNumbers(). Now, to use the method, we need to call it.

Here's is how we can call the addNumbers() method.

// calls the method
addNumbers();
Call a method in Java using the name the method followed by a parenthesis
Working of Java Method Call
Example 1: 
Java Methods
class Main {

  // create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }

  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }
}
Run Code
Output

Sum is: 40
In the above example, we have created a method named addNumbers(). The method takes two parameters a and b. Notice the line,

int result = obj.addNumbers(num1, num2);
Here, we have called the method by passing two arguments num1 and num2. Since the method is returning some value, we have stored the value in the result variable.

Note: The method is not static. Hence, we are calling the method using the object of the class.

##### Java Method Return Type
A Java method may or may not return a value to the function call. We use the return statement to return any value. For example,

int addNumbers() {
...
return sum;
}
Here, we are returning the variable sum. Since the return type of the function is int. The sum variable should be of int type. Otherwise, it will generate an error.

Example 2: 
Method Return Type
class Main {

// create a method
  public static int square(int num) {

    // return statement
    return num * num;
  }

  public static void main(String[] args) {
    int result;

    // call the method
    // store returned value to result
    result = square(10);

    System.out.println("Squared value of 10 is: " + result);
  }
}
Run Code
Output:

Squared value of 10 is: 100

In the above program, we have created a method named square(). The method takes a number as its parameter and returns the square of the number.

Here, we have mentioned the return type of the method as int. Hence, the method should always return an integer value.

Java method returns a value to the method call
Representation of the Java method returning a value
Note: If the method does not return any value, we use the void keyword as the return type of the method. For example,

public void square(int a) {
  int square = a * a;
  System.out.println("Square is: " + a);
}
Method Parameters in Java
A method parameter is a value accepted by the method. As mentioned earlier, a method can also have any number of parameters. For example,

// method with two parameters
int addNumbers(int a, int b) {
  // code
}

// method with no parameter
int addNumbers(){
  // code
}
If a method is created with parameters, we need to pass the corresponding values while calling the method. For example,

// calling the method with two parameters
addNumbers(25, 15);

// calling the method with no parameters
addNumbers()
Example 3: 
Method Parameters
class Main {

  // method with no parameter
  public void display1() {
    System.out.println("Method without parameter");
  }

  // method with single parameter
  public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }

  public static void main(String[] args) {
    
    // create an object of Main
    Main obj = new Main();

    // calling method with no parameter
    obj.display1();
    
    // calling method with the single parameter
    obj.display2(24);
  }
}
Run Code
Output

##### Method without parameter

Method with a single parameter: 24
Here, the parameter of the method is int. Hence, if we pass any other data type instead of int, the compiler will throw an error. It is because Java is a strongly typed language.

Note: The argument 24 passed to the display2() method during the method call is called the actual argument.

The parameter num accepted by the method definition is known as a formal argument. We need to specify the type of formal arguments. And, the type of actual arguments and formal arguments should always match.

##### Standard Library Methods
The standard library methods are built-in methods in Java that are readily available for use. These standard libraries come along with the Java Class Library (JCL) in a Java archive (*.jar) file with JVM and JRE.

For example,

print() is a method of java.io.PrintSteam. The print("...") method prints the string inside quotation marks.
sqrt() is a method of Math class. It returns the square root of a number.
Here's a working example:

Example 4: 
Java Standard Library Method
public class Main {
  public static void main(String[] args) {
    
    // using the sqrt() method
    System.out.print("Square root of 4 is: " + Math.sqrt(4));
  }
}
Run Code
Output:

Square root of 4 is: 2.0
To learn more about standard library methods, visit Java Library Methods.

###### What are the advantages of using methods?
1. The main advantage is code reusability. We can write a method once, and use it multiple times. We do not have to rewrite the entire code each time. Think of it as, "write once, reuse multiple times".

Example 5: 
Java Method for Code Reusability
public class Main {

  // method defined
  private static int getSquare(int x){
    return x * x;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {

      // method call
      int result = getSquare(i);
      System.out.println("Square of " + i + " is: " + result);
    }
  }
}
Run Code
Output:

Square of 1 is: 1
Square of 2 is: 4
Square of 3 is: 9
Square of 4 is: 16
Square of 5 is: 25
In the above program, we have created the method named getSquare() to calculate the square of a number. Here, the method is used to calculate the square of numbers less than 6.

Hence, the same method is used again and again.

2. Methods make code more readable and easier to debug. Here, the getSquare() method keeps the code to compute the square in a block. Hence, makes it more readable.



### Java Constructors
In this tutorial, we will learn about Java constructors, their types, and how to use them with the help of examples.

What is a Constructor?
A constructor in Java is similar to a method that is invoked when an object of the class is created.

Unlike Java methods, a constructor has the same name as that of the class and does not have any return type. For example,

class Test {
  Test() {
    // constructor body
  }
}
Here, Test() is a constructor. It has the same name as that of the class and doesn't have a return type.

Recommended Reading: Why do constructors not return values

Example 1: 
Java Constructor
class Main {
  private String name;

  // constructor
  Main() {
    System.out.println("Constructor Called:");
    name = "Programiz";
  }

  public static void main(String[] args) {

    // constructor is invoked while
    // creating an object of the Main class
    Main obj = new Main();
    System.out.println("The name is " + obj.name);
  }
}
Run Code
Output:

Constructor Called:
The name is Programiz
In the above example, we have created a constructor named Main(). Inside the constructor, we are initializing the value of the name variable.

Notice the statement of creating an object of the Main class.

Main obj = new Main();
Here, when the object is created, the Main() constructor is called. And, the value of the name variable is initialized.

Hence, the program prints the value of the name variables as Programiz.

Types of Constructor
In Java, constructors can be divided into 3 types:

No-Arg Constructor
Parameterized Constructor
Default Constructor
###### 1. Java No-Arg Constructors
Similar to methods, a Java constructor may or may not have any parameters (arguments).

If a constructor does not accept any parameters, it is known as a no-argument constructor. For example,

private Constructor() {
   // body of the constructor
}
Example 2: 
Java private no-arg constructor
class Main {

  int i;

  // constructor with no parameter
  private Main() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {

    // calling the constructor without any parameter
    Main obj = new Main();
    System.out.println("Value of i: " + obj.i);
  }
}
Run Code
Output:

Constructor is called
Value of i: 5
In the above example, we have created a constructor Main(). Here, the constructor does not accept any parameters. Hence, it is known as a no-arg constructor.

Notice that we have declared the constructor as private.

Once a constructor is declared private, it cannot be accessed from outside the class. So, creating objects from outside the class is prohibited using the private constructor.

Here, we are creating the object inside the same class. Hence, the program is able to access the constructor. To learn more, visit Java Implement Private Constructor.

However, if we want to create objects outside the class, then we need to declare the constructor as public.

Example 3: 
Java public no-arg constructors
class Company {
  String name;

  // public constructor
  public Company() {
    name = "Programiz";
  }
}

class Main {
  public static void main(String[] args) {

    // object is created in another class
    Company obj = new Company();
    System.out.println("Company name = " + obj.name);
  }
}
Run Code

Output:

Company name = Programiz
Recommended Reading: Java Access Modifier

###### 2. Java Parameterized Constructor
A Java constructor can also accept one or more parameters. Such constructors are known as parameterized constructors (constructor with parameters).

Example 4: 
Parameterized constructor
class Main {

  String languages;

  // constructor accepting single value
  Main(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    Main obj1 = new Main("Java");
    Main obj2 = new Main("Python");
    Main obj3 = new Main("C");
  }
}
Run Code
Output:

Java Programming Language
Python Programming Language
C Programming Language
In the above example, we have created a constructor named Main(). Here, the constructor takes a single parameter. Notice the expression,

Main obj1 = new Main("Java");
Here, we are passing the single value to the constructor. Based on the argument passed, the language variable is initialized inside the constructor.

###### 3. Java Default Constructor
If we do not create any constructor, the Java compiler automatically create a no-arg constructor during the execution of the program. This constructor is called default constructor.

Example 5: 
Default Constructor
class Main {

  int a;
  boolean b;

  public static void main(String[] args) {

    // A default constructor is called
    Main obj = new Main();

    System.out.println("Default Value:");
    System.out.println("a = " + obj.a);
    System.out.println("b = " + obj.b);
  }
}
Run Code
Output:

a = 0
b = false
Here, we haven't created any constructors. Hence, the Java compiler automatically creates the default constructor.

The default constructor initializes any uninitialized instance variables with default values.

Type	Default Value
boolean	false
byte	0
short	0
int	0
long	0L
char	\u0000
float	0.0f
double	0.0d
object	Reference null
In the above program, the variables a and b are initialized with default value 0 and false respectively.

The above program is equivalent to:

class Main {

  int a;
  boolean b;

   Main() {
    a = 0;
    b = false;
  }

  public static void main(String[] args) {
    // call the constructor
    Main obj = new Main();

    System.out.println("Default Value:");
    System.out.println("a = " + obj.a);
    System.out.println("b = " + obj.b);
  }
}
Run Code
The output of the program is the same as Example 5.

###### Important Notes on Java Constructors
Constructors are invoked implicitly when you instantiate objects.
The two rules for creating a constructor are:
The name of the constructor should be the same as the class.
A Java constructor must not have a return type.
If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time. The default constructor initializes instance variables with default values. For example, the int variable will be initialized to 0
Constructor types:
No-Arg Constructor - a constructor that does not accept any arguments
Parameterized constructor - a constructor that accepts arguments
Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.
A constructor cannot be abstract or static or final.
A constructor can be overloaded but can not be overridden.
Constructors Overloading in Java
Similar to Java method overloading, we can also create two or more constructors with different parameters. This is called constructors overloading.

Example 6: 
Java Constructor Overloading
class Main {

  String language;

  // constructor with no parameter
  Main() {
    this.language = "Java";
  }

  // constructor with a single parameter
  Main(String language) {
    this.language = language;
  }

  public void getName() {
    System.out.println("Programming Langauage: " + this.language);
  }

  public static void main(String[] args) {

    // call constructor with no parameter
    Main obj1 = new Main();

    // call constructor with a single parameter
    Main obj2 = new Main("Python");

    obj1.getName();
    obj2.getName();
  }
}
Run Code
Output:

Programming Language: Java
Programming Language: Python
In the above example, we have two constructors: Main() and Main(String language). Here, both the constructor initialize the value of the variable language with different values.

Based on the parameter passed during object creation, different constructors are called and different values are assigned.

It is also possible to call one constructor from another constructor. To learn more, visit Java Call One Constructor from Another.

Note: We have used this keyword to specify the variable of the class. To know more about this keyword, visit Java this keyword.




#### Java Strings
In this tutorial, we will learn about Java strings, how to create them, and various methods of the String class with the help of examples.

In Java, a string is a sequence of characters. For example, "hello" is a string containing a sequence of characters 'h', 'e', 'l', 'l', and 'o'.

We use double quotes to represent a string in Java. For example,

// create a string
String type = "Java programming";
Here, we have created a string variable named type. The variable is initialized with the string Java Programming.

Example: 
Create a String in Java
class Main {
  public static void main(String[] args) {
    
    // create strings
    String first = "Java";
    String second = "Python";
    String third = "JavaScript";

    // print strings
    System.out.println(first);   // print Java
    System.out.println(second);  // print Python
    System.out.println(third);   // print JavaScript
  }
}
Run Code
In the above example, we have created three strings named first, second, and third. Here, we are directly creating strings like primitive types.

However, there is another way of creating Java strings (using the new keyword). We will learn about that later in this tutorial.

Note: Strings in Java are not primitive types (like int, char, etc). Instead, all strings are objects of a predefined class named String.

And, all string variables are instances of the String class.

Java String Operations
Java String provides various methods to perform different operations on strings. We will look into some of the commonly used string operations.

##### 1. Get length of a String
To find the length of a string, we use the length() method of the String. For example,

class Main {
  public static void main(String[] args) {

    // create a string
    String greet = "Hello! World";
    System.out.println("String: " + greet);

    // get the length of greet
    int length = greet.length();
    System.out.println("Length: " + length);
  }
}
Run Code
Output

String: Hello! World
Length: 12
In the above example, the length() method calculates the total number of characters in the string and returns it. To learn more, visit Java String length().

##### 2. Join Two Java Strings
We can join two strings in Java using the concat() method. For example,

class Main {
  public static void main(String[] args) {

    // create first string
    String first = "Java ";
    System.out.println("First String: " + first);

    // create second
    String second = "Programming";
    System.out.println("Second String: " + second);

    // join two strings
    String joinedString = first.concat(second);
    System.out.println("Joined String: " + joinedString);
  }
}
Run Code
Output

First String: Java 
Second String: Programming     
Joined String: Java Programming
In the above example, we have created two strings named first and second. Notice the statement,

String joinedString = first.concat(second);
Here, the concat() method joins the second string to the first string and assigns it to the joinedString variable.

We can also join two strings using the + operator in Java. To learn more, visit Java String concat().

##### 3. Compare two Strings
In Java, we can make comparisons between two strings using the equals() method. For example,

class Main {
  public static void main(String[] args) {

    // create 3 strings
    String first = "java programming";
    String second = "java programming";
    String third = "python programming";

    // compare first and second strings
    boolean result1 = first.equals(second);
    System.out.println("Strings first and second are equal: " + result1);

    // compare first and third strings
    boolean result2 = first.equals(third);
    System.out.println("Strings first and third are equal: " + result2);
  }
}
Run Code
Output

Strings first and second are equal: true
Strings first and third are equal: false
In the above example, we have created 3 strings named first, second, and third. Here, we are using the equal() method to check if one string is equal to another.

The equals() method checks the content of strings while comparing them. To learn more, visit Java String equals().

Note: We can also compare two strings using the == operator in Java. However, this approach is different than the equals() method. To learn more, visit Java String == vs equals().

Escape character in Java Strings
The escape character is used to escape some of the characters present inside a string.

Suppose we need to include double quotes inside a string.

// include double quote 
String example = "This is the "String" class";

Since strings are represented by double quotes, the compiler will treat "This is the " as the string. Hence, the above code will cause an error.

To solve this issue, we use the escape character \ in Java. For example,

// use the escape character
String example = "This is the \"String\" class.";
Now escape characters tell the compiler to escape double quotes and read the whole text.

Java Strings are Immutable
In Java, strings are immutable. This means, once we create a string, we cannot change that string.

To understand it more deeply, consider an example:

// create a string
String example = "Hello! ";
Here, we have created a string variable named example. The variable holds the string "Hello! ".

Now suppose we want to change the string.

// add another string "World"
// to the previous tring example
example = example.concat(" World");
Here, we are using the concat() method to add another string World to the previous string.

It looks like we are able to change the value of the previous string. However, this is not true.

Let's see what has happened here,

JVM takes the first string "Hello! "
creates a new string by adding "World" to the first string
assign the new string "Hello! World" to the example variable
the first string "Hello! " remains unchanged
Creating strings using the new keyword
So far we have created strings like primitive types in Java.

Since strings in Java are objects, we can create strings using the new keyword as well. For example,

// create a string using the new keyword
String name = new String("Java String");
In the above example, we have created a string name using the new keyword.

Here, when we create a string object, the String() constructor is invoked. To learn more about constructor, visit Java Constructor.

Note: The String class provides various other constructors to create strings. To learn more, visit Java String (official Java documentation).

Example: 
Create Java Strings using the new keyword
class Main {
  public static void main(String[] args) {

    // create a string using new
    String name = new String("Java String");

    System.out.println(name);  // print Java String
  }
}
Run Code
Create String using literals vs new keyword
Now that we know how strings are created using string literals and the new keyword, let's see what is the major difference between them.

In Java, the JVM maintains a string pool to store all of its strings inside the memory. The string pool helps in reusing the strings.

###### 1. While creating strings using string literals,

String example = "Java";
Here, we are directly providing the value of the string (Java). Hence, the compiler first checks the string pool to see if the string already exists.

If the string already exists, the new string is not created. Instead, the new reference, example points to the already existed string (Java).
If the string doesn't exist, the new string (Java is created.
###### 2. While creating strings using the new keyword,

String example = new String("Java");
Here, the value of the string is not directly provided. Hence, a new "Java" string is created even though "Java" is already present inside the memory pool.

#### Methods of Java String
Besides those mentioned above, there are various string methods present in Java. Here are some of those methods:

Methods	Description
contains()	checks whether the string contains a substring
substring()	returns the substring of the string
join()	join the given strings using the delimiter
replace()	replaces the specified old character with the specified new character
replaceAll()	replaces all substrings matching the regex pattern
replaceFirst()	replace the first matching substring
charAt()	returns the character present in the specified location
getBytes()	converts the string to an array of bytes
indexOf()	returns the position of the specified character in the string
compareTo()	compares two strings in the dictionary order
compareToIgnoreCase()	compares two strings ignoring case differences
trim()	removes any leading and trailing whitespaces
format()	returns a formatted string
split()	breaks the string into an array of strings
toLowerCase()	converts the string to lowercase
toUpperCase()	converts the string to uppercase
valueOf()	returns the string representation of the specified argument
toCharArray()	converts the string to a char array
matches()	checks whether the string matches the given regex
startsWith()	checks if the string begins with the given string
endsWith()	checks if the string ends with the given string
isEmpty()	checks whether a string is empty of not
intern() 	returns the canonical representation of the string
contentEquals()	checks whether the string is equal to charSequence
hashCode()	returns a hash code for the string
subSequence()	returns a subsequence from the string





### Java Access Modifiers
In this tutorial, we will learn about the Java Access Modifier, its types, and how to use them with the help of examples.

What are Access Modifiers?
In Java, access modifiers are used to set the accessibility (visibility) of classes, interfaces, variables, methods, constructors, data members, and the setter methods. For example,

class Animal {
    public void method1() {...}

   private void method2() {...}
}
In the above example, we have declared 2 methods: method1() and method2(). Here,

##### method1 is public - This means it can be accessed by other classes.
##### method2 is private - This means it can not be accessed by other classes.
Note the keyword public and private. These are access modifiers in Java. They are also known as visibility modifiers.

Note: You cannot set the access modifier of getters methods.

Types of Access Modifier
Before you learn about types of access modifiers, make sure you know about Java Packages.

There are four access modifiers keywords in Java and they are:

##### Modifier	Description
Default	declarations are visible only within the package (package private)
Private	declarations are visible within the class only
Protected	declarations are visible within the package or all subclasses
Public	declarations are visible everywhere
###### Default Access Modifier
If we do not explicitly specify any access modifier for classes, methods, variables, etc, then by default the default access modifier is considered. For example,

package defaultPackage;
class Logger {
    void message(){
        System.out.println("This is a message");
    }
}
Run Code
Here, the Logger class has the default access modifier. And the class is visible to all the classes that belong to the defaultPackage package. However, if we try to use the Logger class in another class outside of defaultPackage, we will get a compilation error.

###### Private Access Modifier
When variables and methods are declared private, they cannot be accessed outside of the class. For example,

class Data {
    // private variable
    private String name;
}

public class Main {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "Programiz";
    }
}
Run Code
In the above example, we have declared a private variable named name. When we run the program, we will get the following error:

Main.java:18: error: name has private access in Data
        d.name = "Programiz";
         ^
The error is generated because we are trying to access the private variable of the Data class from the Main class.

You might be wondering what if we need to access those private variables. In this case, we can use the getters and setters method. For example,

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class Main {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}
Run Code
Output:

The name is Programiz

In the above example, we have a private variable named name. In order to access the variable from the outer class, we have used methods: getName() and setName(). These methods are called getter and setter in Java.

Here, we have used the setter method (setName()) to assign value to the variable and the getter method (getName()) to access the variable.

We have used this keyword inside the setName() to refer to the variable of the class. To learn more on this keyword, visit Java this Keyword.

Note: We cannot declare classes and interfaces private in Java. However, the nested classes can be declared private. To learn more, visit Java Nested and Inner Class.

###### Protected Access Modifier
When methods and data members are declared protected, we can access them within the same package as well as from subclasses. For example,

class Animal {
    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog dog = new Dog();
         // access protected method
        dog.display();
    }
}
Run Code
Output:

I am an animal
In the above example, we have a protected method named display() inside the Animal class. The Animal class is inherited by the Dog class. To learn more about inheritance, visit Java Inheritance.

We then created an object dog of the Dog class. Using the object we tried to access the protected method of the parent class.

Since protected methods can be accessed from the child classes, we are able to access the method of Animal class from the Dog class.

Note: We cannot declare classes or interfaces protected in Java.

###### Public Access Modifier
When methods, variables, classes, and so on are declared public, then we can access them from anywhere. The public access modifier has no scope restriction. For example,

// Animal.java file
// public class
public class Animal {
    // public variable
    public int legCount;

    // public method
    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }
}

// Main.java
public class Main {
    public static void main( String[] args ) {
        // accessing the public class
        Animal animal = new Animal();

        // accessing the public variable
        animal.legCount = 4;
        // accessing the public method
        animal.display();
    }
}
Run Code
Output:

I am an animal.
I have 4 legs.
Here,

The public class Animal is accessed from the Main class.
The public variable legCount is accessed from the Main class.
The public method display() is accessed from the Main class.
##### Access Modifiers Summarized in one figure
Accessibility of all Access Modifiers in Java
Accessibility of all Access Modifiers in Java
Access modifiers are mainly used for encapsulation. It can help us to control what part of a program can access the members of a class. So that misuse of data can be prevented. To learn more about encapsulation, visit Java Encapsulation.




#### Java this Keyword
In this article, we will learn about this keyword in Java, how and where to use them with the help of examples.

this Keyword
In Java, this keyword is used to refer to the current object inside a method or a constructor. For example,

class Main {
    int instVar;

    Main(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("object reference = " + obj);
    }
}
Run Code
Output:

this reference = Main@23fc625e
object reference = Main@23fc625e
In the above example, we created an object named obj of the class Main. We then print the reference to the object obj and this keyword of the class.

Here, we can see that the reference of both obj and this is the same. It means this is nothing but the reference to the current object.

Use of this Keyword
There are various situations where this keyword is commonly used.

Using this for Ambiguity Variable Names
In Java, it is not allowed to declare two or more variables having the same name inside a scope (class scope or method scope). However, instance variables and parameters may have the same name. For example,

class MyClass {
    // instance variable
    int age;

    // parameter
    MyClass(int age){
        age = age;
    }
}
In the above program, the instance variable and the parameter have the same name: age. Here, the Java compiler is confused due to name ambiguity.

In such a situation, we use this keyword. For example,

First, let's see an example without using this keyword:

class Main {

    int age;
    Main(int age){
        age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}
Run Code
Output:

obj.age = 0
In the above example, we have passed 8 as a value to the constructor. However, we are getting 0 as an output. This is because the Java compiler gets confused because of the ambiguity in names between instance the variable and the parameter.

Now, let's rewrite the above code using this keyword.

class Main {

    int age;
    Main(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}
Run Code
Output:

obj.age = 8
Now, we are getting the expected output. It is because when the constructor is called, this inside the constructor is replaced by the object obj that has called the constructor. Hence the age variable is assigned value 8.

Also, if the name of the parameter and instance variable is different, the compiler automatically appends this keyword. For example, the code:

class Main {
    int age;

    Main(int i) {
        age = i;
    }
}
is equivalent to:

class Main {
    int age;

    Main(int i) {
        this.age = i;
    }
}
this with Getters and Setters

Another common use of this keyword is in setters and getters methods of a class. For example:

class Main {
   String name;

   // setter method
   void setName( String name ) {
       this.name = name;
   }

   // getter method
   String getName(){
       return this.name;
   }

   public static void main( String[] args ) {
       Main obj = new Main();

       // calling the setter and the getter method
       obj.setName("Toshiba");
       System.out.println("obj.name: "+obj.getName());
   }
}
Run Code
Output:

obj.name: Toshiba
Here, we have used this keyword:

to assign value inside the setter method
to access value inside the getter method
Using this in Constructor Overloading
While working with constructor overloading, we might have to invoke one constructor from another constructor. In such a case, we cannot call the constructor explicitly. Instead, we have to use this keyword.

Here, we use a different form of this keyword. That is, this(). Let's take an example,

class Complex {

    private int a, b;

    // constructor with 2 parameters
    private Complex( int i, int j ){
        this.a = i;
        this.b = j;
    }

    // constructor with single parameter
    private Complex(int i){
        // invokes the constructor with 2 parameters
        this(i, i); 
    }

    // constructor with no parameter
    private Complex(){
        // invokes the constructor with single parameter
        this(0);
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }

    public static void main( String[] args ) {
  
        // creating object of Complex class
        // calls the constructor with 2 parameters
        Complex c1 = new Complex(2, 3); 
    
        // calls the constructor with a single parameter
        Complex c2 = new Complex(3);

        // calls the constructor with no parameters
        Complex c3 = new Complex();

        // print objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
Run Code
Output:

2 + 3i
3 + 3i
0 + 0i
In the above example, we have used this keyword,

to call the constructor Complex(int i, int j) from the constructor Complex(int i)
to call the constructor Complex(int i) from the constructor Complex()
Notice the line,

System.out.println(c1);
Here, when we print the object c1, the object is converted into a string. In this process, the toString() is called. Since we override the toString() method inside our class, we get the output according to that method.

One of the huge advantages of this() is to reduce the amount of duplicate code. However, we should be always careful while using this().

This is because calling constructor from another constructor adds overhead and it is a slow process. Another huge advantage of using this() is to reduce the amount of duplicate code.

Note: Invoking one constructor from another constructor is called explicit constructor invocation.

Passing this as an Argument
We can use this keyword to pass the current object as an argument to a method. For example,

class ThisExample {
    // declare variables
    int x;
    int y;

    ThisExample(int x, int y) {
       // assign values of variables inside constructor
        this.x = x;
        this.y = y;

        // value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        // call the add() method passing this as argument
        add(this);

        // value of x and y after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void add(ThisExample o){
        o.x += 2;
        o.y += 2;
    }
}

class Main {
    public static void main( String[] args ) {
        ThisExample obj = new ThisExample(1, -2);
    }
}
Run Code
Output:

Before passing this to addTwo() method:
x = 1, y = -2
After passing this to addTwo() method:
x = 3, y = 0
In the above example, inside the constructor ThisExample(), notice the line,

add(this);
Here, we are calling the add() method by passing this as an argument. Since this keyword contains the reference to the object obj of the class, we can change the value of x and y inside the add() method.






#### Java final keyword
In this tutorial, we will learn about Java final variables, methods and classes with examples.

In Java, the final keyword is used to denote constants. It can be used with variables, methods, and classes.

Once any entity (variable, method or class) is declared final, it can be assigned only once. That is,

the final variable cannot be reinitialized with another value
the final method cannot be overridden
the final class cannot be extended
##### 1. Java final Variable
In Java, we cannot change the value of a final variable. For example,

class Main {
  public static void main(String[] args) {

    // create a final variable
    final int AGE = 32;

    // try to change the final variable
    AGE = 45;
    System.out.println("Age: " + AGE);
  }
}
Run Code
In the above program, we have created a final variable named age. And we have tried to change the value of the final variable.

When we run the program, we will get a compilation error with the following message.

cannot assign a value to final variable AGE
    AGE = 45;
    ^
Note: It is recommended to use uppercase to declare final variables in Java.

##### 2. Java final Method
Before you learn about final methods and final classes, make sure you know about the Java Inheritance.

In Java, the final method cannot be overridden by the child class. For example,

class FinalDemo {
    // create a final method
    public final void display() {
      System.out.println("This is a final method.");
    }
}

class Main extends FinalDemo {
  // try to override final method
  public final void display() {
    System.out.println("The final method is overridden.");
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.display();
  }
}
Run Code

In the above example, we have created a final method named display() inside the FinalDemo class. Here, the Main class inherits the FinalDemo class.

We have tried to override the final method in the Main class. When we run the program, we will get a compilation error with the following message.

 display() in Main cannot override display() in FinalDemo
  public final void display() {
                    ^
  overridden method is final
##### 3. Java final Class
In Java, the final class cannot be inherited by another class. For example,

// create a final class
final class FinalClass {
  public void display() {
    System.out.println("This is a final method.");
  }
}

// try to extend the final class
class Main extends FinalClass {
  public  void display() {
    System.out.println("The final method is overridden.");
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.display();
  }
}
Run Code
In the above example, we have created a final class named FinalClass. Here, we have tried to inherit the final class by the Main class.

When we run the program, we will get a compilation error with the following message.

cannot inherit from final FinalClass
class Main extends FinalClass {
                   ^





### Java Recursion
In this tutorial, you will learn about Java recursive function, its advantages and disadvantages.

In Java, a method that calls itself is known as a recursive method. And, this process is known as recursion.

A physical world example would be to place two parallel mirrors facing each other. Any object in between them would be reflected recursively.

How Recursion works?
A function is calling itself
Working of Java Recursion
In the above example, we have called the recurse() method from inside the main method. (normal method call). And, inside the recurse() method, we are again calling the same recurse method. This is a recursive call.

In order to stop the recursive call, we need to provide some conditions inside the method. Otherwise, the method will be called infinitely.

Hence, we use the if...else statement (or similar approach) to terminate the recursive call inside the method.

Example: 
Factorial of a Number Using Recursion
class Factorial {

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
Run Code
Output:

4 factorial = 24
In the above example, we have a method named factorial(). The factorial() is called from the main() method. with the number variable passed as an argument.

Here, notice the statement,

return n * factorial(n-1);

The factorial() method is calling itself. Initially, the value of n is 4 inside factorial(). During the next recursive call, 3 is passed to the factorial() method. This process continues until n is equal to 0.

When n is equal to 0, the if statement returns false hence 1 is returned. Finally, the accumulated result is passed to the main() method.

Working of Factorial Program
The image below will give you a better idea of how the factorial program is executed using recursion.

Finding the factorial of a number using recursion
Factorial Program using Recursion
Advantages and Disadvantages of Recursion
When a recursive call is made, new storage locations for variables are allocated on the stack. As, each recursive call returns, the old variables and parameters are removed from the stack. Hence, recursion generally uses more memory and is generally slow.

On the other hand, a recursive solution is much simpler and takes less time to write, debug and maintain.

Recommended Reading: What are the advantages and disadvantages of recursion?






### Java instanceof Operator
In this tutorial, you will learn about Java instanceof operator in detail with the help of examples.

The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.

Its syntax is

objectName instanceOf className;
Here, if objectName is an instance of className, the operator returns true. Otherwise, it returns false.

Example: 
Java instanceof
class Main {

  public static void main(String[] args) {

    // create a variable of string type
    String name = "Programiz";
    
    // checks if name is instance of String
    boolean result1 = name instanceof String;
    System.out.println("name is an instance of String: " + result1);

    // create an object of Main
    Main obj = new Main();

    // checks if obj is an instance of Main
    boolean result2 = obj instanceof Main;
    System.out.println("obj is an instance of Main: " + result2);
  }
}
Run Code
Output

name is an instance of String: true
obj is an instance of Main: true
In the above example, we have created a variable name of the String type and an object obj of the Main class.

Here, we have used the instanceof operator to check whether name and obj are instances of the String and Main class respectively. And, the operator returns true in both cases.

Note: In Java, String is a class rather than a primitive data type. To learn more, visit Java String.

Java instanceof during Inheritance
We can use the instanceof operator to check if objects of the subclass is also an instance of the superclass. For example,

// Java Program to check if an object of the subclass
// is also an instance of the superclass

// superclass
class Animal {
}

// subclass
class Dog extends Animal {
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog d1 = new Dog();

    // checks if d1 is an instance of the subclass
    System.out.println(d1 instanceof Dog);        // prints true

    // checks if d1 is an instance of the superclass
    System.out.println(d1 instanceof Animal);     // prints true
  }
}
Run Code
In the above example, we have created a subclass Dog that inherits from the superclass Animal. We have created an object d1 of the Dog class.

Inside the print statement, notice the expression,

d1 instanceof Animal

Here, we are using the instanceof operator to check whether d1 is also an instance of the superclass Animal.

Java instanceof in Interface
The instanceof operator is also used to check whether an object of a class is also an instance of the interface implemented by the class. For example,

// Java program to check if an object of a class is also
//  an instance of the interface implemented by the class

interface Animal {
}

class Dog implements Animal {
}

class Main {
  public static void main(String[] args) {

    // create an object of the Dog class
    Dog d1 = new Dog();

    // checks if the object of Dog
    // is also an instance of Animal
    System.out.println(d1 instanceof Animal);  // returns true
  }
}
Run Code
In the above example, the Dog class implements the Animal interface. Inside the print statement, notice the expression,

d1 instanceof Animal
Here, d1 is an instance of Dog class. The instanceof operator checks if d1 is also an instance of the interface Animal.

Note: In Java, all the classes are inherited from the Object class. So, instances of all the classes are also an instance of the Object class.

In the previous example, if we check,

d1 instanceof Object
The result will be true.






### Java Inheritance
In this tutorial, we will learn about Java inheritance and its types with the help of example.

Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.

The new class that is created is known as subclass (child or derived class) and the existing class from where the child class is derived is known as superclass (parent or base class).

The extends keyword is used to perform inheritance in Java. For example,

class Animal {
  // methods and fields
}

// use of extends keyword
// to perform inheritance
class Dog extends Animal {

  // methods and fields of Animal
  // methods and fields of Dog
}
In the above example, the Dog class is created by inheriting the methods and fields from the Animal class.

Here, Dog is the subclass and Animal is the superclass.

Example 1: 
Java Inheritance
class Animal {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}

// inherit from Animal
class Dog extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // access field of superclass
    labrador.name = "Rohu";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.eat();

  }
}
Run Code
Output

My name is Rohu
I can eat
In the above example, we have derived a subclass Dog from superclass Animal. Notice the statements,

labrador.name = "Rohu";

labrador.eat();
Here, labrador is an object of Dog. However, name and eat() are the members of the Animal class.

Since Dog inherits the field and method from Animal, we are able to access the field and method using the object of the Dog.

Subclass Dog can access the field and method of the superclass Animal.
Java Inheritance Implementation
is-a relationship
In Java, inheritance is an is-a relationship. That is, we use inheritance only if there exists an is-a relationship between two classes. For example,

Car is a Vehicle
Orange is a Fruit
Surgeon is a Doctor
Dog is an Animal
Here, Car can inherit from Vehicle, Orange can inherit from Fruit, and so on.

Method Overriding in Java Inheritance
In Example 1, we see the object of the subclass can access the method of the superclass.

However, if the same method is present in both the superclass and subclass, what will happen?

In this case, the method in the subclass overrides the method in the superclass. This concept is known as method overriding in Java.

Example 2: 
Method overriding in Java Inheritance
class Animal {

  // method in the superclass
  public void eat() {
    System.out.println("I can eat");
  }
}

// Dog inherits Animal
class Dog extends Animal {

  // overriding the eat() method
  @Override
  public void eat() {
    System.out.println("I eat dog food");
  }

  // new method in subclass
  public void bark() {
    System.out.println("I can bark");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // call the eat() method
    labrador.eat();
    labrador.bark();
  }
}
Run Code
Output

I eat dog food
I can bark

In the above example, the eat() method is present in both the superclass Animal and the subclass Dog.

Here, we have created an object labrador of Dog.

Now when we call eat() using the object labrador, the method inside Dog is called. This is because the method inside the derived class overrides the method inside the base class.

This is called method overriding. To learn more, visit Java Method Overriding.

Note: We have used the @Override annotation to tell the compiler that we are overriding a method. However, the annotation is not mandatory. To learn more, visit Java Annotations.

super Keyword in Java Inheritance
Previously we saw that the same method in the subclass overrides the method in superclass.

In such a situation, the super keyword is used to call the method of the parent class from the method of the child class.

Example 3: 
super Keyword in Inheritance
class Animal {

  // method in the superclass
  public void eat() {
    System.out.println("I can eat");
  }
}

// Dog inherits Animal
class Dog extends Animal {

  // overriding the eat() method
  @Override
  public void eat() {

    // call method of superclass
    super.eat();
    System.out.println("I eat dog food");
  }

  // new method in subclass
  public void bark() {
    System.out.println("I can bark");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // call the eat() method
    labrador.eat();
    labrador.bark();
  }
}
Run Code
Output

I can eat
I eat dog food
I can bark 
In the above example, the eat() method is present in both the base class Animal and the derived class Dog. Notice the statement,

super.eat();
Here, the super keyword is used to call the eat() method present in the superclass.

We can also use the super keyword to call the constructor of the superclass from the constructor of the subclass. To learn more, visit Java super keyword.

protected Members in Inheritance
In Java, if a class includes protected fields and methods, then these fields and methods are accessible from the subclass of the class.

Example 4: 
protected Members in Inheritance
class Animal {
  protected String name;

  protected void display() {
    System.out.println("I am an animal.");
  }
}

class Dog extends Animal {

  public void getInfo() {
    System.out.println("My name is " + name);
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // access protected field and method
    // using the object of subclass
    labrador.name = "Rocky";
    labrador.display();

    labrador.getInfo();
  }
}
Run Code
Output

I am an animal.
My name is Rocky
In the above example, we have created a class named Animal. The class includes a protected field: name and a method: display().

We have inherited the Dog class inherits Animal. Notice the statement,

labrador.name = "Rocky";
labrador.display();
Here, we are able to access the protected field and method of the superclass using the labrador object of the subclass.

#### Why use inheritance?
The most important use of inheritance in Java is code reusability. The code that is present in the parent class can be directly used by the child class.
Method overriding is also known as runtime polymorphism. Hence, we can achieve Polymorphism in Java with the help of inheritance.
Types of inheritance
There are five types of inheritance.

##### 1. Single Inheritance
In single inheritance, a single subclass extends from a single superclass. For example,

Class A inherits from class B.
Java Single Inheritance
##### 2. Multilevel Inheritance
In multilevel inheritance, a subclass extends from a superclass and then the same subclass acts as a superclass for another class. For example,

Class B inherits from class A and class C inherits from class B.
Java Multilevel Inheritance
##### 3. Hierarchical Inheritance
In hierarchical inheritance, multiple subclasses extend from a single superclass. For example,

Both classes B and C inherit from the single class A.
Java Hierarchical Inheritance
##### 4. Multiple Inheritance
In multiple inheritance, a single subclass extends from multiple superclasses. For example,

Class C inherits from both classes A and B.
Java Multiple Inheritance
Note: Java doesn't support multiple inheritance. However, we can achieve multiple inheritance using interfaces. To learn more, visit Java implements multiple inheritance.

##### 5. Hybrid Inheritance
Hybrid inheritance is a combination of two or more types of inheritance. For example,

Class B and C inherit from a single class A and class D inherits from both the class B and C.
Java Hybrid Inheritance
Here, we have combined hierarchical and multiple inheritance to form a hybrid inheritance.






### Java Method Overriding
In this tutorial, we will learn about method overriding in Java with the help of examples.

In the last tutorial, we learned about inheritance. Inheritance is an OOP property that allows us to derive a new class (subclass) from an existing class (superclass). The subclass inherits the attributes and methods of the superclass.

Now, if the same method is defined in both the superclass and the subclass, then the method of the subclass class overrides the method of the superclass. This is known as method overriding.

Example 1: 
Method Overriding
class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   @Override
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}

class Main {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
   }
}
Run Code
Output:

I am a dog.
In the above program, the displayInfo() method is present in both the Animal superclass and the Dog subclass.

When we call displayInfo() using the d1 object (object of the subclass), the method inside the subclass Dog is called. The displayInfo() method of the subclass overrides the same method of the superclass.

###### Working of method overriding in Java.

Notice the use of the @Override annotation in our example. In Java, annotations are the metadata that we used to provide information to the compiler. Here, the @Override annotation specifies the compiler that the method after this annotation overrides the method of the superclass.

It is not mandatory to use @Override. However, when we use this, the method should follow all the rules of overriding. Otherwise, the compiler will generate an error.

Java Overriding Rules
Both the superclass and the subclass must have the same method name, the same return type and the same parameter list.
We cannot override the method declared as final and static.
We should always override abstract methods of the superclass (will be discussed in later tutorials).
super Keyword in Java Overriding
A common question that arises while performing overriding in Java is:

Can we access the method of the superclass after overriding?

Well, the answer is Yes. To access the method of the superclass from the subclass, we use the super keyword.

Example 2: 
Use of super Keyword
class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   public void displayInfo() {
      super.displayInfo();
      System.out.println("I am a dog.");
   }
}

class Main {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
   }
}
Run Code
Output:

I am an animal.
I am a dog.
In the above example, the subclass Dog overrides the method displayInfo() of the superclass Animal.

When we call the method displayInfo() using the d1 object of the Dog subclass, the method inside the Dog subclass is called; the method inside the superclass is not called.


Inside displayInfo() of the Dog subclass, we have used super.displayInfo() to call displayInfo() of the superclass.

It is important to note that constructors in Java are not inherited. Hence, there is no such thing as constructor overriding in Java.

However, we can call the constructor of the superclass from its subclasses. For that, we use super(). To learn more, visit Java super keyword.

Access Specifiers in Method Overriding
The same method declared in the superclass and its subclasses can have different access specifiers. However, there is a restriction.

We can only use those access specifiers in subclasses that provide larger access than the access specifier of the superclass. For example,

Suppose, a method myClass() in the superclass is declared protected. Then, the same method myClass() in the subclass can be either public or protected, but not private.

Example 3: 
Access Specifier in Overriding
class Animal {
   protected void displayInfo() {
      System.out.println("I am an animal.");
   }
}

class Dog extends Animal {
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}

class Main {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.displayInfo();
   }
}
Run Code
Output:

I am a dog.
In the above example, the subclass Dog overrides the method displayInfo() of the superclass Animal.

Whenever we call displayInfo() using the d1 (object of the subclass), the method inside the subclass is called.

Notice that, the displayInfo() is declared protected in the Animal superclass. The same method has the public access specifier in the Dog subclass. This is possible because the public provides larger access than the protected.

Overriding Abstract Methods
In Java, abstract classes are created to be the superclass of other classes. And, if a class contains an abstract method, it is mandatory to override it.

We will learn more about abstract classes and overriding of abstract methods in later tutorials.






### Java super
In this tutorial, we will learn about the super keyword in Java with the help of examples.

The super keyword in Java is used in subclasses to access superclass members (attributes, constructors and methods).

Before we learn about the super keyword, make sure to know about Java inheritance.

Uses of super keyword
To call methods of the superclass that is overridden in the subclass.
To access attributes (fields) of the superclass if both superclass and subclass have attributes with the same name.
To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.
Let’s understand each of these uses.

##### 1. Access Overridden Methods of the superclass
If methods with the same name are defined in both superclass and subclass, the method in the subclass overrides the method in the superclass. This is called method overriding.

Example 1: 
Method overriding
class Animal {

  // overridden method
  public void display(){
    System.out.println("I am an animal");
  }
}

class Dog extends Animal {

  // overriding method
  @Override
  public void display(){
    System.out.println("I am a dog");
  }

  public void printMessage(){
    display();
  }
}

class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.printMessage();
  }
}
Run Code
Output

I am a dog
In this example, by making an object dog1 of Dog class, we can call its method printMessage() which then executes the display() statement.

Since display() is defined in both the classes, the method of subclass Dog overrides the method of superclass Animal. Hence, the display() of the subclass is called.

Java overriding example

What if the overridden method of the superclass has to be called?

We use super.display() if the overridden method display() of superclass Animal needs to be called.

Example 2: 
super to Call Superclass Method
class Animal {

  // overridden method
  public void display(){
    System.out.println("I am an animal");
  }
}

class Dog extends Animal {

  // overriding method
  @Override
  public void display(){
    System.out.println("I am a dog");
  }

  public void printMessage(){

    // this calls overriding method
    display();

    // this calls overridden method
    super.display();
  }
}

class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.printMessage();
  }
}
Run Code
Output

I am a dog
I am an animal
Here, how the above program works.

Working of super in Java

##### 2. Access Attributes of the Superclass
The superclass and subclass can have attributes with the same name. We use the super keyword to access the attribute of the superclass.

Example 3: 
Access superclass attribute
class Animal {
  protected String type="animal";
}

class Dog extends Animal {
  public String type="mammal";

  public void printType() {
    System.out.println("I am a " + type);
    System.out.println("I am an " + super.type);
  }
}

class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.printType();
  }
}
Run Code
Output:

I am a mammal
I am an animal
In this example, we have defined the same instance field type in both the superclass Animal and the subclass Dog.

We then created an object dog1 of the Dog class. Then, the printType() method is called using this object.

Inside the printType() function,

type refers to the attribute of the subclass Dog.
super.type refers to the attribute of the superclass Animal.

Hence, System.out.println("I am a " + type); prints I am a mammal. And, System.out.println("I am an " + super.type); prints I am an animal.

##### 3. Use of super() to access superclass constructor
As we know, when an object of a class is created, its default constructor is automatically called.

To explicitly call the superclass constructor from the subclass constructor, we use super(). It's a special form of the super keyword.

super() can be used only inside the subclass constructor and must be the first statement.

Example 4: 
Use of super()
class Animal {

  // default or no-arg constructor of class Animal
  Animal() {
    System.out.println("I am an animal");
  }
}

class Dog extends Animal {

  // default or no-arg constructor of class Dog
  Dog() {

    // calling default constructor of the superclass
    super();

    System.out.println("I am a dog");
  }
}

class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
  }
}
Run Code
Output

I am an animal
I am a dog
Here, when an object dog1 of Dog class is created, it automatically calls the default or no-arg constructor of that class.

Inside the subclass constructor, the super() statement calls the constructor of the superclass and executes the statements inside it. Hence, we get the output I am an animal.

Working of super() in Java

The flow of the program then returns back to the subclass constructor and executes the remaining statements. Thus, I am a dog will be printed.

However, using super() is not compulsory. Even if super() is not used in the subclass constructor, the compiler implicitly calls the default constructor of the superclass.

So, why use redundant code if the compiler automatically invokes super()?

It is required if the parameterized constructor (a constructor that takes arguments) of the superclass has to be called from the subclass constructor.

The parameterized super() must always be the first statement in the body of the constructor of the subclass, otherwise, we get a compilation error.

Example 5: 
Call Parameterized Constructor Using super()
class Animal {

  // default or no-arg constructor
  Animal() {
    System.out.println("I am an animal");
  }

  // parameterized constructor
  Animal(String type) {
    System.out.println("Type: "+type);
  }
}

class Dog extends Animal {

  // default constructor
  Dog() {

    // calling parameterized constructor of the superclass
    super("Animal");

    System.out.println("I am a dog");
  }
}

class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
  }
}
Run Code
Output

Type: Animal
I am a dog
The compiler can automatically call the no-arg constructor. However, it cannot call parameterized constructors.

If a parameterized constructor has to be called, we need to explicitly define it in the subclass constructor.

Working of super in case of parameterized constructor.

Note that in the above example, we explicitly called the parameterized constructor super("Animal"). The compiler does not call the default constructor of the superclass in this case.







### Java Abstract Class and Abstract Methods
In this tutorial, we will learn about Java abstract classes and methods with the help of examples. We will also learn about abstraction in Java.

Java Abstract Class
The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). We use the abstract keyword to declare an abstract class. For example,

// create an abstract class
abstract class Language {
  // fields and methods
}
...

// try to create an object Language
// throws an error
Language obj = new Language(); 
An abstract class can have both the regular methods and abstract methods. For example,

abstract class Language {

  // abstract method
  abstract void method1();

  // regular method
  void method2() {
    System.out.println("This is regular method");
  }
}
To know about the non-abstract methods, visit Java methods. Here, we will learn about abstract methods.

##### Java Abstract Method
A method that doesn't have its body is known as an abstract method. We use the same abstract keyword to create abstract methods. For example,

abstract void display();
Here, display() is an abstract method. The body of display() is replaced by ;.

If a class contains an abstract method, then the class should be declared abstract. Otherwise, it will generate an error. For example,

// error
// class should be abstract
class Language {

  // abstract method
  abstract void method1();
}
Example: 
Java Abstract Class and Method
Though abstract classes cannot be instantiated, we can create subclasses from it. We can then access members of the abstract class using the object of the subclass. For example,

abstract class Language {

  // method of abstract class
  public void display() {
    System.out.println("This is Java Programming");
  }
}

class Main extends Language {

  public static void main(String[] args) {
    
    // create an object of Main
    Main obj = new Main();

    // access method of abstract class
    // using object of Main class
    obj.display();
  }
}
Run Code
Output

This is Java programming
In the above example, we have created an abstract class named Language. The class contains a regular method display().

We have created the Main class that inherits the abstract class. Notice the statement,

obj.display();
Here, obj is the object of the child class Main. We are calling the method of the abstract class using the object obj.

Implementing Abstract Methods
If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation of the abstract method. For example,

abstract class Animal {
  abstract void makeSound();

  public void eat() {
    System.out.println("I can eat.");
  }
}

class Dog extends Animal {

  // provide implementation of abstract method
  public void makeSound() {
    System.out.println("Bark bark");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of Dog class
    Dog d1 = new Dog();

    d1.makeSound();
    d1.eat();
  }
}
Run Code
Output

Bark bark
I can eat.
In the above example, we have created an abstract class Animal. The class contains an abstract method makeSound() and a non-abstract method eat().

We have inherited a subclass Dog from the superclass Animal. Here, the subclass Dog provides the implementation for the abstract method makeSound().


We then used the object d1 of the Dog class to call methods makeSound() and eat().

###### Note: If the Dog class doesn't provide the implementation of the abstract method makeSound(), Dog should also be declared as abstract. This is because the subclass Dog inherits makeSound() from Animal.

##### Accesses Constructor of Abstract Classes
An abstract class can have constructors like the regular class. And, we can access the constructor of an abstract class from the subclass using the super keyword. For example,

abstract class Animal {
   Animal() {
      ….
   }
}

class Dog extends Animal {
   Dog() {
      super();
      ...
   }
}
Here, we have used the super() inside the constructor of Dog to access the constructor of the Animal.

Note that the super should always be the first statement of the subclass constructor. Visit Java super keyword to learn more.

### Java Abstraction
The major use of abstract classes and methods is to achieve abstraction in Java.

Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information.

This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.

A practical example of abstraction can be motorbike brakes. We know what brake does. When we apply the brake, the motorbike will stop. However, the working of the brake is kept hidden from us.

The major advantage of hiding the working of the brake is that now the manufacturer can implement brake differently for different motorbikes, however, what brake does will be the same.

Let's take an example that helps us to better understand Java abstraction.

Example 3: 
Java Abstraction
abstract class MotorBike {
  abstract void brake();
}

class SportsBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("SportsBike Brake");
  }
}

class MountainBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("MountainBike Brake");
  }
}

class Main {
  public static void main(String[] args) {
    MountainBike m1 = new MountainBike();
    m1.brake();
    SportsBike s1 = new SportsBike();
    s1.brake();
  }
}
Run Code
Output:

MountainBike Brake
SportsBike Brake
In the above example, we have created an abstract super class MotorBike. The superclass MotorBike has an abstract method brake().

The brake() method cannot be implemented inside MotorBike. It is because every bike has different implementation of brakes. So, all the subclasses of MotorBike would have different implementation of brake().

So, the implementation of brake() in MotorBike is kept hidden.

Here, MountainBike makes its own implementation of brake() and SportsBike makes its own implementation of brake().

Note: We can also use interfaces to achieve abstraction in Java. To learn more, visit Java Interface.

###### Key Points to Remember
We use the abstract keyword to create abstract classes and methods.
An abstract method doesn't have any implementation (method body).
A class containing abstract methods should also be abstract.
We cannot create objects of an abstract class.
To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example,
Animal.staticMethod();








### Java Interface
In this tutorial, we will learn about Java interfaces. We will learn how to implement interfaces and when to use them in detail with the help of examples.

An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).

We use the interface keyword to create an interface in Java. For example,

interface Language {
  public void getType();

  public void getVersion();
}
Here,

Language is an interface.
It includes abstract methods: getType() and getVersion().
Implementing an Interface
Like abstract classes, we cannot create objects of interfaces.

To use an interface, other classes must implement it. We use the implements keyword to implement an interface.

Example 1: 
Java Interface
interface Polygon {
  void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon {

  // implementation of abstract method
  public void getArea(int length, int breadth) {
    System.out.println("The area of the rectangle is " + (length * breadth));
  }
}

class Main {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.getArea(5, 6);
  }
}
Run Code
Output

The area of the rectangle is 30
In the above example, we have created an interface named Polygon. The interface contains an abstract method getArea().

Here, the Rectangle class implements Polygon. And, provides the implementation of the getArea() method.

Example 2: 
Java Interface
// create an interface
interface Language {
  void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language {

  // implementation of abstract method
  public void getName(String name) {
    System.out.println("Programming Language: " + name);
  }
}

class Main {
  public static void main(String[] args) {
    ProgrammingLanguage language = new ProgrammingLanguage();
    language.getName("Java");
  }
}
Run Code
Output

Programming Language: Java
In the above example, we have created an interface named Language. The interface includes an abstract method getName().

Here, the ProgrammingLanguage class implements the interface and provides the implementation for the method.

Implementing Multiple Interfaces
In Java, a class can also implement multiple interfaces. For example,

interface A {
  // members of A
}

interface B {
  // members of B
}

class C implements A, B {
  // abstract members of A
  // abstract members of B
}
Extending an Interface
Similar to classes, interfaces can extend other interfaces. The extends keyword is used for extending interfaces. For example,

interface Line {
  // members of Line interface
}

// extending interface
interface Polygon extends Line {
  // members of Polygon interface
  // members of Line interface
}
Here, the Polygon interface extends the Line interface. Now, if any class implements Polygon, it should provide implementations for all the abstract methods of both Line and Polygon.

Extending Multiple Interfaces
An interface can extend multiple interfaces. For example,

interface A {
   ...
}
interface B {
   ... 
}

interface C extends A, B {
   ...
}
Advantages of Interface in Java

Now that we know what interfaces are, let's learn about why interfaces are used in Java.

Similar to abstract classes, interfaces help us to achieve abstraction in Java.

Here, we know getArea() calculates the area of polygons but the way area is calculated is different for different polygons. Hence, the implementation of getArea() is independent of one another.
Interfaces provide specifications that a class (which implements it) must follow.

In our previous example, we have used getArea() as a specification inside the interface Polygon. This is like setting a rule that we should be able to get the area of every polygon.

Now any class that implements the Polygon interface must provide an implementation for the getArea() method.
Interfaces are also used to achieve multiple inheritance in Java. For example,
 
interface Line {
…
}

interface Polygon {
…
}

class Rectangle implements Line, Polygon {
…
}


Here, the class Rectangle is implementing two different interfaces. This is how we achieve multiple inheritance in Java.
Note: All the methods inside an interface are implicitly public and all fields are implicitly public static final. For example,

interface Language {
  
  // by default public static final
  String type = "programming language";

  // by default public
  void getName();
}
default methods in Java Interfaces
With the release of Java 8, we can now add methods with implementation inside an interface. These methods are called default methods.

To declare default methods inside interfaces, we use the default keyword. For example,

public default void getSides() {
   // body of getSides()
}
Why default methods?
Let's take a scenario to understand why default methods are introduced in Java.

Suppose, we need to add a new method in an interface.

We can add the method in our interface easily without implementation. However, that's not the end of the story. All our classes that implement that interface must provide an implementation for the method.

If a large number of classes were implementing this interface, we need to track all these classes and make changes to them. This is not only tedious but error-prone as well.

To resolve this, Java introduced default methods. Default methods are inherited like ordinary methods.

Let's take an example to have a better understanding of default methods.

Example: 
Default Method in Java Interface
interface Polygon {
  void getArea();

  // default method 
  default void getSides() {
    System.out.println("I can get sides of a polygon.");
  }
}

// implements the interface
class Rectangle implements Polygon {
  public void getArea() {
    int length = 6;
    int breadth = 5;
    int area = length * breadth;
    System.out.println("The area of the rectangle is " + area);
  }

  // overrides the getSides()
  public void getSides() {
    System.out.println("I have 4 sides.");
  }
}

// implements the interface
class Square implements Polygon {
  public void getArea() {
    int length = 5;
    int area = length * length;
    System.out.println("The area of the square is " + area);
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of Rectangle
    Rectangle r1 = new Rectangle();
    r1.getArea();
    r1.getSides();

    // create an object of Square
    Square s1 = new Square();
    s1.getArea();
    s1.getSides();
  }
}
Run Code
Output

The area of the rectangle is 30
I have 4 sides.
The area of the square is 25
I can get sides of a polygon.
In the above example, we have created an interface named Polygon. It has a default method getSides() and an abstract method getArea().

Here, we have created two classes Rectangle and Square that implement Polygon.

The Rectangle class provides the implementation of the getArea() method and overrides the getSides() method. However, the Square class only provides the implementation of the getArea() method.

Now, while calling the getSides() method using the Rectangle object, the overridden method is called. However, in the case of the Square object, the default method is called.

private and static Methods in Interface
The Java 8 also added another feature to include static methods inside an interface.

Similar to a class, we can access static methods of an interface using its references. For example,

// create an interface
interface Polygon {
  staticMethod(){..}
}

// access static method
Polygon.staticMethod();
Note: With the release of Java 9, private methods are also supported in interfaces.

We cannot create objects of an interface. Hence, private methods are used as helper methods that provide support to other methods in interfaces.

Practical Example of Interface
Let's see a more practical example of Java Interface.

// To use the sqrt function
import java.lang.Math;

interface  Polygon {
   void getArea();
  
 // calculate the perimeter of a Polygon
   default void getPerimeter(int... sides) {
      int perimeter = 0;
      for (int side: sides) {
         perimeter += side;
      }

   System.out.println("Perimeter: " + perimeter);
   }
}

class Triangle implements Polygon {
   private int a, b, c;
   private double s, area;

// initializing sides of a triangle
   Triangle(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
      s = 0;
   }

// calculate the area of a triangle
   public void getArea() {
      s = (double) (a + b + c)/2;
      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("Area: " + area);
   }
}

class Main {
   public static void main(String[] args) {
      Triangle t1 = new Triangle(2, 3, 4);

// calls the method of the Triangle class
      t1.getArea();

// calls the method of Polygon
      t1.getPerimeter(2, 3, 4);
   }
}
Run Code
Output

Area: 2.9047375096555625
Perimeter: 9
In the above program, we have created an interface named Polygon. It includes a default method getPerimeter() and an abstract method getArea().

We can calculate the perimeter of all polygons in the same manner so we implemented the body of getPerimeter() in Polygon.

Now, all polygons that implement Polygon can use getPerimeter() to calculate perimeter.

However, the rule for calculating the area is different for different polygons. Hence, getArea() is included without implementation.

Any class that implements Polygon must provide an implementation of getArea().






### Java Polymorphism
In this tutorial, we will learn about Java polymorphism and its implementation with the help of examples.

Polymorphism is an important concept of object-oriented programming. It simply means more than one form.

That is, the same entity (method or operator or object) can perform different operations in different scenarios.

Example: 
Java Polymorphism
class Polygon {

  // method to render a shape
  public void render() {
    System.out.println("Rendering Polygon...");
  }
}

class Square extends Polygon {

  // renders Square
  public void render() {
    System.out.println("Rendering Square...");
  }
}

class Circle extends Polygon {

  // renders circle
  public void render() {
    System.out.println("Rendering Circle...");
  }
}

class Main {
  public static void main(String[] args) {
    
    // create an object of Square
    Square s1 = new Square();
    s1.render();

    // create an object of Circle
    Circle c1 = new Circle();
    c1.render();
  }
}
Run Code
Output

Rendering Square...
Rendering Circle...
In the above example, we have created a superclass: Polygon and two subclasses: Square and Circle. Notice the use of the render() method.

The main purpose of the render() method is to render the shape. However, the process of rendering a square is different than the process of rendering a circle.

Hence, the render() method behaves differently in different classes. Or, we can say render() is polymorphic.

##### Why Polymorphism?
Polymorphism allows us to create consistent code. In the previous example, we can also create different methods: renderSquare() and renderCircle() to render Square and Circle, respectively.

This will work perfectly. However, for every shape, we need to create different methods. It will make our code inconsistent.

To solve this, polymorphism in Java allows us to create a single method render() that will behave differently for different shapes.

Note: The print() method is also an example of polymorphism. It is used to print values of different types like char, int, string, etc.

##### We can achieve polymorphism in Java using the following ways:

Method Overriding
Method Overloading
Operator Overloading
Java Method Overriding
During inheritance in Java, if the same method is present in both the superclass and the subclass. Then, the method in the subclass overrides the same method in the superclass. This is called method overriding.

In this case, the same method will perform one operation in the superclass and another operation in the subclass. For example,

Example 1: 
Polymorphism using method overriding
class Language {
  public void displayInfo() {
    System.out.println("Common English Language");
  }
}

class Java extends Language {
  @Override
  public void displayInfo() {
    System.out.println("Java Programming Language");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of Java class
    Java j1 = new Java();
    j1.displayInfo();

    // create an object of Language class
    Language l1 = new Language();
    l1.displayInfo();
  }
}
Run Code
Output:

#### Java Programming Language
Common English Language
In the above example, we have created a superclass named Language and a subclass named Java. Here, the method displayInfo() is present in both Language and Java.

The use of displayInfo() is to print the information. However, it is printing different information in Language and Java.

Based on the object used to call the method, the corresponding information is printed.

displayInfo() method prints Common English Language when called using l1 object and when using j1 object, it prints Java Programming Language
Working of Java Polymorphism
Note: The method that is called is determined during the execution of the program. Hence, method overriding is a run-time polymorphism.

##### 2. Java Method Overloading
In a Java class, we can create methods with the same name if they differ in parameters. For example,

void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) { ... }

This is known as method overloading in Java. Here, the same method will perform different operations based on the parameter.

Example 3: 
Polymorphism using method overloading
class Pattern {

  // method without parameter
  public void display() {
    for (int i = 0; i < 10; i++) {
      System.out.print("*");
    }
  }

  // method with single parameter
  public void display(char symbol) {
    for (int i = 0; i < 10; i++) {
      System.out.print(symbol);
    }
  }
}

class Main {
  public static void main(String[] args) {
    Pattern d1 = new Pattern();

    // call method without any argument
    d1.display();
    System.out.println("\n");

    // call method with a single argument
    d1.display('#');
  }
}
Run Code
Output:

**********

##########
In the above example, we have created a class named Pattern. The class contains a method named display() that is overloaded.

// method with no arguments
display() {...}

// method with a single char type argument
display(char symbol) {...}
Here, the main function of display() is to print the pattern. However, based on the arguments passed, the method is performing different operations:

prints a pattern of *, if no argument is passed or
prints pattern of the parameter, if a single char type argument is passed.
Note: The method that is called is determined by the compiler. Hence, it is also known as compile-time polymorphism.

##### 3. Java Operator Overloading
Some operators in Java behave differently with different operands. For example,

+ operator is overloaded to perform numeric addition as well as string concatenation, and
operators like &, |, and ! are overloaded for logical and bitwise operations.
Let's see how we can achieve polymorphism using operator overloading.

The + operator is used to add two entities. However, in Java, the + operator performs two operations.

###### 1. When + is used with numbers (integers and floating-point numbers), it performs mathematical addition. For example,

int a = 5;
int b = 6;

// + with numbers
int sum = a + b;  // Output = 11
###### 2. When we use the + operator with strings, it will perform string concatenation (join two strings). For example,

String first = "Java ";
String second = "Programming";

// + with strings
name = first + second;  // Output = Java Programming
Here, we can see that the + operator is overloaded in Java to perform two operations: addition and concatenation.

Note: In languages like C++, we can define operators to work differently for different operands. However, Java doesn't support user-defined operator overloading.

Polymorphic Variables
A variable is called polymorphic if it refers to different values under different conditions.

Object variables (instance variables) represent the behavior of polymorphic variables in Java. It is because object variables of a class can refer to objects of its class as well as objects of its subclasses.

Example: 
Polymorphic Variables
class ProgrammingLanguage {
  public void display() {
    System.out.println("I am Programming Language.");
  }
}

class Java extends ProgrammingLanguage {
  @Override
  public void display() {
    System.out.println("I am Object-Oriented Programming Language.");
  }
}

class Main {
  public static void main(String[] args) {

    // declare an object variable
    ProgrammingLanguage pl;

    // create object of ProgrammingLanguage
    pl = new ProgrammingLanguage();
    pl.display();

    // create object of Java class
    pl = new Java();
    pl.display();
  }
}
Run Code
Output:

I am Programming Language.
I am Object-Oriented Programming Language.
In the above example, we have created an object variable pl of the ProgrammingLanguage class. Here, pl is a polymorphic variable. This is because,

In statement pl = new ProgrammingLanguage(), pl refer to the object of the ProgrammingLanguage class.
And, in statement pl = new Java(), pl refer to the object of the Java class.
This is an example of upcasting in Java.




### Java Encapsulation
In this tutorial, you will learn about encapsulation and data hiding in Java with the help of examples.

Java Encapsulation
Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to the bundling of fields and methods inside a single class.

It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.

Example 1: 
Java Encapsulation
class Area {

  // fields to calculate area
  int length;
  int breadth;

  // constructor to initialize values
  Area(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  // method to calculate area
  public void getArea() {
    int area = length * breadth;
    System.out.println("Area: " + area);
  }
}

class Main {
  public static void main(String[] args) {

    // create object of Area
    // pass value of length and breadth
    Area rectangle = new Area(5, 6);
    rectangle.getArea();
  }
}
Run Code
Output

Area: 30
In the above example, we have created a class named Area. The main purpose of this class is to calculate the area.

To calculate an area, we need two variables: length and breadth and a method: getArea(). Hence, we bundled these fields and methods inside a single class.

Here, the fields and methods can be accessed from other classes as well. Hence, this is not data hiding.

This is only encapsulation. We are just keeping similar codes together.

Note: People often consider encapsulation as data hiding, but that's not entirely true.

Encapsulation refers to the bundling of related fields and methods together. This can be used to achieve data hiding. Encapsulation in itself is not data hiding.

##### Why Encapsulation?
In Java, encapsulation helps us to keep related fields and methods together, which makes our code cleaner and easy to read.
It helps to control the values of our data fields. For example,
class Person {
  private int age;

  public void setAge(int age) {
    if (age >= 0) {
      this.age = age;
    }
  }
}

Here, we are making the age variable private and applying logic inside the setAge() method. Now, age cannot be negative.
The getter and setter methods provide read-only or write-only access to our class fields. For example,
getName()  // provides read-only access
setName() // provides write-only access
It helps to decouple components of a system. For example, we can encapsulate code into multiple bundles.

These decoupled components (bundle) can be developed, tested, and debugged independently and concurrently. And, any changes in a particular component do not have any effect on other components.
We can also achieve data hiding using encapsulation. In the above example, if we change the length and breadth variable into private, then the access to these fields is restricted.

And, they are kept hidden from outer classes. This is called data hiding.
Data Hiding
Data hiding is a way of restricting the access of our data members by hiding the implementation details. Encapsulation also provides a way for data hiding.


We can use access modifiers to achieve data hiding. For example,

Example 2: 
Data hiding using the private specifier
class Person {

  // private field
  private int age;

  // getter method
  public int getAge() {
    return age;
  }

  // setter method
  public void setAge(int age) {
    this.age = age;
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of Person
    Person p1 = new Person();

    // change age using setter
    p1.setAge(24);

    // access age using getter
    System.out.println("My age is " + p1.getAge());
  }
}
Run Code
Output

My age is 24
In the above example, we have a private field age. Since it is private, it cannot be accessed from outside the class.

In order to access age, we have used public methods: getAge() and setAge(). These methods are called getter and setter methods.

Making age private allowed us to restrict unauthorized access from outside the class. This is data hiding.

If we try to access the age field from the Main class, we will get an error.

// error: age has private access in Person
p1.age = 24;







### Java Nested and Inner Class
In this tutorial, you will learn about the nested class in Java and its types with the help of examples.

In Java, you can define a class within another class. Such class is known as nested class. For example,

class OuterClass {
    // ...
    class NestedClass {
        // ...
    }
}
There are two types of nested classes you can create in Java.

Non-static nested class (inner class)
Static nested class
Recommended reading:

Java Access Modifiers
Java Static Keyword
Let's first look at non-static nested classes.

Non-Static Nested Class (Inner Class)
A non-static nested class is a class within another class. It has access to members of the enclosing class (outer class). It is commonly known as inner class.

Since the inner class exists within the outer class, you must instantiate the outer class first, in order to instantiate the inner class.

Here's an example of how you can declare inner classes in Java.

Example 1: 
Inner class
class CPU {
    double price;
    // nested class
    class Processor{

        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // create object of Outer class CPU
        CPU cpu = new CPU();

       // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}
Run Code
Output:

Processor Cache = 4.3
Ram Clock speed = 5.5
In the above program, there are two nested classes: Processor and RAM inside the outer class: CPU. We can declare the inner class as protected. Hence, we have declared the RAM class as protected.

Inside the Main class,

we first created an instance of an outer class CPU named cpu.
Using the instance of the outer class, we then created objects of inner classes:
 
CPU.Processor processor = cpu.new Processor;

CPU.RAM ram = cpu.new RAM();
Note: We use the dot (.) operator to create an instance of the inner class using the outer class.

Accessing Members of Outer Class within Inner Class
We can access the members of the outer class by using this keyword. If you want to learn about this keyword, visit Java this keyword. 

Example 2: 
Accessing Members
class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

// inner class
    class Engine {
        String engineType;
        void setEngine() {

           // Accessing the carType property of Car
            if(Car.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

public class Main {
    public static void main(String[] args) {

// create an object of the outer class Car
        Car car1 = new Car("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }
}
Run Code
Output:

Engine Type for 8WD= Bigger
Engine Type for 4WD = Smaller
In the above program, we have the inner class named Engine inside the outer class Car. Here, notice the line,

if(Car.this.carType.equals("4WD")) {...}
We are using this keyword to access the carType variable of the outer class. You may have noticed that instead of using this.carType we have used Car.this.carType.


It is because if we had not mentioned the name of the outer class Car, then this keyword will represent the member inside the inner class.

Similarly, we are also accessing the method of the outer class from the inner class.

if (Car.this.getCarName().equals("Crysler") {...}
It is important to note that, although the getCarName() is a private method, we are able to access it from the inner class.

Static Nested Class
In Java, we can also define a static class inside another class. Such class is known as static nested class. Static nested classes are not called static inner classes.

Unlike inner class, a static nested class cannot access the member variables of the outer class. It is because the static nested class doesn't require you to create an instance of the outer class.

OuterClass.NestedClass obj = new OuterClass.NestedClass();
Here, we are creating an object of the static nested class by simply using the class name of the outer class. Hence, the outer class cannot be referenced using OuterClass.this.

Example 3: 
Static Inner Class
class MotherBoard {

   // static nested class
   static class USB{
       int usb2 = 2;
       int usb3 = 1;
       int getTotalPorts(){
           return usb2 + usb3;
       }
   }

}
public class Main {
   public static void main(String[] args) {

       // create an object of the static nested class
       // using the name of the outer class
       MotherBoard.USB usb = new MotherBoard.USB();
       System.out.println("Total Ports = " + usb.getTotalPorts());
   }
}
Run Code
Output:

Total Ports = 3
In the above program, we have created a static class named USB inside the class MotherBoard. Notice the line,

MotherBoard.USB usb = new MotherBoard.USB();
Here, we are creating an object of USB using the name of the outer class.

Now, let's see what would happen if you try to access the members of the outer class:

Example 4: 
Accessing members of Outer class inside Static Inner Class
class MotherBoard {
   String model;
   public MotherBoard(String model) {
       this.model = model;
   }

   // static nested class
   static class USB{
       int usb2 = 2;
       int usb3 = 1;
       int getTotalPorts(){
           // accessing the variable model of the outer classs
           if(MotherBoard.this.model.equals("MSI")) {
               return 4;
           }
           else {
               return usb2 + usb3;
           }
       }
   }
}
public class Main {
   public static void main(String[] args) {

       // create an object of the static nested class
       MotherBoard.USB usb = new MotherBoard.USB();
       System.out.println("Total Ports = " + usb.getTotalPorts());
   }
}
Run Code
When we try to run the program, we will get an error:

error: non-static variable this cannot be referenced from a static context
This is because we are not using the object of the outer class to create an object of the inner class. Hence, there is no reference to the outer class Motherboard stored in Motherboard.this.

##### Key Points to Remember
Java treats the inner class as a regular member of a class. They are just like methods and variables declared inside a class.
Since inner classes are members of the outer class, you can apply any access modifiers like private, protected to your inner class which is not possible in normal classes.
Since the nested class is a member of its enclosing outer class, you can use the dot (.) notation to access the nested class and its members.
Using the nested class will make your code more readable and provide better encapsulation.
Non-static nested classes (inner classes) have access to other members of the outer/enclosing class, even if they are declared private.








### Java Nested Static Class
In this tutorial, you will learn about nested static class with the help of examples. You will also learn about how static classes differs from inner classes.

As learned in previous tutorials, we can have a class inside another class in Java. Such classes are known as nested classes. In Java, nested classes are of two types:

Nested non-static class (Inner class)
Nested static class.
We have already discussed inner classes in the previous tutorial. Visit Java Nested Class if you want to learn about inner classes.

In this tutorial, we will learn about nested static classes.

Java Nested Static Class
We use the keyword static to make our nested class static.

Note: In Java, only nested classes are allowed to be static.

Like regular classes, static nested classes can include both static and non-static fields and methods. For example,

Class Animal {
   static class Mammal {
      // static and non-static members of Mammal
   }
   // members of Animal
} 
Static nested classes are associated with the outer class.

To access the static nested class, we don’t need objects of the outer class.

Example: 
Static Nested Class
class Animal {

// inner class
   class Reptile {
      public void displayInfo() {
        System.out.println("I am a reptile.");
      }
   }

// static class
   static class Mammal {
      public void displayInfo() {
        System.out.println("I am a mammal.");
      }
   }
}

class Main {
   public static void main(String[] args) {
      // object creation of the outer class
      Animal animal = new Animal();

      // object creation of the non-static class
      Animal.Reptile reptile = animal.new Reptile();
      reptile.displayInfo();

      // object creation of the static nested class
      Animal.Mammal mammal = new Animal.Mammal();
      mammal.displayInfo();

   }
}
Run Code
Output

I am a reptile.
I am a mammal.
In the above program, we have two nested class Mammal and Reptile inside a class Animal.

To create an object of the non-static class Reptile, we have used

Animal.Reptile reptile = animal.new Reptile()
To create an object of the static class Mammal, we have used

Animal.Mammal mammal = new Animal.Mammal()
Accessing Members of Outer Class

In Java, static nested classes are associated with the outer class. This is why static nested classes can only access the class members (static fields and methods) of the outer class.

Let’s see what will happen if we try to access non-static fields and methods of the outer class.

Example: 
Accessing Non-static members
class Animal {
  static class Mammal {
   public void displayInfo() {
     System.out.println("I am a mammal.");
   }
 }

 class Reptile {
   public void displayInfo() {
     System.out.println("I am a reptile.");
   }
 }

 public void eat() {
   System.out.println("I eat food.");
 }
}

class Main {
 public static void main(String[] args) {
   Animal animal = new Animal();
   Animal.Reptile reptile = animal.new Reptile();
   reptile.displayInfo();

   Animal.Mammal mammal = new Animal.Mammal();
   mammal.displayInfo();
   mammal.eat();
 }
}
Run Code
Output

Main.java:28: error: cannot find symbol
    mammal.eat();
          ^
  symbol:   method eat()
  location: variable mammal of type Mammal
1 error
compiler exit status 1
In the above example, we have created a non-static method eat() inside the class Animal.

Now, if we try to access eat() using the object mammal, the compiler shows an error.

It is because mammal is an object of a static class and we cannot access non-static methods from static classes.

Static Top-level Class
As mentioned above, only nested classes can be static. We cannot have static top-level classes.

Let’s see what will happen if we try to make a top-level class static.

static class Animal {
 public static void displayInfo() {
   System.out.println("I am an animal");
 }
}

class Main {
 public static void main(String[] args) {
   Animal.displayInfo();
 }
}
Run Code
Output

Main.java:1: error: modifier static not allowed here
static class Animal {
       ^
1 error
compiler exit status 1
In the above example, we have tried to create a static class Animal. Since Java doesn’t allow static top-level class, we will get an error.










#### Java Anonymous Class
In this tutorial, you will learn about anonymous classes in Java with the help of examples.

In Java, a class can contain another class known as nested class. It's possible to create a nested class without giving any name.

A nested class that doesn't have any name is known as an anonymous class.

An anonymous class must be defined inside another class. Hence, it is also known as an anonymous inner class. Its syntax is:

class outerClass {

    // defining anonymous class
    object1 = new Type(parameterList) {
         // body of the anonymous class
    };
}
Anonymous classes usually extend subclasses or implement interfaces.

Here, Type can be

a superclass that an anonymous class extends
an interface that an anonymous class implements
The above code creates an object, object1, of an anonymous class at runtime.

Note: Anonymous classes are defined inside an expression. So, the semicolon is used at the end of anonymous classes to indicate the end of the expression.

Example 1: 
Anonymous Class Extending a Class
class Polygon {
   public void display() {
      System.out.println("Inside the Polygon class");
   }
}

class AnonymousDemo {
   public void createClass() {

      // creation of anonymous class extending class Polygon
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("Inside an anonymous class.");
         }
      };
      p1.display();
   }
}

class Main {
   public static void main(String[] args) {
       AnonymousDemo an = new AnonymousDemo();
       an.createClass();
   }
}
Run Code
Output

Inside an anonymous class.
In the above example, we have created a class Polygon. It has a single method display().


We then created an anonymous class that extends the class Polygon and overrides the display() method.

When we run the program, an object p1 of the anonymous class is created. The object then calls the display() method of the anonymous class.

Example 2: 
Anonymous Class Implementing an Interface
interface Polygon {
   public void display();
}

class AnonymousDemo {
   public void createClass() {

      // anonymous class implementing interface
      Polygon p1 = new Polygon() {
         public void display() {
            System.out.println("Inside an anonymous class.");
         }
      };
      p1.display();
   }
}

class Main {
   public static void main(String[] args) {
      AnonymousDemo an = new AnonymousDemo();
      an.createClass();
   }
}
Run Code
Output

Inside an anonymous class.
In the above example, we have created an anonymous class that implements the Polygon interface.

Advantages of Anonymous Classes
In anonymous classes, objects are created whenever they are required. That is, objects are created to perform some specific tasks. For example,

Object = new Example() {
   public void display() {
      System.out.println("Anonymous class overrides the method display().");
   }
};
Here, an object of the anonymous class is created dynamically when we need to override the display() method.

Anonymous classes also help us to make our code concise.





#### Java Singleton Class
In this tutorial, we will learn to implement Singleton Design Pattern in Java with the help of examples.

In Java, Singleton is a design pattern that ensures that a class can only have one object.

To create a singleton class, a class must implement the following properties:

Create a private constructor of the class to restrict object creation outside of the class.
Create a private attribute of the class type that refers to the single object.
Create a public static method that allows us to create and access the object we created. Inside the method, we will create a condition that restricts us from creating more than one object.
Example: 
Java Singleton Class Syntax
class SingletonExample {

   // private field that refers to the object
   private static SingletonExample singleObject;
                                              
   private SingletonExample() {
      // constructor of the SingletonExample class
   }

   public static SingletonExample getInstance() {
      // write code that allows us to create only one object
      // access the object as per our need
   }
}
In the above example,

private static SingletonExample singleObject - a reference to the object of the class.
private SingletonExample() - a private constructor that restricts creating objects outside of the class.
public static SingletonExample getInstance() - this method returns the reference to the only object of the class. Since the method static, it can be accessed using the class name.
Use of Singleton in Java
Singletons can be used while working with databases. They can be used to create a connection pool to access the database while reusing the same connection for all the clients. For example,

class Database {
   private static Database dbObject;

   private Database() {      
   }

   public static Database getInstance() {

      // create object if it's not already created
      if(dbObject == null) {
         dbObject = new Database();
      }

       // returns the singleton object
       return dbObject;
   }

   public void getConnection() {
       System.out.println("You are now connected to the database.");
   }
}

class Main {
   public static void main(String[] args) {
      Database db1;

      // refers to the only object of Database
      db1= Database.getInstance();
      
      db1.getConnection();
   }
}
Run Code

When we run the program, the output will be:

You are now connected to the database.
In our above example,

We have created a singleton class Database.
The dbObject is a class type field. This will refer to the object of the class Database.
The private constructor Database() prevents object creation outside of the class.
The static class type method getInstance() returns the instance of the class to the outside world.
In the Main class, we have class type variable db1. We are calling getInstance() using db1 to get the only object of the Database.
The method getConnection() can only be accessed using the object of the Database.
Since the Database can have only one object, all the clients can access the database through a single connection.
Singleton is a design pattern rather than a feature specific to Java. A design pattern is like our code library that includes various coding techniques shared by programmers around the world.

It's important to note that, there are only a few scenarios (like logging) where singletons make sense. We recommend you avoid using singletons completely if you are not sure whether to use them or not. Learn more: What is so bad about Singleton?







### Java enums
In this tutorial, we will learn about enums in Java. We will learn to create and use enums and enum classes with the help of examples.

In Java, an enum (short for enumeration) is a type that has a fixed set of constant values. We use the enum keyword to declare enums. For example,

enum Size { 
   SMALL, MEDIUM, LARGE, EXTRALARGE 
}
Here, we have created an enum named Size. It contains fixed values SMALL, MEDIUM, LARGE, and EXTRALARGE.

These values inside the braces are called enum constants (values).

Note: The enum constants are usually represented in uppercase.

Example 1: 
Java Enum
enum Size {
   SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Main {
   public static void main(String[] args) {
      System.out.println(Size.SMALL);
      System.out.println(Size.MEDIUM);
   }
}
Run Code
Output

SMALL
MEDIUM
As we can see from the above example, we use the enum name to access the constant values.

Also, we can create variables of enum types. For example,

Size pizzaSize;
Here, pizzaSize is a variable of the Size type. It can only be assigned with 4 values.

pizzaSize = Size.SMALL;
pizzaSize = Size.MEDIUM;
pizzaSize = Size.LARGE;
pizzaSize = Size.EXTRALARGE;
Example 2: 
Java Enum with the switch statement
enum Size {
 SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
 Size pizzaSize;
 public Test(Size pizzaSize) {
   this.pizzaSize = pizzaSize;
 }
 public void orderPizza() {
   switch(pizzaSize) {
     case SMALL:
       System.out.println("I ordered a small size pizza.");
       break;
     case MEDIUM:
       System.out.println("I ordered a medium size pizza.");
       break;
     default:
       System.out.println("I don't know which one to order.");
       break;
   }
 }
}

class Main {
 public static void main(String[] args) {
   Test t1 = new Test(Size.MEDIUM);
   t1.orderPizza();
 }
}
Run Code
Output

I ordered a medium size pizza.
In the above program, we have created an enum type Size. We then declared a variable pizzaSize of the Size type.

Here, the variable pizzaSize can only be assigned with 4 values (SMALL, MEDIUM, LARGE, EXTRALARGE).

Notice the statement,

Test t1 = new Test(Size.MEDIUM);
It will call the Test() constructor inside the Test class. Now, the variable pizzaSize is assigned with the MEDIUM constant.

Based on the value, one of the cases of the switch case statement is executed.

##### Enum Class in Java
In Java, enum types are considered to be a special type of class. It was introduced with the release of Java 5.

An enum class can include methods and fields just like regular classes.

enum Size {
    constant1, constant2, …, constantN;

    // methods and fields	
}
When we create an enum class, the compiler will create instances (objects) of each enum constants. Also, all enum constant is always public static final by default.

Example 3: 
Java Enum Class
enum Size{
  SMALL, MEDIUM, LARGE, EXTRALARGE;

  public String getSize() {

    // this will refer to the object SMALL
    switch(this) {
      case SMALL:
        return "small";

      case MEDIUM:
        return "medium";

      case LARGE:
        return "large";

      case EXTRALARGE:
        return "extra large";

      default:
        return null;
      }
   }

  public static void main(String[] args) {

    // call getSize()
    // using the object SMALL
    System.out.println("The size of the pizza is " + Size.SMALL.getSize());
  }
}
Run Code
Output

The size of the pizza is small
In the above example, we have created an enum class Size. It has four constants SMALL, MEDIUM, LARGE and EXTRALARGE.


Since Size is an enum class, the compiler automatically creates instances for each enum constants.

Here inside the main() method, we have used the instance SMALL to call the getSize() method.

Note: Like regular classes, an enum class also may include constructors. To learn more about it, visit Java enum constructor.

Methods of Java Enum Class
There are some predefined methods in enum classes that are readily available for use.

###### 1. Java Enum ordinal()
The ordinal() method returns the position of an enum constant. For example,

ordinal(SMALL) 
// returns 0
###### 2. Enum compareTo()
The compareTo() method compares the enum constants based on their ordinal value. For example,

Size.SMALL.compareTo(Size.MEDIUM)
 // returns ordinal(SMALL) - ordinal(MEDIUM)
###### 3. Enum toString()
The toString() method returns the string representation of the enum constants. For example,

SMALL.toString()
// returns "SMALL"
###### 4. Enum name()
The name() method returns the defined name of an enum constant in string form. The returned value from the name() method is final. For example,

name(SMALL)
// returns "SMALL"
###### 5. Java Enum valueOf()
The valueOf() method takes a string and returns an enum constant having the same string name. For example,

Size.valueOf("SMALL")
// returns constant SMALL.
###### 6. Enum values()
The values() method returns an array of enum type containing all the enum constants. For example,

Size[] enumArray = Size.value();
Why Java Enums?
In Java, enum was introduced to replace the use of int constants.

Suppose we have used a collection of int constants.

class Size {
   public final static int SMALL = 1;
   public final static int MEDIUM = 2;
   public final static int LARGE = 3;
   public final static int EXTRALARGE = 4;
}
Here, the problem arises if we print the constants. It is because only the number is printed which might not be helpful.

So, instead of using int constants, we can simply use enums. For example,

enum Size {
   SMALL, MEDIUM, LARGE, EXTRALARGE
}
This makes our code more intuitive.

Also, enum provides compile-time type safety.

If we declare a variable of the Size type. For example,

Size size;
Here, it is guaranteed that the variable will hold one of the four values. Now, If we try to pass values other than those four values, the compiler will generate an error.






### Java enum Constructor
In this Java tutorial, you can learn about enum constructors with the help of a working example.

Before you learn about enum constructors, make sure to know about Java enums.

In Java, an enum class may include a constructor like a regular class. These enum constructors are either

private - accessible within the class
or
package-private - accessible within the package
Example: 
enum Constructor
enum Size {

   // enum constants calling the enum constructors 
   SMALL("The size is small."),
   MEDIUM("The size is medium."),
   LARGE("The size is large."),
   EXTRALARGE("The size is extra large.");

   private final String pizzaSize;

   // private enum constructor
   private Size(String pizzaSize) {
      this.pizzaSize = pizzaSize;
   }

   public String getSize() {
      return pizzaSize;
   }
}

class Main {
   public static void main(String[] args) {
      Size size = Size.SMALL;
      System.out.println(size.getSize());
   }
}

Run Code
Output

The size is small.
In the above example, we have created an enum Size. It includes a private enum constructor. The constructor takes a string value as a parameter and assigns value to the variable pizzaSize.

Since the constructor is private, we cannot access it from outside the class. However, we can use enum constants to call the constructor.

In the Main class, we assigned SMALL to an enum variable size. The constant SMALL then calls the constructor Size with string as an argument.

Finally, we called getSize() using size.



#### Java enum Strings
In this tutorial, we will learn to learn about string values for enum constants. We will also learn to override default string value for enum constants with the help of examples.

Java enum Strings
Before you learn about enum strings, make sure to know about Java enum.

In Java, we can get the string representation of enum constants using the toString() method or the name() method. For example,

enum Size {
   SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Main {
   public static void main(String[] args) {

      System.out.println("string value of SMALL is " + Size.SMALL.toString());
      System.out.println("string value of MEDIUM is " + Size.MEDIUM.name());

   }
}
Run Code
Output

string value of SMALL is SMALL
string value of MEDIUM is MEDIUM
In the above example, we have seen the default string representation of an enum constant is the name of the same constant.

Change Default String Value of enums

We can change the default string representation of enum constants by overriding the toString() method. For example,

enum Size {
   SMALL {

      // overriding toString() for SMALL
      public String toString() {
        return "The size is small.";
      }
   },

   MEDIUM {

     // overriding toString() for MEDIUM
      public String toString() {
        return "The size is medium.";
      }
   };
}

class Main {
   public static void main(String[] args) {
      System.out.println(Size.MEDIUM.toString());
   }
}
Run Code
Output

The size is medium.
In the above program, we have created an enum Size. And we have overridden the toString() method for enum constants SMALL and MEDIUM.

Note: We cannot override the name() method. It is because the name() method is final.

To learn more, visit best ways to create enum String.








### Java Reflection
In this tutorial, we will learn reflection, a feature in Java programming that allows us to inspect and modify classes, methods, etc.

In Java, reflection allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time.

There is a class in Java named Class that keeps all the information about objects and classes at runtime. The object of Class can be used to perform reflection.

Reflection of Java Classes
In order to reflect a Java class, we first need to create an object of Class.

And, using the object we can call various methods to get information about methods, fields, and constructors present in a class.

There exists three ways to create objects of Class:

###### 1. Using forName() method

class Dog {...}

// create object of Class
// to reflect the Dog class
Class a = Class.forName("Dog");
Here, the forName() method takes the name of the class to be reflected as its argument.

###### 2. Using getClass() method

// create an object of Dog class
Dog d1 = new Dog();

// create an object of Class
// to reflect Dog
Class b = d1.getClass();
Here, we are using the object of the Dog class to create an object of Class.

###### 3. Using .class extension

// create an object of Class
// to reflect the Dog class
Class c = Dog.class;
Now that we know how we can create objects of the Class. We can use this object to get information about the corresponding class at runtime.

Example: 
Java Class Reflection
import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

// put this class in different Dog.java file
public class Dog extends Animal {
  public void display() {
    System.out.println("I am a dog.");
  }
}

// put this in Main.java file
class Main {
  public static void main(String[] args) {
    try {
      // create an object of Dog
      Dog d1 = new Dog();

      // create an object of Class
      // using getClass()
      Class obj = d1.getClass();

      // get name of the class
      String name = obj.getName();
      System.out.println("Name: " + name);

      // get the access modifier of the class
      int modifier = obj.getModifiers();

      // convert the access modifier to string
      String mod = Modifier.toString(modifier);
      System.out.println("Modifier: " + mod);

      // get the superclass of Dog
      Class superClass = obj.getSuperclass();
      System.out.println("Superclass: " + superClass.getName());
    }

    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
Run Code
Output

Name: Dog
Modifier: public
Superclass: Animal
In the above example, we have created a superclass: Animal and a subclass: Dog. Here, we are trying to inspect the class Dog.

Notice the statement,

Class obj = d1.getClass();
Here, we are creating an object obj of Class using the getClass() method. Using the object, we are calling different methods of Class.

obj.getName() - returns the name of the class
obj.getModifiers() - returns the access modifier of the class
obj.getSuperclass() - returns the super class of the class
To learn more about Class, visit Java Class (official Java documentation).

###### Note: We are using the Modifier class to convert the integer access modifier to a string.

##### Reflecting Fields, Methods, and Constructors
The package java.lang.reflect provides classes that can be used for manipulating class members. For example,

Method class - provides information about methods in a class
Field class - provides information about fields in a class
Constructor class - provides information about constructors in a class
###### 1. Reflection of Java Methods
The Method class provides various methods that can be used to get information about the methods present in a class. For example,

import java.lang.Class;
import java.lang.reflect.*;

class Dog {

  // methods of the class
  public void display() {
    System.out.println("I am a dog.");
  }

  private void makeSound() {
    System.out.println("Bark Bark");
  }
}

class Main {
  public static void main(String[] args) {
    try {

      // create an object of Dog
      Dog d1 = new Dog();

      // create an object of Class
      // using getClass()
      Class obj = d1.getClass();

      // using object of Class to
      // get all the declared methods of Dog
      Method[] methods = obj.getDeclaredMethods();

      // create an object of the Method class
      for (Method m : methods) {

        // get names of methods
        System.out.println("Method Name: " + m.getName());

        // get the access modifier of methods
        int modifier = m.getModifiers();
        System.out.println("Modifier: " + Modifier.toString(modifier));

        // get the return types of method
        System.out.println("Return Types: " + m.getReturnType());
        System.out.println(" ");
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
Run Code
Output

Method Name: display
Modifier: public
Return Types: void
 
Method Name: makeSound
Modifier: private
Return Types: void
In the above example, we are trying to get information about the methods present in the Dog class. As mentioned earlier, we have first created an object obj of Class using the getClass() method.

Notice the expression,

Method[] methods = obj.getDeclaredMethod();
Here, the getDeclaredMethod() returns all the methods present inside the class.


Also, we have created an object m of the Method class. Here,

m.getName() - returns the name of a method
m.getModifiers() - returns the access modifier of methods in integer form
m.getReturnType() - returns the return type of methods
The Method class also provides various other methods that can be used to inspect methods at run time. To learn more, visit the Java Method class (official Java documentation).

##### 2. Reflection of Java Fields
Like methods, we can also inspect and modify different fields of a class using the methods of the Field class. For example,

import java.lang.Class;
import java.lang.reflect.*;

class Dog {
  public String type;
}

class Main {
  public static void main(String[] args) {
    try {
      // create an object of Dog
      Dog d1 = new Dog();

      // create an object of Class
      // using getClass()
      Class obj = d1.getClass();

      // access and set the type field
      Field field1 = obj.getField("type");
      field1.set(d1, "labrador");

      // get the value of the field type
      String typeValue = (String) field1.get(d1);
      System.out.println("Value: " + typeValue);

      // get the access modifier of the field type
      int mod = field1.getModifiers();

      // convert the modifier to String form
      String modifier1 = Modifier.toString(mod);
      System.out.println("Modifier: " + modifier1);
      System.out.println(" ");
    }
    
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
Run Code
Output

Value: labrador
Modifier: public
In the above example, we have created a class named Dog. It includes a public field named type. Notice the statement,

Field field1 = obj.getField("type");
Here, we are accessing the public field of the Dog class and assigning it to the object field1 of the Field class.

We then used various methods of the Field class:

field1.set() - sets the value of the field
field1.get() - returns the value of field
field1.getModifiers() - returns the value of the field in integer form
Similarly, we can also access and modify private fields as well. However, the reflection of private field is little bit different than the public field. For example,

import java.lang.Class;
import java.lang.reflect.*;

class Dog {
  private String color;
}

class Main {
  public static void main(String[] args) {
    try {
      // create an object of Dog
      Dog d1 = new Dog();

      // create an object of Class
      // using getClass()
      Class obj = d1.getClass();

      // access the private field color
      Field field1 = obj.getDeclaredField("color");

      // allow modification of the private field
      field1.setAccessible(true);

      // set the value of color
      field1.set(d1, "brown");

      // get the value of field color
      String colorValue = (String) field1.get(d1);
      System.out.println("Value: " + colorValue);

      // get the access modifier of color
      int mod2 = field1.getModifiers();

      // convert the access modifier to string
      String modifier2 = Modifier.toString(mod2);
      System.out.println("Modifier: " + modifier2);
    }
    
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
Run Code
Output

Value: brown
Modifier: private
In the above example, we have created a class named Dog. The class contains a private field named color. Notice the statement.

Field field1 = obj.getDeclaredField("color");

field1.setAccessible(true);
Here, we are accessing color and assigning it to the object field1 of the Field class. We then used field1 to modify the accessibility of color and allows us to make changes to it.

We then used field1 to perform various operations on the private field color.

To learn more about the different methods of Field, visit Java Field Class (official Java documentation).

##### 3. Reflection of Java Constructor
We can also inspect different constructors of a class using various methods provided by the Constructor class. For example,

import java.lang.Class;
import java.lang.reflect.*;

class Dog {

  // public constructor without parameter
  public Dog() {

  }

  // private constructor with a single parameter
  private Dog(int age) {

  }

}

class Main {
  public static void main(String[] args) {
    try {
      // create an object of Dog
      Dog d1 = new Dog();

      // create an object of Class
      // using getClass()
      Class obj = d1.getClass();

      // get all constructors of Dog
      Constructor[] constructors = obj.getDeclaredConstructors();

      for (Constructor c : constructors) {

        // get the name of constructors
        System.out.println("Constructor Name: " + c.getName());

        // get the access modifier of constructors
        // convert it into string form
        int modifier = c.getModifiers();
        String mod = Modifier.toString(modifier);
        System.out.println("Modifier: " + mod);

        // get the number of parameters in constructors
        System.out.println("Parameters: " + c.getParameterCount());
        System.out.println("");
      }
    }
    
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
Run Code
Output

Constructor Name: Dog
Modifier: public     
Parameters: 0        

Constructor Name: Dog
Modifier: private    
Parameters: 1
In the above example, we have created a class named Dog. The class includes two constructors.

We are using reflection to find the information about the constructors of the class. Notice the statement,

Constructor[] constructors = obj.getDeclaredConstructor();
Here, the we are accessing all the constructors present in Dog and assigning them to an array constructors of the Constructor type.

We then used object c to get different informations about the constructor.

c.getName() - returns the name of the constructor
c.getModifiers() - returns the access modifiers of the constructor in integer form
c.getParameterCount() - returns the number of parameters present in each constructor
To learn about more methods of the Constructor class, visit Constructor class




#### Java Exceptions
In this tutorial, we will learn about exceptions in Java. We will cover errors, exceptions and different types of exceptions in Java.

An exception is an unexpected event that occurs during program execution. It affects the flow of the program instructions which can cause the program to terminate abnormally.

An exception can occur for many reasons. Some of them are:

Invalid user input
Device failure
Loss of network connection
Physical limitations (out of disk memory)
Code errors
Opening an unavailable file
Java Exception hierarchy
Here is a simplified diagram of the exception hierarchy in Java.

Exception Hierarchy in Java

As you can see from the image above, the Throwable class is the root class in the hierarchy.

Note that the hierarchy splits into two branches: Error and Exception.

Errors
Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc.

Errors are usually beyond the control of the programmer and we should not try to handle errors.

Exceptions
Exceptions can be caught and handled by the program.

When an exception occurs within a method, it creates an object. This object is called the exception object.

It contains information about the exception such as the name and description of the exception and state of the program when the exception occurred.


We will learn how to handle these exceptions in the next tutorial. In this tutorial, we will now focus on different types of exceptions in Java.

#### Java Exception Types
The exception hierarchy also has two branches: RuntimeException and IOException.

##### 1. RuntimeException
A runtime exception happens due to a programming error. They are also known as unchecked exceptions.

These exceptions are not checked at compile-time but run-time. Some of the common runtime exceptions are:

Improper use of an API - IllegalArgumentException
Null pointer access (missing the initialization of a variable) - NullPointerException
Out-of-bounds array access - ArrayIndexOutOfBoundsException
Dividing a number by 0 - ArithmeticException
You can think about it in this way. “If it is a runtime exception, it is your fault”.

The NullPointerException would not have occurred if you had checked whether the variable was initialized or not before using it.

An ArrayIndexOutOfBoundsException would not have occurred if you tested the array index against the array bounds.

##### 2. IOException
An IOException is also known as a checked exception. They are checked by the compiler at the compile-time and the programmer is prompted to handle these exceptions.

Some of the examples of checked exceptions are:

Trying to open a file that doesn’t exist results in FileNotFoundException
Trying to read past the end of a file
Now we know about exceptions, we will learn about handling exceptions in the next tutorial.







### Java Exception Handling
In the tutorial, we will learn about different approaches of exception handling in Java with the help of examples.

In the last tutorial, we learned about Java exceptions. We know that exceptions abnormally terminate the execution of a program.

This is why it is important to handle exceptions. Here's a list of different approaches to handle exceptions in Java.

try...catch block
finally block
throw and throws keyword
##### 1. Java try...catch block
The try-catch block is used to handle exceptions in Java. Here's the syntax of try...catch block:

try {
  // code
}
catch(Exception e) {
  // code
}
Here, we have placed the code that might generate an exception inside the try block. Every try block is followed by a catch block.

When an exception occurs, it is caught by the catch block. The catch block cannot be used without the try block.

Example: 
Exception handling using try...catch
class Main {
  public static void main(String[] args) {

    try {

      // code that generate exception
      int divideByZero = 5 / 0;
      System.out.println("Rest of code in try block");
    }
    
    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
  }
}
Run Code
Output

ArithmeticException => / by zero
In the example, we are trying to divide a number by 0. Here, this code generates an exception.

To handle the exception, we have put the code, 5 / 0 inside the try block. Now when an exception occurs, the rest of the code inside the try block is skipped.

The catch block catches the exception and statements inside the catch block is executed.

If none of the statements in the try block generates an exception, the catch block is skipped.

##### 2. Java finally block
In Java, the finally block is always executed no matter whether there is an exception or not.

The finally block is optional. And, for each try block, there can be only one finally block.

The basic syntax of finally block is:

try {
  //code
}
catch (ExceptionType1 e1) { 
  // catch block
}
finally {
  // finally block always executes
}
If an exception occurs, the finally block is executed after the try...catch block. Otherwise, it is executed after the try block. For each try block, there can be only one finally block.

Example: 
Java Exception Handling using finally block
class Main {
  public static void main(String[] args) {
    try {
      // code that generates exception
      int divideByZero = 5 / 0;
    }

    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
    
    finally {
      System.out.println("This is the finally block");
    }
  }
}
Run Code
Output

ArithmeticException => / by zero
This is the finally block

In the above example, we are dividing a number by 0 inside the try block. Here, this code generates an ArithmeticException.

The exception is caught by the catch block. And, then the finally block is executed.

###### Note: It is a good practice to use the finally block. It is because it can include important cleanup codes like,

code that might be accidentally skipped by return, continue or break
closing a file or connection
##### 3. Java throw and throws keyword
The Java throw keyword is used to explicitly throw a single exception.

When we throw an exception, the flow of the program moves from the try block to the catch block.

Example:
 Exception handling using Java throw
class Main {
  public static void divideByZero() {

    // throw an exception
    throw new ArithmeticException("Trying to divide by 0");
  }

  public static void main(String[] args) {
    divideByZero();
  }
}
Run Code
Output

Exception in thread "main" java.lang.ArithmeticException: Trying to divide by 0
        at Main.divideByZero(Main.java:5)
        at Main.main(Main.java:9)
In the above example, we are explicitly throwing the ArithmeticException using the throw keyword.

Similarly, the throws keyword is used to declare the type of exceptions that might occur within the method. It is used in the method declaration.

Example: 
Java throws keyword
import java.io.*;

class Main {
  // declareing the type of exception
  public static void findFile() throws IOException {

    // code that may generate IOException
    File newFile = new File("test.txt");
    FileInputStream stream = new FileInputStream(newFile);
  }

  public static void main(String[] args) {
    try {
      findFile();
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}
Run Code
Output

java.io.FileNotFoundException: test.txt (The system cannot find the file specified)
When we run this program, if the file test.txt does not exist, FileInputStream throws a FileNotFoundException which extends the IOException class.

The findFile() method specifies that an IOException can be thrown. The main() method calls this method and handles the exception if it is thrown.

If a method does not handle exceptions, the type of exceptions that may occur within it must be specified in the throws clause.

To learn more, visit Java throw and throws.






#### Java try...catch
In this tutorial, we will learn about the try catch statement in Java with the help of examples.

The try...catch block in Java is used to handle exceptions and prevents the abnormal termination of the program.

Here's the syntax of a try...catch block in Java.

try{
  // code
}
catch(exception) {
  // code
}
The try block includes the code that might generate an exception.

The catch block includes the code that is executed when there occurs an exception inside the try block.

Example: 
Java try...catch block
class Main {
  public static void main(String[] args) {

    try {
      int divideByZero = 5 / 0;
      System.out.println("Rest of code in try block");
    }

    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
  }
}
Run Code
Output

ArithmeticException => / by zero
In the above example, notice the line,

int divideByZero = 5 / 0;
Here, we are trying to divide a number by zero. In this case, an exception occurs. Hence, we have enclosed this code inside the try block.

When the program encounters this code, ArithmeticException occurs. And, the exception is caught by the catch block and executes the code inside the catch block.

The catch block is only executed if there exists an exception inside the try block.

Note: In Java, we can use a try block without a catch block. However, we cannot use a catch block without a try block.

Java try...finally block
We can also use the try block along with a finally block.

In this case, the finally block is always executed whether there is an exception inside the try block or not.

Example: 
Java try...finally block
class Main {
  public static void main(String[] args) {
    try {
      int divideByZero = 5 / 0;
    }

    finally {
      System.out.println("Finally block is always executed");
    }
  }
}
Run Code
Output

Finally block is always executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:4)
In the above example, we have used the try block along with the finally block. We can see that the code inside the try block is causing an exception.

However, the code inside the finally block is executed irrespective of the exception.

Java try...catch...finally block
In Java, we can also use the finally block after the try...catch block. For example,

import java.io.*;

class ListOfNumbers {

  // create an integer array
  private int[] list = {5, 6, 8, 9, 2};

  // method to write data from array to a fila
  public void writeList() {
    PrintWriter out = null;

    try {
      System.out.println("Entering try statement");

      // creating a new file OutputFile.txt
      out = new PrintWriter(new FileWriter("OutputFile.txt"));

      // writing values from list array to Output.txt
      for (int i = 0; i < 7; i++) {
        out.println("Value at: " + i + " = " + list[i]);
      }
    }
    
    catch (Exception e) {
      System.out.println("Exception => " + e.getMessage());
    }
    
    finally {
      // checking if PrintWriter has been opened
      if (out != null) {
        System.out.println("Closing PrintWriter");
        // close PrintWriter
        out.close();
      }
      
      else {
        System.out.println("PrintWriter not open");
      }
    }

  }
}

class Main {
  public static void main(String[] args) {
    ListOfNumbers list = new ListOfNumbers();
    list.writeList();
  }
}
Run Code
Output

Entering try statement
Exception => Index 5 out of bounds for length 5
Closing PrintWriter
In the above example, we have created an array named list and a file named output.txt. Here, we are trying to read data from the array and storing to the file.

Notice the code,

for (int i = 0; i < 7; i++) {
  out.println("Value at: " + i + " = " + list[i]);
}
Here, the size of the array is 5 and the last element of the array is at list[4]. However, we are trying to access elements at a[5] and a[6].

Hence, the code generates an exception that is caught by the catch block.

Since the finally block is always executed, we have included code to close the PrintWriter inside the finally block.


It is a good practice to use finally block to include important cleanup code like closing a file or connection.

Note: There are some cases when a finally block does not execute:

Use of System.exit() method
An exception occurs in the finally block
The death of a thread
Multiple Catch blocks
For each try block, there can be zero or more catch blocks. Multiple catch blocks allow us to handle each exception differently.

The argument type of each catch block indicates the type of exception that can be handled by it. For example,

class ListOfNumbers {
  public int[] arr = new int[10];

  public void writeList() {

    try {
      arr[10] = 11;
    }
    
    catch (NumberFormatException e1) {
      System.out.println("NumberFormatException => " + e1.getMessage());
    }
    
    catch (IndexOutOfBoundsException e2) {
      System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
    }

  }
}

class Main {
  public static void main(String[] args) {
    ListOfNumbers list = new ListOfNumbers();
    list.writeList();
  }
}
Run Code
Output

IndexOutOfBoundsException => Index 10 out of bounds for length 10
In this example, we have created an integer array named arr of size 10.

Since the array index starts from 0, the last element of the array is at arr[9]. Notice the statement,

arr[10] = 11;
Here, we are trying to assign a value to the index 10. Hence, IndexOutOfBoundException occurs.

When an exception occurs in the try block,

The exception is thrown to the first catch block. The first catch block does not handle an IndexOutOfBoundsException, so it is passed to the next catch block.
The second catch block in the above example is the appropriate exception handler because it handles an IndexOutOfBoundsException. Hence, it is executed.
Catching Multiple Exceptions
From Java SE 7 and later, we can now catch more than one type of exception with one catch block.

This reduces code duplication and increases code simplicity and efficiency.

Each exception type that can be handled by the catch block is separated using a vertical bar |.

Its syntax is:

try {
  // code
} catch (ExceptionType1 | Exceptiontype2 ex) { 
  // catch block
}
To learn more, visit Java catching multiple exceptions.

Java try-with-resources statement
The try-with-resources statement is a try statement that has one or more resource declarations.

Its syntax is:

try (resource declaration) {
  // use of the resource
} catch (ExceptionType e1) {
  // catch block
}
The resource is an object to be closed at the end of the program. It must be declared and initialized in the try statement.

Let's take an example.

try (PrintWriter out = new PrintWriter(new FileWriter("OutputFile.txt")) {
  // use of the resource
}
The try-with-resources statement is also referred to as automatic resource management. This statement automatically closes all the resources at the end of the statement.

To learn more, visit the java try-with-resources statement.








### Java throw and throws
In this tutorial, we will learn to use throw and throws keyword for exception handling with the help of examples.

In Java, exceptions can be categorized into two types:

Unchecked Exceptions: They are not checked at compile-time but at run-time.For example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, exceptions under Error class, etc.
Checked Exceptions: They are checked at compile-time. For example, IOException, InterruptedException, etc.
Refer to Java Exceptions to learn in detail about checked and unchecked exceptions.

Usually, we don't need to handle unchecked exceptions. It's because unchecked exceptions occur due to programming errors. And, it is a good practice to correct them instead of handling them.

This tutorial will now focus on how to handle checked exceptions using throw and throws.

Java throws keyword
We use the throws keyword in the method declaration to declare the type of exceptions that might occur within it.

Its syntax is:

accessModifier returnType methodName() throws ExceptionType1, ExceptionType2 … {
  // code
}
As you can see from the above syntax, we can use throws to declare multiple exceptions.

Example 1: 
Java throws Keyword
import java.io.*;
class Main {
  public static void findFile() throws IOException {
    // code that may produce IOException
    File newFile=new File("test.txt");
    FileInputStream stream=new FileInputStream(newFile);
  }

  public static void main(String[] args) {
    try{
      findFile();
    } catch(IOException e){
      System.out.println(e);
    }
  }
}
Run Code
Output

java.io.FileNotFoundException: test.txt (No such file or directory)
When we run this program, if the file test.txt does not exist, FileInputStream throws a FileNotFoundException which extends the IOException class.

If a method does not handle exceptions, the type of exceptions that may occur within it must be specified in the throws clause so that methods further up in the call stack can handle them or specify them using throws keyword themselves.

The findFile() method specifies that an IOException can be thrown. The main() method calls this method and handles the exception if it is thrown.

Throwing multiple exceptions
Here's how we can throw multiple exceptions using the throws keyword.

import java.io.*;
class Main {
  public static void findFile() throws NullPointerException, IOException, InvalidClassException {
    
    // code that may produce NullPointerException
    … … … 

    // code that may produce IOException
    … … … 

    // code that may produce InvalidClassException 
    … … … 
  }

  public static void main(String[] args) {
    try{
      findFile();
    } catch(IOException e1){
      System.out.println(e1.getMessage());
    } catch(InvalidClassException e2){
      System.out.println(e2.getMessage());
    }
  }
}
Here, the findFile() method specifies that it can throw NullPointerException, IOException, and InvalidClassException in its throws clause.

Note that we have not handled the NullPointerException. This is because it is an unchecked exception. It is not necessary to specify it in the throws clause and handle it.

throws keyword Vs. try...catch...finally
There might be several methods that can cause exceptions. Writing try...catch for each method will be tedious and code becomes long and less-readable.


throws is also useful when you have checked exception (an exception that must be handled) that you don't want to catch in your current method.

#### Java throw keyword
The throw keyword is used to explicitly throw a single exception.

When an exception is thrown, the flow of program execution transfers from the try block to the catch block. We use the throw keyword within a method.

Its syntax is:

throw throwableObject;
A throwable object is an instance of class Throwable or subclass of the Throwable class.

Example 2: 
Java throw keyword
class Main {
  public static void divideByZero() {
    throw new ArithmeticException("Trying to divide by 0");
  }

  public static void main(String[] args) {
    divideByZero();
  }
}

Run Code
Output

Exception in thread "main" java.lang.ArithmeticException: Trying to divide by 0
    at Main.divideByZero(Main.java:3)
    at Main.main(Main.java:7)
exit status 1
In this example, we are explicitly throwing an ArithmeticException.

Note: ArithmeticException is an unchecked exception. It's usually not necessary to handle unchecked exceptions.

Example 3: 
Throwing checked exception
import java.io.*;
class Main {
  public static void findFile() throws IOException {
    throw new IOException("File not found");
  }

  public static void main(String[] args) {
    try {
      findFile();
      System.out.println("Rest of code in try block");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
Run Code
Output

File not found
The findFile() method throws an IOException with the message we passed to its constructor.

Note that since it is a checked exception, we must specify it in the throws clause.

The methods that call this findFile() method need to either handle this exception or specify it using throws keyword themselves.

We have handled this exception in the main() method. The flow of program execution transfers from the try block to catch block when an exception is thrown. So, the rest of the code in the try block is skipped and statements in the catch block are executed.







### Java catch Multiple Exceptions
In this tutorial, we will learn to handle multiple exceptions in Java with the help of examples.

Before Java 7, we had to write multiple exception handling codes for different types of exceptions even if there was code redundancy.

Let’s take an example.

Example 1: 
Multiple catch blocks
class Main {
  public static void main(String[] args) {
    try {
      int array[] = new int[10];
      array[10] = 30 / 0;
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    } 
  }
}
Run Code
Output

/ by zero
In this example, two exceptions may occur:

ArithmeticException because we are trying to divide a number by 0.
ArrayIndexOutOfBoundsException because we have declared a new integer array with array bounds 0 to 9 and we are trying to assign a value to index 10.
We are printing out the exception message in both the catch blocks i.e. duplicate code.

The associativity of the assignment operator = is right to left, so an ArithmeticException is thrown first with the message / by zero.

Handle Multiple Exceptions in a catch Block
In Java SE 7 and later, we can now catch more than one type of exception in a single catch block.

Each exception type that can be handled by the catch block is separated using a vertical bar or pipe |.

Its syntax is:

try {
  // code
} catch (ExceptionType1 | Exceptiontype2 ex) { 
  // catch block
}
Example 2: 
Multi-catch block
class Main {
  public static void main(String[] args) {
    try {
      int array[] = new int[10];
      array[10] = 30 / 0;
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
  }
}
Run Code
Output

/ by zero
Catching multiple exceptions in a single catch block reduces code duplication and increases efficiency.

The bytecode generated while compiling this program will be smaller than the program having multiple catch blocks as there is no code redundancy.


###### Note: If a catch block handles multiple exceptions, the catch parameter is implicitly final. This means we cannot assign any values to catch parameters.

Catching base Exception
When catching multiple exceptions in a single catch block, the rule is generalized to specialized.

This means that if there is a hierarchy of exceptions in the catch block, we can catch the base exception only instead of catching multiple specialized exceptions.

Let’s take an example.

Example 3: 
Catching base exception class only
class Main {
  public static void main(String[] args) {
    try {
      int array[] = new int[10];
      array[10] = 30 / 0;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
Run Code
Output

/ by zero
We know that all the exception classes are subclasses of the Exception class. So, instead of catching multiple specialized exceptions, we can simply catch the Exception class.

If the base exception class has already been specified in the catch block, do not use child exception classes in the same catch block. Otherwise, we will get a compilation error.

Let’s take an example.

Example 4: 
Catching base and child exception classes
class Main {
  public static void main(String[] args) {
    try {
      int array[] = new int[10];
      array[10] = 30 / 0;
    } catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
  }
}
Run Code
Output

Main.java:6: error: Alternatives in a multi-catch statement cannot be related by subclassing
In this example, ArithmeticException and ArrayIndexOutOfBoundsException are both subclasses of the Exception class. So, we get a compilation error.







### Java try-with-resources
In this tutorial, we will learn about the try-with-resources statement to close resources automatically.

The try-with-resources statement automatically closes all the resources at the end of the statement. A resource is an object to be closed at the end of the program.

Its syntax is:

try (resource declaration) {
  // use of the resource
} catch (ExceptionType e1) {
  // catch block
}
As seen from the above syntax, we declare the try-with-resources statement by,

declaring and instantiating the resource within the try clause.
specifying and handling all exceptions that might be thrown while closing the resource.
Note: The try-with-resources statement closes all the resources that implement the AutoCloseable interface.

Let us take an example that implements the try-with-resources statement.

Example 1: 
try-with-resources
import java.io.*;

class Main {
  public static void main(String[] args) {
    String line;
    try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
      while ((line = br.readLine()) != null) {
        System.out.println("Line =>"+line);
      }
    } catch (IOException e) {
      System.out.println("IOException in try block =>" + e.getMessage());
    }
  }
}

Output if the test.txt file is not found.

IOException in try-with-resources block =>test.txt (No such file or directory)
Output if the test.txt file is found.

Entering try-with-resources block
Line =>test line
In this example, we use an instance of BufferedReader to read data from the test.txt file.

Declaring and instantiating the BufferedReader inside the try-with-resources statement ensures that its instance is closed regardless of whether the try statement completes normally or throws an exception.

If an exception occurs, it can be handled using the exception handling blocks or the throws keyword.

Suppressed Exceptions
In the above example, exceptions can be thrown from the try-with-resources statement when:

The file test.txt is not found.
Closing the BufferedReader object.
An exception can also be thrown from the try block as a file read can fail for many reasons at any time.

If exceptions are thrown from both the try block and the try-with-resources statement, exception from the try block is thrown and exception from the try-with-resources statement is suppressed.

Retrieving Suppressed Exceptions
In Java 7 and later, the suppressed exceptions can be retrieved by calling the Throwable.getSuppressed() method from the exception thrown by the try block.

This method returns an array of all suppressed exceptions. We get the suppressed exceptions in the catch block.

catch(IOException e) {
  System.out.println("Thrown exception=>" + e.getMessage());
  Throwable[] suppressedExceptions = e.getSuppressed();
  for (int i=0; i<suppressedExceptions.length; i++) {
    System.out.println("Suppressed exception=>" + suppressedExceptions[i]);
  }
}
Advantages of using try-with-resources

Here are the advantages of using try-with-resources:

##### 1. finally block not required to close the resource
Before Java 7 introduced this feature, we had to use the finally block to ensure that the resource is closed to avoid resource leaks.

Here's a program that is similar to Example 1. However, in this program, we have used finally block to close resources.

Example 2: 
Close resource using finally block
import java.io.*;

class Main {
  public static void main(String[] args) {
    BufferedReader br = null;
    String line;

    try {
      System.out.println("Entering try block");
      br = new BufferedReader(new FileReader("test.txt"));
      while ((line = br.readLine()) != null) {
        System.out.println("Line =>"+line);
      }
    } catch (IOException e) {
      System.out.println("IOException in try block =>" + e.getMessage());
    } finally {
      System.out.println("Entering finally block");
      try {
        if (br != null) {
          br.close();
        }
      } catch (IOException e) {
        System.out.println("IOException in finally block =>"+e.getMessage());
      }

    }
  }
}

Output

Entering try block
Line =>line from test.txt file
Entering finally block 
As we can see from the above example, the use of finally block to clean up resources makes the code more complex.

###### Notice the try...catch block in the finally block as well? This is because an IOException can also occur while closing the BufferedReader instance inside this finally block so it is also caught and handled.

The try-with-resources statement does automatic resource management. We need not explicitly close the resources as JVM automatically closes them. This makes the code more readable and easier to write.

##### 2. try-with-resources with multiple resources
We can declare more than one resource in the try-with-resources statement by separating them with a semicolon ;

Example 3: 
try with multiple resources
import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) throws IOException{
    try (Scanner scanner = new Scanner(new File("testRead.txt")); 
      PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
      while (scanner.hasNext()) {
        writer.print(scanner.nextLine());
      }
    }
  }
}
If this program executes without generating any exceptions, Scanner object reads a line from the testRead.txt file and writes it in a new testWrite.txt file.

When multiple declarations are made, the try-with-resources statement closes these resources in reverse order. In this example, the PrintWriter object is closed first and then the Scanner object is closed.

#### Java 9 try-with-resources enhancement
In Java 7, there is a restriction to the try-with-resources statement. The resource needs to be declared locally within its block.

try (Scanner scanner = new Scanner(new File("testRead.txt"))) {
  // code
}
If we declared the resource outside the block in Java 7, it would have generated an error message.

Scanner scanner = new Scanner(new File("testRead.txt"));
try (scanner) {
  // code
}
To deal with this error, Java 9 improved the try-with-resources statement so that the reference of the resource can be used even if it is not declared locally. The above code will now execute without any compilation error.







### Java Annotations
In this tutorial, we will learn what annotations are, different Java annotations and how to use them with the help of examples.

Java annotations are metadata (data about data) for our program source code.

They provide additional information about the program to the compiler but are not part of the program itself. These annotations do not affect the execution of the compiled program.

Annotations start with @. Its syntax is:

@AnnotationName
Let's take an example of @Override annotation.

The @Override annotation specifies that the method that has been marked with this annotation overrides the method of the superclass with the same method name, return type, and parameter list.

It is not mandatory to use @Override when overriding a method. However, if we use it, the compiler gives an error if something is wrong (such as wrong parameter type) while overriding the method.

Example 1: 
@Override Annotation Example
class Animal {
  public void displayInfo() {
    System.out.println("I am an animal.");
  }
}

class Dog extends Animal {
  @Override
  public void displayInfo() {
    System.out.println("I am a dog.");
  }
}

class Main {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.displayInfo();
  }
}
Run Code
Output

I am a dog.
In this example, the method displayInfo() is present in both the superclass Animal and subclass Dog. When this method is called, the method of the subclass is called instead of the method in the superclass.

Annotation formats
Annotations may also include elements (members/attributes/parameters).

##### 1. Marker Annotations
Marker annotations do not contain members/elements. It is only used for marking a declaration.

Its syntax is:

@AnnotationName()
Since these annotations do not contain elements, parentheses can be excluded. For example,

@Override
##### 2. Single element Annotations
A single element annotation contains only one element.

Its syntax is:

@AnnotationName(elementName = "elementValue")
If there is only one element, it is a convention to name that element as value.

@AnnotationName(value = "elementValue")
In this case, the element name can be excluded as well. The element name will be value by default.

@AnnotationName("elementValue")
##### 3. Multiple element Annotations
These annotations contain multiple elements separated by commas.
 Its syntax is:

@AnnotationName(element1 = "value1", element2 = "value2")
#### Annotation placement
Any declaration can be marked with annotation by placing it above that declaration. As of Java 8, annotations can also be placed before a type.

##### 1. Above declarations
As mentioned above, Java annotations can be placed above class, method, interface, field, and other program element declarations.

Example 2: 
@SuppressWarnings Annotation Example
import java.util.*;

class Main {
  @SuppressWarnings("unchecked")
  static void wordsList() {
    ArrayList wordList = new ArrayList<>();

// This causes an unchecked warning
    wordList.add("programiz"); 

    System.out.println("Word list => " + wordList);
  }

  public static void main(String args[]) {
    wordsList();
  }
}
Run Code

Output

Word list => [programiz]
If the above program is compiled without using the @SuppressWarnings("unchecked") annotation, the compiler will still compile the program but it will give warnings like:

Main.java uses unchecked or unsafe operations.
Word list => [programiz]
We are getting the warning

Main.java uses unchecked or unsafe operations
because of the following statement.

ArrayList wordList = new ArrayList<>();
This is because we haven't defined the generic type of the array list. We can fix this warning by specifying generics inside angle brackets <>.

ArrayList<String> wordList = new ArrayList<>();
##### 2. Type annotations
Before Java 8, annotations could be applied to declarations only. Now, type annotations can be used as well. This means that we can place annotations wherever we use a type.

Constructor invocations

new @Readonly ArrayList<>()
Type definitions

@NonNull String str;
This declaration specifies non-null variable str of type String to avoid NullPointerException.

@NonNull List<String> newList;
This declaration specifies a non-null list of type String.

List<@NonNull String> newList;
This declaration specifies a list of non-null values of type String.

Type casts

newStr = (@NonNull String) str;
extends and implements clause

class Warning extends @Localized Message
throws clause

public String readMethod() throws @Localized IOException
Type annotations enable Java code to be analyzed better and provide even stronger type checks.

Types of Annotations
##### 1. Predefined annotations

@Deprecated
@Override
@SuppressWarnings
@SafeVarargs
@FunctionalInterface
##### 2. Meta-annotations

@Retention
@Documented
@Target
@Inherited
@Repeatable
##### 3. Custom annotations

These annotation types are described in detail in the Java Annotation Types tutorial.

Use of Annotations
Compiler instructions - Annotations can be used for giving instructions to the compiler, detect errors or suppress warnings. The built-in annotations @Deprecated, @Override,@SuppressWarnings are used for these purposes.
Compile-time instructions - Compile-time instructions provided by these annotations help the software build tools to generate code, XML files and many more.
Runtime instructions - Some annotations can be defined to give instructions to the program at runtime. These annotations are accessed using Java Reflection.








### Java Annotation Types
In this tutorial, we will learn about different types of Java annotation with the help of examples.

Java annotations are metadata (data about data) for our program source code. There are several predefined annotations provided by the Java SE. Moreover, we can also create custom annotations as per our needs.

If you do not know what annotations are, visit the Java annotations tutorial.

These annotations can be categorized as:

##### 1. Predefined annotations

@Deprecated
@Override
@SuppressWarnings
@SafeVarargs
@FunctionalInterface
##### 2. Custom annotations

##### 3. Meta-annotations

@Retention
@Documented
@Target
@Inherited
@Repeatable
Predefined Annotation Types
###### 1. @Deprecated
The@Deprecated annotation is a marker annotation that indicates the element (class, method, field, etc) is deprecated and has been replaced by a newer element.

Its syntax is:

@Deprecated
accessModifier returnType deprecatedMethodName() { ... }
When a program uses the element that has been declared deprecated, the compiler generates a warning.

We use Javadoc @deprecated tag for documenting the deprecated element.

/**
 * @deprecated
 * why it was deprecated
 */
/*
@Deprecated
accessModifier returnType deprecatedMethodName() { ... }
Example 1: 
@Deprecated annotation example
class Main {
  /**
   * @deprecated
   * This method is deprecated and has been replaced by newMethod()
   */
  /*
  @Deprecated
  public static void deprecatedMethod() { 
    System.out.println("Deprecated method"); 
  } 

  public static void main(String args[]) {
    deprecatedMethod();
  }
}
Run Code
Output

Deprecated method
###### 2. @Override
The @Override annotation specifies that a method of a subclass overrides the method of the superclass with the same method name, return type, and parameter list.

It is not mandatory to use @Override when overriding a method. However, if we use it, the compiler gives an error if something is wrong (such as wrong parameter type) while overriding the method.

Example 2: @Override annotation example
class Animal {

  // overridden method
  public void display(){
    System.out.println("I am an animal");
  }
}

class Dog extends Animal {

  // overriding method
  @Override
  public void display(){
    System.out.println("I am a dog");
  }

  public void printMessage(){
    display();
  }
}

class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.printMessage();
  }
}
Run Code
Output

I am a dog
In this example, by making an object dog1 of Dog class, we can call its method printMessage() which then executes the display() statement.

Since display() is defined in both the classes, the method of subclass Dog overrides the method of superclass Animal. Hence, the display() of the subclass is called.

###### 3. @SuppressWarnings
As the name suggests, the @SuppressWarnings annotation instructs the compiler to suppress warnings that are generated while the program executes.

We can specify the type of warnings to be suppressed. The warnings that can be suppressed are compiler-specific but there are two categories of warnings: deprecation and unchecked.

To suppress a particular category of warning, we use:

@SuppressWarnings("warningCategory")
For example,

@SuppressWarnings("deprecated")
To suppress multiple categories of warnings, we use:

@SuppressWarnings({"warningCategory1", "warningCategory2"})
For example,

@SuppressWarnings({"deprecated", "unchecked"})
Category deprecated instructs the compiler to suppress warnings when we use a deprecated element.

Category unchecked instructs the compiler to suppress warnings when we use raw types.

And, undefined warnings are ignored. For example,

@SuppressWarnings("someundefinedwarning")
Example 3: 
@SuppressWarnings annotation example
class Main {
  @Deprecated
  public static void deprecatedMethod() { 
    System.out.println("Deprecated method"); 
  } 
  
  @SuppressWarnings("deprecated")
  public static void main(String args[]) {
    Main depObj = new Main();
    depObj. deprecatedMethod();
  }
}
Run Code
Output

Deprecated method
Here, deprecatedMethod() has been marked as deprecated and will give compiler warnings when used. By using the @SuppressWarnings("deprecated") annotation, we can avoid compiler warnings.

###### 4. @SafeVarargs
The @SafeVarargs annotation asserts that the annotated method or constructor does not perform unsafe operations on its varargs (variable number of arguments).

We can only use this annotation on methods or constructors that cannot be overridden. This is because the methods that override them might perform unsafe operations.

Before Java 9, we could use this annotation only on final or static methods because they cannot be overridden. We can now use this annotation for private methods as well.

Example 4: 
@SafeVarargs annotation example
import java.util.*;

class Main {

  private void displayList(List<String>... lists) {
    for (List<String> list : lists) {
      System.out.println(list);
    }
  }

  public static void main(String args[]) {
    Main obj = new Main();

    List<String> universityList = Arrays.asList("Tribhuvan University", "Kathmandu University");
    obj.displayList(universityList);

    List<String> programmingLanguages = Arrays.asList("Java", "C");
    obj.displayList(universityList, programmingLanguages);
  }
}

Run Code
Warnings

Type safety: Potential heap pollution via varargs parameter lists
Type safety: A generic array of List<String> is created for a varargs 
 parameter
Output

###### Note: Main.java uses unchecked or unsafe operations.
[Tribhuvan University, Kathmandu University]
[Tribhuvan University, Kathmandu University]
[Java, C]
Here, List ... lists specifies a variable-length argument of type List. This means that the method displayList() can have zero or more arguments.


The above program compiles without errors but gives warnings when @SafeVarargs annotation isn't used.

When we use @SafeVarargs annotation in the above example,

@SafeVarargs
 private void displayList(List<String>... lists) { ... }
We get the same output but without any warnings. Unchecked warnings are also suppressed when we use this annotation.

###### 5. @FunctionalInterface
Java 8 first introduced this @FunctionalInterface annotation. This annotation indicates that the type declaration on which it is used is a functional interface. A functional interface can have only one abstract method.

Example 5: 
@FunctionalInterface annotation example
@FunctionalInterface
public interface MyFuncInterface{
  public void firstMethod(); // this is an abstract method
}
If we add another abstract method, let's say

@FunctionalInterface
public interface MyFuncInterface{
  public void firstMethod(); // this is an abstract method
  public void secondMethod(); // this throws compile error
}
Now, when we run the program, we will get the following warning:

Unexpected @FunctionalInterface annotation
@FunctionalInterface ^ MyFuncInterface is not a functional interface
multiple non-overriding abstract methods found in interface MyFuncInterface
It is not mandatory to use @FunctionalInterface annotation. The compiler will consider any interface that meets the functional interface definition as a functional interface.

We use this annotation to make sure that the functional interface has only one abstract method.

However, it can have any number of default and static methods because they have an implementation.

@FunctionalInterface
public interface MyFuncInterface{
  public void firstMethod(); // this is an abstract method
  default void secondMethod() { ... } 
  default void thirdMethod() { ... } 
}
Custom Annotations
It is also possible to create our own custom annotations.

Its syntax is:

[Access Specifier] @interface<AnnotationName> {         
  DataType <Method Name>() [default value];
}
Here is what you need to know about custom annotation:

Annotations can be created by using @interface followed by the annotation name.
The annotation can have elements that look like methods but they do not have an implementation.
The default value is optional. The parameters cannot have a null value.
The return type of the method can be primitive, enum, string, class name or array of these types.
Example 6: 
Custom annotation example
@interface MyCustomAnnotation {
  String value() default "default value";
}

class Main {
  @MyCustomAnnotation(value = "programiz")
  public void method1() {
    System.out.println("Test method 1");
  }

  public static void main(String[] args) throws Exception {
    Main obj = new Main();
    obj.method1();
  }
}

Run Code
Output

Test method 1
Meta Annotations
Meta-annotations are annotations that are applied to other annotations.

###### 1. @Retention
The @Retention annotation specifies the level up to which the annotation will be available.

Its syntax is:

@Retention(RetentionPolicy)
There are 3 types of retention policies:

RetentionPolicy.SOURCE - The annotation is available only at the source level and is ignored by the compiler.
RetentionPolicy.CLASS - The annotation is available to the compiler at compile-time, but is ignored by the Java Virtual Machine (JVM).
RetentionPolicy.RUNTIME - The annotation is available to the JVM.
For example,

@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation{ ... }
###### 2. @Documented
By default, custom annotations are not included in the official Java documentation. To include our annotation in the Javadoc documentation, we use the @Documented annotation.

For example,

@Documented
public @interface MyCustomAnnotation{ ... }
###### 3. @Target
We can restrict an annotation to be applied to specific targets using the @Target annotation.

Its syntax is:

@Target(ElementType)
The ElementType can have one of the following types:

Element Type	Target
ElementType.ANNOTATION_TYPE	Annotation type
ElementType.CONSTRUCTOR 	Constructors
ElementType.FIELD 	Fields
ElementType.LOCAL_VARIABLE 	Local variables
ElementType.METHOD 	Methods
ElementType.PACKAGE 	Package
ElementType.PARAMETER 	Parameter
ElementType.TYPE 	Any element of class
For example,

@Target(ElementType.METHOD)
public @interface MyCustomAnnotation{ ... }
In this example, we have restricted the use of this annotation to methods only.

Note: If the target type is not defined, the annotation can be used for any element.

###### 4. @Inherited
By default, an annotation type cannot be inherited from a superclass. However, if we need to inherit an annotation from a superclass to a subclass, we use the @Inherited annotation.

Its syntax is:

@Inherited
For example,

@Inherited
public @interface MyCustomAnnotation { ... }

@MyCustomAnnotation
public class ParentClass{ ... }

public class ChildClass extends ParentClass { ... }
###### 5. @Repeatable
An annotation that has been marked by @Repeatable can be applied multiple times to the same declaration.

@Repeatable(Universities.class)
public @interface University {
  String name();
}
The value defined in the @Repeatable annotation is the container annotation. The container annotation has a variable value of array type of the above repeatable annotation. Here, Universities are the containing annotation type.

public @interface Universities {
  University[] value();
}
Now, the @University annotation can be used multiple times on the same declaration.

@University(name = "TU")
@University(name = "KU")
private String uniName;
If we need to retrieve the annotation data, we can use the Reflection API.

To retrieve annotation values, we use getAnnotationsByType() or getAnnotations() method defined in the Reflection API.







#### Java Logging
In this tutorial, we will learn about Java Logging and its various components with the help of examples.

Java allows us to create and capture log messages and files through the process of logging.

In Java, logging requires frameworks and APIs. Java has a built-in logging framework in the java.util.logging package.

We can also use third-party frameworks like Log4j, Logback, and many more for logging purposes.

Java Logging Components
The figure below represents the core components and the flow of control of the Java Logging API (java.util.logging).

The flow of control of Java Logging API
Java Logging
##### 1. Logger
The Logger class provides methods for logging. We can instantiate objects from the Logger class and call its methods for logging purposes.

Let's take an example.

Logger logger = Logger.getLogger("newLoggerName");
The getLogger() method of the Logger class is used to find or create a new Logger. The string argument defines the name of the logger.

Here, this creates a new Logger object or returns an existing Logger with the same name.

It is a convention to define a Logger after the current class using class.getName().

Logger logger = Logger.getLogger(MyClass.class.getName());
Note: This method will throw NullPointerException if the passed name is null.

Each Logger has a level that determines the importance of the log message. There are 7 basic log levels:

Log Level (in descending order)	Use
SEVERE	serious failure
WARNING	warning message, a potential problem
INFO	general runtime information
CONFIG	configuration information
FINE	general developer information (tracing messages)
FINER	detailed developer information (tracing messages)
FINEST	highly detailed developer information(tracing messages)
OFF	turn off logging for all levels (capture nothing)
ALL	turn on logging for all levels (capture everything)
Each log level has an integer value that determines their severity except for two special log levels OFF and ALL.

Logging the message
By default, the top three log levels are always logged. To set a different level, we can use the following code:

logger.setLevel(Level.LogLevel);

// example
logger.setLevel(Level.FINE);
In this example, only level FINE and levels above it are set to be logged. All other log messages are dropped.

Now to log a message, we use the log() method.

logger.log(Level.LogLevel, "log message");

// example
logger.log(Level.INFO, "This is INFO log level message");
There are shorthand methods for logging at desired levels.

logger.info( "This is INFO log level message");
logger.warning( "This is WARNING log level message");
All log requests that have passed the set log level are then forwarded to the LogRecord.

Note: If a logger's level is set to null, its level is inherited from its parent and so on up the tree.

##### 2. Filters

A filter (if it is present) determines whether the LogRecord should be forwarded or not. As the name suggests, it filters the log messages according to specific criteria.

A LogRecord is only passed from the logger to the log handler and from the log handler to external systems if it passes the specified criteria.

// set a filter
logger.setFilter(filter);

// get a filter
Filter filter = logger.getFilter();
##### 3. Handlers(Appenders)
The log handler or the appenders receive the LogRecord and exports it to various targets.

Java SE provides 5 built-in handlers:

Handlers	Use
StreamHandler	writes to an OutputStream
ConsoleHandler	writes to console
FileHandler	writes to file
SocketHandler	writes to remote TCP ports
MemoryHandler	writes to memory
A handler can pass the LogRecord to a filter to again determine whether it can be forwarded to external systems or not.

To add a new handler, we use the following code:

logger.addHandler(handler);

// example
Handler handler = new ConsoleHandler();
logger.addHandler(handler);
To remove a handler, we use the following code:

logger.removeHandler(handler);

// example
Handler handler = new ConsoleHandler();
logger.addHandler(handler);
logger.removeHandler(handler);
A logger can have multiple handlers. To get all the handlers, we use the following code:

Handler[] handlers = logger.getHandlers();
##### 4. Formatters
A handler can also use a Formatter to format the LogRecord object into a string before exporting it to external systems.

Java SE has two built-in Formatters:

Formatters	Use
SimpleFormatter	formats LogRecord to string
XMLFormatter	formats LogRecord to XML form
We can use the following code to format a handler:

// formats to string form
handler.setFormatter(new SimpleFormatter());

// formats to XML form
handler.setFormatter(new XMLFormatter());
LogManager
The LogManager object keeps track of the global logging information. It reads and maintains the logging configuration and the logger instances.

The log manager is a singleton, which means that only one instance of it is instantiated.

To obtain the log manager instance, we use the following code:

LogManager manager = new LogManager();
Advantages of Logging
Here are some of the advantages of logging in Java.

helps in monitoring the flow of the program
helps in capturing any errors that may occur
provides support for problem diagnosis and debugging







### Java Assertions
In this tutorial, we will learn about the Java assert statement (Java assertions) with the help of examples.

Assertions in Java help to detect bugs by testing code we assume to be true.

An assertion is made using the assert keyword.

Its syntax is:

assert condition;
Here, condition is a boolean expression that we assume to be true when the program executes.

Enabling Assertions
By default, assertions are disabled and ignored at runtime.

To enable assertions, we use:

java -ea:arguments
OR

java -enableassertions:arguments
When assertions are enabled and the condition is true, the program executes normally.

But if the condition evaluates to false while assertions are enabled, JVM throws an AssertionError, and the program stops immediately.

Example 1: 
Java assertion
class Main {
  public static void main(String args[]) {
    String[] weekends = {"Friday", "Saturday", "Sunday"};
    assert weekends.length == 2;
    System.out.println("There are " + weekends.length + "  weekends in a week");
  }
}
Run Code
Output

There are 3 weekends in a week
We get the above output because this program has no compilation errors and by default, assertions are disabled.

After enabling assertions, we get the following output:

Exception in thread "main" java.lang.AssertionError
Another form of assertion statement
assert condition : expression;
In this form of assertion statement, an expression is passed to the constructor of the AssertionError object. This expression has a value that is displayed as the error’s detail message if the condition is false.

The detailed message is used to capture and transmit the information of the assertion failure to help in debugging the problem.

Example 2: 
Java assertion with expression example
class Main {
  public static void main(String args[]) {
    String[] weekends = {"Friday", "Saturday", "Sunday"};
    assert weekends.length==2 : "There are only 2 weekends in a week";
    System.out.println("There are " + weekends.length + "  weekends in a week");
  }
}

Run Code
Output

Exception in thread "main" java.lang.AssertionError: There are only 2 weekends in a week
As we see from the above example, the expression is passed to the constructor of the AssertionError object. If our assumption is false and assertions are enabled, an exception is thrown with an appropriate message.

This message helps in diagnosing and fixing the error that caused the assertion to fail.

Enabling assertion for specific classes and packages
If we do not provide any arguments to the assertion command-line switches,

java -ea
This enables assertions in all classes except system classes.

We can also enable assertion for specific classes and packages using arguments. The arguments that can be provided to these command-line switches are:

Enable assertion in class names

To enable assertion for all classes of our program Main,

java -ea Main
To enable only one class,

java -ea:AnimalClass Main
This enables assertion in only the AnimalClass in the Main program.


Enable assertion in package names

To enable assertions for package com.animal and its sub-packages only,

java -ea:com.animal... Main
Enable assertion in unnamed packages

To enable assertion in unnamed packages (when we don’t use a package statement) in the current working directory.

java -ea:... Main
Enable assertion in system classes

To enable assertion in system classes, we use a different command-line switch:

java -esa:arguments 
OR

java -enablesystemassertions:arguments
The arguments that can be provided to these switches are the same.

Disabling Assertions
To disable assertions, we use:

java -da arguments 
OR

java -disableassertions arguments
To disable assertion in system classes, we use:

java -dsa:arguments
OR

java -disablesystemassertions:arguments
The arguments that can be passed while disabling assertions are the same as while enabling them.

###### Advantages of Assertion
Quick and efficient for detecting and correcting bugs.
Assertion checks are done only during development and testing. They are automatically removed in the production code at runtime so that it won’t slow the execution of the program.
It helps remove boilerplate code and make code more readable.
Refactors and optimizes code with increased confidence that it functions correctly.
When to use Assertions
###### 1. Unreachable codes
Unreachable codes are codes that do not execute when we try to run the program. Use assertions to make sure unreachable codes are actually unreachable.

Let’s take an example.

void unreachableCodeMethod() {
  System.out.println("Reachable code");
  return;
  // Unreachable code
  System.out.println("Unreachable code");
  assert false;
}
Let’s take another example of a switch statement without a default case.

switch (dayOfWeek) {
  case "Sunday":
    System.out.println("It’s Sunday!");
    break;
  case "Monday":
    System.out.println("It’s Monday!");
    break;
  case "Tuesday":
    System.out.println("It’s Tuesday!");
    break;
  case "Wednesday":
    System.out.println("It’s Wednesday!");
    break;
  case "Thursday":
    System.out.println("It’s Thursday!");
    break;
  case "Friday":
    System.out.println("It’s Friday!");
    break;
  case "Saturday":
    System.out.println("It’s Saturday!");
    break;
}
The above switch statement indicates that the days of the week can be only one of the above 7 values. Having no default case means that the programmer believes that one of these cases will always be executed.

However, there might be some cases that have not yet been considered where the assumption is actually false.

This assumption should be checked using an assertion to make sure that the default switch case is not reached.

default:
    assert false: dayofWeek + " is invalid day";
If dayOfWeek has a value other than the valid days, an AssertionError is thrown.

###### 2. Documenting assumptions
To document their underlying assumptions, many programmers use comments. Let’s take an example.

if (i % 2 == 0) {
    ...
} else { // We know (i % 2 == 1)
    ...
}
Use assertions instead.

Comments can get out-of-date and out-of-sync as the program grows. However, we will be forced to update the assert statements; otherwise, they might fail for valid conditions too.

if (i % 2 == 0) {
   ...
} else {
    assert i % 2 == 1 : i;
    ...
}
##### When not to use Assertions
###### 1. Argument checking in public methods
Arguments in public methods may be provided by the user.

So, if an assertion is used to check these arguments, the conditions may fail and result in AssertionError.

Instead of using assertions, let it result in the appropriate runtime exceptions and handle these exceptions.

###### 2. To evaluate expressions that affect the program operation
Do not call methods or evaluate exceptions that can later affect the program operation in assertion conditions.

Let us take an example of a list weekdays which contains the names of all the days in a week.


ArrayList<String> weekdays = new ArrayList<>(Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ));

ArrayList<String> weekends= new ArrayList<>(Arrays.asList("Sunday", "Saturday" ));

assert weekdays.removeAll(weekends);
Here, we are trying to remove elements Saturday and Sunday from the ArrayList weekdays.

If the assertion is enabled, the program works fine. However, if assertions are disabled, the elements from the list are not removed. This may result in program failure.

Instead, assign the result to a variable and then use that variable for assertion.

ArrayList<String> weekdays = new ArrayList<>(Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ));

ArrayList<String> weekends= new ArrayList<>(Arrays.asList("Sunday", "Saturday" ));

boolean weekendsRemoved = weekdays.removeAll(weekends);
assert weekendsRemoved;
In this way, we can ensure that all the weekends are removed from the weekdays regardless of the assertion being enabled or disabled. As a result, it does not affect the program operation in the future.











### Java Collections Framework
In this tutorial, we will learn about different interfaces of the Java collections framework.

The Java collections framework provides a set of interfaces and classes to implement various data structures and algorithms.

For example, the LinkedList class of the collections framework provides the implementation of the doubly-linked list data structure.

Interfaces of Collections FrameWork
The Java collections framework provides various interfaces. These interfaces include several methods to perform different operations on collections.

Interfaces in the Java Collections Framework

We will learn about these interfaces, their subinterfaces, and implementation in various classes in detail in the later chapters. Let's learn about the commonly used interfaces in brief in this tutorial.

Java Collection Interface
The Collection interface is the root interface of the collections framework hierarchy.

Java does not provide direct implementations of the Collection interface but provides implementations of its subinterfaces like List, Set, and Queue. To learn more, visit: Java Collection Interface

Collections Framework Vs. Collection Interface
People often get confused between the collections framework and Collection Interface.

The Collection interface is the root interface of the collections framework. The framework includes other interfaces as well: Map and Iterator. These interfaces may also have subinterfaces.

Subinterfaces of the Collection Interface
As mentioned earlier, the Collection interface includes subinterfaces that are implemented by Java classes.

All the methods of the Collection interface are also present in its subinterfaces.

Here are the subinterfaces of the Collection Interface:

List Interface

The List interface is an ordered collection that allows us to add and remove elements like an array. To learn more, visit Java List Interface

Set Interface
The Set interface allows us to store elements in different sets similar to the set in mathematics. It cannot have duplicate elements. To learn more, visit Java Set Interface

Queue Interface
The Queue interface is used when we want to store and access elements in First In, First Out manner. To learn more, visit Java Queue Interface

Java Map Interface
In Java, the Map interface allows elements to be stored in key/value pairs. Keys are unique names that can be used to access a particular element in a map. And, each key has a single value associated with it. To learn more, visit Java Map Interface

Java Iterator Interface
In Java, the Iterator interface provides methods that can be used to access elements of collections. To learn more, visit Java Iterator Interface

Why the Collections Framework?
The Java collections framework provides various data structures and algorithms that can be used directly. This has two main advantages:

We do not have to write code to implement these data structures and algorithms manually.
Our code will be much more efficient as the collections framework is highly optimized.
Moreover, the collections framework allows us to use a specific data structure for a particular type of data. Here are a few examples,

If we want our data to be unique, then we can use the Set interface provided by the collections framework.
To store data in key/value pairs, we can use the Map interface.
The ArrayList class provides the functionality of resizable arrays.
Example: ArrayList Class of Collections
Before we wrap up this tutorial, let's take an example of the ArrayList class of the collections framework.

The ArrayList class allows us to create resizable arrays. The class implements the List interface (which is a subinterface of the Collection interface).

// The Collections framework is defined in the java.util package
import java.util.ArrayList;

class Main {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("ArrayList: " + animals);
    }
}
Run Code
Output:

ArrayList: [Dog, Cat, Horse]
In the later tutorials, we will learn about the collections framework (its interfaces and classes) in detail with the help of examples.










### Java Collection Interface
In this tutorial, we will learn about the Java Collection interface and its subinterfaces.

The Collection interface is the root interface of the Java collections framework.

There is no direct implementation of this interface. However, it is implemented through its subinterfaces like List, Set, and Queue.

For example, the ArrayList class implements the List interface which is a subinterface of the Collection Interface.

Java Collection Interface and its subinterfaces.

Subinterfaces of Collection
As mentioned above, the Collection interface includes subinterfaces that are implemented by various classes in Java.

1. List Interface

The List interface is an ordered collection that allows us to add and remove elements like an array. To learn more, visit: Java List Interface.

2. Set Interface
The Set interface allows us to store elements in different sets similar to the set in mathematics. It cannot have duplicate elements. To learn more, visit: Java Set Interface.

3. Queue Interface
The Queue interface is used when we want to store and access elements in First In, First Out(FIFO) manner. To learn more, visit: Java Queue Interface.

Methods of Collection
The Collection interface includes various methods that can be used to perform different operations on objects. These methods are available in all its subinterfaces.

add() - inserts the specified element to the collection
size() - returns the size of the collection
remove() - removes the specified element from the collection
iterator() - returns an iterator to access elements of the collection
addAll() - adds all the elements of a specified collection to the collection
removeAll() - removes all the elements of the specified collection from the collection
clear() - removes all the elements of the collection











### Java List
In this tutorial, we will learn about the List interface in Java and its methods.

In Java, the List interface is an ordered collection that allows us to store and access elements sequentially. It extends the Collection interface.

Classes that Implement List
Since List is an interface, we cannot create objects from it.

In order to use functionalities of the List interface, we can use these classes:

ArrayList
LinkedList
Vector
Stack
Classes implementing the List interface in Java

These classes are defined in the Collections framework and implement the List interface.

How to use List?
In Java, we must import java.util.List package in order to use List.

// ArrayList implementation of List
List<String> list1 = new ArrayList<>();

// LinkedList implementation of List
List<String> list2 = new LinkedList<>();
Here, we have created objects list1 and list2 of classes ArrayList and LinkedList. These objects can use the functionalities of the List interface.

Methods of List
The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.

Some of the commonly used methods of the Collection interface that's also available in the List interface are:

add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element
Implementation of the List Interface

#### 1. Implementing the ArrayList Class

import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}
Run Code
Output

List: [1, 2, 3]
Accessed Element: 3
Removed Element: 2
To learn more about ArrayList, visit Java ArrayList.

#### 2. Implementing the LinkedList Class

import java.util.List;
import java.util.LinkedList;

class Main {

    public static void main(String[] args) {
        // Creating list using the LinkedList class
        List<Integer> numbers = new LinkedList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Using the indexOf() method
        int index = numbers.indexOf(2);
        System.out.println("Position of 3 is " + index);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}
Run Code
Output

List: [1, 2, 3]
Accessed Element: 3
Position of 3 is 1
Removed Element: 2
To learn more about LinkedList, visit Java LinkedList.

##### Java List vs. Set
Both the List interface and the Set interface inherits the Collection interface. However, there exists some difference between them.

Lists can include duplicate elements. However, sets cannot have duplicate elements.
Elements in lists are stored in some order. However, elements in sets are stored in groups like sets in mathematics.
Now that we know what List is, we will see its implementations in ArrayList and LinkedList classes in detail in the next tutorials.








### Java ArrayList
In this tutorial, we will learn about the ArrayList class in Java. We will learn about different operations and methods of the arraylist with the help of examples.

In Java, we use the ArrayList class to implement the functionality of resizable-arrays.

It implements the List interface of the collections framework.

The List interface extends the Collection interface and the ArrayList class implements List.
Java ArrayList Implementation
Java ArrayList Vs Array
In Java, we need to declare the size of an array before we can use it. Once the size of an array is declared, it's hard to change it.

To handle this issue, we can use the ArrayList class. It allows us to create resizable arrays.

Unlike arrays, arraylists can automatically adjust their capacity when we add or remove elements from them. Hence, arraylists are also known as dynamic arrays.

Creating an ArrayList
Before using ArrayList, we need to import the java.util.ArrayList package first. Here is how we can create arraylists in Java:

ArrayList<Type> arrayList= new ArrayList<>();
Here, Type indicates the type of an arraylist. For example,

// create Integer type arraylist
ArrayList<Integer> arrayList = new ArrayList<>();

// create String type arraylist
ArrayList<String> arrayList = new ArrayList<>();
In the above program, we have used Integer not int. It is because we cannot use primitive types while creating an arraylist. Instead, we have to use the corresponding wrapper classes.

Here, Integer is the corresponding wrapper class of int. To learn more, visit the Java wrapper class.

Example: 
Create ArrayList in Java
import java.util.ArrayList;

class Main {
  public static void main(String[] args){

    // create ArrayList
    ArrayList<String> languages = new ArrayList<>();

    // Add elements to ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("Swift");
    System.out.println("ArrayList: " + languages);
  }
}
Run Code
Output

ArrayList: [Java, Python, Swift]
In the above example, we have created an ArrayList named languages.

Here, we have used the add() method to add elements to the arraylist. We will learn more about the add() method later in this tutorial.

Basic Operations on ArrayList
The ArrayList class provides various methods to perform different operations on arraylists. We will look at some commonly used arraylist operations in this tutorial:

Add elements
Access elements
Change elements
Remove elements
##### 1. Add Elements to an ArrayList
To add a single element to the arraylist, we use the add() method of the ArrayList class. For example,

import java.util.ArrayList;

class Main {
  public static void main(String[] args){
    // create ArrayList
    ArrayList<String> languages = new ArrayList<>();

    // add() method without the index parameter
    languages.add("Java");
    languages.add("C");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);
  }
}
Run Code
Output

ArrayList: [Java, C, Python]
In the above example, we have created an ArrayList named languages. Here, we have used the add() method to add elements to languages.

To learn more, visit the Java ArrayList add().

Other way to add elements to arraylist
How to add an element at a specified position in an ArrayList?

How to add all elements of a set to an arraylist?


##### 2. Access ArrayList Elements
To access an element from the arraylist, we use the get() method of the ArrayList class. For example,

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();

    // add elements in the arraylist
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Cow");
    System.out.println("ArrayList: " + animals);

    // get the element from the arraylist
    String str = animals.get(1);
    System.out.print("Element at index 1: " + str);
  }
}
Run Code
Output

ArrayList: [Cat, Dog, Cow]
Element at index 1: Dog
In the above example, we have used the get() method with parameter 1. Here, the method returns the element at index 1.

To learn more, visit the Java ArrayList get().

We can also access elements of the ArrayList using the iterator() method. To learn more, visit Java ArrayList iterator().

##### 3. Change ArrayList Elements
To change elements of the arraylist, we use the set() method of the ArrayList class. For example,

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<>();

    // add elements in the array list
    languages.add("Java");
    languages.add("Kotlin");
    languages.add("C++");
    System.out.println("ArrayList: " + languages);

    // change the element of the array list
    languages.set(2, "JavaScript");
    System.out.println("Modified ArrayList: " + languages);
  }
}
Run Code
Output

ArrayList: [Java, Kotlin, C++]
Modified ArrayList: [Java, Kotlin, JavaScript]
In the above example, we have created an ArrayList named languages. Notice the line,

language.set(2, "JavaScript");

Here, the set() method changes the element at index 2 to JavaScript.

To learn more, visit the Java ArrayList set().

#### 4. Remove ArrayList Elements
To remove an element from the arraylist, we can use the remove() method of the ArrayList class. For example,

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();

    // add elements in the array list
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Horse");
    System.out.println("ArrayList: " + animals);

    // remove element from index 2
    String str = animals.remove(2);
    System.out.println("Updated ArrayList: " + animals);
    System.out.println("Removed Element: " + str);
  }
}
Run Code
Output

ArrayList: [Dog, Cat, Horse]
Updated ArrayList: [Dog, Cat]
Removed Element: Horse
Here, the remove() method takes the index number as the parameter. And, removes the element specified by the index number.

To learn more, visit the Java ArrayList remove().

We can also remove all the elements from the arraylist at once. To learn more, visit

Java ArrayList removeAll()
Java ArrayList clear()
Methods of ArrayList Class
In the previous section, we have learned about the add(), get(), set(), and remove() method of the ArrayList class.

Besides those basic methods, here are some more ArrayList methods that are commonly used.

Methods	Descriptions
size()	Returns the length of the arraylist.
sort()	Sort the arraylist elements.
clone()	Creates a new arraylist with the same element, size, and capacity.
contains()	Searches the arraylist for the specified element and returns a boolean result.
ensureCapacity()	Specifies the total element the arraylist can contain.
isEmpty()	Checks if the arraylist is empty.
indexOf()	Searches a specified element in an arraylist and returns the index of the element.
If you want to learn about all the different methods of arraylist, visit Java ArrayList methods.

Iterate through an ArrayList
We can use the Java for-each loop to loop through each element of the arraylist. For example,

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    // creating an array list
    ArrayList<String> animals = new ArrayList<>();
    animals.add("Cow");
    animals.add("Cat");
    animals.add("Dog");
    System.out.println("ArrayList: " + animals);

    // iterate using for-each loop
    System.out.println("Accessing individual elements:  ");

    for (String language : animals) {
      System.out.print(language);
      System.out.print(", ");
    }
  }
}
Run Code
Output

ArrayList: [Cow, Cat, Dog]
Accessing individual elements:  
Cow, Cat, Dog,
Frequently Asked Questions
What is the difference between Java ArrayList and LinkedList?

How to convert an ArrayList to Array?



How to convert an array to ArrayList?




How to create and initialize an ArrayList in a single line?

How to convert an ArrayList to String?



How to create an arraylist using the List interface?









### Java Vector
In this tutorial, we will learn about the Vector class and how to use it. We will also learn how it is different from the ArrayList class, and why we should use array lists instead.

The Vector class is an implementation of the List interface that allows us to create resizable-arrays similar to the ArrayList class.

Java Vector vs. ArrayList
In Java, both ArrayList and Vector implements the List interface and provides the same functionalities. However, there exist some differences between them.

The Vector class synchronizes each individual operation. This means whenever we want to perform some operation on vectors, the Vector class automatically applies a lock to that operation.

It is because when one thread is accessing a vector, and at the same time another thread tries to access it, an exception called ConcurrentModificationException is generated. Hence, this continuous use of lock for each operation makes vectors less efficient.

However, in array lists, methods are not synchronized. Instead, it uses the Collections.synchronizedList() method that synchronizes the list as a whole.

Note: It is recommended to use ArrayList in place of Vector because vectors less efficient.

Creating a Vector
Here is how we can create vectors in Java.

Vector<Type> vector = new Vector<>();
Here, Type indicates the type of a linked list. For example,

// create Integer type linked list
Vector<Integer> vector= new Vector<>();

// create String type linked list
Vector<String> vector= new Vector<>();
Methods of Vector

The Vector class also provides the resizable-array implementations of the List interface (similar to the ArrayList class). Some of the Vector methods are:

Add Elements to Vector
add(element) - adds an element to vectors
add(index, element) - adds an element to the specified position
addAll(vector) - adds all elements of a vector to another vector
For example,

import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }
}
Run Code
Output

Vector: [Dog, Horse, Cat]
New Vector: [Crocodile, Dog, Horse, Cat]
Access Vector Elements
get(index) - returns an element specified by the index
iterator() - returns an iterator object to sequentially access vector elements
For example,

import java.util.Iterator;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
Run Code
Output

Element at index 2: Cat
Vector: Dog, Horse, Cat,
Remove Vector Elements
remove(index) - removes an element from specified position
removeAll() - removes all the elements
clear() - removes all elements. It is more efficient than removeAll()
For example,

import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("Initial Vector: " + animals);

        // Using remove()
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
    }
}
Run Code
Output

Initial Vector: [Dog, Horse, Cat]
Removed Element: Horse
New Vector: [Dog, Cat]
Vector after clear(): []
Others Vector Methods
Methods	Descriptions
set()	changes an element of the vector
size()	returns the size of the vector
toArray()	converts the vector into an array
toString()	converts the vector into a String
contains()	searches the vector for specified element and returns a boolean result












### Java Stack Class
In this tutorial, we will learn about the Java Stack class and its methods with the help of examples.

The Java collections framework has a class named Stack that provides the functionality of the stack data structure.

The Stack class extends the Vector class.

Java Stack class extending the Vector class

Stack Implementation
In stack, elements are stored and accessed in Last In First Out manner. That is, elements are added to the top of the stack and removed from the top of the stack.

Working of stack data structure

Creating a Stack
In order to create a stack, we must import the java.util.Stack package first. Once we import the package, here is how we can create a stack in Java.

Stack<Type> stacks = new Stack<>();
Here, Type indicates the stack's type. For example,

// Create Integer type stack
Stack<Integer> stacks = new Stack<>();

// Create String type stack
Stack<String> stacks = new Stack<>();
Stack Methods
Since Stack extends the Vector class, it inherits all the methods Vector. To learn about different Vector methods, visit Java Vector Class.

Besides these methods, the Stack class includes 5 more methods that distinguish it from Vector.

push() Method
To add an element to the top of the stack, we use the push() method. For example,

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
    }
}
Run Code
Output

Stack: [Dog, Horse, Cat]
pop() Method

To remove an element from the top of the stack, we use the pop() method. For example,

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Initial Stack: " + animals);

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
    }
}
Run Code
Output

Initial Stack: [Dog, Horse, Cat]
Removed Element: Cat
peek() Method
The peek() method returns an object from the top of the stack. For example,

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Access element from the top
        String element = animals.peek();
        System.out.println("Element at top: " + element);

    }
}
Run Code
Output

Stack: [Dog, Horse, Cat]
Element at top: Cat
search() Method
To search an element in the stack, we use the search() method. It returns the position of the element from the top of the stack. For example,

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
    }
}
Run Code
Output

Stack: [Dog, Horse, Cat]
Position of Horse: 2
empty() Method
To check whether a stack is empty or not, we use the empty() method. For example,

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
Run Code
Output

Stack: [Dog, Horse, Cat]
Is the stack empty? false
Use ArrayDeque Instead of Stack
The Stack class provides the direct implementation of the stack data structure. However, it is recommended not to use it. Instead, use the ArrayDeque class (implements the Deque interface) to implement the stack data structure in Java.

To learn more, visit:

Java ArrayDeque
Why use Deque over Stack?










### Java Queue Interface
In this tutorial, we will learn about the Java Queue interface and its methods.

The Queue interface of the Java collections framework provides the functionality of the queue data structure. It extends the Collection interface.

Classes that Implement Queue
Since the Queue is an interface, we cannot provide the direct implementation of it.

In order to use the functionalities of Queue, we need to use classes that implement it:

ArrayDeque
LinkedList
PriorityQueue
ArrayDeque, LinkedList and PriorityQueue implements the Queue interface in Java.

Interfaces that extend Queue
The Queue interface is also extended by various subinterfaces:

Deque
BlockingQueue
BlockingDeque
Deque, BlockingQueue and BlockingDeque extends the the Queue interface.

Working of Queue Data Structure
In queues, elements are stored and accessed in First In, First Out manner. That is, elements are added from the behind and removed from the front.

Working of queue data structure: first in first out.

How to use Queue?
In Java, we must import java.util.Queue package in order to use Queue.


// LinkedList implementation of Queue
Queue<String> animal1 = new LinkedList<>();

// Array implementation of Queue
Queue<String> animal2 = new ArrayDeque<>();

// Priority Queue implementation of Queue
Queue<String> animal 3 = new PriorityQueue<>();
Here, we have created objects animal1, animal2 and animal3 of classes LinkedList, ArrayDeque and PriorityQueue respectively. These objects can use the functionalities of the Queue interface.

Methods of Queue

The Queue interface includes all the methods of the Collection interface. It is because Collection is the super interface of Queue.

Some of the commonly used methods of the Queue interface are:

add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
element() - Returns the head of the queue. Throws an exception if the queue is empty.
peek() - Returns the head of the queue. Returns null if the queue is empty.
remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
Implementation of the Queue Interface
##### 1. Implementing the LinkedList Class

import java.util.Queue;
import java.util.LinkedList;

class Main {

    public static void main(String[] args) {
        // Creating Queue using the LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        // offer elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}
Run Code
Output

Queue: [1, 2, 3]
Accessed Element: 1
Removed Element: 1
Updated Queue: [2, 3]
To learn more, visit Java LinkedList.

##### 2. Implementing the PriorityQueue Class

import java.util.Queue;
import java.util.PriorityQueue;

class Main {

    public static void main(String[] args) {
        // Creating Queue using the PriorityQueue class
        Queue<Integer> numbers = new PriorityQueue<>();

        // offer elements to the Queue
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}
Run Code
Output

Queue: [1, 5, 2]
Accessed Element: 1
Removed Element: 1
Updated Queue: [2, 5]
To learn more, visit Java PriorityQueue.

In the next tutorials, we will learn about different subinterfaces of the Queue interface and its implementation in detail.











### Java PriorityQueue
In this tutorial, we will learn about the PriorityQueue class of the Java collections framework with the help of examples.

The PriorityQueue class provides the functionality of the heap data structure.

It implements the Queue interface.

The Java PriorityQueue class implements the Queue interface.

Unlike normal queues, priority queue elements are retrieved in sorted order.

Suppose, we want to retrieve elements in the ascending order. In this case, the head of the priority queue will be the smallest element. Once this element is retrieved, the next smallest element will be the head of the queue.

It is important to note that the elements of a priority queue may not be sorted. However, elements are always retrieved in sorted order.

Creating PriorityQueue
In order to create a priority queue, we must import the java.util.PriorityQueue package. Once we import the package, here is how we can create a priority queue in Java.

PriorityQueue<Integer> numbers = new PriorityQueue<>();
Here, we have created a priority queue without any arguments. In this case, the head of the priority queue is the smallest element of the queue. And elements are removed in ascending order from the queue.

However, we can customize the ordering of elements with the help of the Comparator interface. We will learn about that later in this tutorial.

Methods of PriorityQueue
The PriorityQueue class provides the implementation of all the methods present in the Queue interface.

Insert Elements to PriorityQueue
add() - Inserts the specified element to the queue. If the queue is full, it throws an exception.
offer() - Inserts the specified element to the queue. If the queue is full, it returns false.
For example,

import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);
    }
}
Run Code
Output

PriorityQueue: [2, 4]
Updated PriorityQueue: [1, 4, 2]
Here, we have created a priority queue named numbers. We have inserted 4 and 2 to the queue.

Although 4 is inserted before 2, the head of the queue is 2. It is because the head of the priority queue is the smallest element of the queue.


We have then inserted 1 to the queue. The queue is now rearranged to store the smallest element 1 to the head of the queue.

Access PriorityQueue Elements
To access elements from a priority queue, we can use the peek() method. This method returns the head of the queue. For example,

import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);

        // Using the peek() method
        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);
    }
}
Run Code
Output

PriorityQueue: [1, 4, 2]
Accessed Element: 1
Remove PriorityQueue Elements
remove() - removes the specified element from the queue
poll() - returns and removes the head of the queue
For example,

import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);

        // Using the remove() method
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int number = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number);
    }
}
Run Code
Output

PriorityQueue: [1, 4, 2]
Is the element 2 removed? true
Removed Element Using poll(): 1
Iterating Over a PriorityQueue
To iterate over the elements of a priority queue, we can use the iterator() method. In order to use this method, we must import the java.util.Iterator package. For example,

import java.util.PriorityQueue;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.print("PriorityQueue using iterator(): ");

        //Using the iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
Run Code
Output

PriorityQueue using iterator(): 1, 4, 2,
Other PriorityQueue Methods
Methods	Descriptions
contains(element)	Searches the priority queue for the specified element. If the element is found, it returns true, if not it returns false.
size()	Returns the length of the priority queue.
toArray()	Converts a priority queue to an array and returns it.
PriorityQueue Comparator
In all the examples above, priority queue elements are retrieved in the natural order (ascending order). However, we can customize this ordering.

For this, we need to create our own comparator class that implements the Comparator interface. For example,

import java.util.PriorityQueue;
import java.util.Comparator;
class Main {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        System.out.print("PriorityQueue: " + numbers);
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
Run Code
Output

PriorityQueue: [4, 3, 1, 2]
In the above example, we have created a priority queue passing CustomComparator class as an argument.

The CustomComparator class implements the Comparator interface.

We then override the compare() method. The method now causes the head of the element to be the largest number.

To learn more about the comparator, visit Java Comparator.














### Java Deque Interface
In this tutorial, we will learn about the Deque interface, how to use it, and its methods.

The Deque interface of the Java collections framework provides the functionality of a double-ended queue. It extends the Queue interface.

Working of Deque
In a regular queue, elements are added from the rear and removed from the front. However, in a deque, we can insert and remove elements from both front and rear.

Working of deque (double-ended queue) data structure

Classes that implement Deque
In order to use the functionalities of the Deque interface, we need to use classes that implement it:

ArrayDeque
LinkedList
ArrayDeque and Linkedlist implements Deque

How to use Deque?
In Java, we must import the java.util.Deque package to use Deque.

// Array implementation of Deque
Deque<String> animal1 = new ArrayDeque<>();

// LinkedList implementation of Deque
Deque<String> animal2 = new LinkedList<>();
Here, we have created objects animal1 and animal2 of classes ArrayDeque and LinkedList, respectively. These objects can use the functionalities of the Deque interface.

Methods of Deque

Since Deque extends the Queue interface, it inherits all the methods of the Queue interface.

Besides methods available in the Queue interface, the Deque interface also includes the following methods:

addFirst() - Adds the specified element at the beginning of the deque. Throws an exception if the deque is full.
addLast() - Adds the specified element at the end of the deque. Throws an exception if the deque is full.
offerFirst() - Adds the specified element at the beginning of the deque. Returns false if the deque is full.
offerLast() - Adds the specified element at the end of the deque. Returns false if the deque is full.
getFirst() - Returns the first element of the deque. Throws an exception if the deque is empty.
getLast() - Returns the last element of the deque. Throws an exception if the deque is empty.
peekFirst() - Returns the first element of the deque. Returns null if the deque is empty.
peekLast() - Returns the last element of the deque. Returns null if the deque is empty.
removeFirst() - Returns and removes the first element of the deque. Throws an exception if the deque is empty.
removeLast() - Returns and removes the last element of the deque. Throws an exception if the deque is empty.
pollFirst() - Returns and removes the first element of the deque. Returns null if the deque is empty.
pollLast() - Returns and removes the last element of the deque. Returns null if the deque is empty.
Deque as Stack Data Structure
The Stack class of the Java Collections framework provides the implementation of the stack.

However, it is recommended to use Deque as a stack instead of the Stack class. It is because methods of Stack are synchronized.

Here are the methods the Deque interface provides to implement stack:

push() - adds an element at the beginning of deque
pop() - removes an element from the beginning of deque
peek() - returns an element from the beginning of deque
Implementation of Deque in ArrayDeque Class
import java.util.Deque;
import java.util.ArrayDeque;

class Main {

    public static void main(String[] args) {
        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        // add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);
    }
}
Run Code
Output

Deque: [3, 1, 2]
First Element: 3
Last Element: 2
Removed First Element: 3
Removed Last Element: 2
Updated Deque: [1]
To learn more, visit Java ArrayDeque.













### Java LinkedList
In this tutorial, we will learn about the Java LinkedList in detail with the help of examples.

The LinkedList class of the Java collections framework provides the functionality of the linked list data structure (doubly linkedlist).

A single node of doubly linkedlist that has 3 fields Prev, Data, and Next.
Java Doubly LinkedList
Each element in a linked list is known as a node. It consists of 3 fields:

Prev - stores an address of the previous element in the list. It is null for the first element
Next - stores an address of the next element in the list. It is null for the last element
Data - stores the actual data
Creating a Java LinkedList
Here is how we can create linked lists in Java:

LinkedList<Type> linkedList = new LinkedList<>();
Here, Type indicates the type of a linked list. For example,

// create Integer type linked list
LinkedList<Integer> linkedList = new LinkedList<>();

// create String type linked list
LinkedList<String> linkedList = new LinkedList<>();
Example: Create LinkedList in Java
import java.util.LinkedList;

class Main {
  public static void main(String[] args){

    // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);
  }
}
Run Code
Output

LinkedList: [Dog, Cat, Cow]
In the above example, we have created a LinkedList named animals.

Here, we have used the add() method to add elements to the LinkedList. We will learn more about the add() method later in this tutorial.

Working of a Java LinkedList
Elements in linked lists are not stored in sequence. Instead, they are scattered and connected through links (Prev and Next).

3 linkedlist nodes each connecting to one another using pointers
Java LinkedList Implementation
Here we have 3 elements in a linked list.

Dog - it is the first element that holds null as previous address and the address of Cat as the next address
Cat - it is the second element that holds an address of Dog as the previous address and the address of Cow as the next address
Cow - it is the last element that holds the address of Cat as the previous address and null as the next element
To learn more, visit the LinkedList Data Structure.

Methods of Java LinkedList
LinkedList provides various methods that allow us to perform different operations in linked lists. We will look at four commonly used LinkedList Operators in this tutorial:

Add elements
Access elements
Change elements
Remove elements
#### 1. Add elements to a LinkedList
We can use the add() method to add an element (node) at the end of the LinkedList. For example,

import java.util.LinkedList;

class Main {
  public static void main(String[] args){
    // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // add() method without the index parameter
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);

    // add() method with the index parameter
    animals.add(1, "Horse");
    System.out.println("Updated LinkedList: " + animals);
  }
}
Run Code
Output

LinkedList: [Dog, Cat, Cow]
Updated LinkedList: [Dog, Horse, Cat, Cow]
In the above example, we have created a LinkedList named animals. Here, we have used the add() method to add elements to animals.

Notice the statement,

animals.add(1, "Horse");
Here, we have used the index number parameter. It is an optional parameter that specifies the position where the new element is added.

To learn more about adding elements to LinkedList, visit Java program to add elements to LinkedList.

#### 2. Access LinkedList elements
The get() method of the LinkedList class is used to access an element from the LinkedList. For example,

import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add elements in the linked list
    languages.add("Python");
    languages.add("Java");
    languages.add("JavaScript");
    System.out.println("LinkedList: " + languages);

    // get the element from the linked list
    String str = languages.get(1);
    System.out.print("Element at index 1: " + str);
  }
}
Run Code
Output

LinkedList: [Python, Java, JavaScript]
Element at index 1: Java

In the above example, we have used the get() method with parameter 1. Here, the method returns the element at index 1.

We can also access elements of the LinkedList using the iterator() and the listIterator() method. To learn more, visit the Java program to access elements of LinkedList.

#### 3. Change Elements of a LinkedList
The set() method of LinkedList class is used to change elements of the LinkedList. For example,

import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add elements in the linked list
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Java");
    System.out.println("LinkedList: " + languages);

    // change elements at index 3
    languages.set(3, "Kotlin");
    System.out.println("Updated LinkedList: " + languages);
  }
}
Run Code
Output

LinkedList: [Java, Python, JavaScript, Java]
Updated LinkedList: [Java, Python, JavaScript, Kotlin]
In the above example, we have created a LinkedList named languages. Notice the line,

languages.set(3, "Kotlin");
Here, the set() method changes the element at index 3 to Kotlin.

#### 4. Remove element from a LinkedList
The remove() method of the LinkedList class is used to remove an element from the LinkedList. For example,

import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add elements in LinkedList
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Kotlin");
    System.out.println("LinkedList: " + languages);

    // remove elements from index 1
    String str = languages.remove(1);
    System.out.println("Removed Element: " + str);

    System.out.println("Updated LinkedList: " + languages);
  }
}
Run Code
Output

LinkedList: [Java, Python, JavaScript, Kotlin]
Removed Element: Python
New LinkedList: [Java, JavaScript, Kotlin]
Here, the remove() method takes the index number as the parameter. And, removes the element specified by the index number.

To learn more about removing elements from the linkedlist, visit the Java program to remove elements from LinkedList..

Other Methods
Methods	Description
contains()	checks if the LinkedList contains the element
indexOf()	returns the index of the first occurrence of the element
lastIndexOf()	returns the index of the last occurrence of the element
clear()	removes all the elements of the LinkedList
iterator()	returns an iterator to iterate over LinkedList
LinkedList as Deque and Queue
Since the LinkedList class also implements the Queue and the Deque interface, it can implement methods of these interfaces as well. Here are some of the commonly used methods:

Methods	Descriptions
addFirst()	adds the specified element at the beginning of the linked list
addLast()	adds the specified element at the end of the linked list
getFirst()	returns the first element
getLast()	returns the last element
removeFirst()	removes the first element
removeLast()	removes the last element
peek()	returns the first element (head) of the linked list
poll()	returns and removes the first element from the linked list
offer()	adds the specified element at the end of the linked list
Example: Java LinkedList as Queue
import java.util.LinkedList;
import java.util.Queue;

class Main {
  public static void main(String[] args) {
    Queue<String> languages = new LinkedList<>();

    // add elements
    languages.add("Python");
    languages.add("Java");
    languages.add("C");
    System.out.println("LinkedList: " + languages);

    // access the first element
    String str1 = languages.peek();
    System.out.println("Accessed Element: " + str1);

    // access and remove the first element
    String str2 = languages.poll();
    System.out.println("Removed Element: " + str2);
    System.out.println("LinkedList after poll(): " + languages);

    // add element at the end
    languages.offer("Swift");
    System.out.println("LinkedList after offer(): " + languages);
  }
}
Run Code
Output

LinkedList: [Python, Java, C]
Accessed Element: Python
Removed Element: Python
LinkedList after poll(): [Java, C]
LinkedList after offer(): [Java, C, Swift]
Example: LinkedList as Deque
import java.util.LinkedList;
import java.util.Deque;

class Main {
  public static void main(String[] args){
    Deque<String> animals = new LinkedList<>();

    // add element at the beginning
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);

    animals.addFirst("Dog");
    System.out.println("LinkedList after addFirst(): " + animals);

    // add elements at the end
    animals.addLast("Zebra");
    System.out.println("LinkedList after addLast(): " + animals);

    // remove the first element
    animals.removeFirst();
    System.out.println("LinkedList after removeFirst(): " + animals);

    // remove the last element
    animals.removeLast();
    System.out.println("LinkedList after removeLast(): " + animals);
  }
}
Run Code
Output

LinkedList: [Cow]
LinkedList after addFirst(): [Dog, Cow]
LinkedList after addLast(): [Dog, Cow, Zebra]
LinkedList after removeFirst(): [Cow, Zebra]
LinkedList after removeLast(): [Cow]
Iterating through LinkedList
We can use the Java for-each loop to iterate through LinkedList. For example,

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        // Creating a linked list
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("LinkedList: " + animals);

        // Using forEach loop
        System.out.println("Accessing linked list elements:");
        for(String animal: animals) {
            System.out.print(animal);
            System.out.print(", ");
        }
    }
}
Run Code
Output

LinkedList: [Cow, Cat, Dog]
Accessing linked list elements:
Cow, Cat, Dog,
LinkedList Vs. ArrayList
Both the Java ArrayList and LinkedList implements the List interface of the Collections framework. However, there exists some difference between them.

###### LinkedList	ArrayList
Implements List, Queue, and Deque interfaces.	Implements List interface.
Stores 3 values (previous address, data, and next address) in a single position.	Stores a single value in a single position.
Provides the doubly-linked list implementation.	Provides a resizable array implementation.
Whenever an element is added, prev and next address are changed.	Whenever an element is added, all elements after that position are shifted.
To access an element, we need to iterate from the beginning to the element.	Can randomly access elements using indexes.
Note: We can also create a LinkedList using interfaces in Java. For example,

// create linkedlist using List
List<String> animals1 = new LinkedList<>();

// creating linkedlist using Queue
Queue<String> animals2 = new LinkedList<>();

// creating linkedlist using Deque
Deque<String> animals3 = new LinkedList<>();
Here, if the LinkedList is created using one interface, then we cannot use methods provided by other interfaces. That is, animals1 cannot use methods specific to Queue and Deque interfaces.










### Java ArrayDeque
In this tutorial, we will learn about the ArrayDeque class and its methods with the help of examples. Also, we will learn to use array deque to implement a stack.

In Java, we can use the ArrayDeque class to implement queue and deque data structures using arrays.

Interfaces implemented by ArrayDeque
The ArrayDeque class implements these two interfaces:

Java Queue Interface
Java Deque Interface
ArrayDeque in Java implements two interfaces: Queue and Deque

Creating ArrayDeque
In order to create an array deque, we must import the java.util.ArrayDeque package.

Here is how we can create an array deque in Java:

ArrayDeque<Type> animal = new ArrayDeque<>();
Here, Type indicates the type of the array deque. For example,

// Creating String type ArrayDeque
ArrayDeque<String> animals = new ArrayDeque<>();

// Creating Integer type ArrayDeque
ArrayDeque<Integer> age = new ArrayDeque<>();
Methods of ArrayDeque
The ArrayDeque class provides implementations for all the methods present in Queue and Deque interface.

Insert Elements to Deque
#### 1. Add elements using add(), addFirst() and addLast()

add() - inserts the specified element at the end of the array deque
addFirst() - inserts the specified element at the beginning of the array deque
addLast() - inserts the specified at the end of the array deque (equivalent to add())
Note: If the array deque is full, all these methods add(), addFirst() and addLast() throws IllegalStateException.

For example,

import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();

        // Using add()
        animals.add("Dog");

        // Using addFirst()
        animals.addFirst("Cat");

        // Using addLast()
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);
    }
}
Run Code
Output

ArrayDeque: [Cat, Dog, Horse]
#### 2. Insert elements using offer(), offerFirst() and offerLast()

offer() - inserts the specified element at the end of the array deque
offerFirst() - inserts the specified element at the beginning of the array deque
offerLast() - inserts the specified element at the end of the array deque
Note: offer(), offerFirst() and offerLast() returns true if the element is successfully inserted; if the array deque is full, these methods return false.

For example,

import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        // Using offer()
        animals.offer("Dog");

        // Using offerFirst()
        animals.offerFirst("Cat");

        // Using offerLast()
        animals.offerLast("Horse");
        System.out.println("ArrayDeque: " + animals);
    }
}
Run Code
Output

ArrayDeque: [Cat, Dog, Horse]
Note: If the array deque is full

the add() method will throw an exception
the offer() method returns false
Access ArrayDeque Elements
##### 1. Access elements using getFirst() and getLast()

getFirst() - returns the first element of the array deque
getLast() - returns the last element of the array deque
Note: If the array deque is empty, getFirst() and getLast() throws NoSuchElementException.

For example,

import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Get the first element
        String firstElement = animals.getFirst();
        System.out.println("First Element: " + firstElement);

        // Get the last element
        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);
    }
}
Run Code
Output

ArrayDeque: [Dog, Cat, Horse]
First Element: Dog
Last Element: Horse
##### 2. Access elements using peek(), peekFirst() and peekLast() method

peek() - returns the first element of the array deque
peekFirst() - returns the first element of the array deque (equivalent to peek())
peekLast() - returns the last element of the array deque

For example,

import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Using peek()
        String element = animals.peek();
        System.out.println("Head Element: " + element);

        // Using peekFirst()
        String firstElement = animals.peekFirst();
        System.out.println("First Element: " + firstElement);

        // Using peekLast
        String lastElement = animals.peekLast();
        System.out.println("Last Element: " + lastElement);
    }
}
Run Code
Output

ArrayDeque: [Dog, Cat, Horse]
Head Element: Dog
First Element: Dog
Last Element: Horse
Note: If the array deque is empty, peek(), peekFirst() and getLast() throws NoSuchElementException.

#### Remove ArrayDeque Elements
1. Remove elements using the remove(), removeFirst(), removeLast() method

remove() - returns and removes an element from the first element of the array deque
remove(element) - returns and removes the specified element from the head of the array deque
removeFirst() - returns and removes the first element from the array deque (equivalent to remove())
removeLast() - returns and removes the last element from the array deque
Note: If the array deque is empty, remove(), removeFirst() and removeLast() method throws an exception. Also, remove(element) throws an exception if the element is not found.

For example,

import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Using remove()
        String element = animals.remove();
        System.out.println("Removed Element: " + element);

        System.out.println("New ArrayDeque: " + animals);

        // Using removeFirst()
        String firstElement = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement);

        // Using removeLast()
        String lastElement = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement);
    }
}
Run Code
Output

ArrayDeque: [Dog, Cat, Cow, Horse]
Removed Element: Dog
New ArrayDeque: [Cat, Cow, Horse]
Removed First Element: Cat
Removed Last Element: Horse
2. Remove elements using the poll(), pollFirst() and pollLast() method

poll() - returns and removes the first element of the array deque
pollFirst() - returns and removes the first element of the array deque (equivalent to poll())
pollLast() - returns and removes the last element of the array deque
Note: If the array deque is empty, poll(), pollFirst() and pollLast() returns null if the element is not found.

For example,

import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Using poll()
        String element = animals.poll();
        System.out.println("Removed Element: " + element);
        System.out.println("New ArrayDeque: " + animals);

        // Using pollFirst()
        String firstElement = animals.pollFirst();
        System.out.println("Removed First Element: " + firstElement);

        // Using pollLast()
        String lastElement = animals.pollLast();
        System.out.println("Removed Last Element: " + lastElement);
    }
}
Run Code
Output

ArrayDeque: [Dog, Cat, Cow, Horse]
Removed Element: Dog
New ArrayDeque: [Cat, Cow, Horse]
Removed First Element: Cat
Removed Last Element: Horse
3. Remove Element: using the clear() method

To remove all the elements from the array deque, we use the clear() method. For example,

import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Using clear()
        animals.clear();

        System.out.println("New ArrayDeque: " + animals);
    }
}
Run Code
Output

ArrayDeque: [Dog, Cat, Horse]
New ArrayDeque: []
Iterating the ArrayDeque
iterator() - returns an iterator that can be used to iterate over the array deque
descendingIterator() - returns an iterator that can be used to iterate over the array deque in reverse order
In order to use these methods, we must import the java.util.Iterator package. For example,

import java.util.ArrayDeque;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.print("ArrayDeque: ");

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.print("\nArrayDeque in reverse order: ");
        // Using descendingIterator()
        Iterator<String> desIterate = animals.descendingIterator();
        while(desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }
    }
}
Run Code
Output

ArrayDeque: [Dog, Cat, Horse]
ArrayDeque in reverse order: [Horse, Cat, Dog]
Other Methods
Methods	Descriptions
element()	Returns an element from the head of the array deque.
contains(element)	Searches the array deque for the specified element.

				If the element is found, it returns true, if not it returns false.
size()	Returns the length of the array deque.
toArray()	Converts array deque to array and returns it.
clone() 	Creates a copy of the array deque and returns it.
ArrayDeque as a Stack
To implement a LIFO (Last-In-First-Out) stacks in Java, it is recommended to use a deque over the Stack class. The ArrayDeque class is likely to be faster than the Stack class.

ArrayDeque provides the following methods that can be used for implementing a stack.

push() - adds an element to the top of the stack
peek() - returns an element from the top of the stack
pop() - returns and removes an element from the top of the stack
For example,

import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Add elements to stack
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Horse");
        System.out.println("Stack: " + stack);

        // Access element from top of stack
        String element = stack.peek();
        System.out.println("Accessed Element: " + element);

        // Remove elements from top of stack
        String remElement = stack.pop();
        System.out.println("Removed element: " + remElement);
    }
}
Run Code
Output

Stack: [Horse, Cat, Dog]
Accessed Element: Horse
Removed Element: Horse
ArrayDeque Vs. LinkedList Class
Both ArrayDeque and Java LinkedList implements the Deque interface. However, there exist some differences between them.

LinkedList supports null elements, whereas ArrayDeque doesn't.
Each node in a linked list includes links to other nodes. That's why LinkedList requires more storage than ArrayDeque.
If you are implementing the queue or the deque data structure, an ArrayDeque is likely to faster than a LinkedList.













### Java BlockingQueue
In this tutorial, we will learn about the Java BlockingQueue interface and its methods.

The BlockingQueue interface of the Java Collections framework extends the Queue interface. It allows any operation to wait until it can be successfully performed.

For example, if we want to delete an element from an empty queue, then the blocking queue allows the delete operation to wait until the queue contains some elements to be deleted.

Classes that Implement BlockingQueue
Since BlockingQueue is an interface, we cannot provide the direct implementation of it.

In order to use the functionality of the BlockingQueue, we need to use classes that implement it.

ArrayBlockingQueue
LinkedBlockingQueue
ArrayBlockingQueue and LinkedBlockingQueue implements the BlockingQueue interface in Java.

How to use blocking queues?
We must import the java.util.concurrent.BlockingQueue package in order to use BlockingQueue.

// Array implementation of BlockingQueue
BlockingQueue<String> animal1 = new ArraryBlockingQueue<>();

// LinkedList implementation of BlockingQueue
BlockingQueue<String> animal2 = new LinkedBlockingQueue<>();
Here, we have created objects animal1 and animal2 of classes ArrayBlockingQueue and LinkedBlockingQueue, respectively. These objects can use the functionalities of the BlockingQueue interface.

Methods of BlockingQueue
Based on whether a queue is full or empty, methods of a blocking queue can be divided into 3 categories:

Methods that throw an exception
add() - Inserts an element to the blocking queue at the end of the queue. Throws an exception if the queue is full.
element() - Returns the head of the blocking queue. Throws an exception if the queue is empty.
remove() - Removes an element from the blocking queue. Throws an exception if the queue is empty.
Methods that return some value
offer() - Inserts the specified element to the blocking queue at the end of the queue. Returns false if the queue is full.
peek() - Returns the head of the blocking queue. Returns null if the queue is empty.
poll() - Removes an element from the blocking queue. Returns null if the queue is empty.
More on offer() and poll()

The offer() and poll() method can be used with timeouts. That is, we can pass time units as a parameter. For example,

offer(value, 100, milliseconds)

Here,

value is the element to be inserted to the queue
And we have set a timeout of 100 milliseconds
This means the offer() method will try to insert an element to the blocking queue for 100 milliseconds. If the element cannot be inserted in 100 milliseconds, the method returns false.

Note: Instead of milliseconds, we can also use these time units: days, hours, minutes, seconds, microseconds and nanoseconds in offer() and poll() methods.

Methods that blocks the operation
The BlockingQueue also provides methods to block the operations and wait if the queue is full or empty.

put() - Inserts an element to the blocking queue. If the queue is full, it will wait until the queue has space to insert an element.
take() - Removes and returns an element from the blocking queue. If the queue is empty, it will wait until the queue has elements to be deleted.
Suppose, we want to insert elements into a queue. If the queue is full then the put() method will wait until the queue has space to insert elements.

Similarly, if we want to delete elements from a queue. If the queue is empty then the take() method will wait until the queue contains elements to be deleted.

Implementation of BlockingQueue in ArrayBlockingQueue
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

class Main {

    public static void main(String[] args) {
      // Create a blocking queue using the ArrayBlockingQueue
      BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

      try {
        // Insert element to blocking queue
        numbers.put(2);
        numbers.put(1);
        numbers.put(3);
        System.out.println("BLockingQueue: " + numbers);

        // Remove Elements from blocking queue
        int removedNumber = numbers.take();
        System.out.println("Removed Number: " + removedNumber);
      }

      catch(Exception e) {
          e.getStackTrace();
      }
    }
}
Run Code
Output

BlockingQueue: [2, 1, 3]
Removed Element: 2
To learn more about ArrayBlockingQueue, visit Java ArrayBlockingQueue.

Why BlockingQueue?
In Java, BlockingQueue is considered as the thread-safe collection. It is because it can be helpful in multi-threading operations.

Suppose one thread is inserting elements to the queue and another thread is removing elements from the queue.

Now, if the first thread runs slower, then the blocking queue can make the second thread wait until the first thread completes its operation.
















### Java ArrayBlockingQueue
In this tutorial, we will learn about the ArrayBlockingQueue class and its methods with the help of examples.

The ArrayBlockingQueue class of the Java Collections framework provides the blocking queue implementation using an array.

It implements the Java BlockingQueue interface.

ArrayBlockingQueue implements the BlockingQueue interface in Java.

Creating ArrayBlockingQueue
In order to create an array blocking queue, we must import the java.util.concurrent.ArrayBlockingQueue package.

Once we import the package, here is how we can create an array blocking queue in Java:

ArrayBlockingQueue<Type> animal = new ArrayBlockingQueue<>(int capacity);
Here,

Type - the type of the array blocking queue
capacity - the size of the array blocking queue
For example,

// Creating String type ArrayBlockingQueue with size 5
ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

// Creating Integer type ArrayBlockingQueue with size 5
ArrayBlockingQueue<Integer> age = new ArrayBlockingQueue<>(5);
Note: It is compulsory to provide the size of the array.

Methods of ArrayBlockingQueue
The ArrayBlockingQueue class provides the implementation of all the methods in the BlockingQueue interface.

These methods are used to insert, access and delete elements from array blocking queues.

Also, we will learn about two methods put() and take() that support the blocking operation in the array blocking queue.

These two methods distinguish the array blocking queue from other typical queues.

Insert Elements
add() - Inserts the specified element to the array blocking queue. It throws an exception if the queue is full.
offer() - Inserts the specified element to the array blocking queue. It returns false if the queue is full.
For example,

import java.util.concurrent.ArrayBlockingQueue;

class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        // Using add()
        animals.add("Dog");
        animals.add("Cat");

        // Using offer()
        animals.offer("Horse");
        System.out.println("ArrayBlockingQueue: " + animals);
    }
}
Run Code
Output

ArrayBlockingQueue: [Dog, Cat, Horse]
Access Elements
peek() - Returns an element from the front of the array blocking queue. It returns null if the queue is empty.
iterator() - Returns an iterator object to sequentially access elements from the array blocking queue. It throws an exception if the queue is empty. We must import the java.util.Iterator package to use it.
For example,

import java.util.concurrent.ArrayBlockingQueue;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayBlockingQueue: " + animals);

        // Using peek()
        String element = animals.peek();
        System.out.println("Accessed Element: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("ArrayBlockingQueue Elements: ");

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
Run Code
Output

ArrayBlockingQueue: [Dog, Cat, Horse]
Accessed Element: Dog
ArrayBlockingQueue Elements: Dog, Cat, Horse,
Remove Elements
remove() - Returns and removes a specified element from the array blocking queue. It throws an exception if the queue is empty.
poll() - Returns and removes a specified element from the array blocking queue. It returns null if the queue is empty.
clear() - Removes all the elements from the array blocking queue.
For example,

import java.util.concurrent.ArrayBlockingQueue;

class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayBlockingQueue: " + animals);

        // Using remove()
        String element1 = animals.remove();
        System.out.println("Removed Element:");
        System.out.println("Using remove(): " + element1);

        // Using poll()
        String element2 = animals.poll();
        System.out.println("Using poll(): " + element2);

        // Using clear()
        animals.clear();
        System.out.println("Updated ArrayBlockingQueue: " + animals);
    }
}
Run Code

Output

ArrayBlockingQueue: [Dog, Cat, Horse]
Removed Elements:
Using remove(): Dog
Using poll(): Cat
Updated ArrayBlockingQueue: []
put() and take() Method
In multithreading processes, we can use put() and take() to block the operation of one thread to synchronize it with another thread. These methods will wait until they can be successfully executed.

put() method
To add an element to the end of an array blocking queue, we can use the put() method.

If the array blocking queue is full, it waits until there is space in the array blocking queue to add an element.

For example,

import java.util.concurrent.ArrayBlockingQueue;

class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

       try {
        // Add elements to animals
           animals.put("Dog");
           animals.put("Cat");
           System.out.println("ArrayBlockingQueue: " + animals);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
Run Code
Output

ArrayBlockingQueue: [Dog, Cat]
Here, the put() method may throw an InterruptedException if it is interrupted while waiting. Hence, we must enclose it inside a try..catch block.

take() Method
To return and remove an element from the front of the array blocking queue, we can use the take() method.

If the array blocking queue is empty, it waits until there are elements in the array blocking queue to be deleted.

For example,

import java.util.concurrent.ArrayBlockingQueue;

class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

       try {
           //Add elements to animals
           animals.put("Dog");
           animals.put("Cat");
           System.out.println("ArrayBlockingQueue: " + animals);

           // Remove an element
           String element = animals.take();
           System.out.println("Removed Element: " + element);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
Run Code
Output

ArrayBlockingQueue: [Dog, Cat]
Removed Element: Dog
Here, the take() method will throw an InterrupedException if it is interrupted while waiting. Hence, we must enclose it inside a try...catch block.

Other Methods
Methods	Descriptions
contains(element)	Searches the array blocking queue for the specified element.If the element is found, it returns true, if not it returns false.
size()	Returns the length of the array blocking queue.
toArray()	Converts array blocking queue to an array and returns it.
toString() 	Converts the array blocking queue to string
Why use ArrayBlockingQueue?
The ArrayBlockingQueue uses arrays as its internal storage.

It is considered as a thread-safe collection. Hence, it is generally used in multi-threading applications.

Suppose, one thread is inserting elements to the queue and another thread is removing elements from the queue.

Now, if the first thread is slower than the second thread, then the array blocking queue can make the second thread waits until the first thread completes its operations.













### Java LinkedBlockingQueue
In this tutorial, we will learn about the LinkedBLockingQueue class and its methods with the help of examples.

The LinkedBlockingQueue class of the Java Collections framework provides the blocking queue implementation using a linked list.

It implements the Java BlockingQueue interface.

ArrayBlockingQueue implements the BlockingQueue interface in Java.

Creating LinkedBlockingQueue
In order to create a linked blocking queue, we must import the java.util.concurrent.LinkedBlockingQueue package.

Here is how we can create a linked blocking queue in Java:

1. Without the initial capacity

LinkedBlockingQueue<Type> animal = new LinkedBlockingQueue<>();
Here the default initial capacity will be 231-1.

2. With the initial capacity

LinkedBlockingQueue<Type> animal = new LinkedBlockingQueue<>(int capacity);
Here,

Type - the type of the linked blocking queue
capacity - the size of the linked blocking queue
For example,

// Creating String type LinkedBlockingQueue with size 5
LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

// Creating Integer type LinkedBlockingQueue with size 5
LinkedBlockingQueue<Integer> age = new LinkedBlockingQueue<>(5);
Note: It is not compulsory to provide the size of the linked list.

Methods of LinkedBlockingQueue
The LinkedBlockingQueue class provides the implementation of all the methods in the BlockingQueue interface.

These methods are used to insert, access and delete elements from linked blocking queues.

Also, we will learn about two methods put() and take() that support the blocking operation in the linked blocking queue.

These two methods distinguish the linked blocking queue from other typical queues.

Insert Elements
add() - Inserts a specified element to the linked blocking queue. It throws an exception if the queue is full.
offer() - Inserts a specified element to the linked blocking queue. It returns false if the queue is full.
For example,

import java.util.concurrent.LinkedBlockingQueue;

class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

        // Using add()
        animals.add("Dog");
        animals.add("Cat");

        // Using offer()
        animals.offer("Horse");
        System.out.println("LinkedBlockingQueue: " + animals);
    }
}
Run Code
Output

LinkedBlockingQueue: [Dog, Cat, Horse]
Access Elements
peek() - Returns an element from the front of the linked blocking queue. It returns null if the queue is empty.
iterator() - Returns an iterator object to sequentially access an element from the linked blocking queue. It throws an exception if the queue is empty. We must import the java.util.Iterator package to use it.
For example,

import java.util.concurrent.LinkedBlockingQueue;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedBlockingQueue: " + animals);

        // Using peek()
        String element = animals.peek();
        System.out.println("Accessed Element: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("LinkedBlockingQueue Elements: ");

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
Run Code

Output

LinkedBlockingQueue: [Dog, Cat, Horse]
Accessed Element: Dog
LinkedBlockingQueue Elements: Dog, Cat, Horse,
Remove Elements
remove() - Returns and removes a specified element from the linked blocking queue. It throws an exception if the queue is empty.
poll() - Returns and removes a specified element from the linked blocking queue. It returns null if the queue is empty.
clear() - Removes all the elements from the linked blocking queue.
For example,

import java.util.concurrent.LinkedBlockingQueue;

class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedBlockingQueue " + animals);

        // Using remove()
        String element1 = animals.remove();
        System.out.println("Removed Element:");
        System.out.println("Using remove(): " + element1);

        // Using poll()
        String element2 = animals.poll();
        System.out.println("Using poll(): " + element2);

        // Using clear()
        animals.clear();
        System.out.println("Updated LinkedBlockingQueue " + animals);
    }
}
Run Code
Output

LinkedBlockingQueue: [Dog, Cat, Horse]
Removed Elements:
Using remove(): Dog
Using poll(): Cat
Updated LinkedBlockingQueue: []
put() and take() Methods
In multithreading processes, we can use put() and take() to block the operation of one thread to synchronize it with another thread. These methods will wait until they can be successfully executed.

put() Method
To insert the specified element to the end of a linked blocking queue, we use the put() method.

If the linked blocking queue is full, it waits until there is space in the linked blocking queue to insert the element.

For example,

import java.util.concurrent.LinkedBlockingQueue;

class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

       try {
        // Add elements to animals
           animals.put("Dog");
           animals.put("Cat");
           System.out.println("LinkedBlockingQueue: " + animals);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
Run Code
Output

LinkedBlockingQueue: [Dog, Cat]
Here, the put() method may throw an InterruptedException if it is interrupted while waiting. Hence, we must enclose it inside a try..catch block.

take() Method
To return and remove an element from the front of the linked blocking queue, we can use the take() method.

If the linked blocking queue is empty, it waits until there are elements in the linked blocking queue to be deleted.

For example,

import java.util.concurrent.LinkedBlockingQueue;

class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

       try {
           //Add elements to animals
           animals.put("Dog");
           animals.put("Cat");
           System.out.println("LinkedBlockingQueue: " + animals);

           // Remove an element
           String element = animals.take();
           System.out.println("Removed Element: " + element);
           System.out.println("New LinkedBlockingQueue: " + animals);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
Run Code
Output

LinkedBlockingQueue: [Dog, Cat]
Removed Element: Dog
New LinkedBlockingQueue: [Cat]
Here, the take() method will throw an InterrupedException if it is interrupted while waiting. Hence, we must enclose it inside a try...catch block.

Other Methods
Methods	Descriptions
contains(element)	Searches the linked blocking queue for the specified element. If the element is found, it returns true, if not it returns false.
size()	Returns the length of the linked blocking queue.
toArray()	Converts linked blocking queue to an array and return the array.
toString() 	Converts the linked blocking queue to string
Why use LinkedBlockingQueue?
The LinkedBlockingQueue uses linked lists as its internal storage.

It is considered as a thread-safe collection. Hence, it is generally used in multi-threading applications.

Suppose, one thread is inserting elements to the queue and another thread is removing elements from the queue.

Now, if the first thread is slower than the second thread, then the linked blocking queue can make the second thread waits until the first thread completes its operations.










### Java Map Interface
In this tutorial, we will learn about the Java Map interface and its methods.

The Map interface of the Java collections framework provides the functionality of the map data structure.

Working of Map
In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with individual Values.

A map cannot contain duplicate keys. And, each key is associated with a single value.

Working of the map interface in Java

We can access and modify values using the keys associated with them.

In the above diagram, we have values: United States, Brazil, and Spain. And we have corresponding keys: us, br, and es.

Now, we can access those values using their corresponding keys.

Note: The Map interface maintains 3 different sets:

the set of keys
the set of values
the set of key/value associations (mapping).
Hence we can access keys, values, and associations individually.

Classes that implement Map
Since Map is an interface, we cannot create objects from it.

In order to use functionalities of the Map interface, we can use these classes:

HashMap
EnumMap
LinkedHashMap
WeakHashMap
TreeMap
These classes are defined in the collections framework and implement the Map interface.

HashMap, TreeMap, EnumMap, LinkedHashMap and WeakHashMap classes implements the Java Map interface.
Java Map Subclasses
Interfaces that extend Map
The Map interface is also extended by these subinterfaces:

SortedMap
NavigableMap
ConcurrentMap
SortedMap, NavigableMap and ConcurrentMap extends the Java Map interface
Java Map Subinterfaces
How to use Map?
In Java, we must import the java.util.Map package in order to use Map. Once we import the package, here's how we can create a map.

// Map implementation using HashMap
Map<Key, Value> numbers = new HashMap<>();
In the above code, we have created a Map named numbers. We have used the HashMap class to implement the Map interface.


Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by keys in a map
Methods of Map
The Map interface includes all the methods of the Collection interface. It is because Collection is a super interface of Map.

Besides methods available in the Collection interface, the Map interface also includes the following methods:

put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
putAll() - Inserts all the entries from the specified map to this map.
putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
get(K) - Returns the value associated with the specified key K. If the key is not found, it returns null.
getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
containsKey(K) - Checks if the specified key K is present in the map or not.
containsValue(V) - Checks if the specified value V is present in the map or not.
replace(K, V) - Replace the value of the key K with the new specified value V.
replace(K, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
remove(K) - Removes the entry from the map represented by the key K.
remove(K, V) - Removes the entry from the map that has key K associated with value V.
keySet() - Returns a set of all the keys present in a map.
values() - Returns a set of all the values present in a map.
entrySet() - Returns a set of all the key/value mapping present in a map.
Implementation of the Map Interface
1. Implementing HashMap Class

import java.util.Map;
import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
    }
}
Run Code
Output

Map: {One=1, Two=2}
Keys: [One, Two]
Values: [1, 2]
Entries: [One=1, Two=2]
Removed Value: 2
To learn more about HashMap, visit Java HashMap.

2. Implementing TreeMap Class

import java.util.Map;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) {
        // Creating Map using TreeMap
        Map<String, Integer> values = new TreeMap<>();

        // Insert elements to map
        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        // Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        // Remove elements from the map
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
    }
}
Run Code
Output

Map using TreeMap: {First=1, Second=2}
New Map: {First=11, Second=22}
Removed Value: 11
To learn more about TreeMap, visit Java TreeMap.











### Java HashMap
In this tutorial, we will learn about the Java HashMap class and its various operations with the help of examples.

The HashMap class of the Java collections framework provides the functionality of the hash table data structure.

It stores elements in key/value pairs. Here, keys are unique identifiers used to associate each value on a map.

The HashMap class implements the Map interface.

Java HashMap implements Map interface
Java HashMap Implementation
Create a HashMap
In order to create a hash map, we must import the java.util.HashMap package first. Once we import the package, here is how we can create hashmaps in Java.

// hashMap creation with 8 capacity and 0.6 load factor
HashMap<K, V> numbers = new HashMap<>();
In the above code, we have created a hashmap named numbers. Here, K represents the key type and V represents the type of values. For example,

HashMap<String, Integer> numbers = new HashMap<>();
Here, the type of keys is String and the type of values is Integer.

Example 1: 
Create HashMap in Java
import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    // create a hashmap
    HashMap<String, Integer> languages = new HashMap<>();

    // add elements to hashmap
    languages.put("Java", 8);
    languages.put("JavaScript", 1);
    languages.put("Python", 3);
    System.out.println("HashMap: " + languages);
  }
}
Run Code
Output

HashMap: {Java=8, JavaScript=1, Python=3}
In the above example, we have created a HashMap named languages.

Here, we have used the put() method to add elements to the hashmap. We will learn more about the put() method later in this tutorial.

Basic Operations on Java HashMap
The HashMap class provides various methods to perform different operations on hashmaps. We will look at some commonly used arraylist operations in this tutorial:

Add elements
Access elements
Change elements
Remove elements
1. Add elements to a HashMap
To add a single element to the hashmap, we use the put() method of the HashMap class. For example,

import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    // create a hashmap
    HashMap<String, Integer> numbers = new HashMap<>();

    System.out.println("Initial HashMap: " + numbers);
    // put() method to add elements
    numbers.put("One", 1);
    numbers.put("Two", 2);
    numbers.put("Three", 3);
    System.out.println("HashMap after put(): " + numbers);
  }
}
Run Code
Output

Initial HashMap: {}
HashMap after put(): {One=1, Two=2, Three=3}
In the above example, we have created a HashMap named numbers. Here, we have used the put() method to add elements to numbers.

Notice the statement,

numbers.put("One", 1);
Here, we are passing the String value One as the key and Integer value 1 as the value to the put() method.

Recommended Readings

Java HashMap put()
Java HashMap putAll()
Java HashMap putIfAbsent()
2. Access HashMap Elements
We can use the get() method to access the value from the hashmap. For example,

import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);

    // get() method to get value
    String value = languages.get(1);
    System.out.println("Value at index 1: " + value);
  }
}
Run Code
Output

HashMap: {1=Java, 2=Python, 3=JavaScript}
Value at index 1: Java
In the above example, notice the expression,

languages.get(1);
Here, the get() method takes the key as its argument and returns the corresponding value associated with the key.

We can also access the keys, values, and key/value pairs of the hashmap as set views using keySet(), values(), and entrySet() methods respectively. For example,

import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    HashMap<Integer, String> languages = new HashMap<>();

    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);

    // return set view of keys
    // using keySet()
    System.out.println("Keys: " + languages.keySet());

    // return set view of values
    // using values()
    System.out.println("Values: " + languages.values());

    // return set view of key/value pairs
    // using entrySet()
    System.out.println("Key/Value mappings: " + languages.entrySet());
  }
}
Run Code
Output

HashMap: {1=Java, 2=Python, 3=JavaScript}
Keys: [1, 2, 3]
Values: [Java, Python, JavaScript]
Key/Value mappings: [1=Java, 2=Python, 3=JavaScript]

In the above example, we have created a hashmap named languages. Here, we are accessing the keys, values, and key/value mappings from the hashmap.

Recommended Readings

Java HashMap get()
Java Hashmap getOrDefault()
Java HashMap keySet()
Java HashMap values()
Java HashMap entrySet()
3. Change HashMap Value
We can use the replace() method to change the value associated with a key in a hashmap. For example,

import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("Original HashMap: " + languages);

    // change element with key 2
    languages.replace(2, "C++");
    System.out.println("HashMap using replace(): " + languages);
  }
}
Run Code
Output

Original HashMap: {1=Java, 2=Python, 3=JavaScript}
HashMap using replace(): {1=Java, 2=C++, 3=JavaScript}
In the above example, we have created a hashmap named languages. Notice the expression,

languages.replace(2, "C++");
Here, we are changing the value referred to by key 2 with the new value C++.

The HashMap class also provides some variations of the replace() method. To learn more, visit

Java HashMap replace()
Java HashMap replaceAll()
4. Remove HashMap Elements
To remove elements from a hashmap, we can use the remove() method. For example,

import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);

    // remove element associated with key 2
    String value = languages.remove(2);
    System.out.println("Removed value: " + value);

    System.out.println("Updated HashMap: " + languages);
  }
}
Run Code
Output

HashMap: {1=Java, 2=Python, 3=JavaScript}
Removed value: Python
Updated HashMap: {1=Java, 3=JavaScript}
Here, the remove() method takes the key as its parameter. It then returns the value associated with the key and removes the entry.

We can also remove the entry only under certain conditions. For example,

remove(2, "C++");
Here, the remove() method only removes the entry if the key 2 is associated with the value C++. Since 2 is not associated with C++, it doesn't remove the entry.

To learn more, visit Java HashMap remove().

Other Methods of HashMap
Method	Description
clear()	removes all mappings from the HashMap
compute()	computes a new value for the specified key
computeIfAbsent()	computes value if a mapping for the key is not present
computeIfPresent()	computes a value for mapping if the key is present
merge()	merges the specified mapping to the HashMap
clone()	makes the copy of the HashMap
containsKey()	checks if the specified key is present in Hashmap
containsValue()	checks if Hashmap contains the specified value
size()	returns the number of items in HashMap
isEmpty()	checks if the Hashmap is empty
Iterate through a HashMap
To iterate through each entry of the hashmap, we can use Java for-each loop. We can iterate through keys only, vales only, and key/value mapping. For example,

import java.util.HashMap;
import java.util.Map.Entry;

class Main {
  public static void main(String[] args) {

    // create a HashMap
    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);

    // iterate through keys only
    System.out.print("Keys: ");
    for (Integer key : languages.keySet()) {
      System.out.print(key);
      System.out.print(", ");
    }

    // iterate through values only
    System.out.print("\nValues: ");
    for (String value : languages.values()) {
      System.out.print(value);
      System.out.print(", ");
    }
    
    // iterate through key/value entries
    System.out.print("\nEntries: ");
    for (Entry<Integer, String> entry : languages.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }
  }
}
Run Code
Output

HashMap: {1=Java, 2=Python, 3=JavaScript}
Keys: 1, 2, 3,
Values: Java, Python, JavaScript,        
Entries: 1=Java, 2=Python, 3=JavaScript,
Note that we have used the Map.Entry in the above example. It is the nested class of the Map interface that returns a view (elements) of the map.

We first need to import the java.util.Map.Entry package in order to use this class.

This nested class returns a view (elements) of the map.

Creating HashMap from Other Maps
In Java, we can also create a hashmap from other maps. For example,

import java.util.HashMap;
import java.util.TreeMap;

class Main {
  public static void main(String[] args) {

    // create a treemap
    TreeMap<String, Integer> evenNumbers = new TreeMap<>();
    evenNumbers.put("Two", 2);
    evenNumbers.put("Four", 4);
    System.out.println("TreeMap: " + evenNumbers);

    // create hashmap from the treemap
    HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
    numbers.put("Three", 3);
    System.out.println("HashMap: " + numbers);
  }
}
Run Code
Output

TreeMap: {Four=4, Two=2}
HashMap: {Two=2, Three=3, Four=4}
In the above example, we have created a TreeMap named evenNumbers. Notice the expression,

numbers = new HashMap<>(evenNumbers)
Here, we are creating a HashMap named numbers using the TreeMap. To learn more about treemap, visit Java TreeMap.

Note: While creating a hashmap, we can include optional parameters: capacity and load factor. For example,

HashMap<K, V> numbers = new HashMap<>(8, 0.6f);
Here,

8 (capacity is 8) - This means it can store 8 entries.
0.6f (load factor is 0.6) - This means whenever our hash table is filled by 60%, the entries are moved to a new hash table double the size of the original hash table.
If the optional parameters not used, then the default capacity will be 16 and the default load factor will be 0.75.













### Java LinkedHashMap
In this tutorial, we will learn about the Java LinkedHashMap class and its operations with the help of examples.

The LinkedHashMap class of the Java collections framework provides the hash table and linked list implementation of the Map interface.

The LinkedHashMap interface extends the HashMap class to store its entries in a hash table. It internally maintains a doubly-linked list among all of its entries to order its entries.

Java LinkedHashMap class extends the HashMap class.

Creating a LinkedHashMap
In order to create a linked hashmap, we must import the java.util.LinkedHashMap package first. Once we import the package, here is how we can create linked hashmaps in Java.

// LinkedHashMap with initial capacity 8 and load factor 0.6
LinkedHashMap<Key, Value> numbers = new LinkedHashMap<>(8, 0.6f);
In the above code, we have created a linked hashmap named numbers.

Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by the keys in a map
Notice the part new LinkedHashMap<>(8, 0.6). Here, the first parameter is capacity and the second parameter is loadFactor.

capacity - The capacity of this linked hashmap is 8. Meaning, it can store 8 entries.
loadFactor - The load factor of this linked hashmap is 0.6. This means, whenever our hash map is filled by 60%, the entries are moved to a new hash table of double the size of the original hash table.
Default capacity and load factor

It's possible to create a linked hashmap without defining its capacity and load factor. For example,

//LinkedHashMap with default capacity and load factor
LinkedHashMap<Key, Value> numbers1 = new LinkedHashMap<>();
By default,

the capacity of the linked hashmap will be 16
the load factor will be 0.75
Note: The LinkedHashMap class also allows us to define the order of its entries. For example

// LinkedHashMap with specified order
LinkedHashMap<Key, Value> numbers2 = new LinkedHashMap<>(capacity, loadFactor, accessOrder);
Here, accessOrder is a boolean value. Its default value is false. In this case entries in the linked hashmap are ordered on the basis of their insertion order.

However, if true is passed as accessOrder, entries in the linked hashmap will be ordered from least-recently accessed to most-recently accessed.

Creating LinkedHashMap from Other Maps
Here is how we can create a linked hashmap containing all the elements of other maps.

import java.util.LinkedHashMap;

class Main {
    public static void main(String[] args) {
        // Creating a LinkedHashMap of even numbers
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap1: " + evenNumbers);

        // Creating a LinkedHashMap from other LinkedHashMap
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap2: " + numbers);
    }
}
Run Code

Output

LinkedHashMap1: {Two=2, Four=4}
LinkedHashMap2: {Two=2, Four=4, Three=3}
Methods of LinkedHashMap
The LinkedHashMap class provides methods that allow us to perform various operations on the map.

Insert Elements to LinkedHashMap
put() - inserts the specified key/value mapping to the map
putAll() - inserts all the entries from the specified map to this map
putIfAbsent() - inserts the specified key/value mapping to the map if the specified key is not present in the map
For example,


import java.util.LinkedHashMap;

class Main {
    public static void main(String[] args) {
        // Creating LinkedHashMap of even numbers
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("Original LinkedHashMap: " + evenNumbers);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("Updated LinkedHashMap(): " + evenNumbers);

        //Creating LinkedHashMap of numbers
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("New LinkedHashMap: " + numbers);
    }
}
Run Code
Output

Original LinkedHashMap: {Two=2, Four=4}
Updated LinkedHashMap: {Two=2, Four=4, Six=6}
New LinkedHashMap: {One=1, Two=2, Four=4, Six=6}
Access LinkedHashMap Elements
1. Using entrySet(), keySet() and values()

entrySet() - returns a set of all the key/value mapping of the map
keySet() - returns a set of all the keys of the map
values() - returns a set of all the values of the map
For example,

import java.util.LinkedHashMap;

class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
    }
}
Run Code
Output

LinkedHashMap: {One=1, Two=2, Three=3}
Key/Value mappings: [One=1, Two=2, Three=3]
Keys: [One, Two, Three]
Values: [1, 2, 3]
2. Using get() and getOrDefault()

get() - Returns the value associated with the specified key. If the key is not found, it returns null.
getOrDefault() - Returns the value associated with the specified key. If the key is not found, it returns the specified default value.
For example,

import java.util.LinkedHashMap;

class Main {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);
    }
}
Run Code
Output

LinkedHashMap: {One=1, Two=2, Three=3}
Returned Number: 3
Returned Number: 5
Removed LinkedHashMap Elements
remove(key) - returns and removes the entry associated with the specified key from the map
remove(key, value) - removes the entry from the map only if the specified key mapped to be the specified value and return a boolean value
For example,

import java.util.LinkedHashMap;

class Main {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap: " + numbers);

        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated LinkedHashMap: " + numbers);
    }
}
Run Code
Output

LinkedHashMap: {One=1, Two=2, Three=3}
Removed value: 2
Is the entry {Three=3} removed? True
Updated LinkedHashMap: {One=1}
Other Methods of LinkedHashMap
Method	Description
clear()	removes all the entries from the map
containsKey()	checks if the map contains the specified key and returns a boolean value
containsValue()	checks if the map contains the specified value and returns a boolean value
size()	returns the size of the map
isEmpty()	checks if the map is empty and returns a boolean value
LinkedHashMap Vs. HashMap
Both the LinkedHashMap and the HashMap implements the Map interface. However, there exist some differences between them.

LinkedHashMap maintains a doubly-linked list internally. Due to this, it maintains the insertion order of its elements.
The LinkedHashMap class requires more storage than HashMap. This is because LinkedHashMap maintains linked lists internally.
The performance of LinkedHashMap is slower than HashMap.










### Java WeakHashMap
In this tutorial, we will learn about Java WeakHashMap and its operations with the help of examples. We will also learn about the differences between WeakHashMap and HashMap

The WeakHashMap class of the Java collections framework provides the feature of the hash table data structure..

It implements the Map interface.

Java WeakHashMap implements the Map interface.

Note: Keys of the weak hashmap are of the WeakReference type.

The object of a weak reference type can be garbage collected in Java if the reference is no longer used in the program.

Let us learn to create a weak hash map first. Then, we will learn how it differs from a hashmap.

Create a WeakHashMap
In order to create a weak hashmap, we must import the java.util.WeakHashMap package first. Once we import the package, here is how we can create weak hashmaps in Java.

//WeakHashMap creation with capacity 8 and load factor 0.6
WeakHashMap<Key, Value> numbers = new WeakHashMap<>(8, 0.6);
In the above code, we have created a weak hashmap named numbers.

Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by keys in a map
Notice the part new WeakHashMap<>(8, 0.6). Here, the first parameter is capacity and the second parameter is loadFactor.

capacity - The capacity of this map is 8. Meaning, it can store 8 entries.
loadFactor - The load factor of this map is 0.6. This means whenever our hash table is filled by 60%, the entries are moved to a new hash table of double the size of the original hash table.
Default capacity and load factor

It is possible to create a weak hashmap without defining its capacity and load factor. For example,

// WeakHashMap with default capacity and load factor
WeakHashMap<Key, Value> numbers1 = new WeakHashMap<>();
By default,

the capacity of the map will be 16
the load factor will be 0.75
Differences Between HashMap and WeakHashMap
Let us see the implementation of a weak hashmap in Java.

import java.util.WeakHashMap;

class Main {
    public static void main(String[] args) {
        // Creating WeakHashMap of numbers
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("WeakHashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("WeakHashMap after garbage collection: " + numbers);
    }
}
Run Code
Output

WeakHashMap: {Four=4, Two=2}
WeakHashMap after garbage collection: {Four}
As we can see, when the key two of a weak hashmap is set to null and perform garbage collection, the key is removed.

It is because unlike hashmaps, keys of weak hashmaps are of weak reference type. This means the entry of a map are removed by the garbage collector if the key to that entry is no longer used. This is useful to save resources.

Now let us see the same implementation in a hashmap.

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // Creating HashMap of even numbers
        HashMap<String, Integer> numbers = new HashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("HashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("HashMap after garbage collection: " + numbers);
    }
}
Run Code

Output

HashMap: {Four=4, Two=2}
HashMap after garbage collection: {Four=4, Two=2}
Here, when the key two of the hashmap is set to null and perform garbage collection, the key is not removed.

This is because unlike weak hashmaps keys of hashmaps are of strong reference type. This means the entry of a map is not removed by the garbage collector even though the key to that entry is no longer used.

Note: All functionalities of hashmaps and weak hashmaps are similar except keys of a weak hashmap are of weak reference, whereas keys of a hashmap are of strong reference.

Creating WeakHashMap from Other Maps
Here is how we can create a weak hashmap from other maps.

import java.util.HashMap;
import java.util.WeakHashMap;

class Main {
    public static void main(String[] args) {
        // Creating a hashmap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        evenNumbers.put(two, twoValue);
        System.out.println("HashMap: " + evenNumbers);

        // Creating a weak hash map from other hashmap
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>(evenNumbers);

        System.out.println("WeakHashMap: " + numbers);
    }
}

Run Code
Output

HashMap: {Two=2}
WeakHashMap: {Two=2}
Methods of WeakHashMap
The WeakHashMap class provides methods that allow us to perform various operations on the map.

Insert Elements to WeakHashMap
put() - inserts the specified key/value mapping to the map
putAll() - inserts all the entries from specified map to this map
putIfAbsent() - inserts the specified key/value mapping to the map if the specified key is not present in the map
For example,

import java.util.WeakHashMap;

class Main {
    public static void main(String[] args) {
        // Creating WeakHashMap of even numbers
        WeakHashMap<String, Integer> evenNumbers = new WeakHashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;

        // Using put()
        evenNumbers.put(two, twoValue);

        String four = new String("Four");
        Integer fourValue = 4;

        // Using putIfAbsent()
        evenNumbers.putIfAbsent(four, fourValue);
        System.out.println("WeakHashMap of even numbers: " + evenNumbers);

        //Creating WeakHashMap of numbers
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String one = new String("One");
        Integer oneValue = 1;
        numbers.put(one, oneValue);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("WeakHashMap of numbers: " + numbers);
    }
}
Run Code
Output

WeakHashMap of even numbers: {Four=4, Two=2}
WeakHashMap of numbers: {Two=2, Four=4, One=1}
Access WeakHashMap Elements
1. Using entrySet(), keySet() and values()

entrySet() - returns a set of all the key/value mapping of the map
keySet() - returns a set of all the keys of the map
values() - returns a set of all the values of the map
For example,

import java.util.WeakHashMap;

class Main {
    public static void main(String[] args) {
        // Creating WeakHashMap of even numbers
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String one = new String("One");
        Integer oneValue = 1;
        numbers.put(one, oneValue);

        String two = new String("Two");
        Integer twoValue = 2;
        numbers.put(two, twoValue);

        System.out.println("WeakHashMap: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
    }
}
Run Code
Output

WeakHashMap: {Two=2, One=1}
Key/Value mappings: [Two=2, One=1]
Keys: [Two, One]
Values: [1, 2]
2. Using get() and getOrDefault()

get() - Returns the value associated with the specified key. Returns null if the key is not found.
getOrDefault() - Returns the value associated with the specified key. Returns the specified default value if the key is not found.
For example,

import java.util.WeakHashMap;

class Main {
    public static void main(String[] args) {
        // Creating WeakHashMap of even numbers
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String one = new String("One");
        Integer oneValue = 1;
        numbers.put(one, oneValue);

        String two = new String("Two");
        Integer twoValue = 2;
        numbers.put(two, twoValue);

        System.out.println("WeakHashMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Two");
        System.out.println("Using get(): " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Four", 4);
        System.out.println("Using getOrDefault(): " + value2);

    }
}
Run Code
Output

WeakHashMap: {Two=2, One=1}
Using get(): 2
Using getOrDefault(): 4
Remove WeakHashMap Elements
remove(key) - returns and removes the entry associated with the specified key from the map
remove(key, value) - removes the entry from the map only if the specified key mapped to the specified value and return a boolean value
For example,

import java.util.WeakHashMap;

class Main {
    public static void main(String[] args) {
        // Creating WeakHashMap of even numbers
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String one = new String("One");
        Integer oneValue = 1;
        numbers.put(one, oneValue);

        String two = new String("Two");
        Integer twoValue = 2;
        numbers.put(two, twoValue);

        System.out.println("WeakHashMap: " + numbers);

        // Using remove() with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // Using remove() with 2 parameters
        boolean result = numbers.remove("One", 3);
        System.out.println("Is the entry {One=3} removed? " + result);

        System.out.println("Updated WeakHashMap: " + numbers);
    }
}
Run Code
Output

WeakHashMap: {Two=2, One=1}
Removed value: 2
Is the entry {One=3} removed? False
Updated WeakHashMap: {One=1}
Other Methods of WeakHashMap
Method	Description
clear()	Removes all the entries from the map
containsKey()	Checks if the map contains the specified key and returns a boolean value
containsValue()	Checks if the map contains the specified value and returns a boolean value
size()	Returns the size of the map
isEmpty()	Checks if the map is empty and returns a boolean value
To learn more, visit Java WeakHashMap (official Java documentation).












### Java EnumMap
In this tutorial, we will learn about the Java EnumMap class and its operations with the help of examples.

The EnumMap class of the Java collections framework provides a map implementation for elements of an enum.

In EnumMap, enum elements are used as keys. It implements the Map interface.

Java EnumMap implements the Map interface.

Before we learn about EnumMap, make sure to know about the Java Enums.

Creating an EnumMap
In order to create an enum map, we must import the java.util.EnumMap package first. Once we import the package, here is how we can create enum maps in Java.

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
In the above example, we have created an enum map named sizes.

Here,

Size - keys of the enum that map to values
Integer - values of the enum map associated with the corresponding keys
Methods of EnumMap
The EnumMap class provides methods that allow us to perform various elements on the enum maps.

Insert Elements to EnumMap
put() - inserts the specified key/value mapping (entry) to the enum map
putAll() - inserts all the entries of a specified map to this map
For example,

import java.util.EnumMap;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);

        // Using the put() Method
        sizes1.put(Size.SMALL, 28);
        sizes1.put(Size.MEDIUM, 32);
        System.out.println("EnumMap1: " + sizes1);

        EnumMap<Size, Integer> sizes2 = new EnumMap<>(Size.class);

        // Using the putAll() Method
        sizes2.putAll(sizes1);
        sizes2.put(Size.LARGE, 36);
        System.out.println("EnumMap2: " + sizes2);
    }
}
Run Code
Output

EnumMap1: {SMALL=28, MEDIUM=32}
EnumMap2: {SMALL=28, MEDIUM=32, LARGE=36}
In the above example, we have used the putAll() method to insert all the elements of an enum map sizes1 to an enum map of sizes2.

It is also possible to insert elements from other maps such as HashMap, TreeMap, etc. to an enum map using putAll(). However, all maps should be of the same enum type.

Access EnumMap Elements
1. Using entrySet(), keySet() and values()

entrySet() - returns a set of all the keys/values mapping (entry) of an enum map
keySet() - returns a set of all the keys of an enum map
values() - returns a set of all the values of an enum map
For example,

import java.util.EnumMap;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);
        System.out.println("EnumMap: " + sizes);

        // Using the entrySet() Method
        System.out.println("Key/Value mappings: " + sizes.entrySet());

        // Using the keySet() Method
        System.out.println("Keys: " + sizes.keySet());

        // Using the values() Method
        System.out.println("Values: " + sizes.values());
    }
}
Run Code
Output

EnumMap: {SMALL=28, MEDIUM=32, LARGE=36, EXTRALARGE=40}
Key/Value mappings: [SMALL=28, MEDIUM=32, LARGE=36, EXTRALARGE=40]
Keys: [SMALL, MEDIUM, LARGE, EXTRALARGE]
Values: [28, 32, 36, 40]
2. Using the get() Method


The get() method returns the value associated with the specified key. It returns null if the specified key is not found.

For example,

import java.util.EnumMap;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);
        System.out.println("EnumMap: " + sizes);

        // Using the get() Method
        int value = sizes.get(Size.MEDIUM);
        System.out.println("Value of MEDIUM: " + value);
    }
}
Run Code
Output

EnumMap: {SMALL=28, MEDIUM=32, LARGE=36, EXTRALARGE=40}
Value of MEDIUM: 32
Remove EnumMap Elements
remove(key) - returns and removes the entry associated with the specified key from the map
remove(key, value) - removes the entry from the map only if the specified key mapped to the specified value and return a boolean value
For example,

import java.util.EnumMap;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);
        System.out.println("EnumMap: " + sizes);

        // Using the remove() Method
        int value = sizes.remove(Size.MEDIUM);
        System.out.println("Removed Value: " + value);

        boolean result = sizes.remove(Size.SMALL, 28);
        System.out.println("Is the entry {SMALL=28} removed? " + result);

        System.out.println("Updated EnumMap: " + sizes);
    }
}
Run Code
Output

EnumMap: {SMALL=28, MEDIUM=32, LARGE=36, EXTRALARGE=40}
Removed Value: 32
Is the entry {SMALL=28} removed? True
Updated EnumMap: {LARGE=36, EXTRALARGE=40}
Replace EnumMap Elements
replace(key, value) - replaces the value associated with the specified key by the new value
replace(key, old, new) - replaces the old value with the new value only if the old value is already associated with the specified key
replaceAll(function) - replaces each value of the map with the result of the specified function
import java.util.EnumMap;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);
        System.out.println("EnumMap: " + sizes);

        // Using the replace() Method
        sizes.replace(Size.MEDIUM, 30);
        sizes.replace(Size.LARGE, 36, 34);
        System.out.println("EnumMap using replace(): " + sizes);

        // Using the replaceAll() Method
        sizes.replaceAll((key, oldValue) -> oldValue + 3);
        System.out.println("EnumMap using replaceAll(): " + sizes);
    }
}
Run Code
Output

EnumMap: {SMALL=28, MEDIUM=32, LARGE=36, EXTRALARGE=40}
EnumMap using replace(): {SMALL=28, MEDIUM=30, LARGE=34, EXTRALARGE=40}
EnumMap using replaceAll(): {SMALL=31, MEDIUM=33, LARGE=37, EXTRALARGE=43}
In the above program, notice the statement

sizes.replaceAll((key, oldValue) -> oldValue + 3);
Here, the method accesses all the entries of the map. It then replaces all the values with the new values provided by the lambda expressions.

Other Methods
Method	Description
clone()	Creates a copy of the EnumMap
containsKey()	Searches the EnumMap for the specified key and returns a boolean result
containsValue()	Searches the EnumMap for the specified value and returns a boolean result
size()	Returns the size of the EnumMap
clear() 	Removes all the entries from the EnumMap
EnumSet Vs. EnumMap
Both the EnumSet and EnumMap class provides data structures to store enum values. However, there exist some major differences between them.

Enum set is represented internally as a sequence of bits, whereas the enum map is represented internally as arrays.
Enum set is created using its predefined methods like allOf(), noneOf(), of(), etc. However, an enum map is created using its constructor.
Clonable and Serializable Interfaces
The EnumMap class also implements Cloneable and Serializable interfaces.

Cloneable Interface

It allows the EnumMap class to make a copy of instances of the class.

Serializable Interface

Whenever Java objects need to be transmitted over a network, objects need to be converted into bits or bytes. This is because Java objects cannot be transmitted over the network.

The Serializable interface allows classes to be serialized. This means objects of the classes implementing Serializable can be converted into bits or bytes.












Java SortedMap Interface
In this tutorial, we will learn about the Java SortedMap interface and its methods.

The SortedMap interface of the Java collections framework provides sorting of keys stored in a map.

It extends the Map interface.

Java SortedMap interface extends the Map interface.

Class that implements SortedMap
Since SortedMap is an interface, we cannot create objects from it.

In order to use the functionalities of the SortedMap interface, we need to use the class TreeMap that implements it.

The Java TreeMap class implements the SortedMap interface.

How to use SortedMap?
To use the SortedMap, we must import the java.util.SortedMap package first. Once we import the package, here's how we can create a sorted map.

// SortedMap implementation by TreeMap class
SortedMap<Key, Value> numbers = new TreeMap<>();
We have created a sorted map called numbers using the TreeMap class.


Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by keys in a map
Here, we have used no arguments to create a sorted map. Hence the map will be sorted naturally (ascending order).

Methods of SortedMap
The SortedMap interface includes all the methods of the Map interface. It is because Map is a super interface of SortedMap.

Besides all those methods, here are the methods specific to the SortedMap interface.

comparator() - returns a comparator that can be used to order keys in a map
firstKey() - returns the first key of the sorted map
lastKey() - returns the last key of the sorted map
headMap(key) - returns all the entries of a map whose keys are less than the specified key
tailMap(key) - returns all the entries of a map whose keys are greater than or equal to the specified key
subMap(key1, key2) - returns all the entries of a map whose keys lies in between key1 and key2 including key1
To learn more, visit Java SortedMap (official Java documentation).

Implementation of SortedMap in TreeMap Class
import java.util.SortedMap;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) {
        // Creating SortedMap using TreeMap
        SortedMap<String, Integer> numbers = new TreeMap<>();

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        System.out.println("SortedMap: " + numbers);


        // Access the first key of the map
        System.out.println("First Key: " + numbers.firstKey());

        // Access the last key of the map
        System.out.println("Last Key: " + numbers.lastKey());

        // Remove elements from the map
        int value = numbers.remove("One");
        System.out.println("Removed Value: " + value);
    }
}
Run Code
Output

SortedMap: {One=1, Two=2}
First Key: One
Last Key: Two
Removed Value: 1
Here, we show how the SortedMap interface works. If you want to know more about its implementation, visit Java TreeMap.



















### Java NavigableMap Interface
In this tutorial, we will learn about the Java NavigableMap interface and its methods with the help of a example.

The NavigableMap interface of the Java collections framework provides the features to navigate among the map entries.

It is considered as a type of SortedMap.

Class that implements NavigableMap
Since NavigableMap is an interface, we cannot create objects from it.

In order to use the functionalities of the NavigableMap interface, we need to use the TreeMap class that implements NavigableMap.

Java TreeMap class implements the Java NavigableMap interface.

How to use NavigableMap?
In Java, we must import the java.util.NavigableMap package to use NavigableMap. Once we import the package, here's how we can create a navigable map.

// NavigableMap implementation by TreeMap class
NavigableMap<Key, Value> numbers = new TreeMap<>();
In the above code, we have created a navigable map named numbers of the TreeMap class.

Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by keys in a map
Methods of NavigableMap
The NavigableMap is considered as a type of SortedMap. It is because NavigableMap extends the SortedMap interface.

Hence, all SortedMap methods are also available in NavigableMap. To learn how these methods are defined in SortedMap, visit Java SortedMap.

However, some of the methods of SortedMap (headMap(), tailMap(), and subMap() ) are defined differently in NavigableMap.

Let's see how these methods are defined in NavigableMap.

headMap(key, booleanValue)
The headMap() method returns all the entries of a navigable map associated with all those keys before the specified key (which is passed as an argument).

The booleanValue is an optional parameter. Its default value is false.


If true is passed as a booleanValue, the method returns all the entries associated with all those keys before the specified key, including the entry associated with the specified key.

tailMap(key, booleanValue)
The tailMap() method returns all the entries of a navigable map associated with all those keys after the specified key (which is passed as an argument) including the entry associated with the specified key.

The booleanValue is an optional parameter. Its default value is true.

If false is passed as a booleanValue, the method returns all the entries associated with those keys after the specified key, without including the entry associated with the specified key.

subMap(k1, bv1, k2, bv2)
The subMap() method returns all the entries associated with keys between k1 and k2 including the entry associated with k1.

The bv1 and bv2 are optional parameters. The default value of bv1 is true and the default value of bv2 is false.

If false is passed as bv1, the method returns all the entries associated with keys between k1 and k2, without including the entry associated with k1.

If true is passed as bv2, the method returns all the entries associated with keys between k1 and k2, including the entry associated with k1.

Other Methods
The NavigableMap provides various methods that can be used to locate the entries of maps.

descendingMap() - reverse the order of entries in a map
descendingKeyMap() - reverses the order of keys in a map
ceilingEntry() - returns an entry with the lowest key among all those entries whose keys are greater than or equal to the specified key
ceilingKey() - returns the lowest key among those keys that are greater than or equal to the specified key
floorEntry() - returns an entry with the highest key among all those entries whose keys are less than or equal to the specified key
floorKey() - returns the highest key among those keys that are less than or equal to the specified key
higherEntry() - returns an entry with the lowest key among all those entries whose keys are greater than the specified key
higherKey() - returns the lowest key among those keys that are greater than the specified key
lowerEntry() - returns an entry with the highest key among all those entries whose keys are less than the specified key
lowerKey() - returns the highest key among those keys that are less than the specified key
firstEntry() - returns the first entry (the entry with the lowest key) of the map
lastEntry() - returns the last entry (the entry with the highest key) of the map
pollFirstEntry() - returns and removes the first entry of the map
pollLastEntry() - returns and removes the last entry of the map
To learn more, visit Java NavigableMap (official Java documentation).

Implementation of NavigableMap in TreeMap Class
import java.util.NavigableMap;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) {
        // Creating NavigableMap using TreeMap
        NavigableMap<String, Integer> numbers = new TreeMap<>();

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);
        System.out.println("NavigableMap: " + numbers);

        // Access the first entry of the map
        System.out.println("First Entry: " + numbers.firstEntry());

        // Access the last entry of the map
        System.out.println("Last Entry: " + numbers.lastEntry());

        // Remove the first entry from the map
        System.out.println("Removed First Entry: " + numbers.pollFirstEntry());

        // Remove the last entry from the map
        System.out.println("Removed Last Entry: " + numbers.pollLastEntry());
    }
}
Run Code
Output

NavigableMap: {One=1, Three=3, Two=2}
First Entry: One=1
Last Entry: Two=2
Removed First Entry: One=1
Removed Last Entry: Two=2
To learn more about TreeMap, visit Java TreeMap.

Now we know about the NavigableMap interface, we will learn about its implementation using the TreeMap class in detail in the next tutorial.



















### Java TreeMap
In this tutorial, we will learn about the Java TreeMap class and its operations with the help of examples.

The TreeMap class of the Java collections framework provides the tree data structure implementation.

It implements the NavigableMap interface.

Java TreeMap class implements the Map interface.

Creating a TreeMap
In order to create a TreeMap, we must import the java.util.TreeMap package first. Once we import the package, here is how we can create a TreeMap in Java.

TreeMap<Key, Value> numbers = new TreeMap<>();
In the above code, we have created a TreeMap named numbers without any arguments. In this case, the elements in TreeMap are sorted naturally (ascending order).

However, we can customize the sorting of elements by using the Comparator interface. We will learn about it later in this tutorial.

Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by keys in a map
Methods of TreeMap
The TreeMap class provides various methods that allow us to perform operations on the map.

Insert Elements to TreeMap
put() - inserts the specified key/value mapping (entry) to the map
putAll() - inserts all the entries from specified map to this map
putIfAbsent() - inserts the specified key/value mapping to the map if the specified key is not present in the map
For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // Creating TreeMap of even numbers
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("TreeMap of even numbers: " + evenNumbers);

        //Creating TreeMap of numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("TreeMap of numbers: " + numbers);
    }
}
Run Code
Output

TreeMap of even numbers: {Four=4, Six=6, Two=2}
TreeMap of numbers: {Four=4, One=1, Six=6, Two=2}
Access TreeMap Elements
1. Using entrySet(), keySet() and values()

entrySet() - returns a set of all the key/values mapping (entry) of a treemap
keySet() - returns a set of all the keys of a tree map
values() - returns a set of all the maps of a tree map
For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
    }
}
Run Code
Output

TreeMap: {One=1, Three=3, Two=2}
Key/Value mappings: [One=1, Three=3, Two=2]
Keys: [One, Three, Two]
Values: [1, 3, 2]
2. Using get() and getOrDefault()

get() - Returns the value associated with the specified key. Returns null if the key is not found.
getOrDefault() - Returns the value associated with the specified key. Returns the specified default value if the key is not found.
For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Using get(): " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);
    }
}
Run Code
Output

TreeMap: {One=1, Three=3, Two=2}
Using get(): 3
Using getOrDefault(): 5
Here, the getOrDefault() method does not find the key Five. Hence it returns the specified default value 5.

Remove TeeMap Elements
remove(key) - returns and removes the entry associated with the specified key from a TreeMap
remove(key, value) - removes the entry from the map only if the specified key is associated with the specified value and returns a boolean value
For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);

        System.out.println("Updated TreeMap: " + numbers);
    }
}
Run Code
Output

TreeMap: {One=1, Three=3, Two=2}
Removed value = 2
Is the entry {Three=3} removed? True
Updated TreeMap: {One=1}
Replace TreeMap Elements
replace(key, value) - replaces the value mapped by the specified key with the new value
replace(key, old, new) - replaces the old value with the new value only if the old value is already associated with the specified key
replaceAll(function) - replaces each value of the map with the result of the specified function
For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("Original TreeMap: " + numbers);

        // Using replace()
        numbers.replace("Second", 22);
        numbers.replace("Third", 3, 33);
        System.out.println("TreeMap using replace: " + numbers);

        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("TreeMap using replaceAll: " + numbers);
    }
}
Run Code
Output

Original TreeMap: {First=1, Second=2, Third=3}
TreeMap using replace(): {First=1, Second=22, Third=33}
TreeMap using replaceAll(): {First=3, Second=24, Third=35}
In the above program notice the statement

numbers.replaceAll((key, oldValue) -> oldValue + 2);
Here, we have passed a lambda expression as an argument.

The replaceAll() method accesses all the entries of the map. It then replaces all the elements with the new values (returned from the lambda expression).

Methods for Navigation
Since the TreeMap class implements NavigableMap, it provides various methods to navigate over the elements of the treemap.

1. First and Last Methods
firstKey() - returns the first key of the map
firstEntry() - returns the key/value mapping of the first key of the map
lastKey() - returns the last key of the map
lastEntry() - returns the key/value mapping of the last key of the map
For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        // Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());


        // Using the lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());
    }
}
Run Code
Output

TreeMap: {First=1, Second=2, Third=3}
First Key: First
Last Key: Third
First Entry: First=1
Last Entry: Third=3
2. Ceiling, Floor, Higher and Lower Methods
higherKey() - Returns the lowest key among those keys that are greater than the specified key.
higherEntry() - Returns an entry associated with a key that is lowest among all those keys greater than the specified key.
lowerKey() - Returns the greatest key among all those keys that are less than the specified key.
lowerEntry() - Returns an entry associated with a key that is greatest among all those keys that are less than the specified key.
ceilingKey() - Returns the lowest key among those keys that are greater than the specified key. If the key passed as an argument is present in the map, it returns that key.
ceilingEntry() - Returns an entry associated with a key that is lowest among those keys that are greater than the specified key. It an entry associated with the key passed an argument is present in the map, it returns the entry associated with that key.
floorKey() - Returns the greatest key among those keys that are less than the specified key. If the key passed as an argument is present, it returns that key.
floorEntry() - Returns an entry associated with a key that is greatest among those keys that are less than the specified key. If the key passed as argument is present, it returns that key.
For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 5);
        numbers.put("Third", 4);
        numbers.put("Fourth", 6);
        System.out.println("TreeMap: " + numbers);

        // Using higher()
        System.out.println("Using higherKey(): " + numbers.higherKey("Fourth"));
        System.out.println("Using higherEntry(): " + numbers.higherEntry("Fourth"));

        // Using lower()
        System.out.println("\nUsing lowerKey(): " + numbers.lowerKey("Fourth"));
        System.out.println("Using lowerEntry(): " + numbers.lowerEntry("Fourth"));

        // Using ceiling()
        System.out.println("\nUsing ceilingKey(): " + numbers.ceilingKey("Fourth"));
        System.out.println("Using ceilingEntry(): " + numbers.ceilingEntry("Fourth"));

        // Using floor()
        System.out.println("\nUsing floorKey(): " + numbers.floorKey("Fourth"));
        System.out.println("Using floorEntry(): " + numbers.floorEntry("Fourth"));


    }
}
Run Code
Output

TreeMap: {First=1, Fourth=6, Second=5, Third=4}
Using higherKey(): Second
Using higherEntry(): Second=5

Using lowerKey(): First
Using lowerEntry(): First=1

Using ceilingKey(): Fourth
Using ceilingEntry(): Fourth=6

Using floorkey(): Fourth
Using floorEntry(): Fourth=6
3. pollFirstEntry() and pollLastEntry() Methods
pollFirstEntry() - returns and removes the entry associated with the first key of the map
pollLastEntry() - returns and removes the entry associated with the last key of the map

For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        //Using the pollFirstEntry() method
        System.out.println("Using pollFirstEntry(): " + numbers.pollFirstEntry());

        // Using the pollLastEntry() method
        System.out.println("Using pollLastEntry(): " + numbers.pollLastEntry());

        System.out.println("Updated TreeMap: " + numbers);

    }
}
Run Code
Output

TreeMap: {First=1, Second=2, Third=3}
Using pollFirstEntry(): First=1
Using pollLastEntry(): Third=3
Updated TreeMap: {Second=2}
4. headMap(), tailMap() and subMap() Methods
headMap(key, booleanValue)

The headMap() method returns all the key/value pairs of a treemap before the specified key (which is passed as an argument).

The booleanValue parameter is optional. Its default value is false.

If true is passed as a booleanValue, the method also includes the key/value pair of the key which is passed as an argument.

For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);

        System.out.println("\nUsing headMap() Method:");
        // Using headMap() with default booleanValue
        System.out.println("Without boolean value: " + numbers.headMap("Fourth"));

        // Using headMap() with specified booleanValue
        System.out.println("With boolean value: " + numbers.headMap("Fourth", true));

    }
}

Run Code
Output

TreeMap: {First=1, Fourth=4, Second=2, Third=3}

Using headMap() Method: 
Without boolean value: {First=1}
With boolean value: {First=1, Fourth=4}
tailMap(key, booleanValue)

The tailMap() method returns all the key/value pairs of a treemap starting from the specified key (which is passed as an argument).

The booleanValue is an optional parameter. Its default value is true.

If false is passed as a booleanValue, the method doesn't include the key/value pair of the specified key.

For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);

        System.out.println("\nUsing tailMap() Method:");
        // Using tailMap() with default booleanValue
        System.out.println("Without boolean value: " + numbers.tailMap("Second"));

        // Using tailMap() with specified booleanValue
        System.out.println("With boolean value: " + numbers.tailMap("Second", false));

    }
}
Run Code
Output

TreeMap: {First=1, Fourth=4, Second=2, Third=3}

Using tailMap() Method:
Without boolean value: {Second=2, Third=3}
With boolean value: {Third=3}
subMap(k1, bV1, k2, bV2)

The subMap() method returns all the entries associated with keys between k1 and k2 including the entry of k1.

The bV1 and bV2 are optional boolean parameters. The default value of bV1 is true and the default value of bV2 is false.

If false is passed as bV1, the method returns all the entries associated with keys between k1 and k2 without including the entry of k1.

If true is passed as bV2, the method returns all the entries associated with keys between k1 and k2 including the entry of k2.

For example,

import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);

        System.out.println("\nUsing subMap() Method:");
        // Using subMap() with default booleanValue
        System.out.println("Without boolean value: " + numbers.subMap("Fourth", "Third"));

        // Using subMap() with specified booleanValue
        System.out.println("With boolean value: " + numbers.subMap("Fourth", false, "Third", true));

    }
}
Run Code
Output

TreeMap: {First=1, Fourth=2, Second=2, Third=3}

Using subMap() Method:
Without boolean value: {Fourth=4, Second=2}
With boolean value: {Second=2, Third=3}
Other Methods of TreeMap
Method	Description
clone()	Creates a copy of the TreeMap
containsKey()	Searches the TreeMap for the specified key and returns a boolean result
containsValue()	Searches the TreeMap for the specified value and returns a boolean result
size()	Returns the size of the TreeMap
clear()	Removes all the entries from the TreeMap
TreeMap Comparator
In all the examples above, treemap elements are sorted naturally (in ascending order). However, we can also customize the ordering of keys.

For this, we need to create our own comparator class based on which keys in a treemap are sorted. For example,

import java.util.TreeMap;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {

        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);
    }

    // Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String number1, String number2) {
            int value =  number1.compareTo(number2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
Run Code
Output

TreeMap: {Third=3, Second=2, Fourth=4, First=1}
In the above example, we have created a treemap passing CustomComparator class as an argument.

The CustomComparator class implements the Comparator interface.

We then override the compare() method to sort elements in reverse order.

To learn more, visit Java Comparator (official Java documentation).









Java ConcurrentMap Interface
In this tutorial, we will learn about the Java ConcurrentMap interface and its methods.

The ConcurrentMap interface of the Java collections framework provides a thread-safe map. That is, multiple threads can access the map at once without affecting the consistency of entries in a map.

ConcurrentMap is known as a synchronized map.

It extends the Map interface.

Class that implements ConcurrentMap
Since ConcurrentMap is an interface, we cannot create objects from it.

In order to use the functionalities of the ConcurrentMap interface, we need to use the class ConcurrentHashMap that implements it.

Java ConcurrentHashMap interface extends the Java ConcurrentMap interface.

How to use ConcurrentMap?
To use the ConcurrentMap, we must import the java.util.concurrent.ConcurrentMap package first. Once we import the package, here's how we can create a concurrent map.

// ConcurrentMap implementation by ConcurrentHashMap
CocurrentMap<Key, Value> numbers = new ConcurrentHashMap<>();

In the above code, we have created a concurrent map named numbers.

Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by keys in a map
Methods of ConcurrentMap
The ConcurrentMap interface includes all the methods of the Map interface. It is because Map is the super interface of the ConcurrentMap interface.

Besides all those methods, here are the methods specific to the ConcurrentMap interface.

putIfAbsent() - Inserts the specified key/value to the map if the specified key is not already associated with any value.
compute() - Computes an entry (key/value mapping) for the specified key and its previously mapped value.
computeIfAbsent() - Computes a value using the specified function for the specified key if the key is not already mapped with any value.
computeIfPresent() - Computes a new entry (key/value mapping) for the specified key if the key is already mapped with the specified value.
forEach() - Access all entries of a map and perform the specified actions.
merge() - Merges the new specified value with the old value of the specified key if the key is already mapped to a certain value. If the key is not already mapped, the method simply associates the specified value to our key.
To learn more, visit Java ConcurrentMap (official Java documentation).

Implementation of ConcurrentMap in ConcurrentHashMap
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;

class Main {

    public static void main(String[] args) {
        // Creating ConcurrentMap using ConcurrentHashMap
        ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>();

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);
        System.out.println("ConcurrentMap: " + numbers);

        // Access the value of specified key
        int value = numbers.get("One");
        System.out.println("Accessed Value: " + value);

        // Remove the value of specified key
        int removedValue = numbers.remove("Two");
        System.out.println("Removed Value: " + removedValue);
    }
}
Run Code
Output

ConcurrentMap: {One=1, Two=2, Three=3}
Accessed Value: 1
Removed Value: 2
To learn more about ConcurrentHashMap, visit Java ConcurrentHashMap.














### Java ConcurrentHashMap
In this tutorial, we will learn about the Java ConcurrentHashMap class and its operations with the help of examples.

The ConcurrentHashMap class of the Java collections framework provides a thread-safe map. That is, multiple threads can access the map at once without affecting the consistency of entries in a map.

It implements the ConcurrentMap interface.

Java ConcurrentHashMap class implements the ConcurrentMap interface.

Create a ConcurrentHashMap
In order to create a concurrent hashmap, we must import the java.util.concurrent.ConcurrentHashMap package first. Once we import the package, here is how we can create concurrent hashmaps in Java.

// ConcurrentHashMap with capacity 8 and load factor 0.6
ConcurrentHashMap<Key, Value> numbers = new ConcurrentHashMap<>(8, 0.6f);
In the above code, we have created a concurrent hashmap named numbers.

Here,

Key - a unique identifier used to associate each element (value) in a map
Value - elements associated by keys in a map
Notice the part new ConcurrentHashMap<>(8, 0.6). Here, the first parameter is capacity and the second parameter is loadFactor.

capacity - The capacity of this map is 8. Meaning, it can store 8 entries.
loadFactor - The load factor of this map is 0.6. This means, whenever our hash table is filled by 60%, the entries are moved to a new hash table of double the size of the original hash table.
Default capacity and load factor

It's possible to create a concurrent hashmap without defining its capacity and load factor. For example,

// ConcurrentHashMap with default capacity and load factor
ConcurrentHashMap<Key, Value> numbers1 = new ConcurrentHashMap<>();
By default,

the capacity of the map will be 16
the load factor will be 0.75
Creating ConcurrentHashMap from Other Maps
Here is how we can create a concurrent hashmap containing all the elements of other maps.

import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // Creating a hashmap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("HashMap: " + evenNumbers);

        // Creating a concurrent hashmap from other map
        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers);
    }
}
Run Code
Output

HashMap: {Four=4, Two=2}
ConcurrentHashMap: {Four=4, Two=2, Three=3}
Methods of ConcurrentHashMap
The ConcurrentHashMap class provides methods that allow us to perform various operations on the map.

Insert Elements to ConcurrentHashMap
put() - inserts the specified key/value mapping to the map
putAll() - inserts all the entries from specified map to this map
putIfAbsent() - inserts the specified key/value mapping to the map if the specified key is not present in the map
For example,

import java.util.concurrent.ConcurrentHashMap;

class Main {
    public static void main(String[] args) {
        // Creating ConcurrentHashMap of even numbers
        ConcurrentHashMap<String, Integer> evenNumbers = new ConcurrentHashMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("ConcurrentHashMap of even numbers: " + evenNumbers);

        //Creating ConcurrentHashMap of numbers
        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("ConcurrentHashMap of numbers: " + numbers);
    }
}
Run Code
Output

ConcurrentHashMap of even numbers: {Six=6, Four=4, Two=2}
ConcurrentHashMap of numbers: {Six=6, One=1, Four=-4, Two=2}
Access ConcurrentHashMap Elements
1. Using entrySet(), keySet() and values()

entrySet() - returns a set of all the key/value mapping of the map
keySet() - returns a set of all the keys of the map
values() - returns a set of all the values of the map
For example,

import java.util.concurrent.ConcurrentHashMap;

class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());
    }
}
Run Code
Output

ConcurrentHashMap: {One=1, Two=2, Three=3}
Key/Value mappings: [One=1, Two=2, Three=3]
Keys: [One, Two, Three]
Values: [1, 2, 3]
2. Using get() and getOrDefault()

get() - Returns the value associated with the specified key. Returns null if the key is not found.
getOrDefault() - Returns the value associated with the specified key. Returns the specified default value if the key is not found.
For example,

import java.util.concurrent.ConcurrentHashMap;

class Main {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers);

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Using get(): " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);
    }
}
Run Code
Output

ConcurrentHashMap: {One=1, Two=2, Three=3}
Using get(): 3
Using getOrDefault(): 5
Remove ConcurrentHashMap Elements
remove(key) - returns and removes the entry associated with the specified key from the map
remove(key, value) - removes the entry from the map only if the specified key mapped to the specified value and return a boolean value
For example,

import java.util.concurrent.ConcurrentHashMap;

class Main {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers);

        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);

        System.out.println("Updated ConcurrentHashMap: " + numbers);
    }
}
Run Code

Output

ConcurrentHashMap: {One=1, Two=2, Three=3}
Removed value: 2
Is the entry {Three=3} removed? True
Updated ConcurrentHashMap: {One=1}
Bulk ConcurrentHashMap Operations
The ConcurrentHashMap class provides different bulk operations that can be applied safely to concurrent maps.

1. forEach() Method
The forEach() method iterates over our entries and executes the specified function.

It includes two parameters.

parallelismThreshold - It specifies that after how many elements operations in a map are executed in parallel.
transformer - This will transform the data before the data is passed to the specified function.
For example,

import java.util.concurrent.ConcurrentHashMap;

class Main {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers);

        // forEach() without transformer function
        numbers.forEach(4, (k, v) -> System.out.println("key: " + k + " value: " + v));

        // forEach() with transformer function
        System.out.print("Values are ");
        numbers.forEach(4, (k, v) -> v, (v) -> System.out.print(v + ", "));
    }
}

Run Code
Output

ConcurrentHashMap: {One = 1, Two = 2, Three = 3}
key: One value: 1
key: Two value: 2
key: Three value: 3
Values are 1, 2, 3,
In the above program, we have used parallel threshold 4. This means if the map contains 4 entries, the operation will be executed in parallel.

Variation of forEach() Method

forEachEntry() - executes the specified function for each entry
forEachKey() - executes the specified function for each key
forEachValue() - executes the specified function for each value
2. search() Method
The search() method searches the map based on the specified function and returns the matched entry.

Here, the specified function determines what entry is to be searched.

It also includes an optional parameter parallelThreshold. The parallel threshold specifies that after how many elements in the map the operation is executed in parallel.

For example,

import java.util.concurrent.ConcurrentHashMap;

class Main {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers);

        // Using search()
        String key = numbers.search(4, (k, v) -> {return v == 3 ? k: null;});
        System.out.println("Searched value: " + key);

    }
}
Run Code
Output

ConcurrentHashMap: {One=1, Two=2, Three=3}
Searched value: Three
Variants of search() Method

searchEntries() - search function is applied to key/value mappings
searchKeys() - search function is only applied to the keys
searchValues() - search function is only applied to the values
3. reduce() Method
The reduce() method accumulates (gather together) each entry in a map. This can be used when we need all the entries to perform a common task, like adding all the values of a map.

It includes two parameters.

parallelismThreshold - It specifies that after how many elements, operations in a map are executed in parallel.
transformer - This will transform the data before the data is passed to the specified function.
For example,

import java.util.concurrent.ConcurrentHashMap;

class Main {
    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers);

        // Using search()
        int sum = numbers.reduce(4, (k, v) -> v, (v1, v2) -> v1 + v2);
        System.out.println("Sum of all values: " + sum);

    }
}
Run Code
Output

ConcurrentHashMap: {One=1, Two=2, Three=3}
Sum of all values: 6
In the above program, notice the statement

numbers.reduce(4, (k, v) -> v, (v1, v2) -> v1+v2);
Here,

4 is a parallel threshold
(k, v) -> v is a transformer function. It transfers the key/value mappings into values only.
(v1, v2) -> v1+v2 is a reducer function. It gathers together all the values and adds all values.
Variants of reduce() Method

reduceEntries() - returns the result of gathering all the entries using the specified reducer function
reduceKeys() - returns the result of gathering all the keys using the specified reducer function
reduceValues() - returns the result of gathering all the values using the specified reducer function
ConcurrentHashMap vs HashMap
Here are some of the differences between ConcurrentHashMap and HashMap,

ConcurrentHashMap is a thread-safe collection. That is, multiple threads can access and modify it at the same time.
ConcurrentHashMap provides methods for bulk operations like forEach(), search() and reduce().
Why ConcurrentHashMap?
The ConcurrentHashMap class allows multiple threads to access its entries concurrently.
By default, the concurrent hashmap is divided into 16 segments. This is the reason why 16 threads are allowed to concurrently modify the map at the same time. However, any number of threads can access the map at a time.
The putIfAbsent() method will not override the entry in the map if the specified key already exists.
It provides its own synchronization.


















### Java Set Interface
In this tutorial, we will learn about the Set interface in Java and its methods.

The Set interface of the Java Collections framework provides the features of the mathematical set in Java. It extends the Collection interface.

Unlike the List interface, sets cannot contain duplicate elements.

Classes that implement Set
Since Set is an interface, we cannot create objects from it.

In order to use functionalities of the Set interface, we can use these classes:

HashSet
LinkedHashSet
EnumSet
TreeSet
These classes are defined in the Collections framework and implement the Set interface.

Interfaces SortedSet and NavigableSet extends the Set interface.

Interfaces that extend Set
The Set interface is also extended by these subinterfaces:

SortedSet
NavigableSet
Classes EnumSet, HashSet, LinkedHastSet and TreeSet implement the Set interface.

How to use Set?
In Java, we must import java.util.Set package in order to use Set.

// Set implementation using HashSet
Set<String> animals = new HashSet<>();
Here, we have created a Set called animals. We have used the HashSet class to implement the Set interface.

Methods of Set
The Set interface includes all the methods of the Collection interface. It's because Collection is a super interface of Set.


Some of the commonly used methods of the Collection interface that's also available in the Set interface are:

add() - adds the specified element to the set
addAll() - adds all the elements of the specified collection to the set
iterator() - returns an iterator that can be used to access elements of the set sequentially
remove() - removes the specified element from the set
removeAll() - removes all the elements from the set that is present in another specified set
retainAll() - retains all the elements in the set that are also present in another specified set
clear() - removes all the elements from the set
size() - returns the length (number of elements) of the set
toArray() - returns an array containing all the elements of the set
contains() - returns true if the set contains the specified element
containsAll() - returns true if the set contains all the elements of the specified collection
hashCode() - returns a hash code value (address of the element in the set)
To learn about more methods of the Set interface, visit Java Set (official Java documentation).

Set Operations
The Java Set interface allows us to perform basic mathematical set operations like union, intersection, and subset.

Union - to get the union of two sets x and y, we can use x.addAll(y)
Intersection - to get the intersection of two sets x and y, we can use x.retainAll(y)
Subset - to check if x is a subset of y, we can use y.containsAll(x)
Implementation of the Set Interface
1. Implementing HashSet Class

import java.util.Set;
import java.util.HashSet;

class Main {

    public static void main(String[] args) {
        // Creating a set using the HashSet class
        Set<Integer> set1 = new HashSet<>();

        // Add elements to the set1
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        // Creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);

        // Union of two sets
        set2.addAll(set1);
        System.out.println("Union is: " + set2);
    }
}
Run Code
Output

Set1: [2, 3]
Set2: [1, 2]
Union is: [1, 2, 3]
To learn more about HashSet, visit Java HashSet.

2. Implementing TreeSet Class

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

class Main {

    public static void main(String[] args) {
        // Creating a set using the TreeSet class
        Set<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("Set using TreeSet: " + numbers);

        // Access Elements using iterator()
        System.out.print("Accessing elements using iterator(): ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

    }
}
Run Code
Output

Set using TreeSet: [1, 2, 3]
Accessing elements using iterator(): 1, 2, 3,
To learn more about TreeSet, visit Java TreeSet.

Now that we know what Set is, we will see its implementations in classes like EnumSet, HashSet, LinkedHashSet and TreeSet in the next tutorials.






















### Java HashSet Class
In this tutorial, we will learn about the Java HashSet class. We will learn about different hash set methods and operations with the help of examples.

The HashSet class of the Java Collections framework provides the functionalities of the hash table data structure.

It implements the Set interface.

Java HashSet class implements the Set interface.

Creating a HashSet
In order to create a hash set, we must import the java.util.HashSet package first.

Once we import the package, here is how we can create hash sets in Java.

// HashSet with 8 capacity and 0.75 load factor
HashSet<Integer> numbers = new HashSet<>(8, 0.75);
Here, we have created a hash set named numbers.

Notice, the part new HashSet<>(8, 0.75). Here, the first parameter is capacity, and the second parameter is loadFactor.

capacity - The capacity of this hash set is 8. Meaning, it can store 8 elements.
loadFactor - The load factor of this hash set is 0.6. This means, whenever our hash set is filled by 60%, the elements are moved to a new hash table of double the size of the original hash table.
Default capacity and load factor

It's possible to create a hash table without defining its capacity and load factor. For example,

// HashSet with default capacity and load factor
HashSet<Integer> numbers1 = new HashSet<>();
By default,

the capacity of the hash set will be 16
the load factor will be 0.75
Methods of HashSet
The HashSet class provides various methods that allow us to perform various operations on the set.

Insert Elements to HashSet
add() - inserts the specified element to the set
addAll() - inserts all the elements of the specified collection to the set
For example,

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
    }
}
Run Code
Output

HashSet: [2, 4, 6]
New HashSet: [2, 4, 5, 6]
Access HashSet Elements
To access the elements of a hash set, we can use the iterator() method. In order to use this method, we must import the java.util.Iterator package. For example,

import java.util.HashSet;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet: " + numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
Run Code
Output

HashSet: [2, 5, 6]
HashSet using Iterator: 2, 5, 6,
Remove Elements
remove() - removes the specified element from the set
removeAll() - removes all the elements from the set

For example,

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet: " + numbers);

        // Using remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }
}
Run Code
Output

HashSet: [2, 5, 6]
Is 5 removed? true
Are all elements removed? true
Set Operations
The various methods of the HashSet class can also be used to perform various set operations.

Union of Sets
To perform the union between two sets, we can use the addAll() method. For example,

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        // Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);
    }
}

Run Code
Output

HashSet1: [2, 4]
HashSet2: [1, 3]
Union is: [1, 2, 3, 4]
Intersection of Sets
To perform the intersection between two sets, we can use the retainAll() method. For example

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet2: " + evenNumbers);

        // Intersection of two sets
        evenNumbers.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumbers);
    }
}
Run Code
Output

HashSet1: [2, 3]
HashSet2: [2, 4]
Intersection is: [2]
Difference of Sets
To calculate the difference between the two sets, we can use the removeAll() method. For example,

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);
    }
}
Run Code
Output

HashSet1: [2, 3, 5]
HashSet2: [1, 3, 5]
Difference: [2]
Subset
To check if a set is a subset of another set or not, we can use the containsAll() method. For example,

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("HashSet1: " + numbers);

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet2: " + primeNumbers);

        // Check if primeNumbers is a subset of numbers
        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("Is HashSet2 is subset of HashSet1? " + result);
    }
}
Run Code
Output

HashSet1: [1, 2, 3, 4]
HashSet2: [2, 3]
Is HashSet2 is a subset of HashSet1? true
Other Methods Of HashSet
Method	Description
clone()	Creates a copy of the HashSet
contains()	Searches the HashSet for the specified element and returns a boolean result
isEmpty()	Checks if the HashSet is empty
size()	Returns the size of the HashSet
clear()	Removes all the elements from the HashSet
To learn more about HashSet methods, visit Java HashSet (official Java documentation).

Why HashSet?
In Java, HashSet is commonly used if we have to access elements randomly. It is because elements in a hash table are accessed using hash codes.

The hashcode of an element is a unique identity that helps to identify the element in a hash table.

HashSet cannot contain duplicate elements. Hence, each hash set element has a unique hashcode.

Note: HashSet is not synchronized. That is if multiple threads access the hash set at the same time and one of the threads modifies the hash set. Then it must be externally synchronized.


















Java EnumSet
In this tutorial, we will learn about the Java EnumSet class and its various methods with the help of examples.

The EnumSet class of the Java collections framework provides a set implementation of elements of a single enum.

Before you learn about EnumSet, make sure to know about Java Enums.

It implements the Set interface.

Java EnumSet class implements the Java Set interface.

Creating EnumSet
In order to create an enum set, we must import the java.util.EnumSet package first.

Unlike other set implementations, the enum set does not have public constructors. We must use the predefined methods to create an enum set.

1. Using allOf(Size)
The allof() method creates an enum set that contains all the values of the specified enum type Size. For example,

import java.util.EnumSet;

class Main {
    // an enum named Size
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    
    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        System.out.println("EnumSet: " + sizes);
    }

}
Run Code
Output

EnumSet: [SMALL, MEDIUM, LARGE, EXTRALARGE]
Notice the statement,

EnumSet<Size> sizes = EnumSet.allOf(Size.class);
Here, Size.class denotes the Size enum that we have created.

2. Using noneOf(Size)
The noneOf() method creates an empty enum set. For example,

import java.util.EnumSet;

class Main {

     // an enum type Size
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating an EnumSet using noneOf()
        EnumSet<Size> sizes = EnumSet.noneOf(Size.class);

        System.out.println("Empty EnumSet: " + sizes);
    }
}
Run Code
Output

Empty EnumSet : []
Here, we have created an empty enum named sizes.

Note: We can only insert elements of enum type Size in the above program. It's because we created our empty enum set using Size enum.

3. Using range(e1, e2) Method
The range() method creates an enum set containing all the values of an enum between e1 and e2 including both values. For example,

import java.util.EnumSet;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating an EnumSet using range()
        EnumSet<Size> sizes = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);

        System.out.println("EnumSet: " + sizes);
    }
}
Run Code
Output

EnumSet: [MEDIUM, LARGE, EXTRALARGE]
4. Using of() Method
The of() method creates an enum set containing the specified elements. For example,

import java.util.EnumSet;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Using of() with a single parameter
        EnumSet<Size> sizes1 = EnumSet.of(Size.MEDIUM);
        System.out.println("EnumSet1: " + sizes1);

        EnumSet<Size> sizes2 = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("EnumSet2: " + sizes2);
    }
}
Run Code
Output

EnumSet1: [MEDIUM]
EnumSet2: [SMALL, LARGE]
Methods of EnumSet
The EnumSet class provides methods that allow us to perform various elements on the enum set.

Insert Elements to EnumSet
add() - inserts specified enum values to the enum set
addAll() inserts all the elements of the specified collection to the set
For example,

import java.util.EnumSet;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes1 = EnumSet.allOf(Size.class);

        // Creating an EnumSet using noneOf()
        EnumSet<Size> sizes2 = EnumSet.noneOf(Size.class);

        // Using add method
        sizes2.add(Size.MEDIUM);
        System.out.println("EnumSet Using add(): " + sizes2);

        // Using addAll() method
        sizes2.addAll(sizes1);
        System.out.println("EnumSet Using addAll(): " + sizes2);
    }
}
Run Code

Output

EnumSet using add(): [MEDIUM]
EnumSet using addAll(): [SMALL, MEDIUM, LARGE, EXTRALARGE]
In the above example, we have used the addAll() method to insert all the elements of an enum set sizes1 to an enum set sizes2.

It's also possible to insert elements from other collections such as ArrayList, LinkedList, etc. to an enum set using addAll(). However, all collections should be of the same enum type.

Access EnumSet Elements
To access elements of an enum set, we can use the iterator() method. In order to use this method, we must import the java.util.Iterator package. For example,

import java.util.EnumSet;
import java.util.Iterator;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        Iterator<Size> iterate = sizes.iterator();

        System.out.print("EnumSet: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
Run Code
Output

EnumSet: SMALL, MEDIUM, LARGE, EXTRALARGE,
Note:

hasNext() returns true if there is a next element in the enum set
next() returns the next element in the enum set
Remove EnumSet Elements
remove() - removes the specified element from the enum set
removeAll() - removes all the elements from the enum set
For example,

import java.util.EnumSet;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet: " + sizes);

        // Using remove()
        boolean value1 = sizes.remove(Size.MEDIUM);
        System.out.println("Is MEDIUM removed? " + value1);

        // Using removeAll()
        boolean value2 = sizes.removeAll(sizes);
        System.out.println("Are all elements removed? " + value2);
    }
}
Run Code
Output

EnumSet: [SMALL, MEDIUM, LARGE, EXTRALARGE]
Is MEDIUM removed? true
Are all elements removed? true
Other Methods
Method	Description
copyOf()	Creates a copy of the EnumSet
contains()	Searches the EnumSet for the specified element and returns a boolean result
isEmpty()	Checks if the EnumSet is empty
size()	Returns the size of the EnumSet
clear()	Removes all the elements from the EnumSet
Clonable and Serializable Interfaces
The EnumSet class also implements Cloneable and Serializable interfaces.

Cloneable Interface

It allows the EnumSet class to make a copy of instances of the class.

Serializable Interface

Whenever Java objects need to be transmitted over a network, objects need to be converted into bits or bytes. This is because Java objects cannot be transmitted over the network.

The Serializable interface allows classes to be serialized. This means objects of the classes implementing Serializable can be converted into bits or bytes.

Why EnumSet?
The EnumSet provides an efficient way to store enum values than other set implementations (like HashSet, TreeSet).

An enum set only stores enum values of a specific enum. Hence, the JVM already knows all the possible values of the set.

This is the reason why enum sets are internally implemented as a sequence of bits. Bits specifies whether elements are present in the enum set or not.

The bit of a corresponding element is turned on if that element is present in the set.












### Java LinkedHashSet
In this tutorial, we will learn about the Java LinkedHashSet class and its methods with the help of examples.

The LinkedHashSet class of the Java collections framework provides functionalities of both the hashtable and the linked list data structure.

It implements the Set interface.

Java LinkedHastSet class implements the Set interface.

Elements of LinkedHashSet are stored in hash tables similar to HashSet.

However, linked hash sets maintain a doubly-linked list internally for all of its elements. The linked list defines the order in which elements are inserted in hash tables.

Create a LinkedHashSet
In order to create a linked hash set, we must import the java.util.LinkedHashSet package first.

Once we import the package, here is how we can create linked hash sets in Java.

// LinkedHashSet with 8 capacity and 0.75 load factor
LinkedHashSet<Integer> numbers = new LinkedHashSet<>(8, 0.75);
Here, we have created a linked hash set named numbers.

Notice, the part new LinkedHashSet<>(8, 0.75). Here, the first parameter is capacity and the second parameter is loadFactor.

capacity - The capacity of this hash set is 8. Meaning, it can store 8 elements.
loadFactor - The load factor of this hash set is 0.6. This means, whenever our hash table is filled by 60%, the elements are moved to a new hash table of double the size of the original hash table.
Default capacity and load factor

It's possible to create a linked hash set without defining its capacity and load factor. For example,

// LinkedHashSet with default capacity and load factor
LinkedHashSet<Integer> numbers1 = new LinkedHashSet<>();
By default,

the capacity of the linked hash set will be 16
the load factor will be 0.75
Creating LinkedHashSet from Other Collections
Here is how we can create a linked hash set containing all the elements of other collections.

import java.util.LinkedHashSet;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Creating an arrayList of even numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("ArrayList: " + evenNumbers);

        // Creating a LinkedHashSet from an ArrayList
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
        System.out.println("LinkedHashSet: " + numbers);
    }
}

Run Code
Output

ArrayList: [2, 4]
LinkedHashSet: [2, 4]
Methods of LinkedHashSet
The LinkedHashSet class provides methods that allow us to perform various operations on the linked hash set.

Insert Elements to LinkedHashSet
add() - inserts the specified element to the linked hash set
addAll() - inserts all the elements of the specified collection to the linked hash set
For example,

import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("LinkedHashSet: " + evenNumber);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New LinkedHashSet: " + numbers);
    }
}
Run Code
Output

LinkedHashSet: [2, 4, 6]
New LinkedHashSet: [2, 4, 6, 5]
Access LinkedHashSet Elements

To access the elements of a linked hash set, we can use the iterator() method. In order to use this method, we must import the java.util.Iterator package. For example,

import java.util.LinkedHashSet;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("LinkedHashSet: " + numbers);

        // Calling the iterator() method
        Iterator<Integer> iterate = numbers.iterator();

        System.out.print("LinkedHashSet using Iterator: ");

        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
Run Code
Output

LinkedHashSet: [2, 5, 6]
LinkedHashSet using Iterator: 2, 5, 6,
Note:

hasNext() returns true if there is a next element in the linked hash set
next() returns the next element in the linked hash set
Remove Elements from HashSet
remove() - removes the specified element from the linked hash set
removeAll() - removes all the elements from the linked hash set
For example,

import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("LinkedHashSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }
}
Run Code
Output

LinkedHashSet: [2, 5, 6]
Is 5 removed? true
Are all elements removed? true
Set Operations
The various methods of the LinkedHashSet class can also be used to perform various set operations.

Union of Sets
Two perform the union between two sets, we can use the addAll() method. For example,

import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("LinkedHashSet1: " + evenNumbers);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("LinkedHashSet2: " + numbers);

        // Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);
    }
}
Run Code
Output

LinkedHashSet1: [2, 4]
LinkedHashSet2: [1, 3]
Union is: [1, 3, 2, 4]
Intersection of Sets
To perform the intersection between two sets, we can use the retainAll() method. For example

import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("LinkedHashSet1: " + primeNumbers);

        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("LinkedHashSet2: " + evenNumbers);

        // Intersection of two sets
        evenNumbers.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumbers);
    }
}
Run Code
Output

LinkedHashSet1: [2, 3]
LinkedHashSet2: [2, 4]
Intersection is: [2]
Difference of Sets
To calculate the difference between the two sets, we can use the removeAll() method. For example,

import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("LinkedHashSet1: " + primeNumbers);

        LinkedHashSet<Integer> oddNumbers = new LinkedHashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("LinkedHashSet2: " + oddNumbers);

        // Difference between LinkedHashSet1 and LinkedHashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);
    }
}
Run Code
Output

LinkedHashSet1: [2, 3, 5]
LinkedHashSet2: [1, 3, 5]
Difference: [2]
Subset
To check if a set is a subset of another set or not, we can use the containsAll() method. For example,

import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("LinkedHashSet1: " + numbers);

        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("LinkedHashSet2: " + primeNumbers);

        // Check if primeNumbers is a subset of numbers
        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("Is LinkedHashSet2 is subset of LinkedHashSet1? " + result);
    }
}
Run Code
Output

LinkedHashSet1: [1, 2, 3, 4]
LinkedHashSet2: [2, 3]
Is LinkedHashSet2 is a subset of LinkedHashSet1? true
Other Methods Of LinkedHashSet
Method	Description
clone()	Creates a copy of the LinkedHashSet
contains()	Searches the LinkedHashSet for the specified element and returns a boolean result
isEmpty()	Checks if the LinkedHashSet is empty
size()	Returns the size of the LinkedHashSet
clear()	Removes all the elements from the LinkedHashSet
To learn more about LinkedHashSet methods, visit Java LinkedHashSet (official Java documentation).

LinkedHashSet Vs. HashSet
Both LinkedHashSet and HashSet implements the Set interface. However, there exist some differences between them.

LinkedHashSet maintains a linked list internally. Due to this, it maintains the insertion order of its elements.
The LinkedHashSet class requires more storage than HashSet. This is because LinkedHashSet maintains linked lists internally.
The performance of LinkedHashSet is slower than HashSet. It is because of linked lists present in LinkedHashSet.
LinkedHashSet Vs. TreeSet
Here are the major differences between LinkedHashSet and TreeSet:

The TreeSet class implements the SortedSet interface. That's why elements in a tree set are sorted. However, the LinkedHashSet class only maintains the insertion order of its elements.
A TreeSet is usually slower than a LinkedHashSet. It is because whenever an element is added to a TreeSet, it has to perform the sorting operation.
LinkedHashSet allows the insertion of null values. However, we cannot insert a null value to TreeSet.

















Java SortedSet Interface
In this tutorial, we will learn about the SortedSet interface in Java and its methods with the help of an example.

The SortedSet interface of the Java Collections framework is used to store elements with some order in a set.

It extends the Set interface.

The Java SortedSet interface extends the Set interface.

Class that implements SortedSet
In order to use the functionalities of the SortedSet interface, we need to use the TreeSet class that implements it.

The Java TreeSet class implements the SortedSet interface.

How to use SortedSet?
To use SortedSet, we must import the java.util.SortedSet package first.

// SortedSet implementation by TreeSet class
SortedSet<String> animals = new TreeSet<>();
We have created a sorted set called animals using the TreeSet class.


Here we have used no arguments to create a sorted set. Hence the set will be sorted naturally.

Methods of SortedSet
The SortedSet interface includes all the methods of the Set interface. It's because Set is a super interface of SortedSet.

Besides methods included in the Set interface, the SortedSet interface also includes these methods:

comparator() - returns a comparator that can be used to order elements in the set
first() - returns the first element of the set
last() - returns the last element of the set
headSet(element) - returns all the elements of the set before the specified element
tailSet(element) - returns all the elements of the set after the specified element including the specified element
subSet(element1, element2) - returns all the elements between the element1 and element2 including element1
Implementation of SortedSet in TreeSet Class
import java.util.SortedSet;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {
        // Creating SortedSet using the TreeSet
        SortedSet<Integer> numbers = new TreeSet<>();

        // Insert elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("SortedSet: " + numbers);

        // Access the element
        int firstNumber = numbers.first();
        System.out.println("First Number: " + firstNumber);

        int lastNumber = numbers.last();
        System.out.println("Last Number: " + lastNumber);

        // Remove elements
        boolean result = numbers.remove(2);
        System.out.println("Is the number 2 removed? " + result);
    }
}
Run Code
Output

SortedSet: [1, 2, 3, 4]
First Number: 1
Last Number: 4
Is the number 2 removed? true
To learn more about TreeSet, visit Java TreeSet.

Now that we know about the SortedSet interface, we will learn about its implementation using the TreeSet class.














Java NavigableSet Interface
In this tutorial, we will learn about the Java NavigableSet interface and its methods with the help of an example.

The NavigableSet interface of the Java Collections framework provides the features to navigate among the set elements.

It is considered as a type of SortedSet.

Class that implements NavigableSet
In order to use the functionalities of the NavigableSet interface, we need to use the TreeSet class that implements NavigableSet.

The TreeSet class implements the NavigableSet interface.

How to use NavigableSet?
In Java, we must import the java.util.NavigableSet package to use NavigableSet. Once we import the package, here's how we can create navigable sets.

// SortedSet implementation by TreeSet class
NavigableSet<String> numbers = new TreeSet<>();
Here, we have created a navigable set named numbers of the TreeSet class.

Methods of NavigableSet
The NavigableSet is considered as a type of SortedSet. It is because NavigableSet extends the SortedSet interface.

Hence, all SortedSet methods are also available in NavigableSet. To learn how these methods, visit Java SortedSet.

However, some of the methods of SortedSet (headSet(), tailSet() and subSet()) are defined differently in NavigableSet.

Let's see how these methods are defined in NavigableSet.

headSet(element, booleanValue)
The headSet() method returns all the elements of a navigable set before the specified element (which is passed as an argument).

The booleanValue parameter is optional. Its default value is false.

If true is passed as a booleanValue, the method returns all the elements before the specified element including the specified element.

tailSet(element, booleanValue)

The tailSet() method returns all the elements of a navigable set after the specified element (which is passed as an argument) including the specified element.

The booleanValue parameter is optional. Its default value is true.

If false is passed as a booleanValue, the method returns all the elements after the specified element without including the specified element.

subSet(e1, bv1, e2, bv2)
The subSet() method returns all the elements between e1 and e2 including e1.

The bv1 and bv2 are optional parameters. The default value of bv1 is true, and the default value of bv2 is false.

If false is passed as bv1, the method returns all the elements between e1 and e2 without including e1.

If true is passed as bv2, the method returns all the elements between e1 and e2, including e1.

Methods for Navigation
The NavigableSet provides various methods that can be used to navigate over its elements.

descendingSet() - reverses the order of elements in a set
descendingIterator() - returns an iterator that can be used to iterate over a set in reverse order
ceiling() - returns the lowest element among those elements that are greater than or equal to the specified element
floor() - returns the greatest element among those elements that are less than or equal to the specified element
higher() - returns the lowest element among those elements that are greater than the specified element
lower() - returns the greatest element among those elements that are less than the specified element
pollFirst() - returns and removes the first element from the set
pollLast() - returns and removes the last element from the set
To learn more about the NavigableSet, visit Java NavigableSet (official Java documentation).

Implementation of NavigableSet in TreeSet Class
import java.util.NavigableSet;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {
        // Creating NavigableSet using the TreeSet
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Insert elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("NavigableSet: " + numbers);

        // Access the first element
        int firstElement = numbers.first();
        System.out.println("First Number: " + firstElement);

        // Access the last element
        int lastElement = numbers.last();
        System.out.println("Last Element: " + lastElement);

        // Remove the first element
        int number1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + number1);

        // Remove the last element
        int number2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + number2);

    }
}
Run Code
Output

NavigableSet: [1, 2, 3]
First Element: 1
Last Element: 3
Removed First Element: 1
Removed Last Element: 3
To learn more about TreeSet, visit Java TreeSet.

Now that we know about the NavigableSet interface, we will learn about its implementation using the TreeSet class.










### Java TreeSet
In this tutorial, we will learn about the Java TreeSet class and its various operations and methods with the help of examples.

The TreeSet class of the Java collections framework provides the functionality of a tree data structure.

It extends the NavigableSet interface.

Java TreeSet class implements the NavigableSet interface.

Creating a TreeSet
In order to create a tree set, we must import the java.util.TreeSet package first.

Once we import the package, here is how we can create a TreeSet in Java.


TreeSet<Integer> numbers = new TreeSet<>();
Here, we have created a TreeSet without any arguments. In this case, the elements in TreeSet are sorted naturally (ascending order).

However, we can customize the sorting of elements by using the Comparator interface. We will learn about it later in this tutorial.

Methods of TreeSet
The TreeSet class provides various methods that allow us to perform various operations on the set.

Insert Elements to TreeSet
add() - inserts the specified element to the set
addAll() - inserts all the elements of the specified collection to the set
For example,

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {

        TreeSet<Integer> evenNumbers = new TreeSet<>();

        // Using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);

        // Using the addAll() method
        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);
    }
}
Run Code
Output

TreeSet: [2, 4, 6]
New TreeSet: [1, 2, 4, 6]
Access TreeSet Elements
To access the elements of a tree set, we can use the iterator() method. In order to use this method, we must import java.util.Iterator package. For example,

import java.util.TreeSet;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("TreeSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
Run Code
Output

TreeSet: [2, 5, 6]
TreeSet using Iterator: 2, 5, 6,
Remove Elements
remove() - removes the specified element from the set
removeAll() - removes all the elements from the set
For example,

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        // Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }
}
Run Code
Output

TreeSet: [2, 5, 6]
Is 5 removed? true
Are all elements removed? true
Methods for Navigation
Since the TreeSet class implements NavigableSet, it provides various methods to navigate over the elements of the tree set.

1. first() and last() Methods
first() - returns the first element of the set
last() - returns the last element of the set
For example,

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);
    }
}
Run Code
Output

TreeSet: [2, 5, 6]
First Number: 2
Last Number: 6
2. ceiling(), floor(), higher() and lower() Methods
higher(element) - Returns the lowest element among those elements that are greater than the specified element.
lower(element) - Returns the greatest element among those elements that are less than the specified element.
ceiling(element) - Returns the lowest element among those elements that are greater than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
floor(element) - Returns the greatest element among those elements that are less than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
For example,

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using higher()
        System.out.println("Using higher: " + numbers.higher(4));

        // Using lower()
        System.out.println("Using lower: " + numbers.lower(4));

        // Using ceiling()
        System.out.println("Using ceiling: " + numbers.ceiling(4));

        // Using floor()
        System.out.println("Using floor: " + numbers.floor(3));

    }
}
Run Code
Output

TreeSet: [2, 4, 5, 6]
Using higher: 5
Using lower: 2
Using ceiling: 4
Using floor: 2
3. pollfirst() and pollLast() Methods
pollFirst() - returns and removes the first element from the set
pollLast() - returns and removes the last element from the set
For example,

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers.pollLast());

        System.out.println("New TreeSet: " + numbers);
    }
}
Run Code
Output

TreeSet: [2, 4, 5, 6]
Removed First Element: 2
Removed Last Element: 6
New TreeSet: [4, 5]
4. headSet(), tailSet() and subSet() Methods
headSet(element, booleanValue)
The headSet() method returns all the elements of a tree set before the specified element (which is passed as an argument).

The booleanValue parameter is optional. Its default value is false.

If true is passed as a booleanValue, the method returns all the elements before the specified element including the specified element.

For example,

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using headSet() with default boolean value
        System.out.println("Using headSet without boolean value: " + numbers.headSet(5));

        // Using headSet() with specified boolean value
        System.out.println("Using headSet with boolean value: " + numbers.headSet(5, true));
    }
}
Run Code
Output

TreeSet: [2, 4, 5, 6]
Using headSet without boolean value: [2, 4]
Using headSet with boolean value: [2, 4, 5]
tailSet(element, booleanValue)
The tailSet() method returns all the elements of a tree set after the specified element (which is passed as a parameter) including the specified element.

The booleanValue parameter is optional. Its default value is true.


If false is passed as a booleanValue, the method returns all the elements after the specified element without including the specified element.

For example,

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using tailSet() with default boolean value
        System.out.println("Using tailSet without boolean value: " + numbers.tailSet(4));

        // Using tailSet() with specified boolean value
        System.out.println("Using tailSet with boolean value: " + numbers.tailSet(4, false));
    }
}
Run Code
Output

TreeSet: [2, 4, 5, 6]
Using tailSet without boolean value: [4, 5, 6]
Using tailSet with boolean value: [5, 6]
subSet(e1, bv1, e2, bv2)
The subSet() method returns all the elements between e1 and e2 including e1.

The bv1 and bv2 are optional parameters. The default value of bv1 is true, and the default value of bv2 is false.

If false is passed as bv1, the method returns all the elements between e1 and e2 without including e1.

If true is passed as bv2, the method returns all the elements between e1 and e2, including e1.

For example,

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using subSet() with default boolean value
        System.out.println("Using subSet without boolean value: " + numbers.subSet(4, 6));

        // Using subSet() with specified boolean value
        System.out.println("Using subSet with boolean value: " + numbers.subSet(4, false, 6, true));
    }
}
Run Code
Output

TreeSet: [2, 4, 5, 6]
Using subSet without boolean value: [4, 5]
Using subSet with boolean value: [5, 6]
Set Operations
The methods of the TreeSet class can also be used to perform various set operations.

Union of Sets
To perform the union between two sets, we use the addAll() method. For example,

import java.util.TreeSet;;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("TreeSet1: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("TreeSet2: " + numbers);

        // Union of two sets
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);

    }
}
Run Code
Output

TreeSet1: [2, 4]
TreeSet2: [1, 2, 3]
Union is: [1, 2, 3, 4]
Intersection of Sets
To perform the intersection between two sets, we use the retainAll() method. For example,

import java.util.TreeSet;;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("TreeSet1: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("TreeSet2: " + numbers);

        // Intersection of two sets
        numbers.retainAll(evenNumbers);
        System.out.println("Intersection is: " + numbers);
    }
}
Run Code
Output

TreeSet1: [2, 4]
TreeSet2: [1, 2, 3]
Intersection is: [2]
Difference of Sets
To calculate the difference between the two sets, we can use the removeAll() method. For example,

import java.util.TreeSet;;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("TreeSet1: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("TreeSet2: " + numbers);

        // Difference between two sets
        numbers.removeAll(evenNumbers);
        System.out.println("Difference is: " + numbers);
    }
}
Run Code
Output

TreeSet1: [2, 4]
TreeSet2: [1, 2, 3, 4]
Difference is: [1, 3]
Subset of a Set
To check if a set is a subset of another set or not, we use the containsAll() method. For example,

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("TreeSet1: " + numbers);

        TreeSet<Integer> primeNumbers = new TreeSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("TreeSet2: " + primeNumbers);

        // Check if primeNumbers is subset of numbers
        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("Is TreeSet2 subset of TreeSet1? " + result);
    }
}
Run Code
Output

TreeSet1: [1, 2, 3, 4]
TreeSet2: [2, 3]
Is TreeSet2 subset of TreeSet1? True
Other Methods of TreeSet
Method	Description
clone()	Creates a copy of the TreeSet
contains()	Searches the TreeSet for the specified element and returns a boolean result
isEmpty()	Checks if the TreeSet is empty
size()	Returns the size of the TreeSet
clear()	Removes all the elements from the TreeSet
To learn more, visit Java TreeSet (official Java documentation).

TreeSet Vs. HashSet
Both the TreeSet as well as the HashSet implements the Set interface. However, there exist some differences between them.

Unlike HashSet, elements in TreeSet are stored in some order. It is because TreeSet implements the SortedSet interface as well.
TreeSet provides some methods for easy navigation. For example, first(), last(), headSet(), tailSet(), etc. It is because TreeSet also implements the NavigableSet interface.
HashSet is faster than the TreeSet for basic operations like add, remove, contains and size.
TreeSet Comparator
In all the examples above, tree set elements are sorted naturally. However, we can also customize the ordering of elements.

For this, we need to create our own comparator class based on which elements in a tree set are sorted. For example,

import java.util.TreeSet;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {

        // Creating a tree set with a customized comparator
        TreeSet<String> animals = new TreeSet<>(new CustomComparator());

        animals.add("Dog");
        animals.add("Zebra");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("TreeSet: " + animals);
    }

    // Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String animal1, String animal2) {
            int value =  animal1.compareTo(animal2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
Run Code
Output

TreeSet: [Zebra, Horse, Dog, Cat]
In the above example, we have created a tree set passing CustomComparator class as an argument.

The CustomComparator class implements the Comparator interface.

We then override the compare() method. The method will now sort elements in reverse order.

To learn more, visit Java Comparator (official Java documentation).











### Java Algorithms
In this tutorial, we will learn about different algorithms provided by the Java collections framework with the help of examples.

The Java collections framework provides various algorithms that can be used to manipulate elements stored in data structures.

Algorithms in Java are static methods that can be used to perform various operations on collections.

Since algorithms can be used on various collections, these are also known as generic algorithms.

Let's see the implementation of different methods available in the collections framework.

1. Sorting Using sort()
The sort() method provided by the collections framework is used to sort elements. For example,

import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

    }
}
Run Code
Output

Unsorted ArrayList: [4, 2, 3]
Sorted ArrayList: [2, 3, 4]
Here the sorting occurs in natural order (ascending order). However, we can customize the sorting order of the sort() method using the Comparator interface.

To learn more, visit Java Sorting.

2. Shuffling Using shuffle()
The shuffle() method of the Java collections framework is used to destroy any kind of order present in the data structure. It does just the opposite of the sorting. For example,

import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Sorted ArrayList: " + numbers);

        // Using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);

    }
}
Run Code
Output

Sorted ArrayList: [1, 2, 3]
ArrayList using shuffle: [2, 1, 3]
When we run the program, the shuffle() method will return a random output.


The shuffling algorithm is mainly used in games where we want random output.

3. Routine Data Manipulation
In Java, the collections framework provides different methods that can be used to manipulate data.

reverse() - reverses the order of elements
fill() - replace every element in a collection with the specified value
copy() - creates a copy of elements from the specified source to destination
swap() - swaps the position of two elements in a collection
addAll() - adds all the elements of a collection to other collection
For example,

import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        // Using reverse()
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList1: " + numbers);

        // Using swap()
        Collections.swap(numbers, 0, 1);
        System.out.println("ArrayList1 using swap(): " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        // Using addAll
        newNumbers.addAll(numbers);
        System.out.println("ArrayList2 using addAll(): " + newNumbers);

        // Using fill()
        Collections.fill(numbers, 0);
        System.out.println("ArrayList1 using fill(): " + numbers);

        // Using copy()
        Collections.copy(newNumbers, numbers);
        System.out.println("ArrayList2 using copy(): " + newNumbers);
    }
}
Run Code
Output

ArrayList1: [1, 2]
Reversed ArrayList1: [2, 1]
ArrayList1 Using swap(): [1, 2]
ArrayList2 using addALl(): [1, 2]
ArrayList1 using fill(): [0, 0]
ArrayList2 using copy(): [0, 0]
Note: While performing the copy() method both the lists should be of the same size.

4. Searching Using binarySearch()
The binarySearch() method of the Java collections framework searches for the specified element. It returns the position of the element in the specified collections. For example,

import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Using binarySearch()
        int pos = Collections.binarySearch(numbers, 3);
        System.out.println("The position of 3 is " + pos);
    }
}
Run Code
Output

The position of 3 is 2.
Note: The collection should be sorted before performing the binarySearch() method.

To know more, visit Java Binary Search.

5. Composition
frequency() - returns the count of the number of times an element is present in the collection
disjoint() - checks if two collections contain some common element
For example,

import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(5);
        newNumbers.add(6);
        System.out.println("ArrayList2: " + newNumbers);

        boolean value = Collections.disjoint(numbers, newNumbers);
        System.out.println("Two lists are disjoint: " + value);
    }
}
Run Code
Output

ArrayList1: [1, 2, 3, 2]
Count of 2: 2
ArrayList2: [5, 6]
Two lists are disjoint: true
6. Finding Extreme Values
The min() and max() methods of the Java collections framework are used to find the minimum and the maximum elements, respectively. For example,

import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Using min()
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // Using max()
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}
Run Code
Output

Minimum Element: 1
Maximum Element: 3















### Java Iterator Interface
In this tutorial, we will learn about the Java Iterator interface with the help of an example.

The Iterator interface of the Java collections framework allows us to access elements of a collection. It has a subinterface ListIterator.

The Listiterator interface extends the Java Iterator interface.

All the Java collections include an iterator() method. This method returns an instance of iterator used to iterate over elements of collections.

Methods of Iterator
The Iterator interface provides 4 methods that can be used to perform various operations on elements of collections.

hasNext() - returns true if there exists an element in the collection
next() - returns the next element of the collection
remove() - removes the last element returned by the next()
forEachRemaining() - performs the specified action for each remaining element of the collection
Example: Implementation of Iterator
In the example below, we have implemented the hasNext(), next(), remove() and forEachRemining() methods of the Iterator interface in an array list.

import java.util.ArrayList;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();

        // Using the next() method
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        // Using the remove() method
        iterate.remove();
        System.out.println("Removed Element: " + number);

        System.out.print("Updated ArrayList: ");

        // Using the hasNext() method
        while(iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}
Run Code

Output

ArrayList: [1, 3, 2]
Acessed Element: 1
Removed Element: 1
Updated ArrayList: 3, 2,
In the above example, notice the statement:

iterate.forEachRemaining((value) -> System.put.print(value + ", "));
Here, we have passed the lambda expression as an argument of the forEachRemaining() method.

Now the method will print all the remaining elements of the array list.
















### Java ListIterator Interface
In this tutorial, we will learn about the Java ListIterator interface with the help of an example.

The ListIterator interface of the Java collections framework provides the functionality to access elements of a list.

It is bidirectional. This means it allows us to iterate elements of a list in both the direction.

It extends the Iterator interface.

The ListIterator interface extends the Java Iterator interface.

The List interface provides a listIterator() method that returns an instance of the ListIterator interface.

Methods of ListIterator
The ListIterator interface provides methods that can be used to perform various operations on the elements of a list.

hasNext() - returns true if there exists an element in the list
next() - returns the next element of the list
nextIndex() returns the index of the element that the next() method will return
previous() - returns the previous element of the list
previousIndex() - returns the index of the element that the previous() method will return
remove() - removes the element returned by either next() or previous()
set() - replaces the element returned by either next() or previous() with the specified element
Example 1: Implementation of ListIterator
In the example below, we have implemented the next(), nextIndex() and hasNext() methods of the ListIterator interface in an array list.

import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();

        // Using the next() method
        int number1 = iterate.next();
        System.out.println("Next Element: " + number1);

        // Using the nextIndex()
        int index1 = iterate.nextIndex();
        System.out.println("Position of Next Element: " + index1);

        // Using the hasNext() method
        System.out.println("Is there any next element? " + iterate.hasNext());
    }
}
Run Code

Output

ArrayList: [1, 3, 2]
Next Element: 1
Position of Next Element: 1
Is there any next element? true
Example 2: Implementation of ListIterator
In the example below, we have implemented the previous() and previousIndex() methods of the ListIterator interface in an array list.

import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();
        iterate.next();
        iterate.next();

        // Using the previous() method
        int number1 = iterate.previous();
        System.out.println("Previous Element: " + number1);

        // Using the previousIndex()
        int index1 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + index1);
    }
}
Run Code
Output

ArrayList: [1, 3, 2]
Previous Element: 3
Position of the Previous Element: 0
In the above example, initially, the instance of the Iterator was before 1. Since there was no element before 1 so calling the previous() method will throw an exception.

We then used the next() methods 2 times. Now the Iterator instance will be between 3 and 2.

Hence, the previous() method returns 3.
















### Java I/O Streams
In this tutorial, we will learn about Java input/output streams and their types.

In Java, streams are the sequence of data that are read from the source and written to the destination.

An input stream is used to read data from the source. And, an output stream is used to write data to the destination.

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}
Run Code
For example, in our first Hello World example, we have used System.out to print a string. Here, the System.out is a type of output stream.

Similarly, there are input streams to take input.

Input stream reads data from source to program and output stream writes file from program to destination

We will learn about input streams and output streams in detail in the later tutorials.

Types of Streams
Depending upon the data a stream holds, it can be classified into:

Byte Stream
Character Stream
Byte Stream

Byte stream is used to read and write a single byte (8 bits) of data.

All byte stream classes are derived from base abstract classes called InputStream and OutputStream.

To learn more, visit

Java InputStream Class
Java OutputStream Class
Character Stream
Character stream is used to read and write a single character of data.

All the character stream classes are derived from base abstract classes Reader and Writer.

To learn more, visit

Java Reader Class
Java Writer Class











### Java InputStream Class
In this tutorial, we will learn about the Java InputStream class and its methods with the help of an example.

The InputStream class of the java.io package is an abstract superclass that represents an input stream of bytes.

Since InputStream is an abstract class, it is not useful by itself. However, its subclasses can be used to read data.

Subclasses of InputStream
In order to use the functionality of InputStream, we can use its subclasses. Some of them are:

FileInputStream
ByteArrayInputStream
ObjectInputStream
FileInputStream class inherits the InputStream class
Java FileInputStream class
We will learn about all these subclasses in the next tutorial.

Create an InputStream
In order to create an InputStream, we must import the java.io.InputStream package first. Once we import the package, here is how we can create the input stream.

// Creates an InputStream
InputStream object1 = new FileInputStream();
Here, we have created an input stream using FileInputStream. It is because InputStream is an abstract class. Hence we cannot create an object of InputStream.

Note: We can also create an input stream from other subclasses of InputStream.

Methods of InputStream
The InputStream class provides different methods that are implemented by its subclasses. Here are some of the commonly used methods:

read() - reads one byte of data from the input stream
read(byte[] array) - reads bytes from the stream and stores in the specified array
available() - returns the number of bytes available in the input stream
mark() - marks the position in the input stream up to which data has been read
reset() - returns the control to the point in the stream where the mark was set
markSupported() - checks if the mark() and reset() method is supported in the stream
skips() - skips and discards the specified number of bytes from the input stream
close() - closes the input stream
Example: InputStream Using FileInputStream

Here is how we can implement InputStream using the FileInputStream class.

Suppose we have a file named input.txt with the following content.

This is a line of text inside the file.
Let's try to read this file using FileInputStream (a subclass of InputStream).

import java.io.FileInputStream;
import java.io.InputStream;

class Main {
  public static void main(String args[]) {

    byte[] array = new byte[100];

    try {
      InputStream input = new FileInputStream("input.txt");

      System.out.println("Available bytes in the file: " + input.available());

      // Read byte from the input stream
      input.read(array);
      System.out.println("Data read from the file: ");

      // Convert byte array into string
      String data = new String(array);
      System.out.println(data);

      // Close the input stream
      input.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}
Output

Available bytes in the file: 39
Data read from the file:
This is a line of text inside the file
In the above example, we have created an input stream using the FileInputStream class. The input stream is linked with the file input.txt.

InputStream input = new FileInputStream("input.txt");
To read data from the input.txt file, we have implemented these two methods.

input.read(array);  // to read data from the input stream
input.close();            // to close the input stream

To learn more, visit Java InputStream (official Java documentation).



















### Java OutputStream Class
In this tutorial, we will learn about the Java OutputStream and its methods with the help of an example.

The OutputStream class of the java.io package is an abstract superclass that represents an output stream of bytes.

Since OutputStream is an abstract class, it is not useful by itself. However, its subclasses can be used to write data.

Subclasses of OutputStream
In order to use the functionality of OutputStream, we can use its subclasses. Some of them are:

FileOutputStream
ByteArrayOutputStream
ObjectOutputStream
OutputStreamWriter 
OutputStreamWriter
We will learn about all these subclasses in the next tutorial.

Create an OutputStream
In order to create an OutputStream, we must import the java.io.OutputStream package first. Once we import the package, here is how we can create the output stream.

// Creates an OutputStream
OutputStream object = new FileOutputStream();
Here, we have created an object of output stream using FileOutputStream. It is because OutputStream is an abstract class, so we cannot create an object of OutputStream.

Note: We can also create the output stream from other subclasses of the OutputStream class.

Methods of OutputStream
The OutputStream class provides different methods that are implemented by its subclasses. Here are some of the methods:

write() - writes the specified byte to the output stream
write(byte[] array) - writes the bytes from the specified array to the output stream
flush() - forces to write all data present in output stream to the destination
close() - closes the output stream
Example: OutputStream Using FileOutputStream

Here is how we can implement OutputStream using the FileOutputStream class.

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String args[]) {
        String data = "This is a line of text inside the file.";

        try {
            OutputStream out = new FileOutputStream("output.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
In the above example, we have created an output stream using the FileOutputStream class. The output stream is now linked with the file output.txt.

OutputStream out = new FileOutputStream("output.txt");
To write data to the output.txt file, we have implemented these methods.

output.write();      // To write data to the file
output.close();      // To close the output stream
When we run the program, the output.txt file is filled with the following content.

This is a line of text inside the file.
To learn more, visit Java OutputStream (official Java documentation).
















### Java FileInputStream Class
In this tutorial, we will learn about Java FileInputStream and its methods with the help of examples.

The FileInputStream class of the java.io package can be used to read data (in bytes) from files.

It extends the InputStream abstract class.

Java FileInputStream is a subclass of InputStream class.

Before we learn about FileInputStream, make sure to know about Java Files.

Create a FileInputStream
In order to create a file input stream, we must import the java.io.FileInputStream package first. Once we import the package, here is how we can create a file input stream in Java.

1. Using the path to file

FileInputStream input = new FileInputStream(stringPath);
Here, we have created an input stream that will be linked to the file specified by the path.

2. Using an object of the file

FileInputStream input = new FileInputStream(File fileObject);
Here, we have created an input stream that will be linked to the file specified by fileObject.

Methods of FileInputStream
The FileInputStream class provides implementations for different methods present in the InputStream class.

read() Method
read() - reads a single byte from the file
read(byte[] array) - reads the bytes from the file and stores in the specified array
read(byte[] array, int start, int length) - reads the number of bytes equal to length from the file and stores in the specified array starting from the position start
Suppose we have a file named input.txt with the following content.

This is a line of text inside the file.
Let's try to read this file using FileInputStream.

import java.io.FileInputStream;

public class Main {

  public static void main(String args[]) {

     try {
        FileInputStream input = new FileInputStream("input.txt");

        System.out.println("Data in the file: ");

        // Reads the first byte
        int i = input.read();

       while(i != -1) {
           System.out.print((char)i);

           // Reads next byte from the file
           i = input.read();
        }
        input.close();
     }

     catch(Exception e) {
        e.getStackTrace();
     }
  }
}
Output

Data in the file:
This is a line of text inside the file.

In the above example, we have created a file input stream named input. The input stream is linked with the input.txt file.

FileInputStream input = new FileInputStream("input.txt");
To read data from the file, we have used the read() method inside the while loop.

available() Method
To get the number of available bytes, we can use the available() method. For example,

import java.io.FileInputStream;

public class Main {

   public static void main(String args[]) {

      try {
         // Suppose, the input.txt file contains the following text
         // This is a line of text inside the file.
         FileInputStream input = new FileInputStream("input.txt");

         // Returns the number of available bytes
         System.out.println("Available bytes at the beginning: " + input.available());

         // Reads 3 bytes from the file
         input.read();
         input.read();
         input.read();

         // Returns the number of available bytes
         System.out.println("Available bytes at the end: " + input.available());

         input.close();
      }

      catch (Exception e) {
         e.getStackTrace();
      }
   }
}
Output

Available bytes at the beginning: 39
Available bytes at the end: 36
In the above example,

We first use the available() method to check the number of available bytes in the file input stream.
We then have used the read() method 3 times to read 3 bytes from the file input stream.
Now, after reading the bytes we again have checked the available bytes. This time the available bytes decreased by 3.
skip() Method
To discard and skip the specified number of bytes, we can use the skip() method. For example,

import java.io.FileInputStream;

public class Main {

   public static void main(String args[]) {

      try {
         // Suppose, the input.txt file contains the following text
         // This is a line of text inside the file.
         FileInputStream input = new FileInputStream("input.txt");

         // Skips the 5 bytes
         input.skip(5);
         System.out.println("Input stream after skipping 5 bytes:");

         // Reads the first byte
         int i = input.read();
         while (i != -1) {
            System.out.print((char) i);

            // Reads next byte from the file
            i = input.read();
         }

         // close() method
         input.close();
      }
      catch (Exception e) {
         e.getStackTrace();
      }
   }
}
Output

Input Stream after skipping 5 bytes:
is a line of text inside the file.
In the above example, we have used the skip() method to skip 5 bytes of data from the file input stream. Hence, the bytes representing the text "This " is not read from the input stream.

close() Method
To close the file input stream, we can use the close() method. Once the close() method is called, we cannot use the input stream to read data.

In all the above examples, we have used the close() method to close the file input stream.

Other Methods Of FileInputStream
Methods	Descriptions
finalize()	ensures that the close() method is called
getChannel()	returns the object of FileChannel associated with the input stream
getFD()	returns the file descriptor associated with the input stream
mark() 	mark the position in input stream up to which data has been read
reset() 	returns the control to the point in the input stream where the mark was set
To learn more, visit Java FileInputStream (official Java documentation).












### Java FileOutputStream Class
In this tutorial, we will learn about Java FileOutputStream and its methods with the help of examples.

The FileOutputStream class of the java.io package can be used to write data (in bytes) to the files.

It extends the OutputStream abstract class.

The FileOutputStream class is the subclass of the Java OutputStream.

Before you learn about FileOutputStream, make sure to know about Java Files.

Create a FileOutputStream
In order to create a file output stream, we must import the java.io.FileOutputStream package first. Once we import the package, here is how we can create a file output stream in Java.

1. Using the path to file

// Including the boolean parameter
FileOutputStream output = new FileOutputStream(String path, boolean value);

// Not including the boolean parameter
FileOutputStream output = new FileOutputStream(String path);
Here, we have created an output stream that will be linked to the file specified by the path.

Also, value is an optional boolean parameter. If it is set to true, the new data will be appended to the end of the existing data in the file. Otherwise, the new data overwrites the existing data in the file.

2. Using an object of the file

FileOutputStream output = new FileOutputStream(File fileObject);
Here, we have created an output stream that will be linked to the file specified by fileObject.

Methods of FileOutputStream

The FileOutputStream class provides implementations for different methods present in the OutputStream class.

write() Method
write() - writes the single byte to the file output stream
write(byte[] array) - writes the bytes from the specified array to the output stream
write(byte[] array, int start, int length) - writes the number of bytes equal to length to the output stream from an array starting from the position start
Example: FileOutputStream to write data to a File
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        
        String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("output.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
In the above example, we have created a file output stream named output. The file output stream is linked with the file output.txt.

FileOutputStream output = new FileOutputStream("output.txt");
To write data to the file, we have used the write() method.

Here, when we run the program, the output.txt file is filled with the following content.

This is a line of text inside the file.
Note: The getBytes() method used in the program converts a string into an array of bytes.

flush() Method
To clear the output stream, we can use the flush() method. This method forces the output stream to write all data to the destination. For example,

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileOutputStream out = null;
        String data = "This is demo of flush method";

        try {
            out = new FileOutputStream(" flush.txt");

            // Using write() method
            out.write(data.getBytes());

            // Using the flush() method
            out.flush();
            out.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
Run Code
When we run the program, the file flush.txt is filled with the text represented by the string data.

close() Method
To close the file output stream, we can use the close() method. Once the method is called, we cannot use the methods of FileOutputStream.

Other Methods Of FileOutputStream
Methods	Descriptions
finalize()	ensures that the close() method is called
getChannel()	returns the object of FileChannel associated with the output stream
getFD()	returns the file descriptor associated with the output stream
To learn more, visit Java FileOutputStream (official Java documentation).












### Java ByteArrayInputStream Class
In this tutorial, we will learn about Java ByteArrayInputStream and its methods with the help of examples.

The ByteArrayInputStream class of the java.io package can be used to read an array of input data (in bytes).

It extends the InputStream abstract class.

The ByteArrayInputStream class extends the InputStream class.
Java ByteArrayInputStream
Note: In ByteArrayInputStream, the input stream is created using the array of bytes. It includes an internal array to store data of that particular byte array.

Create a ByteArrayInputStream
In order to create a byte array input stream, we must import the java.io.ByteArrayInputStream package first. Once we import the package, here is how we can create an input stream.

// Creates a ByteArrayInputStream that reads entire array
ByteArrayInputStream input = new ByteArrayInputStream(byte[] arr);
Here, we have created an input stream that reads entire data from the arr array. However, we can also create the input stream that reads only some data from the array.

// Creates a ByteArrayInputStream that reads a portion of array
ByteArrayInputStream input = new ByteArrayInputStream(byte[] arr, int start, int length);
Here the input stream reads the number of bytes equal to length from the array starting from the start position.

Methods of ByteArrayInputStream
The ByteArrayInputStream class provides implementations for different methods present in the InputStream class.

read() Method
read() - reads the single byte from the array present in the input stream
read(byte[] array) - reads bytes from the input stream and stores in the specified array
read(byte[] array, int start, int length) - reads the number of bytes equal to length from the stream and stores in the specified array starting from the position start
Example: ByteArrayInputStream to read data
import java.io.ByteArrayInputStream;

public class Main {
  public static void main(String[] args) {

    // Creates an array of byte
    byte[] array = {1, 2, 3, 4};

    try {
      ByteArrayInputStream input = new ByteArrayInputStream(array);

      System.out.print("The bytes read from the input stream: ");

      for(int i= 0; i < array.length; i++) {

        // Reads the bytes
        int data = input.read();
        System.out.print(data + ", ");
      }
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Run Code
Output

The bytes read from the input stream: 1, 2, 3, 4,
In the above example, we have created a byte array input stream named input.

ByteArrayInputStream input = new ByteArrayInputStream(array);
Here, the input stream includes all the data from the specified array. To read data from the input stream, we have used the read() method.

available() Method
To get the number of available bytes in the input stream, we can use the available() method. For example,

import java.io.ByteArrayInputStream;

public class Main {

  public static void main(String args[]) {

    // Creates an array of bytes
    byte[] array = { 1, 2, 3, 4 };

    try {
      ByteArrayInputStream input = new ByteArrayInputStream(array);

      // Returns the available number of bytes
      System.out.println("Available bytes at the beginning: " + input.available());

      // Reads 2 bytes from the input stream
      input.read();
      input.read();

      // Returns the available number of bytes
      System.out.println("Available bytes at the end: " + input.available());

      input.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}
Run Code

Output

Available bytes at the beginning: 4
Available bytes at the end: 2
In the above example,

We have used the available() method to check the number of available bytes in the input stream.
We have then used the read() method 2 times to read 2 bytes from the input stream.
Now, after reading the 2 bytes, we have checked the available bytes. This time the available bytes decreased by 2.
skip() Method
To discard and skip the specified number of bytes, we can use the skip() method. For example,

import java.io.ByteArrayInputStream;

public class Main {

  public static void main(String args[]) {

    // Create an array of bytes
    byte[] array = { 1, 2, 3, 4 };
    try {
      ByteArrayInputStream input = new ByteArrayInputStream(array);

      // Using the skip() method
      input.skip(2);
      System.out.print("Input stream after skipping 2 bytes: ");

      int data = input.read();
      while (data != -1) {
        System.out.print(data + ", ");
        data = input.read();
      }

      // close() method
      input.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}
Run Code
Output

Input stream after skipping 2 bytes: 3, 4,
In the above example, we have used the skip() method to skip 2 bytes of data from the input stream. Hence 1 and 2 are not read from the input stream.

close() Method
To close the input stream, we can use the close() method.

However, the close() method has no effect in ByteArrayInputStream class. We can use the methods of this class even after the close() method is called.

Other Methods Of ByteArrayInputStream
Methods	Descriptions
finalize()	ensures that the close() method is called
mark()	marks the position in input stream up to which data has been read
reset()	returns the control to the point in the input stream where the mark was set
markSupported()	checks if the input stream supports mark() and reset()
To learn more, visit Java ByteArrayInputStream (official Java documentation).










Java ByteArrayOutputStream Class
In this tutorial, we will learn about Java ByteArrayOutputStream and its methods with the help of examples.

The ByteArrayOutputStream class of the java.io package can be used to write an array of output data (in bytes).

It extends the OutputStream abstract class.

The ByteArrayOutputStream is a subclass of the Java OutputStream.

Note: In ByteArrayOutputStream maintains an internal array of bytes to store the data.

Create a ByteArrayOutputStream
In order to create a byte array output stream, we must import the java.io.ByteArrayOutputStream package first. Once we import the package, here is how we can create an output stream.

// Creates a ByteArrayOutputStream with default size
ByteArrayOutputStream out = new ByteArrayOutputStream();
Here, we have created an output stream that will write data to an array of bytes with default size 32 bytes. However, we can change the default size of the array.

// Creating a ByteArrayOutputStream with specified size
ByteArrayOutputStream out = new ByteArrayOutputStream(int size);
Here, the size specifies the length of the array.

Methods of ByteArrayOutputStream
The ByteArrayOutputStream class provides the implementation of the different methods present in the OutputStream class.

write() Method
write(int byte) - writes the specified byte to the output stream
write(byte[] array) - writes the bytes from the specified array to the output stream
write(byte[] arr, int start, int length) - writes the number of bytes equal to length to the output stream from an array starting from the position start
writeTo(ByteArrayOutputStream out1) - writes the entire data of the current output stream to the specified output stream
Example: ByteArrayOutputStream to write data
import java.io.ByteArrayOutputStream;

class Main {
  public static void main(String[] args) {

    String data = "This is a line of text inside the string.";

    try {
      // Creates an output stream
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      byte[] array = data.getBytes();

      // Writes data to the output stream
      out.write(array);

      // Retrieves data from the output stream in string format
      String streamData = out.toString();
      System.out.println("Output stream: " + streamData);

      out.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Run Code
Output

Output stream: This is a line of text inside the string.
In the above example, we have created a byte array output stream named output.

ByteArrayOutputStream output = new ByteArrayOutputStream();

To write the data to the output stream, we have used the write() method.

Note: The getBytes() method used in the program converts a string into an array of bytes.

Access Data from ByteArrayOutputStream
toByteArray() - returns the array present inside the output stream
toString() - returns the entire data of the output stream in string form
For example,

import java.io.ByteArrayOutputStream;

class Main {
  public static void main(String[] args) {
    String data = "This is data.";

    try {
      // Creates an output stream
      ByteArrayOutputStream out = new ByteArrayOutputStream();

      // Writes data to the output stream
      out.write(data.getBytes());

      // Returns an array of bytes
      byte[] byteData = out.toByteArray();
      System.out.print("Data using toByteArray(): ");
      for(int i=0; i<byteData.length; i++) {
        System.out.print((char)byteData[i]);
      }

      // Returns a string
      String stringData = out.toString();
      System.out.println("\nData using toString(): " + stringData);

      out.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Run Code
Output

Data using toByteArray(): This is data.
Data using toString(): This is data.
In the above example, we have created an array of bytes to store the data returned by the toByteArray() method.

We then have used the for loop to access each byte from the array. Here, each byte is converted into the corresponding character using typecasting.

close() Method
To close the output stream, we can use the close() method.

However, the close() method has no effect in ByteArrayOutputStream class. We can use the methods of this class even after the close() method is called.

Other Methods of ByteArrayOutputStream
Methods	Descriptions
size() 	returns the size of the array in the output stream
flush() 	clears the output stream
To learn more, visit Java ByteArrayOutputStream (official Java documentation).










Java ObjectInputStream Class
In this tutorial, we will learn about Java ObjectOutputStream and its methods with the help of examples.

The ObjectInputStream class of the java.io package can be used to read objects that were previously written by ObjectOutputStream.

It extends the InputStream abstract class.

The ObjectInputStream class extends the InputStream class.
Java ObjectInputStream Class
Before you learn about the ObjectInputStream class, make sure you know about the ObjectOutputStream Class.

Working of ObjectInputStream
The ObjectInputStream is mainly used to read data written by the ObjectOutputStream.

Basically, the ObjectOutputStream converts Java objects into corresponding streams. This is known as serialization. Those converted streams can be stored in files or transferred through networks.

Now, if we need to read those objects, we will use the ObjectInputStream that will convert the streams back to corresponding objects. This is known as deserialization.

Create an ObjectInputStream
In order to create an object input stream, we must import the java.io.ObjectInputStream package first. Once we import the package, here is how we can create an input stream.

// Creates a file input stream linked with the specified file
FileInputStream fileStream = new FileInputStream(String file);

// Creates an object input stream using the file input stream
ObjectInputStream objStream = new ObjectInputStream(fileStream);
In the above example, we have created an object input stream named objStream that is linked with the file input stream named fileStream.

Now, the objStream can be used to read objects from the file.

Methods of ObjectInputStream
The ObjectInputStream class provides implementations of different methods present in the InputStream class.

read() Method
read() - reads a byte of data from the input stream
readBoolean() - reads data in boolean form
readChar() - reads data in character form
readInt() - reads data in integer form
readObject() - reads the object from the input stream
Example 1: Java ObjectInputStream

Let's see how we can use the ObjectInputStream class to read objects written by the ObjectOutputStream class.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Main {
    public static void main(String[] args) {

        int data1 = 5;
        String data2 = "This is programiz";

        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writing to the file using ObjectOutputStream
            output.writeInt(data1);
            output.writeObject(data2);

            FileInputStream fileStream = new FileInputStream("file.txt");
            // Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            //Using the readInt() method
            System.out.println("Integer data :" + objStream.readInt());

            // Using the readObject() method
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
Output

Integer data: 5
String data: This is programiz
In the above example, we have used the readInt() and readObject() method to read integer data and object data from the file.

Here, we have used the ObjectOutputStream to write data to the file. We then read the data from the file using the ObjectInputStream.

Example 2: Java ObjectInputStream
Let's see another practical example,

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

class Main {
    public static void main(String[] args) {

        // Creates an object of Dog class
        Dog dog = new Dog("Tyson", "Labrador");

        try {
            FileOutputStream file = new FileOutputStream("file.txt");

            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writes objects to the output stream
            output.writeObject(dog);

            FileInputStream fileStream = new FileInputStream("file.txt");

            // Creates an ObjectInputStream
            ObjectInputStream input = new ObjectInputStream(fileStream);

            // Reads the objects
            Dog newDog = (Dog) input.readObject();

            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

            output.close();
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
Output

Dog Name: Tyson
Dog Breed: Labrador
In the above example, we have created

ObjectOutputStream named output using the FileOutputStream named file
ObjectInputStream named input using the FileInputStream named fileStream
An object dog of the Dog class
Here, we have then used the object output stream to write the object to the file. And, the object input stream to read the object from the file.

Note: The Dog class implements the Serializable interface. It is because the ObjectOutputStream only writes the serializable objects to the output stream.

Other Methods Of ObjectInputStream
Methods	Descriptions
available() 	returns the available number of bytes in the input stream
mark() 	marks the position in input stream up to which data has been read
reset() 	returns the control to the point in the input stream where the mark was set
skipBytes() 	skips and discards the specified bytes from the input stream
close() 	closes the object input stream.











Java ObjectOutputStream Class
In this tutorial, we will learn about Java ObjectOutputStream and its methods with the help of examples.

The ObjectOutputStream class of the java.io package can be used to write objects that can be read by ObjectInputStream.

It extends the OutputStream abstract class.

The ObjectOutputStream class inherits the OutputStream class
Java ObjectOutputStream Class
Working of ObjectOutputStream
Basically, the ObjectOutputStream encodes Java objects using the class name and object values. And, hence generates corresponding streams. This process is known as serialization.

Those converted streams can be stored in files and can be transferred among networks.

Note: The ObjectOutputStream class only writes those objects that implement the Serializable interface. This is because objects need to be serialized while writing to the stream

Create an ObjectOutputStream
In order to create an object output stream, we must import the java.io.ObjectOutputStream package first. Once we import the package, here is how we can create an output stream.

// Creates a FileOutputStream where objects from ObjectOutputStream are written
FileOutputStream fileStream = new FileOutputStream(String file);

// Creates the ObjectOutputStream
ObjectOutputStream objStream = new ObjectOutputStream(fileStream);
In the above example, we have created an object output stream named objStream that is linked with the file output stream named fileStream.

Methods of ObjectOutputStream
The ObjectOutputStream class provides implementations for different methods present in the OutputStream class.

write() Method
write() - writes a byte of data to the output stream
writeBoolean() - writes data in boolean form
writeChar() - writes data in character form
writeInt() - writes data in integer form
writeObject() - writes object to the output stream
Example 1: Java ObjectOutputStream
Let's see how we can use ObjectOutputStream to store objects in a file and ObjectInputStream to read those objects from the files

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Main {
    public static void main(String[] args) {

        int data1 = 5;
        String data2 = "This is programiz";

        try {

            FileOutputStream file = new FileOutputStream("file.txt");

            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // writes objects to output stream
            output.writeInt(data1);
            output.writeObject(data2);

            // Reads data using the ObjectInputStream
            FileInputStream fileStream = new FileInputStream("file.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            System.out.println("Integer data :" + objStream.readInt());
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

Output

Integer data: 5
String data: This is programiz
In the above example, we have used the readInt() method and readObject() method to read an integer data and object data from the files.

Here, we have used the ObjectOutputStream to write data to the file. We then read the data from the file using the ObjectInputStream.

Example 2: Java ObjectOutputStream
Let's take another example,

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

class Main {
    public static void main(String[] args) {

        // Creates an object of Dog class
        Dog dog1 = new Dog("Tyson", "Labrador");

        try {
            FileOutputStream fileOut = new FileOutputStream("file.txt");

            // Creates an ObjectOutputStream
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            // Writes objects to the output stream
            objOut.writeObject(dog1);

            // Reads the object
            FileInputStream fileIn = new FileInputStream("file.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            // Reads the objects
            Dog newDog = (Dog) objIn.readObject();

            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

            objOut.close();
            objIn.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
Output

Dog Name: Tyson
Dog Breed: Labrador
In the above example, we have created

ObjectOutputStream named objOut using the FileOutputStream named fileOut
ObjectInputStream named objIn using the FileInputStream named fileIn.
An object dog1 of the Dog class.
Here, we have then used the object output stream to write the object to the file. And, the object input stream to read the object from the file.

Note: The Dog class implements the Serializable interface. It is because the ObjectOutputStream only writes objects that can be serialized to the output stream.

Other Methods Of ObjectOutputStream
Methods	Descriptions
flush()	clears all the data from the output stream
drain()	puts all the buffered data in the output stream
close()	closes the output stream
To learn more, visit Java ObjectOutputStream (official Java documentation).










Java BufferedInputStream Class
In this tutorial, we will learn about Java BufferedInputStream and its methods with the help of examples.

The BufferedInputStream class of the java.io package is used with other input streams to read the data (in bytes) more efficiently.

It extends the InputStream abstract class.

The BufferedInputStream class is a subclass of the Java InputStream.

Working of BufferedInputStream
The BufferedInputStream maintains an internal buffer of 8192 bytes.

During the read operation in BufferedInputStream, a chunk of bytes is read from the disk and stored in the internal buffer. And from the internal buffer bytes are read individually.

Hence, the number of communication to the disk is reduced. This is why reading bytes is faster using the BufferedInputStream.

Create a BufferedInputStream
In order to create a BufferedInputStream, we must import the java.io.BufferedInputStream package first. Once we import the package here is how we can create the input stream.

// Creates a FileInputStream
FileInputStream file = new FileInputStream(String path);

// Creates a BufferedInputStream
BufferedInputStream buffer = new BufferInputStream(file);
In the above example, we have created a BufferdInputStream named buffer with the FileInputStream named file.

Here, the internal buffer has the default size of 8192 bytes. However, we can specify the size of the internal buffer as well.

// Creates a BufferedInputStream with specified size internal buffer
BufferedInputStream buffer = new BufferInputStream(file, int size);
The buffer will help to read bytes from the files more quickly.

Methods of BufferedInputStream
The BufferedInputStream class provides implementations for different methods present in the InputStream class.

read() Method
read() - reads a single byte from the input stream
read(byte[] arr) - reads bytes from the stream and stores in the specified array
read(byte[] arr, int start, int length) - reads the number of bytes equal to the length from the stream and stores in the specified array starting from the position start
Suppose we have a file named input.txt with the following content.

This is a line of text inside the file.
Let's try to read the file using BufferedInputStream.

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class Main {
    public static void main(String[] args) {
        try {

            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("input.txt");

            // Creates a BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);

            // Reads first byte from file
            int i = input .read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

Output

This is a line of text inside the file.
In the above example, we have created a buffered input stream named buffer along with FileInputStream. The input stream is linked with the file input.txt.

FileInputStream file = new FileInputStream("input.txt");
BufferedInputStream buffer = new BufferedInputStream(file);
Here, we have used the read() method to read an array of bytes from the internal buffer of the buffered reader.

available() Method
To get the number of available bytes in the input stream, we can use the available() method. For example,

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class Main {

   public static void main(String args[]) {

      try {

         // Suppose, the input.txt file contains the following text
         // This is a line of text inside the file.
         FileInputStream file = new FileInputStream("input.txt");
         
         // Creates a BufferedInputStream
         BufferedInputStream buffer = new BufferedInputStream(file);

         // Returns the available number of bytes
         System.out.println("Available bytes at the beginning: " + buffer.available());

         // Reads bytes from the file
         buffer.read();
         buffer.read();
         buffer.read();

         // Returns the available number of bytes
         System.out.println("Available bytes at the end: " + buffer.available());

         buffer.close();
      }

      catch (Exception e) {
         e.getStackTrace();
      }
   }
}
Output

Available bytes at the beginning: 39
Available bytes at the end: 36
In the above example,

We first use the available() method to check the number of available bytes in the input stream.
Then, we have used the read() method 3 times to read 3 bytes from the input stream.
Now, after reading the bytes we again have checked the available bytes. This time the available bytes decreased by 3.
skip() Method
To discard and skip the specified number of bytes, we can use the skip() method. For example,

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class Main {

   public static void main(String args[]) {

      try {
         // Suppose, the input.txt file contains the following text
         // This is a line of text inside the file.
         FileInputStream file = new FileInputStream("input.txt");

         // Creates a BufferedInputStream
         BufferedInputStream buffer = new BufferedInputStream(file);

         // Skips the 5 bytes
         buffer.skip(5);
         System.out.println("Input stream after skipping 5 bytes:");

         // Reads the first byte from input stream
         int i = buffer.read();
         while (i != -1) {
            System.out.print((char) i);

            // Reads next byte from the input stream
            i = buffer.read();
         }

         // Closes the input stream
         buffer.close();
      }

      catch (Exception e) {
         e.getStackTrace();
      }
   }
}
Output

Input stream after skipping 5 bytes: is a line of text inside the file.
In the above example, we have used the skip() method to skip 5 bytes from the file input stream. Hence, the bytes 'T', 'h', 'i', 's' and ' ' are skipped from the input stream.

close() Method
To close the buffered input stream, we can use the close() method. Once the close() method is called, we cannot use the input stream to read the data.

Other Methods Of BufferedInputStream
Methods	Descriptions
mark() 	mark the position in input stream up to which data has been read
reset() 	returns the control to the point in the input stream where the mark was set










Java BufferedOutputStream Class
In this tutorial, we will learn about Java BufferedOutputStream and its methods with the help of examples.

The BufferedOutputStream class of the java.io package is used with other output streams to write the data (in bytes) more efficiently.

It extends the OutputStream abstract class.

Java BufferedOutputStream class extends the OutputStream class
Java BufferedOutputStream
Working of BufferedOutputStream
The BufferedOutputStream maintains an internal buffer of 8192 bytes.

During the write operation, the bytes are written to the internal buffer instead of the disk. Once the buffer is filled or the stream is closed, the whole buffer is written to the disk.

Hence, the number of communication to the disk is reduced. This is why writing bytes is faster using BufferedOutputStream.

Create a BufferedOutputStream
In order to create a BufferedOutputStream, we must import the java.io.BufferedOutputStream package first. Once we import the package here is how we can create the output stream.

// Creates a FileOutputStream
FileOutputStream file = new FileOutputStream(String path);

// Creates a BufferedOutputStream
BufferedOutputStream buffer = new BufferOutputStream(file);
In the above example, we have created a BufferdOutputStream named buffer with the FileOutputStream named file.

Here, the internal buffer has the default size of 8192 bytes. However, we can specify the size of the internal buffer as well.

// Creates a BufferedOutputStream with specified size internal buffer
BufferedOutputStream buffer = new BufferOutputStream(file, int size);
The buffer will help to write bytes to files more quickly.

Methods of BufferedOutputStream
The BufferedOutputStream class provides implementations for different methods in the OutputStream class.

write() Method
write() - writes a single byte to the internal buffer of the output stream
write(byte[] array) - writes the bytes from the specified array to the output stream
write(byte[] arr, int start, int length) - writes the number of bytes equal to length to the output stream from an array starting from the position start
Example: BufferedOutputStream to write data to a File
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Main {
    public static void main(String[] args) {

        String data = "This is a line of text inside the file";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("output.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

In the above example, we have created a buffered output stream named output along with FileOutputStream. The output stream is linked with the file output.txt.

FileOutputStream file = new FileOutputStream("output.txt");
BufferedOutputStream output = new BufferedOutputStream(file);
To write data to the file, we have used the write() method.

Here when we run the program, the output.txt file is filled with the following content.

This is a line of text inside the file.
Note: The getBytes() method used in the program converts a string into an array of bytes.

flush() Method
To clear the internal buffer, we can use the flush() method. This method forces the output stream to write all data present in the buffer to the destination file. For example,

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Main {
    public static void main(String[] args) {

        String data = "This is a demo of the flush method";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream(" flush.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream buffer = new BufferedOutputStream(file);

            // Writes data to the output stream
            buffer.write(data.getBytes());

            // Flushes data to the destination
            buffer.flush();
            System.out.println("Data is flushed to the file.");
            buffer.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
Output

Data is flushed to the file.
When we run the program, the file flush.txt is filled with the text represented by the string data.

close() Method
To close the buffered output stream, we can use the close() method. Once the method is called, we cannot use the output stream to write the data.









ava PrintStream Class
In this tutorial, we will learn about the Java PrintStream class and its print() and printf() methods with the help of examples.

The PrintStream class of the java.io package can be used to write output data in commonly readable form (text) instead of bytes.

It extends the abstract class OutputStream.

The PrintStream class is a subclass of the Java OutputStream.

Working of PrintStream
Unlike other output streams, the PrintStream converts the primitive data (integer, character) into the text format instead of bytes. It then writes that formatted data to the output stream.

And also, the PrintStream class does not throw any input/output exception. Instead, we need to use the checkError() method to find any error in it.

Note: The PrintStream class also has a feature of auto flushing. This means it forces the output stream to write all the data to the destination under one of the following conditions:

if newline character \n is written in the print stream
if the println() method is invoked
if an array of bytes is written in the print stream
Create a PrintStream
In order to create a PrintStream, we must import the java.io.PrintStream package first. Once we import the package here is how we can create the print stream.

1. Using other output streams

// Creates a FileOutputStream
FileOutputStream file = new FileOutputStream(String file);

// Creates a PrintStream
PrintStream output = new PrintStream(file, autoFlush);
Here,

we have created a print stream that will write formatted data to the file represented by FileOutputStream
the autoFlush is an optional boolean parameter that specifies whether to perform auto flushing or not
2. Using filename

 // Creates a PrintStream
PrintStream output = new PrintStream(String file, boolean autoFlush);
Here,

we have created a print stream that will write formatted data to the specified file
autoFlush is an optional boolean parameter that specifies whether to perform autoflush or not
Note: In both the case, the PrintStream write data to the file using some default character encoding. However, we can specify the character encoding (UTF8 or UTF16) as well.

// Creates a PrintStream using some character encoding
PrintStream output = new PrintStream(String file, boolean autoFlush, Charset cs);
Here, we have used the Charset class to specify the character encoding. To learn more, visit Java Charset (official Java documentation).

Methods of PrintStream
The PrintStream class provides various methods that allow us to print data to the output.

print() Method
print() - prints the specified data to the output stream
println() - prints the data to the output stream along with a new line character at the end
Example: print() method with System class
class Main {
    public static void main(String[] args) {

        String data = "Hello World.";
        System.out.print(data);
    }
}
Run Code
Output

Hello World.
In the above example, we have not created a print stream. However, we can use the print() method of the PrintStream class.

You might be wondering how is this possible. Well, let me explain what is happening here.


Notice the line,

System.out.print(data);
Here,

System is a final class that is responsible to perform standard input/output operation
out is a class variable of PrintStream type declared in System class
Now since out is of PrintStream type, we can use it to call all the methods of PrintStream class.

Example: print() method with PrintStream class
import java.io.PrintStream;

class Main {
    public static void main(String[] args) {

        String data = "This is a text inside the file.";

        try {
            PrintStream output = new PrintStream("output.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
In the above example, we have created a print stream named output. The print stream is linked with the output.txt file.

PrintStream output = new PrintStream("output.txt");
To print data to the file, we have used the print() method.

Here, when we run the program, the output.txt file is filled with the following content.

This is a text inside the file.
printf() Method
The printf() method can be used to print the formatted string. It includes 2 parameters: formatted string and arguments. For example,

printf("I am %d years old", 25);
Here,

I am %d years old is a formatted string
%d is integer data in the formatted string
25 is an argument
The formatted string includes both text and data. And, the arguments replace the data inside the formatted string.

Hence the %d is replaced by 25.

Example: printf() method using PrintStream
import java.io.PrintStream;

class Main {
    public static void main(String[] args) {

        try {
            PrintStream output = new PrintStream("output.txt");

            int age = 25;

            output.printf("I am %d years old.", age);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
In the above example, we have created a print stream named output. The print stream is linked with the file output.txt.

PrintStream output = new PrintStream("output.txt");
To print the formatted text to the file, we have used the printf() method.

Here, when we run the program, the output.txt file is filled with the following content.

I am 25 years old.
Other Methods Of PrintStream
Methods	Descriptions
close()	closes the print stream
checkError()	checks if there is an error in the stream and returns a boolean result
append()	appends the specified data to the stream








Java Reader Class
In this tutorial, we will learn about Java Reader, its subclasses and its methods with the help of an example.

The Reader class of the java.io package is an abstract superclass that represents a stream of characters.

Since Reader is an abstract class, it is not useful by itself. However, its subclasses can be used to read data.

Subclasses of Reader
In order to use the functionality of Reader, we can use its subclasses. Some of them are:

BufferedReader
InputStreamReader
FileReader
StringReader
BufferedReader, InputStreamReader, and StringReader are subclasses of Reader
Subclasses of Reader
We will learn about all these subclasses in the next tutorial.

Create a Reader
In order to create a Reader, we must import the java.io.Reader package first. Once we import the package, here is how we can create the reader.

// Creates a Reader
Reader input = new FileReader();
Here, we have created a reader using the FileReader class. It is because Reader is an abstract class. Hence we cannot create an object of Reader.

Note: We can also create readers from other subclasses of Reader.

Methods of Reader
The Reader class provides different methods that are implemented by its subclasses. Here are some of the commonly used methods:

ready() - checks if the reader is ready to be read
read(char[] array) - reads the characters from the stream and stores in the specified array
read(char[] array, int start, int length) - reads the number of characters equal to length from the stream and stores in the specified array starting from the start
mark() - marks the position in the stream up to which data has been read
reset() - returns the control to the point in the stream where the mark is set
skip() - discards the specified number of characters from the stream
Example: Reader Using FileReader

Here is how we can implement Reader using the FileReader class.

Suppose we have a file named input.txt with the following content.

This is a line of text inside the file.
Let's try to read this file using FileReader (a subclass of Reader).

import java.io.Reader;
import java.io.FileReader;

class Main {
    public static void main(String[] args) {

        // Creates an array of character
        char[] array = new char[100];

        try {
            // Creates a reader using the FileReader
            Reader input = new FileReader("input.txt");

            // Checks if reader is ready 
            System.out.println("Is there data in the stream?  " + input.ready());

            // Reads characters
            input.read(array);
            System.out.println("Data in the stream:");
            System.out.println(array);

            // Closes the reader
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
Output

Is there data in the stream?  true
Data in the stream:
This is a line of text inside the file.
In the above example, we have created a reader using the FileReader class. The reader is linked with the file input.txt.

Reader input = new FileReader("input.txt");
To read data from the input.txt file, we have implemented these methods.

input.read();       // to read data from the reader
input.close();      // to close the reader













Java Writer Class
In this tutorial, we will learn about Java Writer, its subclasses and its methods with the help of an example.

The Writer class of the java.io package is an abstract superclass that represents a stream of characters.

Since Writer is an abstract class, it is not useful by itself. However, its subclasses can be used to write data.

Subclasses of Writer
In order to use the functionality of the Writer, we can use its subclasses. Some of them are:

BufferedWriter
OutputStreamWriter
FileWriter
StringWriter
BufferedWriter, InputStreamWriter, and StringWriter are subclasses of Writer.
Subclasses of Writer
We will learn about all these subclasses in the next tutorial.

Create a Writer
In order to create a Writer, we must import the java.io.Writer package first. Once we import the package, here is how we can create the writer.

// Creates a Writer
Writer output = new FileWriter();
Here, we have created a writer named output using the FileWriter class. It is because the Writer is an abstract class. Hence we cannot create an object of Writer.

Note: We can also create writers from other subclasses of the Writer class.

Methods of Writer

The Writer class provides different methods that are implemented by its subclasses. Here are some of the methods:

write(char[] array) - writes the characters from the specified array to the output stream
write(String data) - writes the specified string to the writer
append(char c) - inserts the specified character to the current writer
flush() - forces to write all the data present in the writer to the corresponding destination
close() - closes the writer
Example: Writer Using FileWriter
Here is how we can implement the Writer using the FileWriter class.

import java.io.FileWriter;
import java.io.Writer;

public class Main {

    public static void main(String args[]) {

        String data = "This is the data in the output file";

        try {
            // Creates a Writer using FileWriter
            Writer output = new FileWriter("output.txt");


            // Writes string to the file
            output.write(data);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
In the above example, we have created a writer using the FileWriter class. The writer is linked with the file output.txt.

Writer output = new FileWriter("output.txt");
To write data to the output.txt file, we have implemented these methods.

output.write();      // To write data to the file
output.close();      // To close the writer
When we run the program, the output.txt file is filled with the following content.

This is a line of text inside the file.







Java InputStreamReader Class
In this tutorial, we will learn about Java InputStreamReader and its methods with the help of examples.

The InputStreamReader class of the java.io package can be used to convert data in bytes into data in characters.

It extends the abstract class Reader.

The InputStreamReader class is a suclass of Java Reader.

The InputStreamReader class works with other input streams. It is also known as a bridge between byte streams and character streams. This is because the InputStreamReader reads bytes from the input stream as characters.

For example, some characters required 2 bytes to be stored in the storage. To read such data we can use the input stream reader that reads the 2 bytes together and converts into the corresponding character.

Create an InputStreamReader
In order to create an InputStreamReader, we must import the java.io.InputStreamReader package first. Once we import the package here is how we can create the input stream reader.

// Creates an InputStream
FileInputStream file = new FileInputStream(String path);

// Creates an InputStreamReader
InputStreamReader input = new InputStreamReader(file);
In the above example, we have created an InputStreamReader named input along with the FileInputStream named file.

Here, the data in the file are stored using some default character encoding.

However, we can specify the type of character encoding (UTF8 or UTF16) in the file as well.

// Creates an InputStreamReader specifying the character encoding
InputStreamReader input = new InputStreamReader(file, Charset cs);
Here, we have used the Charset class to specify the character encoding in the file.

Methods of InputStreamReader
The InputStreamReader class provides implementations for different methods present in the Reader class.

read() Method
read() - reads a single character from the reader
read(char[] array) - reads the characters from the reader and stores in the specified array
read(char[] array, int start, int length) - reads the number of characters equal to length from the reader and stores in the specified array starting from the start

For example, suppose we have a file named input.txt with the following content.

This is a line of text inside the file.
Let's try to read this file using InputStreamReader.

import java.io.InputStreamReader;
import java.io.FileInputStream;

class Main {
  public static void main(String[] args) {

    // Creates an array of character
    char[] array = new char[100];

    try {
      // Creates a FileInputStream
      FileInputStream file = new FileInputStream("input.txt");

      // Creates an InputStreamReader
      InputStreamReader input = new InputStreamReader(file);

      // Reads characters from the file
      input.read(array);
      System.out.println("Data in the stream:");
      System.out.println(array);

      // Closes the reader
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Output

Data in the stream:
This is a line of text inside the file.
In the above example, we have created an input stream reader using the file input stream. The input stream reader is linked with the file input.txt.

 FileInputStream file = new FileInputStream("input.txt");
 InputStreamReader input = new InputStreamReader(file);
To read characters from the file, we have used the read() method.

getEncoding() Method
The getEncoding() method can be used to get the type of encoding that is used to store data in the input stream. For example,

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.FileInputStream;

class Main {
  public static void main(String[] args) {

    try {
      // Creates a FileInputStream
      FileInputStream file = new FileInputStream("input.txt");

      // Creates an InputStreamReader with default encoding
      InputStreamReader input1 = new InputStreamReader(file);

      // Creates an InputStreamReader specifying the encoding
      InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF8"));

      // Returns the character encoding of the input stream
      System.out.println("Character encoding of input1: " + input1.getEncoding());
      System.out.println("Character encoding of input2: " + input2.getEncoding());

      // Closes the reader
      input1.close();
      input2.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Output

The character encoding of input1: Cp1252
The character encoding of input2: UTF8
In the above example, we have created 2 input stream reader named input1 and input2.

input1 does not specify the character encoding. Hence the getEncoding() method returns the canonical name of the default character encoding.
input2 specifies the character encoding, UTF8. Hence the getEncoding() method returns the specified character encoding.
Note: We have used the Charset.forName() method to specify the type of character encoding. To learn more, visit Java Charset (official Java documentation).

close() Method
To close the input stream reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read the data.

Other Methods of InputStreamReader
Method	Description
ready()	checks if the stream is ready to be read
mark()	mark the position in stream up to which data has been read
reset()	returns the control to the point in the stream where the mark was set











Java OutputStreamWriter Class
In this tutorial, we will learn about Java OutputStreamWriter and its methods with the help of examples.

The OutputStreamWriter class of the java.io package can be used to convert data in character form into data in bytes form.

It extends the abstract class Writer.

OutputStreamWriter 
OutputStreamWriter
The OutputStreamWriter class works with other output streams. It is also known as a bridge between byte streams and character streams. This is because the OutputStreamWriter converts its characters into bytes.

For example, some characters require 2 bytes to be stored in the storage. To write such data we can use the output stream writer that converts the character into corresponding bytes and stores the bytes together.

Create an OutputStreamWriter
In order to create an OutputStreamWriter, we must import the java.io.OutputStreamWriter package first. Once we import the package here is how we can create the output stream writer.

// Creates an OutputStream
FileOutputStream file = new FileOutputStream(String path);

// Creates an OutputStreamWriter
OutputStreamWriter output = new OutputStreamWriter(file);
In the above example, we have created an OutputStreamWriter named output along with the FileOutputStream named file.

Here, we are using the default character encoding to write characters to the output stream.

However, we can specify the type of character encoding (UTF8 or UTF16) to be used to write data.

// Creates an OutputStreamWriter specifying the character encoding
OutputStreamWriter output = new OutputStreamWriter(file, Charset cs);
Here, we have used the Charset class to specify the type of character encoding.

Methods of OutputStreamWriter

The OutputStreamWriter class provides implementations for different methods present in the Writer class.

write() Method
write() - writes a single character to the writer
write(char[] array) - writes the characters from the specified array to the writer
write(String data) - writes the specified string to the writer
Example: OutputStreamWriter to write data to a File
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String args[]) {

    String data = "This is a line of text inside the file.";

    try {
      // Creates a FileOutputStream
      FileOutputStream file = new FileOutputStream("output.txt");

      // Creates an OutputStreamWriter
      OutputStreamWriter output = new OutputStreamWriter(file);

      // Writes string to the file
      output.write(data);

      // Closes the writer
      output.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}
In the above example, we have created an output stream reader using the file output stream. The output stream reader is linked with the output.txt file.

FileOutputStream file = new FileOutputStream("output.txt");
OutputStreamWriter output = new OutputStreamWriter(file);
To write data to the file, we have used the write() method.

Here, when we run the program, the output.txt file is filled with the following content.

This is a line of text inside the file.
getEncoding() Method
The getEncoding() method can be used to get the type of encoding that is used to write data to the output stream. For example,

import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.io.FileOutputStream;

class Main {
  public static void main(String[] args) {

    try {
      // Creates an output stream
      FileOutputStream file = new FileOutputStream("output.txt");

      // Creates an output stream reader with default encoding
      OutputStreamWriter output1 = new OutputStreamWriter(file);

      // Creates an output stream reader specifying the encoding
      OutputStreamWriter output2 = new OutputStreamWriter(file, Charset.forName("UTF8"));

      // Returns the character encoding of the output stream
      System.out.println("Character encoding of output1: " + output1.getEncoding());
      System.out.println("Character encoding of output2: " + output2.getEncoding());

      // Closes the reader
      output1.close();
      output2.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Output

The character encoding of output1: Cp1252
The character encoding of output2: UTF8
In the above example, we have created 2 output stream writer named output1 and output2.

output1 does not specify the character encoding. Hence the getEncoding() method returns the default character encoding.
output2 specifies the character encoding, UTF8. Hence the getEncoding() method returns the specified character encoding.
Note: We have used the Charset.forName() method to specify the type of character encoding. To learn more, visit Java Charset (official Java documentation).

close() Method
To close the output stream writer, we can use the close() method. Once the close() method is called, we cannot use the writer to write the data.

Other methods of OutputStreamWriter
Method	Description
flush()	forces to write all the data present in the writer to the corresponding destination
append()	inserts the specified character to the current writer













Java FileReader Class
In this tutorial, we will learn about Java FileReader and its methods with the help of examples.

The FileReader class of the java.io package can be used to read data (in characters) from files.

It extends the InputSreamReader class.

FileReader extends the InputStreamReader and Reader classes
FileReader extends InputStreamReader
Before you learn about FileReader, make sure you know about the Java File.

Create a FileReader
In order to create a file reader, we must import the java.io.FileReader package first. Once we import the package, here is how we can create the file reader.

1. Using the name of the file

FileReader input = new FileReader(String name);
Here, we have created a file reader that will be linked to the file specified by the name.

2. Using an object of the file

FileReader input = new FileReader(File fileObj);
Here, we have created a file reader that will be linked to the file specified by the object of the file.

In the above example, the data in the file are stored using some default character encoding.

However, since Java 11 we can specify the type of character encoding (UTF-8 or UTF-16) in the file as well.

FileReader input = new FileReader(String file, Charset cs);
Here, we have used the Charset class to specify the character encoding of the file reader.

Methods of FileReader

The FileReader class provides implementations for different methods present in the Reader class.

read() Method
read() - reads a single character from the reader
read(char[] array) - reads the characters from the reader and stores in the specified array
read(char[] array, int start, int length) - reads the number of characters equal to length from the reader and stores in the specified array starting from the position start
For example, suppose we have a file named input.txt with the following content.

This is a line of text inside the file.
Let's try to read the file using FileReader.

import java.io.FileReader;

class Main {
  public static void main(String[] args) {

    // Creates an array of character
    char[] array = new char[100];

    try {
      // Creates a reader using the FileReader
      FileReader input = new FileReader("input.txt");

      // Reads characters
      input.read(array);
      System.out.println("Data in the file: ");
      System.out.println(array);

      // Closes the reader
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Output

Data in the file:
This is a line of text inside the file.
In the above example, we have created a file reader named input. The file reader is linked with the file input.txt.

FileInputStream input = new FileInputStream("input.txt");
To read data from the file, we have used the read() method.

Note: The file input.txt should be present in the current working directory.

getEncoding() Method
The getEncoding() method can be used to get the type of encoding that is used to store data in the file. For example,

import java.io.FileReader;
import java.nio.charset.Charset;

class Main {
  public static void main(String[] args) {

    try {
      // Creates a FileReader with default encoding
      FileReader input1 = new FileReader("input.txt");

      // Creates a FileReader specifying the encoding
      FileReader input2 = new FileReader("input.txt", Charset.forName("UTF8"));

      // Returns the character encoding of the file reader
      System.out.println("Character encoding of input1: " + input1.getEncoding());
      System.out.println("Character encoding of input2: " + input2.getEncoding());

      // Closes the reader
      input1.close();
      input2.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Output

The character encoding of input1: Cp1252
The character encoding of input2: UTF8
In the above example, we have created 2 file reader named input1 and input2.

input1 does not specify the character encoding. Hence the getEncoding() method returns the default character encoding.
input2 specifies the character encoding, UTF8. Hence the getEncoding() method returns the specified character encoding.
Note: We have used the Charset.forName() method to specify the type of character encoding. To learn more, visit Java Charset (official Java documentation).

close() Method
To close the file reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read the data.

Other Methods of FileReader
Method	Description
ready()	checks if the file reader is ready to be read
mark()	mark the position in file reader up to which data has been read
reset()	returns the control to the point in the reader where the mark was set











Java FileWriter Class
In this tutorial, we will learn about Java FileWriter and its methods with the help of examples.

The FileWriter class of the java.io package can be used to write data (in characters) to files.

It extends the OutputStreamWriter class.

The FileWriter is a subclass of OutputStreamWriter and the OutputStreamWriter is subclass of the Java Writer.

Before you learn more about FileWriter, make sure to know about Java File.

Create a FileWriter
In order to create a file writer, we must import the Java.io.FileWriter package first. Once we import the package, here is how we can create the file writer.

1. Using the name of the file

FileWriter output = new FileWriter(String name);
Here, we have created a file writer that will be linked to the file specified by the name.

2. Using an object of the file

FileWriter  input = new FileWriter(File fileObj);
Here, we have created a file writer that will be linked to the file specified by the object of the file.

In the above example, the data are stored using some default character encoding.

However, since Java 11 we can specify the type of character encoding (UTF8 or UTF16) as well.

FileWriter input = new FileWriter(String file, Charset cs);

Here, we have used the Charset class to specify the character encoding of the file writer.

Methods of FileWriter
The FileWriter class provides implementations for different methods present in the Writer class.

write() Method
write() - writes a single character to the writer
write(char[] array) - writes the characters from the specified array to the writer
write(String data) - writes the specified string to the writer
Example: FileWriter to write data to a File
import java.io.FileWriter;

public class Main {

  public static void main(String args[]) {

    String data = "This is the data in the output file";

    try {
      // Creates a FileWriter
      FileWriter output = new FileWriter("output.txt");

      // Writes the string to the file
      output.write(data);

      // Closes the writer
      output.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}
In the above example, we have created a file writer named output. The output reader is linked with the output.txt file.

FileWriter output = new FileWriter("output.txt");
To write data to the file, we have used the write() method.

Here when we run the program, the output.txt file is filled with the following content.

This is a line of text inside the file.
getEncoding() Method
The getEncoding() method can be used to get the type of encoding that is used to write data. For example,

import java.io.FileWriter;
import java.nio.charset.Charset;

class Main {
  public static void main(String[] args) {

    String file = "output.txt";

    try {
      // Creates a FileReader with default encoding
      FileWriter output1 = new FileWriter(file);

      // Creates a FileReader specifying the encoding
      FileWriter output2 = new FileWriter(file, Charset.forName("UTF8"));

      // Returns the character encoding of the reader
      System.out.println("Character encoding of output1: " + output1.getEncoding());
      System.out.println("Character encoding of output2: " + output2.getEncoding());

      // Closes the reader
      output1.close();
      output2.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Output

The character encoding of output1: Cp1252
The character encoding of output2: UTF8
In the above example, we have created 2 file writer named output1 and output2.

output1 does not specify the character encoding. Hence the getEncoding() method returns the default character encoding.
output2 specifies the character encoding, UTF8. Hence the getEncoding() method returns the specified character encoding.
Note: We have used the Charset.forName() method to specify the type of character encoding. To learn more, visit Java Charset (official Java documentation).

close() Method
To close the file writer, we can use the close() method. Once the close() method is called, we cannot use the writer to write the data.

Other methods of FileWriter
Method	Description
flush()	forces to write all the data present in the writer to the corresponding destination
append()	inserts the specified character to the current writer


















Java BufferedReader
In this tutorial, we will learn about the Java BufferedReader class with the help of examples.

The BufferedReader class of the java.io package can be used with other readers to read data (in characters) more efficiently.

It extends the abstract class Reader.

The BufferedReader class extends the Reader class in Java
Java BufferedReader
Working of BufferedReader
The BufferedReader maintains an internal buffer of 8192 characters.

During the read operation in BufferedReader, a chunk of characters is read from the disk and stored in the internal buffer. And from the internal buffer characters are read individually.

Hence, the number of communication to the disk is reduced. This is why reading characters is faster using BufferedReader.

Create a BufferedReader
In order to create a BufferedReader, we must import the java.io.BuferedReader package first. Once we import the package, here is how we can create the reader.

// Creates a FileReader
FileReader file = new FileReader(String file);

// Creates a BufferedReader
BufferedReader buffer = new BufferedReader(file);
In the above example, we have created a BufferedReader named buffer with the FileReader named file.

Here, the internal buffer of the BufferedReader has the default size of 8192 characters. However, we can specify the size of the internal buffer as well.

// Creates a BufferdReader with specified size internal buffer
BufferedReader buffer = new BufferedReader(file, int size);
The buffer will help to read characters from the files more quickly.

Methods of BufferedReader
The BufferedReader class provides implementations for different methods present in Reader.

read() Method
read() - reads a single character from the internal buffer of the reader
read(char[] array) - reads the characters from the reader and stores in the specified array
read(char[] array, int start, int length) - reads the number of characters equal to length from the reader and stores in the specified array starting from the position start
For example, suppose we have a file named input.txt with the following content.

This is a line of text inside the file.

Let's try to read the file using BufferedReader.

import java.io.FileReader;
import java.io.BufferedReader;

class Main {
  public static void main(String[] args) {

    // Creates an array of character
    char[] array = new char[100];

    try {
      // Creates a FileReader
      FileReader file = new FileReader("input.txt");

      // Creates a BufferedReader
      BufferedReader input = new BufferedReader(file);

      // Reads characters
      input.read(array);
      System.out.println("Data in the file: ");
      System.out.println(array);

      // Closes the reader
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Output

Data in the file:
This is a line of text inside the file.
In the above example, we have created a buffered reader named input. The buffered reader is linked with the input.txt file.

FileReader file = new FileReader("input.txt");
BufferedReader input = new BufferedReader(file);
Here, we have used the read() method to read an array of characters from the internal buffer of the buffered reader.

skip() Method
To discard and skip the specified number of characters, we can use the skip() method. For example,

import java.io.FileReader;
import java.io.BufferedReader;

public class Main {

  public static void main(String args[]) {

    // Creates an array of characters
    char[] array = new char[100];

    try {
      // Suppose, the input.txt file contains the following text
      // This is a line of text inside the file.
      FileReader file = new FileReader("input.txt");

      // Creates a BufferedReader
      BufferedReader input = new BufferedReader(file);

      // Skips the 5 characters
      input.skip(5);

      // Reads the characters
      input.read(array);

      System.out.println("Data after skipping 5 characters:");
      System.out.println(array);

      // closes the reader
      input.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}
Output

Data after skipping 5 characters:
is a line of text inside the file.
In the above example, we have used the skip() method to skip 5 characters from the file reader. Hence, the characters 'T', 'h', 'i', 's' and ' ' are skipped from the original file.

close() Method
To close the buffered reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read the data.

Other Methods of BufferedReader
Method	Description
ready()	checks if the file reader is ready to be read
mark()	mark the position in reader up to which data has been read
reset()	returns the control to the point in the reader where the mark was set


















Java BufferedWriter Class
In this tutorial, we will learn about Java BufferedWriter and its methods with the help of examples.

The BufferedWriter class of the java.io package can be used with other writers to write data (in characters) more efficiently.

It extends the abstract class Writer.

The BufferedWriter class is a subclass of Java Writer.

Working of BufferedWriter
The BufferedWriter maintains an internal buffer of 8192 characters.

During the write operation, the characters are written to the internal buffer instead of the disk. Once the buffer is filled or the writer is closed, the whole characters in the buffer are written to the disk.

Hence, the number of communication to the disk is reduced. This is why writing characters is faster using BufferedWriter.

Create a BufferedWriter
In order to create a BufferedWriter, we must import the java.io.BufferedWriter package first. Once we import the package here is how we can create the buffered writer.

// Creates a FileWriter
FileWriter file = new FileWriter(String name);

// Creates a BufferedWriter
BufferedWriter buffer = new BufferedWriter(file);
In the above example, we have created a BufferedWriter named buffer with the FileWriter named file.

Here, the internal buffer of the BufferedWriter has the default size of 8192 characters. However, we can specify the size of the internal buffer as well.

// Creates a BufferedWriter with specified size internal buffer
BufferedWriter buffer = new BufferedWriter(file, int size);
The buffer will help to write characters to the files more efficiently.

Methods of BufferedWriter
The BufferedWriter class provides implementations for different methods present in Writer.

write() Method
write() - writes a single character to the internal buffer of the writer
write(char[] array) - writes the characters from the specified array to the writer
write(String data) - writes the specified string to the writer
Example: BufferedWriter to write data to a File
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {

  public static void main(String args[]) {

    String data = "This is the data in the output file";

    try {
      // Creates a FileWriter
      FileWriter file = new FileWriter("output.txt");

      // Creates a BufferedWriter
      BufferedWriter output = new BufferedWriter(file);

      // Writes the string to the file
      output.write(data);

      // Closes the writer
      output.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}

In the above example, we have created a buffered writer named output along with FileWriter. The buffered writer is linked with the output.txt file.

FileWriter file = new FileWriter("output.txt");
BufferedWriter output = new BufferedWriter(file);
To write data to the file, we have used the write() method.

Here when we run the program, the output.txt file is filled with the following content.

This is a line of text inside the file.
flush() Method
To clear the internal buffer, we can use the flush() method. This method forces the writer to write all data present in the buffer to the destination file.

For example, suppose we have an empty file named output.txt.

import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
  public static void main(String[] args) {

    String data = "This is a demo of the flush method";

    try {
      // Creates a FileWriter
      FileWriter file = new FileWriter(" flush.txt");

      // Creates a BufferedWriter
      BufferedWriter output = new BufferedWriter(file);

      // Writes data to the file
      output.write(data);

      // Flushes data to the destination
      output.flush();
      System.out.println("Data is flushed to the file.");

      output.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Output

Data is flushed to the file.
When we run the program, the file output.txt is filled with the text represented by the string data.

close() Method
To close the buffered writer, we can use the close() method. Once the close() method is called, we cannot use the writer to write the data.

Other Methods of BufferedWriter
Method	Description
newLine() 	inserts a new line to the writer
append() 	inserts the specified character to the current writer
















ava StringReader Class
In this tutorial, we will learn about Java StringReader and its methods with the help of examples.

The StringReader class of the java.io package can be used to read data (in characters) from strings.

It extends the abstract class Reader.

The StringReader class is a subclass of Java Reader.

Note: In StringReader, the specified string acts as a source from where characters are read individually.

Create a StringReader
In order to create a StringReader, we must import the java.io.StringReader package first. Once we import the package here is how we can create the string reader.

// Creates a StringReader
StringReader input = new StringReader(String data);
Here, we have created a StringReader that reads characters from the specified string named data.

Methods of StringReader
The StringReader class provides implementations for different methods present in the Reader class.

read() Method
read() - reads a single character from the string reader
read(char[] array) - reads the characters from the reader and stores in the specified array
read(char[] array, int start, int length) - reads the number of characters equal to length from the reader and stores in the specified array starting from the position start
Example: Java StringReader
import java.io.StringReader;

public class Main {
  public static void main(String[] args) {

    String data = "This is the text read from StringReader.";

    // Create a character array
    char[] array = new char[100];

    try {
      // Create a StringReader
      StringReader input = new StringReader(data);

      //Use the read method
      input.read(array);
      System.out.println("Data read from the string:");
      System.out.println(array);

      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Run Code
Output

Data read from the string:
This is the text read from StringReader.
In the above example, we have created a string reader named input. The string reader is linked to the string data.

String data = "This is a text in the string.";
StringReader input = new StringReader(data);

To read data from the string, we have used the read() method.

Here, the method reads an array of characters from the reader and stores in the specified array.

skip() Method
To discard and skip the specified number of characters, we can use the skip() method. For example,

import java.io.StringReader;

public class Main {
  public static void main(String[] args) {

    String data = "This is the text read from StringReader";
    System.out.println("Original data: " + data);

    // Create a character array
    char[] array = new char[100];

    try {
      // Create a StringReader
      StringReader input = new StringReader(data);

      // Use the skip() method
      input.skip(5);

      //Use the read method
      input.read(array);
      System.out.println("Data after skipping 5 characters:");
      System.out.println(array);

      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Run Code
Output

Original data: This is the text read from the StringReader
Data after skipping 5 characters:
is the text read from the StringReader
In the above example, we have used the skip() method to skip 5 characters from the string reader. Hence, the characters 'T', 'h', 'i', 's' and ' ' are skipped from the original string reader.

close() Method
To close the string reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read data from the string.

Other Methods of StringReader
Method	Description
ready() 	checks if the string reader is ready to be read
mark() 	marks the position in reader up to which data has been read
reset() 	returns the control to the point in the reader where the mark was set







Java StringWriter Class
In this tutorial, we will learn about Java StringWriter and its subclasses with the help of examples.

The StringWriter class of the java.io package can be used to write data (in characters) to the string buffer.

It extends the abstract class Writer.

The StringWriter class is a subclass of Java Writer.

Note: In Java, string buffer is considered as a mutable string. That is, we can modify the string buffer. To convert from string buffer to string, we can use the toString() method.

Create a StringWriter
In order to create a StringWriter, we must import the java.io.StringWriter package first. Once we import the package here is how we can create the string writer.

// Creates a StringWriter
StringWriter output = new StringWriter();
Here, we have created the string writer with default string buffer capacity. However, we can specify the string buffer capacity as well.

// Creates a StringWriter with specified string buffer capacity
StringWriter output = new StringWriter(int size);
Here, the size specifies the capacity of the string buffer.

Methods of StringWriter
The StringWriter class provides implementations for different methods present in the Writer class.

write() Method
write() - writes a single character to the string writer
write(char[] array) - writes the characters from the specified array to the writer
write(String data) - writes the specified string to the writer
Example: Java StringWriter
import java.io.StringWriter;

public class Main {
  public static void main(String[] args) {

    String data = "This is the text in the string.";

    try {
      // Create a StringWriter with default string buffer capacity
      StringWriter output = new StringWriter();

      // Writes data to the string buffer
      output.write(data);

      // Prints the string writer
      System.out.println("Data in the StringWriter: " + output);

      output.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Run Code
Output

Data in the StringWriter: This is the text in the string.
In the above example, we have created a string writer named output.

StringWriter output = new StringWriter();

We then use the write() method to write the string data to the string buffer.

Note: We have used the toString() method to get the output data from string buffer in string form.

Access Data from StringBuffer
getBuffer() - returns the data present in the string buffer
toString() - returns the data present in the string buffer as a string
For example,

import java.io.StringWriter;

public class Main {
  public static void main(String[] args) {

    String data = "This is the original data";

    try {
      // Create a StringWriter with default string buffer capacity
      StringWriter output = new StringWriter();

      // Writes data to the string buffer
      output.write(data);

      // Returns the string buffer
      StringBuffer stringBuffer = output.getBuffer();
      System.out.println("StringBuffer: " + stringBuffer);

      // Returns the string buffer in string form
      String string = output.toString();
      System.out.println("String: " + string);

      output.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
Run Code
Output

StringBuffer: This is the original data
String: This is the original data
Here we have used the getBuffer() method to get the data present in the string buffer. And also the method toString() returns the data present in the string buffer as a string.

close() Method
To close the string writer, we can use the close() method.

However, the close() method has no effect in the StringWriter class. We can use the methods of this class even after the close() method is called.

Other methods of StringWriter
Method	Description
flush()	forces to write all the data present in the writer to the string buffer
append()	inserts the specified character to the current writer







Java PrintWriter Class
In this tutorial, we will learn about Java PrintWriter and its print() and printf() methods with the help of examples.

The PrintWriter class of the java.io package can be used to write output data in a commonly readable form (text).

It extends the abstract class Writer.

The PrintWriter class is a subclass of Java Writer.

Working of PrintWriter
Unlike other writers, PrintWriter converts the primitive data (int, float, char, etc.) into the text format. It then writes that formatted data to the writer.

Also, the PrintWriter class does not throw any input/output exception. Instead, we need to use the checkError() method to find any error in it.

Note: The PrintWriter class also has a feature of auto flushing. This means it forces the writer to write all data to the destination if one of the println() or printf() methods is called.

Create a PrintWriter
In order to create a print writer, we must import the java.io.PrintWriter package first. Once we import the package here is how we can create the print writer.

1. Using other writers

// Creates a FileWriter
FileWriter file = new FileWriter("output.txt");

// Creates a PrintWriter
PrintWriter output = new PrintWriter(file, autoFlush);
Here,

we have created a print writer that will write data to the file represented by the FileWriter
autoFlush is an optional parameter that specifies whether to perform auto flushing or not
2. Using other output streams

// Creates a FileOutputStream
FileOutputStream file = new FileOutputStream("output.txt");

// Creates a PrintWriter
PrintWriter output = new PrintWriter(file, autoFlush);
Here,

we have created a print writer that will write data to the file represented by the FileOutputStream
the autoFlush is an optional parameter that specifies whether to perform auto flushing or not
3. Using filename

// Creates a PrintWriter
PrintWriter output = new PrintWriter(String file, boolean autoFlush);
Here,

we have created a print writer that will write data to the specified file
the autoFlush is an optional boolean parameter that specifies whether to perform auto flushing or nor
Note: In all the above cases, the PrintWriter writes data to the file using some default character encoding. However, we can specify the character encoding (UTF8 or UTF16) as well.

// Creates a PrintWriter using some character encoding
PrintWriter output = new PrintWriter(String file, boolean autoFlush, Charset cs);
Here, we have used the Charset class to specify the character encoding. To know more, visit Java Charset (official Java documentation).

Methods of PrintWriter
The PrintWriter class provides various methods that allow us to print data to the output.

print() Method
print() - prints the specified data to the writer
println() - prints the data to the writer along with a new line character at the end

For example,

import java.io.PrintWriter;

class Main {
  public static void main(String[] args) {

    String data = "This is a text inside the file.";

    try {
      PrintWriter output = new PrintWriter("output.txt");

      output.print(data);
      output.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
In the above example, we have created a print writer named output. This print writer is linked with the file output.txt.

PrintWriter output = new PrintWriter("output.txt");
To print data to the file, we have used the print() method.

Here when we run the program, the output.txt file is filled with the following content.

This is a text inside the file.
printf() Method
The printf() method can be used to print the formatted string. It includes 2 parameters: formatted string and arguments. For example,

printf("I am %d years old", 25);
Here,

I am %d years old is a formatted string
%d is integer data in the formatted string
25 is an argument
The formatted string includes both text and data. And, the arguments replace the data inside the formatted string.

Hence the %d is replaced by 25.

Example: printf() Method using PrintWriter
import java.io.PrintWriter;

class Main {
  public static void main(String[] args) {

    try {
      PrintWriter output = new PrintWriter("output.txt");

      int age = 25;

      output.printf("I am %d years old.", age);
      output.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
In the above example, we have created a print writer named output. The print writer is linked with the file output.txt.

PrintWriter output = new PrintWriter("output.txt");
To print the formatted text to the file, we have used the printf() method.

Here when we run the program, the output.txt file is filled with the following content.

I am 25 years old.
Other Methods Of PrintWriter
Method	Description
close()	closes the print writer
checkError()	checks if there is an error in the writer and returns a boolean result
append()	appends the specified data to the writer






Java Scanner Class
In this tutorial, we will learn about the Java Scanner and its methods with the help of examples.

The Scanner class of the java.util package is used to read input data from different sources like input streams, users, files, etc. Let's take an example.

Example 1: Read a Line of Text Using Scanner
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");

    // takes input from the keyboard
    String name = input.nextLine();

    // prints the name
    System.out.println("My name is " + name);

    // closes the scanner
    input.close();
  }
}
Run Code
Output

Enter your name: Kelvin
My name is Kelvin
In the above example, notice the line

Scanner input = new Scanner(System.in);
Here, we have created an object of Scanner named input.

The System.in parameter is used to take input from the standard input. It works just like taking inputs from the keyboard.

We have then used the nextLine() method of the Scanner class to read a line of text from the user.

Now that you have some idea about Scanner, let's explore more about it.

Import Scanner Class
As we can see from the above example, we need to import the java.util.Scanner package before we can use the Scanner class.

import java.util.Scanner;
To learn more about importing packages, visit Java Packages.

Create a Scanner Object in Java
Once we import the package, here is how we can create Scanner objects.

// read input from the input stream
Scanner sc1 = new Scanner(InputStream input);

// read input from files
Scanner sc2 = new Scanner(File file);

// read input from a string
Scanner sc3 = new Scanner(String str);
Here, we have created objects of the Scanner class that will read input from InputStream, File, and String respectively.

Java Scanner Methods to Take Input
The Scanner class provides various methods that allow us to read inputs of different types.

Method	Description
nextInt()	reads an int value from the user
nextFloat()	reads a float value form the user
nextBoolean()	reads a boolean value from the user
nextLine()	reads a line of text from the user
next()	reads a word from the user
nextByte()	reads a byte value from the user
nextDouble()	reads a double value from the user
nextShort()	reads a short value from the user
nextLong()	reads a long value from the user
Example 2: Java Scanner nextInt()
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // creates a Scanner object
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer: ");

    // reads an int value
    int data1 = input.nextInt();

    System.out.println("Using nextInt(): " + data1);

    input.close();
  }
}
Run Code
Output

Enter an integer:
22
Using nextInt(): 22
In the above example, we have used the nextInt() method to read an integer value.

Example 3: Java Scanner nextDouble()
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Double value: ");

    // reads the double value
    double value = input.nextDouble();
    System.out.println("Using nextDouble(): " + value);

    input.close();
  }
}
Run Code
Output

Enter Double value: 33.33
Using nextDouble(): 33.33
In the above example, we have used the nextDouble() method to read a floating-point value.

Example 4: Java Scanner next()
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");

    // reads the entire word
    String value = input.next();
    System.out.println("Using next(): " + value);

    input.close();
  }
}
Run Code

Output

Enter your name: Jonny Walker
Using next(): Jonny
In the above example, we have used the next() method to read a string from the user.

Here, we have provided the full name. However, the next() method only reads the first name.

This is because the next() method reads input up to the whitespace character. Once the whitespace is encountered, it returns the string (excluding the whitespace).

Example 5: Java Scanner nextLine()
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");

    // reads the entire line
    String value = input.nextLine();
    System.out.println("Using nextLine(): " + value);

    input.close();
  }
}
Run Code
Output

Enter your name: Jonny Walker
Using nextLine(): Jonny Walker
In the first example, we have used the nextLine() method to read a string from the user.

Unlike next(), the nextLine() method reads the entire line of input including spaces. The method is terminated when it encounters a next line character, \n.

Recommended Reading: Java Scanner skipping the nextLine().

Java Scanner with BigInteger and BigDecimal
Java scanner can also be used to read the big integer and big decimal numbers.

nextBigInteger() - reads the big integer value from the user
nextBigDecimal() - reads the big decimal value from the user
Example 4: Read BigInteger and BigDecimal
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // creates an object of Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a big integer: ");

    // reads the big integer
    BigInteger value1 = input.nextBigInteger();
    System.out.println("Using nextBigInteger(): " + value1);

    System.out.print("Enter a big decimal: ");

    // reads the big decimal
    BigDecimal value2 = input.nextBigDecimal();
    System.out.println("Using nextBigDecimal(): " + value2);

    input.close();
  }
}
Run Code
Output

Enter a big integer: 987654321
Using nextBigInteger(): 987654321
Enter a big decimal: 9.55555
Using nextBigDecimal(): 9.55555
In the above example, we have used the java.math.BigInteger and java.math.BigDecimal package to read BigInteger and BigDecimal respectively.

Working of Java Scanner
The Scanner class reads an entire line and divides the line into tokens. Tokens are small elements that have some meaning to the Java compiler. For example,

Suppose there is an input string:

He is 22
In this case, the scanner object will read the entire line and divides the string into tokens: "He", "is" and "22". The object then iterates over each token and reads each token using its different methods.

Note: By default, whitespace is used to divide tokens.











Java Type Casting
In this tutorial, we will learn about the Java Type Casting and its types with the help of examples.

Before you learn about Java Type Casting, make sure you know about Java Data Types.

Type Casting
The process of converting the value of one data type (int, float, double, etc.) to another data type is known as typecasting.

In Java, there are 13 types of type conversion. However, in this tutorial, we will only focus on the major 2 types.

1. Widening Type Casting

2. Narrowing Type Casting

To learn about other types of type conversion, visit Java Type Conversion (official Java documentation).

Widening Type Casting
In Widening Type Casting, Java automatically converts one data type to another data type.

Example: Converting int to double
class Main {
  public static void main(String[] args) {
    // create int type variable
    int num = 10;
    System.out.println("The integer value: " + num);

    // convert into double type
    double data = num;
    System.out.println("The double value: " + data);
  }
}
Run Code
Output

The integer value: 10
The double value: 10.0
In the above example, we are assigning the int type variable named num to a double type variable named data.

Here, the Java first converts the int type data into the double type. And then assign it to the double variable.

In the case of Widening Type Casting, the lower data type (having smaller size) is converted into the higher data type (having larger size). Hence there is no loss in data. This is why this type of conversion happens automatically.

Note: This is also known as Implicit Type Casting.

Narrowing Type Casting
In Narrowing Type Casting, we manually convert one data type into another using the parenthesis.

Example: Converting double into an int
class Main {
  public static void main(String[] args) {
    // create double type variable
    double num = 10.99;
    System.out.println("The double value: " + num);

    // convert into int type
    int data = (int)num;
    System.out.println("The integer value: " + data);
  }
}
Run Code
Output

The double value: 10.99
The integer value: 10

In the above example, we are assigning the double type variable named num to an int type variable named data.

Notice the line,

int data = (int)num;
Here, the int keyword inside the parenthesis indicates that that the num variable is converted into the int type.

In the case of Narrowing Type Casting, the higher data types (having larger size) are converted into lower data types (having smaller size). Hence there is the loss of data. This is why this type of conversion does not happen automatically.

Note: This is also known as Explicit Type Casting.

Let's see some of the examples of other type conversions in Java.

Example 1: Type conversion from int to String
class Main {
  public static void main(String[] args) {
    // create int type variable
    int num = 10;
    System.out.println("The integer value is: " + num);

    // converts int to string type
    String data = String.valueOf(num);
    System.out.println("The string value is: " + data);
  }
}
Run Code
Output

The integer value is: 10
The string value is: 10
In the above program, notice the line

String data = String.valueOf(num);
Here, we have used the valueOf() method of the Java String class to convert the int type variable into a string.

Example 2: Type conversion from String to int
class Main {
  public static void main(String[] args) {
    // create string type variable
    String data = "10";
    System.out.println("The string value is: " + data);

    // convert string variable to int
    int num = Integer.parseInt(data);
    System.out.println("The integer value is: " + num);
  }
}
Run Code
Output

The string value is: 10
The integer value is: 10
In the above example, notice the line

int num = Integer.parseInt(data);
Here, we have used the parseInt() method of the Java Integer class to convert a string type variable into an int variable.

Note: If the string variable cannot be converted into the integer variable then an exception named NumberFormatException occurs.












Java autoboxing and unboxing
In this tutorial, we will learn about Java autoboxing and unboxing with the help of examples.

Java Autoboxing - Primitive Type to Wrapper Object
In autoboxing, the Java compiler automatically converts primitive types into their corresponding wrapper class objects. For example,

int a = 56;

// autoboxing
Integer aObj = a;
Autoboxing has a great advantage while working with Java collections.

Example 1: Java Autoboxing
import java.util.ArrayList;

class Main {
   public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>();

      //autoboxing
      list.add(5);
      list.add(6);

      System.out.println("ArrayList: " + list);
   }
}
Run Code
Output

ArrayList: [5, 6]
In the above example, we have created an array list of Integer type. Hence the array list can only hold objects of Integer type.

Notice the line,

list.add(5);
Here, we are passing primitive type value. However, due to autoboxing, the primitive value is automatically converted into an Integer object and stored in the array list.

Java Unboxing - Wrapper Objects to Primitive Types

In unboxing, the Java compiler automatically converts wrapper class objects into their corresponding primitive types. For example,

// autoboxing
Integer aObj = 56;

// unboxing
int a = aObj;
Like autoboxing, unboxing can also be used with Java collections.

Example 2: Java Unboxing
import java.util.ArrayList;

class Main {
   public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>();

      //autoboxing
      list.add(5);
      list.add(6);

      System.out.println("ArrayList: " + list);

      // unboxing
      int a = list.get(0);
      System.out.println("Value at index 0: " + a);
   }
}
Run Code
Output

ArrayList: [5, 6]
Value at index 0: 5
In the above example, notice the line,

int a = list.get(0);
Here, the get() method returns the object at index 0. However, due to unboxing, the object is automatically converted into the primitive type int and assigned to the variable a.







Java Lambda Expressions
In this article, we will learn about Java lambda expression and the use of lambda expression with functional interfaces, generic functional interface, and stream API with the help of examples.

The lambda expression was introduced first time in Java 8. Its main objective to increase the expressive power of the language.

But, before getting into lambdas, we first need to understand functional interfaces.

What is Functional Interface?
If a Java interface contains one and only one abstract method then it is termed as functional interface. This only one method specifies the intended purpose of the interface.

For example, the Runnable interface from package java.lang; is a functional interface because it constitutes only one method i.e. run().

Example 1: Define a Functional Interface in java
import java.lang.FunctionalInterface;
@FunctionalInterface
public interface MyInterface{
    // the single abstract method
    double getValue();
}
In the above example, the interface MyInterface has only one abstract method getValue(). Hence, it is a functional interface.

Here, we have used the annotation @FunctionalInterface. The annotation forces the Java compiler to indicate that the interface is a functional interface. Hence, does not allow to have more than one abstract method. However, it is not compulsory though.

In Java 7, functional interfaces were considered as Single Abstract Methods or SAM type. SAMs were commonly implemented with Anonymous Classes in Java 7.

Example 2: Implement SAM with anonymous classes in java
public class FunctionInterfaceTest {
    public static void main(String[] args) {

        // anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I just implemented the Runnable Functional Interface.");
            }
        }).start();
    }
}
Run Code
Output:

I just implemented the Runnable Functional Interface.
Here, we can pass an anonymous class to a method. This helps to write programs with fewer codes in Java 7. However, the syntax was still difficult and a lot of extra lines of code were required.

Java 8 extended the power of a SAMs by going a step further. Since we know that a functional interface has just one method, there should be no need to define the name of that method when passing it as an argument. Lambda expression allows us to do exactly that.

Introduction to lambda expressions
Lambda expression is, essentially, an anonymous or unnamed method. The lambda expression does not execute on its own. Instead, it is used to implement a method defined by a functional interface.

How to define lambda expression in Java?
Here is how we can define lambda expression in Java.

(parameter list) -> lambda body
The new operator (->) used is known as an arrow operator or a lambda operator. The syntax might not be clear at the moment. Let's explore some examples,

Suppose, we have a method like this:

double getPiValue() {
    return 3.1415;
}
We can write this method using lambda expression as:

() -> 3.1415
Here, the method does not have any parameters. Hence, the left side of the operator includes an empty parameter. The right side is the lambda body that specifies the action of the lambda expression. In this case, it returns the value 3.1415.

Types of Lambda Body
In Java, the lambda body is of two types.

1. A body with a single expression

() -> System.out.println("Lambdas are great");
This type of lambda body is known as the expression body.

2. A body that consists of a block of code.

() -> {
    double pi = 3.1415;
    return pi;
};
This type of the lambda body is known as a block body. The block body allows the lambda body to include multiple statements. These statements are enclosed inside the braces and you have to add a semi-colon after the braces.

Note: For the block body, you can have a return statement if the body returns a value. However, the expression body does not require a return statement.

Example 3: Lambda Expression

Let's write a Java program that returns the value of Pi using the lambda expression.

As mentioned earlier, a lambda expression is not executed on its own. Rather, it forms the implementation of the abstract method defined by the functional interface.

So, we need to define a functional interface first.

import java.lang.FunctionalInterface;

// this is functional interface
@FunctionalInterface
interface MyInterface{

    // abstract method
    double getPiValue();
}

public class Main {

    public static void main( String[] args ) {

    // declare a reference to MyInterface
    MyInterface ref;
    
    // lambda expression
    ref = () -> 3.1415;
    
    System.out.println("Value of Pi = " + ref.getPiValue());
    } 
}
Run Code
Output:

Value of Pi = 3.1415
In the above example,

We have created a functional interface named MyInterface. It contains a single abstract method named getPiValue()
Inside the Main class, we have declared a reference to MyInterface. Note that we can declare a reference of an interface but we cannot instantiate an interface. That is,
 
// it will throw an error
MyInterface ref = new myInterface();

// it is valid
MyInterface ref;
We then assigned a lambda expression to the reference.
ref = () -> 3.1415;
Finally, we call the method getPiValue() using the reference interface. When
 
System.out.println("Value of Pi = " + ref.getPiValue());
Lambda Expressions with parameters
Till now we have created lambda expressions without any parameters. However, similar to methods, lambda expressions can also have parameters. For example,

(n) -> (n%2)==0
Here, the variable n inside the parenthesis is a parameter passed to the lambda expression. The lambda body takes the parameter and checks if it is even or odd.

Example 4: Using lambda expression with parameters
@FunctionalInterface
interface MyInterface {

    // abstract method
    String reverse(String n);
}

public class Main {

    public static void main( String[] args ) {

        // declare a reference to MyInterface
        // assign a lambda expression to the reference
        MyInterface ref = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };

        // call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }

}
Run Code
Output:

Lambda reversed = adbmaL
Generic Functional Interface
Till now we have used the functional interface that accepts only one type of value. For example,

@FunctionalInterface
interface MyInterface {
    String reverseString(String n);
}
The above functional interface only accepts String and returns String. However, we can make the functional interface generic, so that any data type is accepted. If you are not sure about generics, visit Java Generics.

Example 5: Generic Functional Interface and Lambda Expressions
// GenericInterface.java
@FunctionalInterface
interface GenericInterface<T> {

    // generic method
    T func(T t);
}

// GenericLambda.java
public class Main {

    public static void main( String[] args ) {

        // declare a reference to GenericInterface
        // the GenericInterface operates on String data
        // assign a lambda expression to it
        GenericInterface<String> reverse = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed = " + reverse.func("Lambda"));

        // declare another reference to GenericInterface
        // the GenericInterface operates on Integer data
        // assign a lambda expression to it
        GenericInterface<Integer> factorial = (n) -> {

            int result = 1;
            for (int i = 1; i <= n; i++)
            result = i * result;
            return result;
        };

        System.out.println("factorial of 5 = " + factorial.func(5));
    }
}
Run Code
Output:

Lambda reversed = adbmaL
factorial of 5 = 120
In the above example, we have created a generic functional interface named GenericInterface. It contains a generic method named func().

Here, inside the Main class,

GenericInterface<String> reverse - creates a reference to the interface. The interface now operates on String type of data.
GenericInterface<Integer> factorial - creates a reference to the interface. The interface, in this case, operates on the Integer type of data.
Lambda Expression and Stream API
The new java.util.stream package has been added to JDK8 which allows java developers to perform operations like search, filter, map, reduce, or manipulate collections like Lists.

For example, we have a stream of data (in our case a List of String) where each string is a combination of country name and place of the country. Now, we can process this stream of data and retrieve only the places from Nepal.

For this, we can perform bulk operations in the stream by the combination of Stream API and Lambda expression.

Example 6: Demonstration of using lambdas with the Stream API
import java.util.ArrayList;
import java.util.List;

public class StreamMain {

    // create an object of list using ArrayList
    static List<String> places = new ArrayList<>();

    // preparing our data
    public static List getPlaces(){

        // add places and country to the list
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main( String[] args ) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");
        
        // Filter places from Nepal
        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
    }

}
Run Code
Output:

Places from Nepal:
NEPAL, KATHMANDU
NEPAL, POKHARA
In the above example, notice the statement,

myPlaces.stream()
        .filter((p) -> p.startsWith("Nepal"))
        .map((p) -> p.toUpperCase())
        .sorted()
        .forEach((p) -> System.out.println(p));
Here, we are using the methods like filter(), map() and forEach() of the Stream API. These methods can take a lambda expression as input.

We can also define our own expressions based on the syntax we learned above. This allows us to reduce the lines of code drastically as we saw in the above example.









Java Generics
In this tutorial, we will learn about Java Generics, how to create generics class and methods and its advantages with the help of examples.

The Java Generics allows us to create a single class, interface, and method that can be used with different types of data (objects).

This helps us to reuse our code.

Note: Generics does not work with primitive types (int, float, char, etc).

Java Generics Class
We can create a class that can be used with any type of data. Such a class is known as Generics Class.

Here's is how we can create a generics class in Java:

Example: Create a Generics Class
class Main {
  public static void main(String[] args) {

    // initialize generic class
    // with Integer data
    GenericsClass<Integer> intObj = new GenericsClass<>(5);
    System.out.println("Generic Class returns: " + intObj.getData());

    // initialize generic class
    // with String data
    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
    System.out.println("Generic Class returns: " + stringObj.getData());
  }
}

// create a generics class
class GenericsClass<T> {

  // variable of T type
  private T data;

  public GenericsClass(T data) {
    this.data = data;
  }

  // method that return T type variable
  public T getData() {
    return this.data;
  }
}
Run Code
Output

Generic Class returns: 5
Generic Class returns: Java Programming
In the above example, we have created a generic class named GenericsClass. This class can be used to work with any type of data.

class GenericsClass<T> {...}
Here, T used inside the angle bracket <> indicates the type parameter. Inside the Main class, we have created two objects of GenericsClass

intObj - Here, the type parameter T is replaced by Integer. Now, the GenericsClass works with integer data.
stringObj - Here, the type parameter T is replaced by String. Now, the GenericsClass works with string data.
Java Generics Method
Similar to the generics class, we can also create a method that can be used with any type of data. Such a class is known as Generics Method.

Here's is how we can create a generics class in Java:

Example: Create a Generics Method
class Main {
  public static void main(String[] args) {

    // initialize the class with Integer data
    DemoClass demo = new DemoClass();

    // generics method working with String
    demo.<String>genericsMethod("Java Programming");

    // generics method working with integer
    demo.<Integer>genericsMethod(25);
  }
}

class DemoClass {

  // creae a generics method
  public <T> void genericsMethod(T data) {
    System.out.println("Generics Method:");
    System.out.println("Data Passed: " + data);
  }
}
Run Code
Output

Generics Method:
Data Passed: Java Programming
Generics Method:
Data Passed: 25
In the above example, we have created a generic method named genericsMethod.

public <T> void genericMethod(T data) {...}
Here, the type parameter <T> is inserted after the modifier public and before the return type void.

We can call the generics method by placing the actual type <String> and <Integer> inside the bracket before the method name.

demo.<String>genericMethod("Java Programming");

demo.<Integer>genericMethod(25);
Note: We can call the generics method without including the type parameter. For example,

demo.genericsMethod("Java Programming");
In this case, the compiler can match the type parameter based on the value passed to the method.

Bounded Types
In general, the type parameter can accept any data types (except primitive types).


However, if we want to use generics for some specific types (such as accept data of number types) only, then we can use bounded types.

In the case of bound types, we use the extends keyword. For example,

<T extends A>
This means T can only accept data that are subtypes of A.

Example: Bounded Types
class GenericsClass <T extends Number> {

  public void display() {
    System.out.println("This is a bounded type generics class.");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of GenericsClass
    GenericsClass<String> obj = new GenericsClass<>();
  }
}
Run Code
In the above example, we have created a class named GenericsClass. Notice the expression, notice the expression

<T extends Number> 
Here, GenericsClass is created with bounded type. This means GenericsClass can only work with data types that are children of Number (Integer, Double, and so on).

However, we have created an object of the generics class with String. In this case, we will get the following error.

GenericsClass<String> obj = new GenericsClass<>();
                                                 ^
    reason: inference variable T has incompatible bounds
      equality constraints: String
      lower bounds: Number
  where T is a type-variable:
    T extends Number declared in class GenericsClass
Advantages of Java Generics
1. Code Reusability
With the help of generics in Java, we can write code that will work with different types of data. For example,

public <T> void genericsMethod(T data) {...}
Here, we have created a generics method. This same method can be used to perform operations on integer data, string data, and so on.

2. Compile-time Type Checking
The type parameter of generics provides information about the type of data used in the generics code. For example,

// using Generics
GenericsClass<Integer> list = new GenericsClass<>();
Here, we know that GenericsClass is working with Integer data only.

Now, if we try to pass data other than Integer to this class, the program will generate an error at compile time.

3. Used with Collections
The collections framework uses the concept of generics in Java. For example,

// creating a string type ArrayList
ArrayList<String> list1 = new ArrayList<>();

// creating a integer type ArrayList
ArrayList<Integer> list2 = new ArrayList<>();
In the above example, we have used the same ArrayList class to work with different types of data.

Similar to ArrayList, other collections (LinkedList, Queue, Maps, and so on) are also generic in Java.





Java File Class
In this tutorial, we will learn about Java File and its various operations with the help of examples.

The File class of the java.io package is used to perform various operations on files and directories.

There is another package named java.nio that can be used to work with files. However, in this tutorial, we will focus on the java.io package.

File and Directory
A file is a named location that can be used to store related information. For example,

main.java is a Java file that contains information about the Java program.

A directory is a collection of files and subdirectories. A directory inside a directory is known as subdirectory.

Create a Java File Object
To create an object of File, we need to import the java.io.File package first. Once we import the package, here is how we can create objects of file.

// creates an object of File using the path 
File file = new File(String pathName);
Here, we have created a file object named file. The object can be used to work with files and directories.

Note: In Java, creating a file object does not mean creating a file. Instead, a file object is an abstract representation of the file or directory pathname (specified in the parenthesis).

Java File Operation Methods
Operation	Method	Package
To create file	createNewFile()	java.io.File
To read file	read()	java.io.FileReader
To write file	write()	java.io.FileWriter
To delete file	delete()	java.io.File
Java create files
To create a new file, we can use the createNewFile() method. It returns

true if a new file is created.
false if the file already exists in the specified location.
Example: Create a new File
// importing the File class
import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
In the above example, we have created a file object named file. The file object is linked with the specified file path.

File file = new File("newFile.txt");
Here, we have used the file object to create the new file with the specified path.

If newFile.txt doesn't exist in the current location, the file is created and this message is shown.

The new file is created.
However, if newFile.txt already exists, we will see this message.

The file already exists.
Java read files
To read data from the file, we can use subclasses of either InputStream or Reader.

Example: Read a file using FileReader
Suppose we have a file named input.txt with the following content.

This is a line of text inside the file. 
Now let's try to read the file using Java FileReader.

// importing the FileReader class
import java.io.FileReader;

class Main {
  public static void main(String[] args) {

    char[] array = new char[100];
    try {
      // Creates a reader using the FileReader
      FileReader input = new FileReader("input.txt");

      // Reads characters
      input.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);

      // Closes the reader
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}

Output

Data in the file:
This is a line of text inside the file.
In the above example, we have used created an object of FileReader named input. It is now linked with the input.txt file.

FileReader input = new FileReader("input.txt");
To read the data from the input.txt file, we have used the read() method of FileReader.

Java write to files
To write data to the file, we can use subclasses of either OutputStream or Writer.

Example: Write to file using FileWriter
// importing the FileWriter class
import java.io.FileWriter;

 class Main {
   public static void main(String args[]) {

     String data = "This is the data in the output file";
     try {
       // Creates a Writer using FileWriter
       FileWriter output = new FileWriter("output.txt");

       // Writes string to the file
       output.write(data);
       System.out.println("Data is written to the file.");

       // Closes the writer
       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
}
Output

Data is written to the file.
In the above example, we have created a writer using the FileWriter class. The writer is linked with the output.txt file.

FileWriter output = new FileWriter("output.txt");
To write data to the file, we have used the write() method.

Here when we run the program, the output.txt file is filled with the following content.

This is the data in the output file.
Java delete files
We can use the delete() method of the File class to delete the specified file or directory. It returns

true if the file is deleted.
false if the file does not exist.
Note: We can only delete empty directories.

Example: Delete a file
import java.io.File;

class Main {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("file.txt");

    // deletes the file
    boolean value = file.delete();
    if(value) {
      System.out.println("The File is deleted.");
    }
    else {
      System.out.println("The File is not deleted.");
    }
  }
}
Output

The File is deleted.
In the above example, we have created an object of File named file. The file now holds the information about the specified file.

File file = new File("file.txt");
Here we have used the delete() method to delete the file specified by the object.

Related Examples

Java create directory
Java rename file
Java list files in a directory
Java copy files












Java Wrapper Class
In this tutorial, we will learn about the Java Wrapper class with the help of examples.

The wrapper classes in Java are used to convert primitive types (int, char, float, etc) into corresponding objects.

Each of the 8 primitive types has corresponding wrapper classes.

Primitive Type	Wrapper Class
byte	Byte
boolean	Boolean
char	Character
double	Double
float	Float
int	Integer
long	Long
short	Short
Convert Primitive Type to Wrapper Objects
We can also use the valueOf() method to convert primitive types into corresponding objects.

Example 1: Primitive Types to Wrapper Objects
class Main {
  public static void main(String[] args) {

    // create primitive types
    int a = 5;
    double b = 5.65;

    //converts into wrapper objects
    Integer aObj = Integer.valueOf(a);
    Double bObj = Double.valueOf(b);

    if(aObj instanceof Integer) {
      System.out.println("An object of Integer is created.");
    }

    if(bObj instanceof Double) {
      System.out.println("An object of Double is created.");
    }
  }
}
Run Code
Output

An object of Integer is created.
An object of Double is created.
In the above example, we have used the valueOf() method to convert the primitive types into objects.

Here, we have used the instanceof operator to check whether the generated objects are of Integer or Double type or not.

However, the Java compiler can directly convert the primitive types into corresponding objects. For example,

int a = 5;
// converts into object
Integer aObj = a;

double b = 5.6;
// converts into object
Double bObj = b;

This process is known as auto-boxing. To learn more, visit Java autoboxing and unboxing.

Note: We can also convert primitive types into wrapper objects using Wrapper class constructors. But the use of constructors is discarded after Java 9.

Wrapper Objects into Primitive Types
To convert objects into the primitive types, we can use the corresponding value methods (intValue(), doubleValue(), etc) present in each wrapper class.

Example 2: Wrapper Objects into Primitive Types
class Main {
  public static void main(String[] args) {

    // creates objects of wrapper class
    Integer aObj = Integer.valueOf(23);
    Double bObj = Double.valueOf(5.55);

    // converts into primitive types
    int a = aObj.intValue();
    double b = bObj.doubleValue();

    System.out.println("The value of a: " + a);
    System.out.println("The value of b: " + b);
  }
}
Run Code
Output

The value of a: 23
The value of b: 5.55
In the above example, we have used the intValue() and doubleValue() method to convert the Integer and Double objects into corresponding primitive types.

However, the Java compiler can automatically convert objects into corresponding primitive types. For example,

Integer aObj = Integer.valueOf(2);
// converts into int type
int a = aObj;

Double bObj = Double.valueOf(5.55);
// converts into double type
double b = bObj;
This process is known as unboxing. To learn more, visit Java autoboxing and unboxing.

Advantages of Wrapper Classes
In Java, sometimes we might need to use objects instead of primitive data types. For example, while working with collections.
// error
ArrayList<int> list = new ArrayList<>();

// runs perfectly
ArrayList<Integer> list = new ArrayList<>();
In such cases, wrapper classes help us to use primitive data types as objects.
We can store the null value in wrapper objects. For example,

// generates an error
int a = null;

// runs perfectly
Integer a = null;
Note: Primitive types are more efficient than corresponding objects. Hence, when efficiency is the requirement, it is always recommended primitive types.















Java Wrapper Class
In this tutorial, we will learn about the Java Wrapper class with the help of examples.

The wrapper classes in Java are used to convert primitive types (int, char, float, etc) into corresponding objects.

Each of the 8 primitive types has corresponding wrapper classes.

Primitive Type	Wrapper Class
byte	Byte
boolean	Boolean
char	Character
double	Double
float	Float
int	Integer
long	Long
short	Short
Convert Primitive Type to Wrapper Objects
We can also use the valueOf() method to convert primitive types into corresponding objects.

Example 1: Primitive Types to Wrapper Objects
class Main {
  public static void main(String[] args) {

    // create primitive types
    int a = 5;
    double b = 5.65;

    //converts into wrapper objects
    Integer aObj = Integer.valueOf(a);
    Double bObj = Double.valueOf(b);

    if(aObj instanceof Integer) {
      System.out.println("An object of Integer is created.");
    }

    if(bObj instanceof Double) {
      System.out.println("An object of Double is created.");
    }
  }
}
Run Code
Output

An object of Integer is created.
An object of Double is created.
In the above example, we have used the valueOf() method to convert the primitive types into objects.

Here, we have used the instanceof operator to check whether the generated objects are of Integer or Double type or not.

However, the Java compiler can directly convert the primitive types into corresponding objects. For example,

int a = 5;
// converts into object
Integer aObj = a;

double b = 5.6;
// converts into object
Double bObj = b;

This process is known as auto-boxing. To learn more, visit Java autoboxing and unboxing.

Note: We can also convert primitive types into wrapper objects using Wrapper class constructors. But the use of constructors is discarded after Java 9.

Wrapper Objects into Primitive Types
To convert objects into the primitive types, we can use the corresponding value methods (intValue(), doubleValue(), etc) present in each wrapper class.

Example 2: Wrapper Objects into Primitive Types
class Main {
  public static void main(String[] args) {

    // creates objects of wrapper class
    Integer aObj = Integer.valueOf(23);
    Double bObj = Double.valueOf(5.55);

    // converts into primitive types
    int a = aObj.intValue();
    double b = bObj.doubleValue();

    System.out.println("The value of a: " + a);
    System.out.println("The value of b: " + b);
  }
}
Run Code
Output

The value of a: 23
The value of b: 5.55
In the above example, we have used the intValue() and doubleValue() method to convert the Integer and Double objects into corresponding primitive types.

However, the Java compiler can automatically convert objects into corresponding primitive types. For example,

Integer aObj = Integer.valueOf(2);
// converts into int type
int a = aObj;

Double bObj = Double.valueOf(5.55);
// converts into double type
double b = bObj;
This process is known as unboxing. To learn more, visit Java autoboxing and unboxing.

Advantages of Wrapper Classes
In Java, sometimes we might need to use objects instead of primitive data types. For example, while working with collections.
// error
ArrayList<int> list = new ArrayList<>();

// runs perfectly
ArrayList<Integer> list = new ArrayList<>();
In such cases, wrapper classes help us to use primitive data types as objects.
We can store the null value in wrapper objects. For example,

// generates an error
int a = null;

// runs perfectly
Integer a = null;
Note: Primitive types are more efficient than corresponding objects. Hence, when efficiency is the requirement, it is always recommended primitive types.



*/