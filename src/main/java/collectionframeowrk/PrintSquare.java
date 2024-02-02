package collectionframeowrk;

import java.util.Scanner;

public class PrintSquare {

	public PrintSquare() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row values");
		Integer row=sc.nextInt();
		//Scanner sc2= new Scanner(System.in);
		System.out.println("Enter the column values");
		Integer col=sc.nextInt();
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= col; j++) 
				if((i==1 || i==col) || (j==1 || j==col))
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
			
		}
		
		
	}

}
