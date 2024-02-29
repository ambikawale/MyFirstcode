package Arrays;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
int age[]=new int[3];
age[0]=25;
age[1]=58;
age[2]=42;
Arrays.sort(age);
for(int i=0;i<=2;i++)
{
System.out.println(age[i]);
}
	}
}
