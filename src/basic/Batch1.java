package basic;

public class Batch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student1 s2 = new Student1();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		
		s1.setName("John");
		
		s2.setName(s1.getName());
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		
	}

}
