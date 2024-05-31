package patterns;

import java.util.Scanner;

public class work3 {

	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("Enter the value");
		int n=s.nextInt();
		n*=2;
		n-=1;
		int a=1;
		//int b=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i+j<=n-1) && (i>=j) ) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				//b++;
			}
			System.out.println(" ");
			a++;
			//b=0;
		}
	}
}
