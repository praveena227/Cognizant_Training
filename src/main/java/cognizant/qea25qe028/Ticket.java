package cognizant.qea25qe028;
import java.util.*;
public class Ticket {
	String custName;
	int price;
	public String getCustName() {
		return custName;
	}
	public int getPrice() {
		return price;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Ticket(String custName,int price){
		this.custName = custName;
		this.price = price;
	}

}
