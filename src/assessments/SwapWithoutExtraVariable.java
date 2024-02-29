package assessments;

import java.util.Scanner;

public class SwapWithoutExtraVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter First number :");
		   int num1=sc.nextInt();
		   System.out.println("Enter Second number :");
		   int num2=sc.nextInt();
		   num1=num1-num2;
		   num2=num1+num2;
		   num1=num2-num1;
		   System.out.println("After swapping values are :");
		   System.out.println("First number = "+num1);
		   System.out.println("Second number ="+num2);
			}
	}


