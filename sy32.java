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
		System.out.printf("��1-100����Ҫ���ҵ����֣�");
		Scanner a=new Scanner(System.in);
		b=a.nextInt();
		for(int i=0;i<10;i++) {
			if(x[i]==b) {
				System.out.printf("���ҵ����ֵ��±�Ϊ%d",i);
				r=1;
			}
		}
		if(r==0) {
			System.out.printf("�޲��ҵ�����");
		}
	}
}
