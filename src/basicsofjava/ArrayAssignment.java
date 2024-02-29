package basicsofjava;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="ambika123";
char c1[]=name.toCharArray();
for(int i=0;i<=name.length()-1;i++)
{
boolean answer = Character.isAlphabetic(c1[i]);
if(answer==true)
{
	
	System.out.println("Index of Position"+i+" is "+"alphabate");
}
else
{
	System.out.println("Index of Position"+i+" is "+ "not alphabate");
}
//System.out.println("Index of Position"+i+" is "+answer);
}

}
}