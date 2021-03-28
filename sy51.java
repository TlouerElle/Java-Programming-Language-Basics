package sy51;
class juxing{
	protected double length;
	protected double width;
	public void setLengthWidth(double length,double width){
	        this.length=length;
	        this.width=width;
	}
	public void show1() {
		System.out.println(String.format("底面积为:%.2f",length*width));
	}
}
class lifangti extends juxing{
	private double height;
	public void show2() {
		System.out.println("长为："+length+"，宽为："+width+"，高为："+height);
	}
	public void setHeight(double hei) {
		height=hei;
		System.out.println(String.format("体积为:%.2f",length*width*height));
		}
}
public class sy51{
	public static void main(String[] args) {
		lifangti stu=new lifangti();
		stu.setLengthWidth(4.3,3.5);
		stu.setHeight(2.3);
		stu.show1();
		stu.show2();
	}
}








