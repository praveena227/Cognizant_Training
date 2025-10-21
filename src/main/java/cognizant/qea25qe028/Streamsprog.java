package cognizant.qea25qe028;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streamsprog {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Ticket> ticket = new ArrayList<>();
		
		System.out.println("Enter no of tickets");
		int n = sc.nextInt();
		sc.nextLine(); 
		System.out.println("Enter ticket details");
		for(int i=0; i<n;i++) {
			String[] tktDet = sc.nextLine().split(" ");
			String tktName = tktDet[0];
			int tktPrice = Integer.parseInt(tktDet[1]);
			ticket.add(new Ticket(tktName,tktPrice));
		}
		List<Ticket> output = new ArrayList<>();
		output = ticket.stream().filter(t -> t.price > 300).sorted(Comparator.comparing(Ticket::getCustName)).collect(Collectors.toList());
		
		for(Ticket t : output) {
			String name = t.custName;
			int pr = t.price;
			System.out.println(name+" "+pr);
		}
		
	}


}
