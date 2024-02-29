package basicsofjava;

public class Average {

	public static void main(String[] args) {
		double sum=0;
		double average;
		
		System.out.println("print numbers : ");
for(int i=1;i<11;i++)
	
{
	
	System.out.println(i);
	sum+=i;
	
}

System.out.println("sum of first ten numbers="+sum);
average=sum/10;
System.out.println("average of ten numbers"+average);

	}

}
