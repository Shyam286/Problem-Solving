package day2;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("check number is Armstrong or not :");
		System.out.println("Enter number :");
		
		int no = sc.nextInt();
		
		if(isArmstrong(no))
			System.out.println(no+" is Armstrong number");
		else
			System.out.println(no+" is not Armstrong a number");
		
		
	}

	static boolean isArmstrong(int no) {
		
		int count = 0;
		int temp = no;
		
		//count no of digit
		while(temp > 0) {
			temp = temp /10;
			count++;
		}

		int res = 0;
		int rem;
		temp = no;
		
		
		while(temp > 0){
			 
			rem = temp % 10;		
			res += Math.pow(rem, count);			
			temp = temp / 10;
		}

		return res == no;
	}
}
