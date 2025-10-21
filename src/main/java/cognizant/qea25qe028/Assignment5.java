package cognizant.qea25qe028;

public class Assignment5 {

    // Static variable to count number of objects created
    static int objectCount = 0;

    // Constructor to increment object count
    public Assignment5() {
        objectCount++;
        System.out.println("Object created. Total objects: " + objectCount);
    }

    // 1. Method Overloading with only return type difference – ❌ Not Allowed
    // Uncommenting below will cause compile-time error
    /*
    int test() {
        return 1;
    }

    double test() {
        return 2.0;
    }
    */

    // 2. Final methods can be overloaded – ✅ Allowed
    final void show() {
        System.out.println("Final method with no parameters");
    }

    void show(String msg) {
        System.out.println("Overloaded final method: " + msg);
    }

    // 3. Static methods can be overloaded – ✅ Allowed
    static void display() {
        System.out.println("Static method with no parameters");
    }

    static void display(int x) {
        System.out.println("Overloaded static method with int: " + x);
    }

    // 4. Final methods cannot be overridden – ❌ Not Allowed
    final void cannotOverride() {
        System.out.println("Final method - cannot be overridden");
    }

    // 5. Static methods cannot be overridden – ❌ Not Allowed (they are hidden)
    static void staticMethod() {
        System.out.println("Static method in MainConcepts");
    }

    // 6. Overloading main method – ✅ Allowed
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Object creation to test object counter
        Assignment5 obj1 = new Assignment5();
        Assignment5 obj2 = new Assignment5();

        // Final method overloading
        obj1.show();
        obj1.show("Hello");

        // Static method overloading
        display();
        display(10);

        // Static method hiding demonstration
        SubClass.staticMethod();

        // Overloaded main method
        main(100);
    }

    public static void main(int x) {
        System.out.println("Overloaded main method with int: " + x);
    }
}

// Subclass to demonstrate static method hiding and final method restriction
class SubClass extends Assignment5 {
    // This hides the static method from parent
    static void staticMethod() {
        System.out.println("Static method in SubClass (hides parent method)");
    }

    // Uncommenting below will cause error: final method cannot be overridden
    /*
    void cannotOverride() {
        System.out.println("Trying to override final method");
    }
    */
}




