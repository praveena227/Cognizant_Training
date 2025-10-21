package cognizant.qea25qe028;
import java.util.Scanner;

public class Assignment3 {

    //Question 1. Write a Java program to convert from Fahrenheit to Celsius?
    static void convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);
    }

    // Question 2. Write a Java program to swap two numbers?
    static void swapWithTemp(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // Question 3. Write a Java program to swap two numbers without using   a third variable?
    static void swapWithoutTemp(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // Question 4.Write a Java program to add two numbers?
    static void addNumbers(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Question 5. Write a Java program to find the GCD of two numbers?
    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Question 6. Write a Java program to find the LCM of two numbers?
    static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // Question 7. Write a Java program to print the sum of digits of a   number?
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        convertFahrenheitToCelsius(fahrenheit);

        // Swap using third variable
        System.out.print("\nEnter two numbers to swap (with temp): ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        swapWithTemp(a1, b1);

        // Swap without third variable
        System.out.print("\nEnter two numbers to swap (without temp): ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        swapWithoutTemp(a2, b2);

        // Add two numbers
        System.out.print("\nEnter two numbers to add: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        addNumbers(num1, num2);

        // GCD
        System.out.print("\nEnter two numbers to find GCD: ");
        int gcdA = sc.nextInt();
        int gcdB = sc.nextInt();
        System.out.println("GCD: " + findGCD(gcdA, gcdB));

        // LCM
        System.out.print("\nEnter two numbers to find LCM: ");
        int lcmA = sc.nextInt();
        int lcmB = sc.nextInt();
        System.out.println("LCM: " + findLCM(lcmA, lcmB));

        // Sum of digits
        System.out.print("\nEnter a number to find sum of digits: ");
        int digitNum = sc.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(digitNum));

        sc.close();
    }
}
