package assessments;

public class FindString_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String name="Ambika Yuvraj Birajdar";
   char c1[]=name.toCharArray();
   for(int i=0;i<=name.length()-1;i++)
   {
	  boolean answer= Character.isSpaceChar(c1[i]);
	  if(answer==true)
	  {
		  System.out.println("Space is present in given string");
	  }
   }
	}

}
