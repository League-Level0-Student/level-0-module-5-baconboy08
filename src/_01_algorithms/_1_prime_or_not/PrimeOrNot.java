package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

public static void main(String[] args) {
	
	int num = 0;
	int divisnums = 0;
			
	for(int i = 0; i < 1; i--){
	
	String input = JOptionPane.showInputDialog("enter a number");
	
	 num = Integer.parseInt(input);
	
	divisnums = 0;
	
	for(int a = num; a > 0; a--) {
		
		if (num % a == 0 && !(a == num) && !(a == 1)) {
			
			divisnums += 1;
			System.out.println("divisible number found: " + a);
		
			
		}
	}
		
		if (divisnums > 0) {
		JOptionPane.showMessageDialog(null,"number divisible by " + divisnums + " number(s). NOT PRIME");
	} else {
		
		JOptionPane.showMessageDialog(null,"number only divisble by 1 and " + num + ". PRIME");
	}
	
	

	
  }
 }
}
