package basicsofjava;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rollno[]=new int[3];
Scanner s1=new Scanner(System.in);
for(int i=0;i<3;i++)
{
	System.out.println("Enter the values");
	rollno[i]=s1.nextInt();
}
Arrays.sort(rollno);
System.out.println(Arrays.toString(rollno));
	}

}
