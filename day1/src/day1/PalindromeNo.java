package day1;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("check number is palindrome or not :");
		System.out.println("Enter number :");
		
		int no = sc.nextInt();
		
		if(isPalindrome(no))
			System.out.println(no+" is Palindrome number");
		else
			System.out.println(no+" is Palindrome not a number");
			
	}
	
	static boolean isPalindrome(int no) {
		
		int temp =no;
		int rem, sum = 0;
			
		while(temp >0) {
			
			rem = temp % 10;
			sum = sum * 10 + rem;
			
			temp/=10; // temp = temp / 10;
		}
		
		if(sum == no)
			return true;
		else
			return false;
		
	}

}
