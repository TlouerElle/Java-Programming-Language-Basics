package sy41;
class Cylinder{
	private double radius;
	private int height;
	private double pi=3.14;
	String color;
	public Cylinder() {
		this(2.5,5,"红色");
		System.out.println("无构造方法被调用");
	}
	public Cylinder(double r,int h,String str) {
		System.out.println("构造方法被调用");
		radius=r;
		height=h;
		color=str;
	}
	public void show() {
		System.out.println("圆柱底半径为："+ radius);
		System.out.println("圆柱体的高为："+ height);
		System.out.println("圆柱的颜色为："+ color);
	}
	double area() {
		return pi*radius*radius;
	}
	double volume() {
		return area()*height;
	}
}
public class sy41 {
	public static void main(String[] args) {
		Cylinder volu=new Cylinder();
		System.out.println("圆柱底面积为："+ volu.area());
		System.out.println("圆柱体体积为："+ volu.volume());
		volu.show();
	}
}
