package PATTERNS;

import java.util.*;
public class P1 {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int e=s.nextInt();
		patter(e);
	}
	static void patter(int e)
	{
		for(int i=0;i<2*e;i++) {
			
			for(int j=0;j<e;j++) {
				if(i>j)
					System.out.print("  ");
				 else
					 System.out.print("1 ");
				
			}
			System.out.println("");
		}
	
		
	}

}
