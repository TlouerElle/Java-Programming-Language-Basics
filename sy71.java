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
			System.out.println("请输入一串字符，并用#结束");
			while((ch=(char)fin.read())!='#')
				fout.write(ch);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("文件未找到！");
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
