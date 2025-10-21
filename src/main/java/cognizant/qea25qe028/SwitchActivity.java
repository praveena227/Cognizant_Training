package cognizant.qea25qe028;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class SwitchActivity
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	String DayOfWeek= sc.nextLine();
    	switch(DayOfWeek) {
    	case "sunday":
    		System.out.println("Holiday");
    		break;
    	case "monday":
    		System.out.println("Work day");
    		break;
    	case "tuesday":
    		System.out.println("Laundry Day");
    		break;
    	case "wednesday":
    		System.out.println("Cooking class");
    		break;
    	case "thursday":
    		System.out.println("Skill Oriented");
    		break;
    	case "friday":
    		System.out.println("Picnic");
    		break;
    	case "saturday":
    		System.out.println("Family");
    		break;
    	}
    	sc.close();
    }
}