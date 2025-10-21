package cognizant.qea25qe028;
import java.util.Scanner;

public class Assignment4  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1: Write a Java program to demonstrate if…else statement?
        demonstrateIfElse(sc);

        // Question 2. Write a Java program to demonstrate nested if…else if… statement?
        demonstrateNestedIfElseIf(sc);

        // Question 3. Write a Java program to demonstrate nested if…else statement?
        demonstrateNestedIfElse(sc);

        // Question 4. Write a Java program to find odd and even numbers?
        findOddEven(sc);

        // Question 5. Write a Java program for printing the prime numbers?
        printPrimeNumbers(sc);

        // Question 6. Write a Java program to check whether a given number is Armstrong?
        checkArmstrong(sc);

        // Question 7. Write a Java program to check if a number is prime?
        checkPrime(sc);

        // Question 8. Write a Java program to check if a number is a palindrome?
        checkPalindrome(sc);

        //  Question 9. Write a Java program to check if a number is an Armstrong number?
        checkArmstrong(sc);

        sc.close();
    }

    static void demonstrateIfElse(Scanner sc) {
        System.out.print("Enter a number for if...else demo: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("Positive number");
        else
            System.out.println("Non-positive number");
    }

    static void demonstrateNestedIfElseIf(Scanner sc) {
        System.out.print("Enter your marks for grade evaluation: ");
        int marks = sc.nextInt();
        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 75)
            System.out.println("Grade B");
        else if (marks >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Grade F");
    }

    static void demonstrateNestedIfElse(Scanner sc) {
        System.out.print("Enter a number for nested if...else demo: ");
        int num = sc.nextInt();
        if (num >= 0) {
            if (num % 2 == 0)
                System.out.println("Even and non-negative");
            else
                System.out.println("Odd and non-negative");
        } else {
            System.out.println("Negative number");
        }
    }

    static void findOddEven(Scanner sc) {
        System.out.print("Enter a number to check odd/even: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }

    static void printPrimeNumbers(Scanner sc) {
        System.out.print("Enter limit to print prime numbers: ");
        int limit = sc.nextInt();
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    static void checkArmstrong(Scanner sc) {
        System.out.print("Enter a number to check Armstrong: ");
        int num = sc.nextInt();
        int original = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }

    static void checkPrime(Scanner sc) {
        System.out.print("Enter a number to check prime: ");
        int num = sc.nextInt();
        if (isPrime(num))
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }

    static void checkPalindrome(Scanner sc) {
        System.out.print("Enter a number to check palindrome: ");
        int num = sc.nextInt();
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        if (original == reversed)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }
}
