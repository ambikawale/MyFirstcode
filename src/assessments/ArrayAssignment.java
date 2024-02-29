package assessments;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num[]=new int[1000];
   for(int i=1;i<=num.length;i++)
   {
	   if(i%3==0)
	   {
		   System.out.println("Sun"+" " +" Value of" +" " +i);
	   }
	   if(i%5==0)
	   {
		   System.out.println("Moon"+" " +" Value of" +" " +i);
	   }
	   if(i%3==0 && i%5==0)
	   {
		   System.out.println("Sun and Moon"+" " +" Value of" +" " +i);
	   }
   }
	}

}
