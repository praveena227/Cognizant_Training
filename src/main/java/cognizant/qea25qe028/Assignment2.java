package cognizant.qea25qe028;
import java.io.*;
import java.util.Properties;


public class Assignment2 {

	// QUESTION 1 Write a Java program to demonstrate the use of the ‘this’   keyword?
    static class ThisKeywordDemo {
        int x;

        ThisKeywordDemo(int x) {
            this.x = x; // 'this' refers to the current object
        }

        void show() {
            System.out.println("Value of x using 'this': " + this.x);
        }
    }

  //QUESTION 2 Write a Java program to demonstrate the use of   constructors?
    static class ConstructorDemo {
        String message;

        ConstructorDemo() {
            message = "Default Constructor Called";
        }

        ConstructorDemo(String msg) {
            message = msg;
        }

        void display() {
            System.out.println(message);
        }
    }

  //QUESTION 3 Write a Java program to demonstrate the use of abstract   classes?
    static abstract class Animal {
        abstract void sound();
    }

    static class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }

    //QUESTION 4 Write a Java program to demonstrate the use of interfaces?
    interface Vehicle {
        void move();
    }

    static class Car implements Vehicle {
        public void move() {
            System.out.println("Car is moving");
        }
    }

    //QUESTION 5 Write a Java program to demonstrate the use of static   variables and methods?
    static class StaticDemo {
        static int count = 0;

        static void increment() {
            count++;
        }

        static void showCount() {
            System.out.println("Static count: " + count);
        }
    }

  //QUESTION 6 Write a Java program to demonstrate the use of final   keyword?
    static class FinalDemo {
        final int CONSTANT = 100;

        void showConstant() {
            System.out.println("Final constant: " + CONSTANT);
        }
    }

  //QUESTION 7 Write a program to read/write data from a property file.
    static void propertyFileDemo() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("username", "praveena");
        prop.setProperty("password", "12345");

        FileOutputStream out = new FileOutputStream("config.properties");
        prop.store(out, "User Config");
        out.close();

        FileInputStream in = new FileInputStream("config.properties");
        prop.load(in);
        System.out.println("Username from property file: " + prop.getProperty("username"));
        in.close();
    }

  //QUESTION 8 Demonstrate creating the factorial of a number using   recursion.
    static int factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

  //QUESTION 9 Write a program to find the factorial of a given number.
    static int factorialLoop(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

  //QUESTION 10 Write a program to see the output as 0, 1, 1, 2, 3.
    static void fibonacciSequence() {
        int a = 0, b = 1;
        System.out.print(a + ", " + b);
        for (int i = 2; i < 5; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

  //QUESTION 11 Write a Java program to find the biggest number   among 1,2,3,4,5,65,76,5,4,33,4,34,232,3,2323.
	static void findBiggestNumber() {
        int[] nums = {1,2,3,4,5,65,76,5,4,33,4,34,232,3,2323};
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        System.out.println("Biggest number is: " + max);
    }

	//QUESTION 12 Write a Java program to read and write a file.
    static void fileReadWriteDemo() throws IOException {
        String data = "Hello, this is a file write demo.";
        FileWriter writer = new FileWriter("demo.txt");
        writer.write(data);
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("demo.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("Read from file: " + line);
        }
        reader.close();
    }

  //QUESTION 13 Write a Java Program to print the below output
    static void printPattern() {
        System.out.println("Pattern:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("*".repeat(i));
        }
    }

  //QUESTION 14 Write a Java program to print the triangle of numbers.
    static void triangleOfNumbers() {
        System.out.println("Triangle of Numbers:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        new ThisKeywordDemo(10).show();
        new ConstructorDemo().display();
        new ConstructorDemo("Parameterized Constructor Called").display();
        new Dog().sound();
        new Car().move();
        StaticDemo.increment();
        StaticDemo.increment();
        StaticDemo.showCount();
        new FinalDemo().showConstant();
        propertyFileDemo();
        System.out.println("Factorial (Recursion) of 5: " + factorialRecursive(5));
        System.out.println("Factorial (Loop) of 5: " + factorialLoop(5));
        fibonacciSequence();
        findBiggestNumber();
        fileReadWriteDemo();
        printPattern();
        triangleOfNumbers();
    }
}


