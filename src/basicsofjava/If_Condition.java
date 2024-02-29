package basicsofjava;

public class If_Condition 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int q=100;
    int r=200;
    if(q>r)
    {
    	System.out.println("1");
    }
    if(q<=r)// check both condition as q<r and q=r both false 
    {
    	System.out.println("2");
    }
    if(q!=r)
    {
    	System.out.println("3");
    }
    if(q<r)
    {
    	System.out.println("4");
    }
	}

}
