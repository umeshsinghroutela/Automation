package src.practice.programe;

public class UpCasting {
	static String color;
	public UpCasting() {
		this.color =  "Black";
	}

	public static void main(String[] args) {
//		new UpCasting();
//		System.out.println(color);
		
		Parentclass p = new ChildClass();
		p.m1();
		
		
		ChildClass c = (ChildClass)p;
	}
	
}

class Parentclass {
	public void m1(){
		System.out.println("Hello m1 ");
	}
	protected void m2(){
		System.out.println("Hello m2");
	}
	
	private void m3(){
		System.out.println("Hello m2");
	}
}

class ChildClass extends Parentclass{
	
	@Override
	protected void m2() {
		// TODO Auto-generated method stub
		super.m2();
	}
	
	private void m3() {
		// TODO Auto-generated method stub

	}
	public void m4() {
		System.out.println("hello m3 from child");
		this.m2();
	}
	

	
	
	

	
	
}
