class print{
	
	public String delimiter;
	public void a() {
		
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	
	public void b() {
		// TODO Auto-generated method stub
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	
	
}
public class staticMethod {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print t1 = new print();
		t1.delimiter = "=";
		
		t1.a();
		t1.b();
		
		//------instance--------------
		print t2 = new print();
		t2.delimiter = "+";
		t2.a();
		t2.b();
	}



}
