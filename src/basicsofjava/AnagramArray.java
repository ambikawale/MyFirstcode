package basicsofjava;

import java.util.Arrays;

public class AnagramArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1 ="night";
String name2="thing";
if(name1.length()!=name2.length())
{
	System.out.println("Sorry given string are not Anagram");
}
else
{
	char n1[]=name1.toCharArray();
	char n2[]=name2.toCharArray();
	System.out.println("Arrays before sort :");
	System.out.println(Arrays.toString(n1));
	System.out.println(Arrays.toString(n2));
	Arrays.sort(n1);
	Arrays.sort(n2);
	System.out.println("Arrays after sort :");
	System.out.println(Arrays.toString(n1));
	System.out.println(Arrays.toString(n2));
	boolean answer = Arrays.equals(n1, n2);
	System.out.println(answer);
	if(answer==true)
	{
		System.out.println("String is Anangram");
	}
	else
	{
		System.out.println("String is not Anangram");	
	}
	
	
	
}
	}

}
