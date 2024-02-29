package basicsofjava;
interface one{
	void add();
	void sub();
}
abstract class Abc{
	abstract void mul();
	abstract void div();
	
}
abstract class Xyz 
{
	abstract void mul1();
	abstract void div1();
	void study()
	{
		System.out.println("Studying");
	}
	void run()
	{
		System.out.println("Running");
	}
	
}


public class Assignment1_Abstract extends Xyz
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void mul1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void div1() {
		// TODO Auto-generated method stub
		
	}

}
