package Arrays;

public class Array5 {

	public static void main(String[] args) {
       String name="Ambika Yuvraj Birajdar";
       char[]c1= name.toCharArray();
       for(int i=0;i<name.length();i++)
       {
       boolean answer=Character.isSpaceChar(c1[i]);
       
       if(answer==true) {
       System.out.println("Space is presernt in given string ");
       }


	}
	}
}
