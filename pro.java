package pro;
import java.io.*;
import java.util.*;
public class pro 
{
	public static void main(String[] args)throws IOException {
		int a;
		float b;
		Scanner reader=new Scanner(System.in);
		System.out.print("������һ�����ͣ�");
		a=reader.nextInt();
		System.out.print("������һ�������ͣ�");
		b=reader.nextFloat();
		System.out.print("������һ���ַ���");
		String s=reader.next();
		char c = s.charAt(0);
		BufferedReader buf;
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������һ���ַ�����");
		str=buf.readLine();
		System.out.printf("�����������Ϊ��%d\n",a);
		System.out.printf("������ĸ�����Ϊ��%f\n",b);
		System.out.printf("��������ַ�Ϊ��%c\n",c);
		System.out.printf("��������ַ���Ϊ��%s\n",str);
				
	}
}
