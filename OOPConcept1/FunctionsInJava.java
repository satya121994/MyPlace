package OOPConcept1;

public class FunctionsInJava {

	
	public static void main(String[] args) {
		
	FunctionsInJava obj = new FunctionsInJava();	
		obj.test();
		
		int  l = obj.pqr ();
		System.out.println(l);
		
		String s1 =obj.qa();
		System.out.println(s1);
		
		int div =obj.division(30,10);
		System.out.println(div);
		

	//1.one object will be created ,obj is the refernce variable ,referring to this object
	
		//2.after creating the object ,the copy of all non static method will be given to this object
		//main method is void ---never returns a value
		
	}
	

	//non static var
	
	//void means does not return any value 
	//return type ---void 
	public void test () {//no input no output
		System.out.println("test method");
	}
	
	public int pqr () {
		System.out.println("Pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	public String qa () {
		System.out.println("Qa method");
		String s = "Selenium";
		return s;	
	}
	//x,y are input parameters/arguments 
	public int division (int x,int y) {
		System.out.println("division method");
		int d =x/y;
		
		return d;
		
	}	
}