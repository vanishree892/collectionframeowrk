package collectionframeowrk;

import java.util.Scanner;

public class StarPrint2 {

	public StarPrint2() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
	//	Scanner sc=new Scanner(System.in);
		
		//System.out.println(missedLectures(5,5,6));//2
		System.out.println(missedLectures(5,13,98));//3
	}
	 public static int missedLectures(int numchaps,int b,int e)
	 {
		 return Math.min(e-b+1,numchaps);
	 }

}
