package cognizant.qea25qe028;
import java.util.Scanner;

public class  Assignment6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        forLoopDemo();
        starPattern();
        whileLoopDemo();
        reverseNumber();
        breakInWhileLoop();
        printAlphabets();
        breakContinueInWhileLoop();
        forEachLoopDemo();
        floydsTriangle();
        pascalsTriangle();
        fibonacciSeries();
        multiplicationTable();
        factorial();
        primeNumbers();
        floydsTriangle(); // repeated
        pascalsTriangle(); // repeated
        powerUsingWhile();
        perfectNumber();
        fibonacciFrom1To10();
        greatestOfThree();
        largestTwoInArray();
    }
   //Question 1. Write a Java program to demonstrate for loop?
    static void forLoopDemo() {
        System.out.println("For Loop Demo:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
 //Question 2.  Write a Java program to print stars using for loop, where the number of stars printed should be   equal to the row number?
    static void starPattern() {
        System.out.println("\nStar Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
  //Question 3. Write a Java program to demonstrate while loop?
    static void whileLoopDemo() {
               int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }
    }
//Question 4. Write a Java program to print the entered number in reverse?
    static void reverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number to reverse: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
//Question 5. Write a Java program to demonstrate the usage of break statement inside while loop?
    static void breakInWhileLoop() {
        System.out.println("\nBreak in While Loop:");
        int i = 1;
        while (true) {
            if (i == 4) break;
            System.out.println("i = " + i);
            i++;
        }
    }
//Question 6. Write a Java program to print the alphabets using for loop?
    static void printAlphabets() {
        System.out.println("\nAlphabets:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
//Question 7. Write a Java program to demonstrate the usage of break and continue statements inside   while   loop?
    static void breakContinueInWhileLoop() {
        System.out.println("\nBreak and Continue in While Loop:");
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) continue;
            if (i == 8) break;
            System.out.println("i = " + i);
        }
    }
//Question 8. Write a Java program to demonstrate for each loop?
    static void forEachLoopDemo() {
        System.out.println("\nFor Each Loop Demo:");
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }
    }
//Question 9. Write a Java program to print Floyd’s triangle?
    static void floydsTriangle() {
        System.out.println("\nFloyd’s Triangle:");
        int n = 5, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
// Question 10. Write a Java program to print Pascal’s triangle?
    static void pascalsTriangle() {
        System.out.println("\nPascal’s Triangle:");
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.print(" ".repeat((rows - i) * 2));
            for(int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
//Question 11. Write a Java program to print the Fibonacci series?
    static void fibonacciSeries() {
        System.out.println("\nFibonacci Series:");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(); // for clean output
    }

//Question 12. Write a Java program for printing the Multiplication table?
    static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number for multiplication table: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
//Question 13. Write a Java program to find the factorial of a number?
    static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number for factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
    //Question 14. Write a Java program to print the prime numbers up to a given number?
    static void primeNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter limit to print prime numbers: ");
        int limit = sc.nextInt();
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println();
    }
    //Question 15. Write a Java program to calculate the power of a number using a while loop
    static void powerUsingWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter base and exponent: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();
        int result = 1;
        while (exp != 0) {
            result *= base;
            exp--;
        }
        System.out.println("Power: " + result);
    }
//Question 16. Write a Java program to verify whether a number is a perfect number or not
    static void perfectNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number to check perfect number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        if (sum == num) System.out.println(num + " is a Perfect Number");
        else System.out.println(num + " is not a Perfect Number");
    }
   // Question 17. Write a Java program for printing the Fibonacci series from 1 to 10
    static void fibonacciFrom1To10() {
        System.out.println("\nFibonacci Series from 1 to 10:");
        int a = 0, b = 1;
        while (b <= 10) {
            System.out.print(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
//Question 18. Write a Java program to find the greatest of three numbers
    static void greatestOfThree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Greatest: " + max);
    }
// Question 19. Find and print the largest two numbers from an array of given numbers
    static void largestTwoInArray() {
        int[] arr = {12, 45, 67, 23, 89, 34};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("\nLargest: " + first + ", Second Largest: " + second);
    }
}
