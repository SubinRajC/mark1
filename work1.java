package patterns;

import java.util.Scanner;

public class work1 {

	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("Enter the value");
		int n=s.nextInt();
		int a=0;
		int b=0;		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a+","+b+" ");
				
				b++;
			}
			System.out.println(" ");
			a++;
			b=0;
		}
	}
}
