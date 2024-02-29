package basicsofjava;

import java.lang.reflect.Array;

public class Avg_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int value[]	= new int [5];
      value[0]=21;
      value[1]=22;
      value[2]=50;
      value[3]=25;
      value[4]=80;
      double Sum_of_value=0;
      for(int i=0;i<=4;i++)
      {
    	  Sum_of_value=Sum_of_value+value[i];  
      }
      System.out.println(Sum_of_value);
      
      double average=Sum_of_value/Array.length;
      
      System.out.println("Average is :"+average);
      
}

}
