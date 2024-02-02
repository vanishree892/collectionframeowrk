package collectionframeowrk;

import java.util.Iterator;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		int array[]= {12,11,9,17,20};
	//	int len=array.length;
	    Bubblesort(array);
	    PrintArray(array);
		
	}


	private static void PrintArray(int[] array) {
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);	
	}
	
		
	}


	private static void Bubblesort(int[] array) {
		int i,j,temp;
		int len=array.length;
		for(i=0;i<len-1;i++)
		{
			boolean swapped=false;
			for(j=0;j<len-i-1;j++)
			{
			  if(array[j]>array[j+1])
			  {
				  temp=array[j];
				  array[j]=array[j+1];
				  array[j+1]=temp;
				  swapped=true;
			  }
			  
			}
if(swapped==false)
{
	break;
}
			
		}
		
	}
}
