package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	int num1 = 0;
	System.out.println(num1);
	int num2 = 1;
	System.out.println(num2);
	int sum = 0;
	for (int num = 0; num < 20; num++) {
		
		sum = num1 + num2;
		System.out.println(sum);
		num1 = num2;
		num2 = sum;
	}
}
}
