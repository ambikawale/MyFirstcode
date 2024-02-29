package assessments;

public class Constructor_Assignment {
	void add()
	{
		System.out.println("Method 1");
	}
	static void add(int a)
	{
		System.out.println("Method 2");
	}
	void add(String b)
	{
		System.out.println("Method 3");
	}
	void add(char c)
	{
		System.out.println("Method 4");
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Assignment c1=new Constructor_Assignment();
		c1.add();
		c1.add('s');
		c1.add(20);
		c1.add("Ambika");
		
	}

}
