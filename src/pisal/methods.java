package pisal;

public class methods {
	public static void main(String[] args) {
		System.out.println("Four Types of Regular Methods");
		m1();
		
		methods s1=new methods();
				s1.m2();
				
				demo1.m3();
				
				demo2 s2=new demo2();
				s2.m4();
	}
	public static void m1()
	{
		System.out.println("Static Regular method call from same class");
	}
	public void m2()
	{
		System.out.println("Non Static regular method call from same class");
	}

}
