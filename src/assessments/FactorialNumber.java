package assessments;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String []args)
    {
      
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter the number: ");
       int num=sc.nextInt();
      
       int factorial = 1;
       for(int i=1;i<=5;i++)
       {
    	   factorial=factorial*i;
           i++;
       }
       System.out.println("Factorial of the number: "+factorial);  
    }   
}



