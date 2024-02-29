package basicsofjava;

public class Class21feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Ambika Yuvraj Birajdar";
		char [] c1= name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			boolean answer=Character.isSpaceChar(c1[3]);
			if(answer==true)
			{
				System.out.println("Space is there"+"index of space"+"is"+i);
			}	
		}
		
		//System.out.println(answer);
		

	}

}
