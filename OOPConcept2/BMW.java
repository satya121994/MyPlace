package OOPConcept2;

public class BMW extends Car{ //has -a relationship

	public void start () {
		System.out.println("BMW -----start");
	}
	public void theftsafety () {
		System.out.println("BMW -----theftsafety");
	}
}
//when same method is present in parent class as well as in child class with the same name and same number of arguments is called method overridding