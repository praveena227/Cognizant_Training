package cognizant.qea25qe028;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String args[]) {
		 //QUESTION 1 Write a simple Java program?
		   System.out.println("Hello, World");
		   
		   //QUESTION 2 Write a Java program to print an integer value?
		   int a=5;
		   System.out.println(a);
		   
		   //QUESTION 3 Write a Java program to print the command line arguments?
		  
			        for (String arg : args) {
			            System.out.println(arg);
			        }
			    

	        
	        //QUESTION 4 Write a Java program to print the input from scanner?
			        
			                Scanner scanner = new Scanner(System.in);
			                System.out.print("Enter something: ");
			                String input = scanner.nextLine();
			                System.out.println("You entered: " + input);
			                scanner.close();
			            }
			        }

	