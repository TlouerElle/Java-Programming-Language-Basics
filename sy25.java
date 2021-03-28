package sy25;

import java.util.Scanner;

public class sy25 {
	public static void main(String[] args) {
		int i,j,k,n;
		Scanner reader=new Scanner(System.in);
		System.out.print("«Î ‰»În=");
		n=reader.nextInt();
		for(i=1;i<=n;i++) {
			for(k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
