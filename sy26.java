package sy26;

import java.util.Scanner;

public class sy26 {
	public static void main(String[] args) {
		int i,j=0,n;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入整数n=");
		n=reader.nextInt();
		if(n%2!=0) {
			for(i=1;i<n;i=i+2) {
				j=j+i*(i+1)*(i+2);
			}
			System.out.printf("结果为：%d",j);
		}
		if(n%2==0) {
			for(i=1;i<n-1;i=i+2) {
				j=j+i*(i+1)*(i+2);
				j=j+(n-1)*n;
			}
			System.out.printf("结果为：%d",j);
		}
	}
}
