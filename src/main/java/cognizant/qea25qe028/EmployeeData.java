package cognizant.qea25qe028;
//import java.util.Arrays;
import java.util.*;
//import java.util.Collections;

public class EmployeeData {
	public static void main(String args[]) {
	
	Employee e1 = new Employee("praveena", 21, 200000.00);
	Employee e2 = new Employee("Gayatri", 22, 300000.00);
	Employee e3 = new Employee("Jeya", 22, 100000.00);
	Set <Employee> list = new TreeSet<>(new SortbySalary());
	
	list.add(e1);
	list.add(e2);
	list.add(e3);
	//Collections.sort(list, new SortbySalary());
	System.out.println(list);
	}
}
