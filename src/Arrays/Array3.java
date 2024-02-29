package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int age[]=new int[3];
     Scanner s1=new Scanner(System.in);
     for(int i=0;i<=2;i++)
     {
    	 System.out.println("Enter values :");
    	 age[i]= s1.nextInt(); 
     }
     Arrays.sort(age);
     System.out.println(Arrays.toString(age));
	}

}
