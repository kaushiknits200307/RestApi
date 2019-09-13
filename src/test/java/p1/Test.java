package p1;

public class Test {
	
	public void show()
	{
		System.out.println("show() of Test class of p1 package");
	}
	
	public static void display()
	{
		System.out.println("display() of Test class of p1 package");
	}
	
	public static void main(String[] args) {
		
		Test obj = new Test();
		
		obj.show();
		
		Test.display();
	}

}
