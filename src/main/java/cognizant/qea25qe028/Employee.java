package cognizant.qea25qe028;

public class Employee {
	String name;
	int age;
	double salary;
	public Employee(String name, int age, double salary ) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return name + ": Age -"+age+" Salary - "+ salary;
	}

/*@Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);

	}*/

}
