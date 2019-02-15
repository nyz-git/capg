package basic;

public class Child extends Parent{

	String name = "Alice";
	
	public Child() {
		//super();
		System.out.println(name);
		System.out.println(super.name);
		show();
		super.show();
		
		
	}
	
	public void show() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child();
	}

}
