package basicsofjava;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Sky is 421";
char c1[]=name.toCharArray();
int count_of_alpha=0;
int count_of_numeric=0;
int count_of_Space=0;

for(int i=0;i<=name.length()-1;i++)
{
boolean answer = Character.isAlphabetic(c1[i]);
boolean answer1 = Character.isDigit(c1[i]);
boolean answer2 = Character.isSpaceChar(c1[i]);

if(answer==true)
{
	count_of_alpha++;
}
if(answer1==true)
{
	count_of_numeric++;
	
}
if(answer2==true)
{
	count_of_Space++;
	
}


}
System.out.println("Count of Alpha is ="+count_of_alpha);
System.out.println("Count of numeric is ="+count_of_numeric);
System.out.println("Count of Space is ="+count_of_Space);
}
}