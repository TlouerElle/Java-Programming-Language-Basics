package sy71;
import java.io.*;
public class sy71 {
	public static void main(String[] args)
	{
		char ch;
		int data;
		try(
			FileInputStream fin=new FileInputStream(FileDescriptor.in);
			FileOutputStream fout=new FileOutputStream("C:/Users/Administrator/Desktop/char.txt");
		)
		{
			System.out.println("������һ���ַ�������#����");
			while((ch=(char)fin.read())!='#')
				fout.write(ch);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("�ļ�δ�ҵ���");
		}
		catch(IOException e) {}
		try(
			FileInputStream fin=new FileInputStream("C:/Users/Administrator/Desktop/char.txt");
			FileOutputStream fout=new FileOutputStream(FileDescriptor.out);
			)
		{
			while(fin.available()>0) {
				data=fin.read();
				fout.write(data);
			}
		}
		catch(IOException e) {}
	}
}
