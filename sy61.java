package sy61;
abstract class Shape{
	protected String name;
	public Shape(String jx) {
		name=jx;
		System.out.println("名称："+name);
	}
	abstract public double getArea();
	abstract public double getLength();
}
class Circle extends Shape{
	private double length;
	private double width;
	public String toString() {
		return name;
	}
	public Circle(String shapeName,double l,double w) {
		super(shapeName);
		length=l;
		width=w;
	}
	public double getArea(){
		return length*width;
	}
	public double getLength(){
		return 2*(length+width);
	}
}
public class sy61 {
	public static void main(String[] args) {
		Shape circle=new Circle("长方形",3.2,6.3);
		System.out.println("面积="+circle.getArea());
		System.out.println("周长="+circle.getLength());
	}
}
