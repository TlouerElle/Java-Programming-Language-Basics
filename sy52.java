 package sy52;
class People{
	protected String hair;
	protected String skin;
	protected String eyes;
	public String getHair() {
        return hair;
    }
	public void setHair(String hair){
        this.hair=hair;
	}
	public String getSkin() {
        return skin;
    }
	public void setSkin(String skin) {
		this.skin=skin;
	}
	public String getEyes() {
        return eyes;
    }
	public void setEyes(String eyes) {
		this.eyes=eyes;
	}
	public void show1() {
		
	}
	public void show2() {
		
	}
	public void show3() {
	
	}
}
class ChinesePeople extends People{
	public void set()
    {
        System.out.println("头发："+this.eyes+"，皮肤："+this.skin+"，眼睛："+this.eyes);
    }
	public void show1() {
		System.out.println("来自中国");
	}
	public void show2() {
		System.out.println("首都北京");
	}
	public void show3() {
		System.out.println("喜欢旅游");
	}
}
class AmericanPeople extends People{
	public void set()
    {
		System.out.println("头发："+this.eyes+"，皮肤："+this.skin+"，眼睛："+this.eyes);
    }
	public void show1() {
		System.out.println("来自美国");
	}
	public void show2() {
		System.out.println("首都华盛顿");
	}
	public void show3() {
		System.out.println("喜欢听音乐");
	}
}
public class sy52 {
	public static void main(String[] args) {
		ChinesePeople cp=new ChinesePeople();
		cp.setHair("黑色");
		cp.setSkin("黄色");
		cp.setEyes("黑色");
		cp.set();
		cp.show1();
		cp.show2();
		cp.show3();
		AmericanPeople ap=new AmericanPeople();
		ap.setHair("黑色、金色、白色");
		ap.setSkin("黄色、白色、黑色");
		ap.setEyes("黑色、金色、蓝色");
		ap.set();
		ap.show1();
		ap.show2();
		ap.show3();
	}
}
