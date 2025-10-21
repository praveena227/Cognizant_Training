package cognizant.qea25qe028;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //scanner
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println( "My name is "+name+"\nage is "+age);
        scanner.close();
    }
}
