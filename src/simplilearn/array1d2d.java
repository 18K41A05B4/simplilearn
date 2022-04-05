package simplilearn;

import java.util.Scanner;

public class array1d2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b[]=new int[5];
		
		int i;
		for(i=0;i<5;i++) {
			System.out.println("enter element:");
			b[i]=sc.nextInt();
		}
		for(i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		int j;
		int a[][]=new int[3][3];
		for(i=0;i<a.length;i++) {

		for(j=0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();
		}
	}
		for(i=0;i<a.length;i++) {

			for(j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
			
		
		

	}

}
