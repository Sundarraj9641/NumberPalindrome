package number.palindrome;

import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rev = 0;
		
		int num1 = num;
		
		while(num != 0)   
		{  
		int rem = num % 10;  
		rev = rev * 10 + rem;  
		num = num/10;  
		}  
		if(num1 == rev){
			System.out.println("Palindrome"); 
		} else {
			System.out.println("Not Palindrome"); 
		}
		 
		
		sc.close();
	}

}
