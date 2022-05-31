package OOPConcept1;

public class StaticAndNonStaticConcept {

	String name = "Nani";
	static int age = 28;
	public static void main(String[] args) {
		
		//how to call static methods and var
		//1.direct calling
		sum();
		//calling by classname
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept ();
		obj.sendmail();
		System.out.println(obj.name);
		
		
		
	}

	public void sendmail () {
		System.out.println("sendmail method");
	}
	public static void sum() {
		System.out.println("sum method");
	}
	
	
	
}
