package basicsofjava;

public class Assignment_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name= "Ambika";
	String reverse="";
	for(int i=name.length()-1;i>=0;i--)
	{
		char answer =    name.charAt(i);
		/*System.out.println(answer);
		System.out.print(answer);
		reverse=answer+reverse;*/
		reverse=reverse+answer;
		System.out.println(reverse);
	}
	}
}
