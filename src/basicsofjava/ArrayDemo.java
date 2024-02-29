package basicsofjava;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="ambika123";
int count_of_alpha=0;
int count_of_numeric=0;
char c1[]=name.toCharArray();
for(int i=0;i<=name.length()-1;i++)
{
boolean answer = Character.isAlphabetic(c1[i]);
if(answer==true)
{
	count_of_alpha++;
	
	
}
else
{
	count_of_numeric++;
	
}

System.out.println("Count of Alpha is ="+count_of_alpha);
System.out.println("Count of numeric is ="+count_of_numeric);
}

}
}