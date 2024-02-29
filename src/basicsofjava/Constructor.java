package basicsofjava;

public class Constructor {
Constructor()
{
	System.out.println("This is my constructor");
}
	public static void main(String[] args) {
		System.out.println("this is my main method");
		Constructor c1=new Constructor();//this is how you invoke constructor
		new Constructor();
		

	}

}
