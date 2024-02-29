package assessments;
//Create a class and write 5 static methods each for addition, subtration, multiplication, devision and modules, call it in the main method
public class Assignment7 
{
static void add()
{
	int a=20;
	int b=30;
	int c=a+b;
	System.out.println("Addition of 2 numbers:"+c);
	
}
static void sub()
{
	int a=20;
	int b=30;
	int c=a-b;
	System.out.println("Substraction of 2 numbers:"+c);
	
}
static void mul()
{
	int a=20;
	int b=30;
	int c=a*b;
	System.out.println("multiplication of 2 numbers:"+c);
	
}
static void div()
{
	int a=20;
	int b=30;
	int c=a/b;
	System.out.println("division of 2 numbers:"+c);
	
}
static void mod()
{
	int a=20;
	int b=30;
	int c=a%b;
	System.out.println("mod of 2 numbers:"+c);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		mul();
		div();
		mod();

	}

}
