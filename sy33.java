package sy33;
import java.io.*;
import java.util.*;
public class sy33 
{
	public static void main(String[] args)throws IOException {
		int a=0,b=0,c=0;
		Scanner reader=new Scanner(System.in);
		BufferedReader buf;
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������һ���ַ�����");
		str=buf.readLine();
		int length=str.length();
		int[] x;
		x=new int[length];
		System.out.printf("��������ַ���Ϊ��%s\n",str);
		for(int i=0;i<length;i++) {
			x[i]=str.charAt(i);
		}
		for(int i=0;i<length;i++) {
			if(65<=x[i]&&x[i]<=90) {
				a++;
			}
			if(97<=x[i]&&x[i]<=122) {
				b++;
			}
			if(48<=x[i]&&x[i]<=57) {
				c++;
			}	
		}
		System.out.printf("��д��ĸ%d��\n",a);
		System.out.printf("Сд��ĸ%d��\n",b);
		System.out.printf("����%d��\n",c);
	}
}