package basicsofjava;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int array[]=new int[4];
  array[0]=43;
  array[1]=54;
  array[2]=56;
  array[3]=89;
  int array1[]=new int [array.length];
  for(int i=0;i<4;i++)
  {
	  array1[i]=array[i];
  }
  System.out.println(Arrays.toString(array1));
  
		  
  
   
	}

}
