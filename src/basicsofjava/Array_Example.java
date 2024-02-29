package basicsofjava;

import java.util.Arrays;

public class Array_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age[]= new int[3];
age[0]=27;
age[1]=65;
age[2]=52;
Arrays.sort(age); // ascending order we use it
for(int i=0;i<=2;i++)
{
	System.out.println(age[i]);
}
	}

}
