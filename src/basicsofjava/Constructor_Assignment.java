package basicsofjava;

public class Constructor_Assignment {
	int a=100;
	int b=200;
    void sub() {
	System.out.println(a-b);

    }
    void mul()
    {
	System.out.println(a*b);
    }
	static void add()
	{
		int a=50;
		int b=200;
		System.out.println(a+b);
	}
	static void div()
	{
		int a=50;
		int b=200;
		System.out.println(a/b);
	}
	Constructor_Assignment()
	{
		System.out.println("This is constructor");
	}


	public static void main(String[] args) {
		add();
		div();
		Constructor_Assignment c1=new Constructor_Assignment();
		c1.mul();
		c1.sub();
		new Constructor_Assignment();
		
	}

}
