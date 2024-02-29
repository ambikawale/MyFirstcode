package basicsofjava;
public class TenthClass 
{
	static
	{
		System.out.println("SIB");
	}
	TenthClass()
	{
		System.out.println("Constructor");
	}
	{
		System.out.println("IIB");
	}
public static void main(String[] args) 
{
	System.out.println("Main method");
	new TenthClass();
}
}
