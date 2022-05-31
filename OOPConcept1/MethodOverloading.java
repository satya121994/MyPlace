package OOPConcept1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj .sum();
		obj.sum(10);
		obj.sum(20,5);

		//we can overload main method also
		//you can not create a method inside a method
		//duplicate methods --i.e,same method name with same number of arguments are nt allowed
	}
	public void sum() {
		System.out.println("sum method ---zero parameters");
	}
	public void sum(int i) {
		System.out.println("sum method ---one parameters");
		System.out.println(i);
	}
	
	public void sum (int k,int l) {
		System.out.println("sum method ---two parameters");
		System.out.println(k+l);
	}
}
