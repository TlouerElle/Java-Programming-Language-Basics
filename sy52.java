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
        System.out.println("ͷ����"+this.eyes+"��Ƥ����"+this.skin+"���۾���"+this.eyes);
    }
	public void show1() {
		System.out.println("�����й�");
	}
	public void show2() {
		System.out.println("�׶�����");
	}
	public void show3() {
		System.out.println("ϲ������");
	}
}
class AmericanPeople extends People{
	public void set()
    {
		System.out.println("ͷ����"+this.eyes+"��Ƥ����"+this.skin+"���۾���"+this.eyes);
    }
	public void show1() {
		System.out.println("��������");
	}
	public void show2() {
		System.out.println("�׶���ʢ��");
	}
	public void show3() {
		System.out.println("ϲ��������");
	}
}
public class sy52 {
	public static void main(String[] args) {
		ChinesePeople cp=new ChinesePeople();
		cp.setHair("��ɫ");
		cp.setSkin("��ɫ");
		cp.setEyes("��ɫ");
		cp.set();
		cp.show1();
		cp.show2();
		cp.show3();
		AmericanPeople ap=new AmericanPeople();
		ap.setHair("��ɫ����ɫ����ɫ");
		ap.setSkin("��ɫ����ɫ����ɫ");
		ap.setEyes("��ɫ����ɫ����ɫ");
		ap.set();
		ap.show1();
		ap.show2();
		ap.show3();
	}
}
