package sy32;
import java.util.Scanner;
public class sy32 {
	public static void main(String[] args) {
		int[] x;
		x=new int[10];
		int b;
		int r=0;
		for(int i=0;i<10;i++) {
			x[i]=(int)(Math.random()*100+1);
		}
		for(int i=0;i<10;i++) {
			System.out.printf("%d ",x[i]);
		}
		System.out.println();
		System.out.printf("请1-100输入要查找的数字：");
		Scanner a=new Scanner(System.in);
		b=a.nextInt();
		for(int i=0;i<10;i++) {
			if(x[i]==b) {
				System.out.printf("查找的数字的下标为%d",i);
				r=1;
			}
		}
		if(r==0) {
			System.out.printf("无查找的数字");
		}
	}
}
