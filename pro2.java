package pro2;
import java.io.*;
import java.util.Scanner;

public class pro2 {
	public static void main(String[] args) {
		float a,b,c;
		System.out.print("���������ųɼ���");
		Scanner reader=new Scanner(System.in);
		a=reader.nextFloat();
		b=reader.nextFloat();
		c=reader.nextFloat();
		System.out.println("�ܷ�Ϊ��"+(a+b+c));
		System.out.println("ƽ����Ϊ��"+(a+b+c)/3);
	}
}