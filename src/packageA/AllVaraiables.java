package packageA;

public class AllVaraiables {
	int i=10;
	static int j=20;
	{
		System.out.println("I am instance block");
	}
	
	static{
		System.out.println("I am static block");
	}
	public void m1()
	{
		int y=30;
		System.out.println(y);
	}
	public static void main(String[] args) {
		AllVaraiables a= new AllVaraiables();
		System.out.println(a.i);
		System.out.println(j);
	}
	

}
