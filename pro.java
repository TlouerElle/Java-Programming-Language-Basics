package pro;
import java.io.*;
import java.util.*;
public class pro 
{
	public static void main(String[] args)throws IOException {
		int a;
		float b;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个整型：");
		a=reader.nextInt();
		System.out.print("请输入一个浮点型：");
		b=reader.nextFloat();
		System.out.print("请输入一个字符：");
		String s=reader.next();
		char c = s.charAt(0);
		BufferedReader buf;
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入一个字符串：");
		str=buf.readLine();
		System.out.printf("您输入的整型为：%d\n",a);
		System.out.printf("您输入的浮点型为：%f\n",b);
		System.out.printf("您输入的字符为：%c\n",c);
		System.out.printf("您输入的字符串为：%s\n",str);
				
	}
}
