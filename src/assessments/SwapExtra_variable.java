package assessments;

import java.util.Scanner;

public class SwapExtra_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter First number :");
   int num1=sc.nextInt();
   System.out.println("Enter Second number :");
   int num2=sc.nextInt();
   temp=num1;
   num1=num2;
   num2=temp;
   System.out.println("After swapping values are :");
   System.out.println("First number = "+num1);
   System.out.println("Second number ="+num2);
	}

}
