package sy31;
import java.util.*;
public class sy31 {
	public static void main(String[] args) {
		int[] x;
		int sum=0;
		float ave=0;
		x=new int[5];
		System.out.printf("����������ɼ���");
		Scanner a =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			x[i]=a.nextInt();
		}
		for(int i=0;i<5;i++) {
			sum=sum+x[i];
		}
		ave=sum/5;
		for(int i=1;i<5;i++) {
			int t;
			for(int j=0;j<5-i;j++) {
				if(x[j]<x[j+1]) {
					t=x[j];x[j]=x[j+1];x[j+1]=t;
				}
			}
		}
		System.out.printf("����ɼ��Ӵ�С��");
		for(int i=0;i<5;i++) {
			System.out.printf("%d ",x[i]);
		}
		System.out.println();
		System.out.printf("�ɼ�֮�ͣ�%d \n",sum);
		System.out.printf("ƽ���ɼ���%.1f \n",ave);
		System.out.printf("���ɼ���%d \n",x[0]);
		System.out.printf("��С�ɼ���%d ",x[4]);
	}
}
