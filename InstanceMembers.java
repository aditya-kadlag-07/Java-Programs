

public class InstanceMembers {
	
	int a;
	
	public void demo(int b) {
		a=b;
		System.out.println("demo");
	}
	{
		System.out.println("nb1");
	}
	//constructor overloading 
	public InstanceMembers() {
		System.out.println("c1");
	}
	public InstanceMembers(int a) {
		System.out.println("ct2");
	}
	
	public static void main(String[] args) {
		System.out.println("ms");
		InstanceMembers obj1= new InstanceMembers();
		obj1.demo(10);
		 System.out.println(obj1.a);//0
		 
		InstanceMembers obj2= new InstanceMembers(20);
		obj2.demo(30);
		 System.out.println(obj2.a);//0
	}
//ms nb1 demo 10 nb1 demo 30
}


