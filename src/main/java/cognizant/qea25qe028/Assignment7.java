package cognizant.qea25qe028;

//Base class for inheritance and method overriding
class Animal {
 String type = "Generic Animal";

 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Derived class demonstrating inheritance and method overriding
class Dog extends Animal {
 String type = "Dog";

 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }

 void showType() {
     System.out.println("Child type: " + type);
     System.out.println("Parent type using super: " + super.type);
 }
}

public class Assignment7  {

 // Method Overloading
 void greet() {
     System.out.println("Hello!");
 }

 void greet(String name) {
     System.out.println("Hello, " + name + "!");
 }

 void greet(String name, int times) {
     for (int i = 0; i < times; i++) {
         System.out.println("Hello, " + name + "!");
     }
 }

 public static void main(String[] args) {
	 Assignment7  obj = new Assignment7 ();

	// Question 1.Write a Java program to demonstrate method   overloading?
     System.out.println("=== Method Overloading ===");
     obj.greet();
     obj.greet("Praveena");
     obj.greet("Praveena", 3);

  // Question 2. Write a Java program to demonstrate method   overriding?
     System.out.println("\n=== Method Overriding ===");
     Animal a = new Animal();
     Animal d = new Dog(); // Polymorphism
     a.makeSound();
     d.makeSound();

  // Question 3. Write a Java program to demonstrate inheritance?
  // Question 4. Write a Java program to demonstrate the use of the   ‘super’ keyword?
     System.out.println("\n=== Inheritance and super keyword ===");
     Dog dog = new Dog();
     dog.showType();
 }
}
