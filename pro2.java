package pro2;
import java.io.*;
import java.util.Scanner;

public class pro2 {
	public static void main(String[] args) {
		float a,b,c;
		System.out.print("请输入三门成绩：");
		Scanner reader=new Scanner(System.in);
		a=reader.nextFloat();
		b=reader.nextFloat();
		c=reader.nextFloat();
		System.out.println("总分为："+(a+b+c));
		System.out.println("平均分为："+(a+b+c)/3);
	}
}