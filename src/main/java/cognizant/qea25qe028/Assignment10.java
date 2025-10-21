package cognizant.qea25qe028;

import java.util.Scanner;
import java.util.*;

//Custom Exception for Question 4
/**/

//Immutable class for Question 6
final class ImmutablePerson {
 private final String name;
 private final int age;

 public ImmutablePerson(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getters only, no setters
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}
public class Assignment10 {

	// Question 1. Write a Java program to demonstrate exception   handling   using try-catch?
 static void demoTryCatch() {
     try {
         int result = 10 / 0;
     } catch (ArithmeticException e) {
         System.out.println("Caught ArithmeticException: " + e.getMessage());
     }
 }

//Question 2.  Write a Java program to demonstrate the use of finally   block?
 static void demoFinallyBlock() {
     try {
         System.out.println("Inside try block");
     } finally {
         System.out.println("Finally block always executes");
     }
 }

//Question 3. Write a Java program to demonstrate the use of throw   and throws?
 static void validateAge(int age) throws Exception {
     if (age < 18) {
         throw new Exception("Age must be 18 or above");
     } else {
         System.out.println("Valid age: " + age);
     }
 }

//Question 4. Write a Java program to demonstrate custom   exceptions?
 static void checkValue(int value) throws CustomException1 {
     if (value < 0) {
         throw new CustomException1("Negative value not allowed");
     } else {
         System.out.println("Value is valid: " + value);
     }
 }

//Question 5. Write a Java program to demonstrate the advantage of   finally in Exception Handling?
 static void demoFinallyAdvantage() {
     Scanner sc = new Scanner(System.in);
     try {
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
         System.out.println("You entered: " + num);
     } catch (Exception e) {
         System.out.println("Invalid input!");
     } finally {
         sc.close(); // Ensures resource is closed
         System.out.println("Scanner closed in finally block.");
     }
 }

//Question 6. How do you write custom class which is immutable?
 static void demoImmutableClass() {
     ImmutablePerson person = new ImmutablePerson("praveena", 25);
     System.out.println("Immutable Person - Name: " + person.getName() + ", Age: " + person.getAge());
 }

 public static void main(String[] args) {
     demoTryCatch();
     demoFinallyBlock();

     try {
         validateAge(17);
     } catch (Exception e) {
         System.out.println("Exception from validateAge: " + e.getMessage());
     }

     try {
         checkValue(-5);
     } catch (CustomException1 e) {
         System.out.println("CustomException caught: " + e.getMessage());
     }

     demoFinallyAdvantage();
     demoImmutableClass();
 }
}
