package cognizant.qea25qe028;

import java.util.*;
public class CustomException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int amt = sc.nextInt();
		
		try {
			if(amt>1000) {
				throw new InsufficientBalance("Insufficient Balance");
			}
			else {
				System.out.println("withdrawn");
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());		
			}
		
	}

}
