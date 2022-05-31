package OOPConcept1;

public class LocalAndGlobalVariables {

	//global vars ---class variables
	String name = "Nani";
	int age = 26;
	public static void main(String[] args) {
		
		int i =10;//local var .
		System.out.println(i);
		
		LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum () {
		int i =10;
		int j = 20;
		int age = 28;
	}
	
	
	
	
	
}
