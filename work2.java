package patterns;

import java.util.*;
public class work2 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[]args) {
		int n=s.nextInt();
		int a=2;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
				System.out.print(a+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			
		System.out.println("");
		a+=2;
	}
	}

}
