package basicsofjava;
class College_Class
{
	void bookstowrite()
	{
		System.out.println("writing to study");
	}
}
public class School_Class extends College_Class
{
	void bookstowrite()
	{
		System.out.println("writing to top class");
		
		super.bookstowrite();//super keyword
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School_Class s1= new School_Class();
		s1.bookstowrite();
		

	
	}
}
