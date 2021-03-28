package sy42;
class Cube{
	private static double length=2.5;
	private static double width=3.5;
	private static double height=4.5;
	public Cube(double l,double w,double h) {
		length=l;
		width=w;
		height=h;
	}
	double area() {
		return length*width;
	}
	double volume() {
		return area()*height;
	}
}
public class sy42 {
	public static void main(String[] args) {
		Cube volu=new Cube(2.5,3.5,4.5);
		System.out.println("立方体底面积为："+ volu.area());
		System.out.println("立方体体积为："+ volu.volume());
	}
}
