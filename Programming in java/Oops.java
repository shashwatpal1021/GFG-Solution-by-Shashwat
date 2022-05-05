public 

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

Let's' see what has happened here,

JVM takes the first string "Hello! "
creates a new string by adding "World" to the first string
assign the new string "Hello! World" to the example variable
the first string "Hello!""remains unchanged
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
Now that we know how strings are created using string literals and the new keyword, let's' see what is the major difference between them.

In Java, the JVM maintains a string pool to store all of its strings inside the memory. The string pool helps in reusing the strings.

###### 1. While creating strings using string literals,

String example = "Java";
Here, we are directly providing the value of the string (Java). Hence, the compiler first checks the string pool to see if the string already exists.

If the string already exists, the new string is not created. Instead, the new reference, example points to the already existed string (Java).
If the string doesn't' exist, the new string (Java is created.
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

First, let's' see an example without using this keyword:

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

Now, let's' rewrite the above code using this keyword.

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

Here, we use a different form of this keyword. That is, this(). Let's' take an example,

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
A method that doesn't' have its body is known as an abstract method. We use the same abstract keyword to create abstract methods. For example,

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

Now that we know what interfaces are, let's' learn about why interfaces are used in Java.

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
Let's' take a scenario to understand why default methods are introduced in Java.

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
Let's' see a more practical example of Java Interface.

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

Note: In languages like C++, we can define operators to work differently for different operands. However, Java doesn't' support user-defined operator overloading.

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

class Oops {
    
}
