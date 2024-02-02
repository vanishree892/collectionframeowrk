package collectionframeowrk;

public class BinarySearch {

	public static void main(String[] args) {
		  int array[] = {10,20,45,78,90,100};
		  int startIndex=0;
		  int endIndex=array.length;
		  int searchElement=78;
		  BinarySerchElement(array, startIndex, endIndex, searchElement);
		  
		
	}

	private static void BinarySerchElement(int array[],int start,int end,int searchelement) {
		
		
		int mid=(start+end)/2;
		if(array[mid]<searchelement)
		{
		 start=mid+1;
				}
		else if(array[mid]>searchelement)
		{
		 end=mid-1;	
		}
		if(array[mid]==searchelement)
		 {
			 System.out.println("element found"+array[mid]);
		 }
		 
		
	}

}
