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
		System.out.print("请输入一个字符串：");
		str=buf.readLine();
		int length=str.length();
		int[] x;
		x=new int[length];
		System.out.printf("您输入的字符串为：%s\n",str);
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
		System.out.printf("大写字母%d个\n",a);
		System.out.printf("小写字母%d个\n",b);
		System.out.printf("数字%d个\n",c);
	}
}