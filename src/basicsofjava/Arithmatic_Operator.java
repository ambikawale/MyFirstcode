package basicsofjava;

public class Arithmatic_Operator //Non static method
{
	int a=200;
	int b=300;
	void add()
	{
		
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(a-b);
	}
	static void mul() // static method
	{
		int a=20;
		int b=5;
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		
     System.out.println("started");
     Arithmatic_Operator a1=new Arithmatic_Operator();
     a1.add();
     a1.sub();
     mul();

	}

}
