class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // Ok
	//	System.out.println(instanceVar);// Error
	}
	public void instanceMethod() {
		System.out.println(classVar); // Ok print 동작 안 함.
		System.out.println(instanceVar);// Ok print 동작 안 함.
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //OK
	  //System.out.println(Foo.instanceVar); // ERROR
		Foo.classMethod();
	//	Foo.instanceMethod();
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // 
		System.out.println(f1.instanceVar);
		
		f1.classVar = "Changed by f1";
		System.out.println(Foo.classVar);
		System.out.println(f2.classVar);
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);
	}

}
