package OOPConcept1;

public class Car {

	//class var 
	 int mod ;
	 int wheel;
	
	public static void main(String[] args) {
		
		//newCar () ---this is the object of car class
		//new keyword is used to create the object
		//a,b,c --->object reference variable
		
		Car a = new Car ();
		Car b = new Car ();
		 Car c = new Car ();
		 
		 a.mod = 2015;
		 a.wheel = 4;
		 
		 b.mod = 2013;
		 b.wheel = 4;
		 
		 c.mod = 2038;
		 c.wheel = 4;
		 
		 System.out.println("before assiging the refernce");
		 System.out.println(a.mod);
		 System.out.println(a.wheel);
		 System.out.println(b.mod);
		 System.out.println(b.wheel);
		 System.out.println(c.mod);
		 System.out.println(c.wheel);
		 
		 System.out.println("After shifting the refernce");
		 
		 a=b;
		 b=c;
		 c=a;
		 
		 a.mod = 10;
		 System.out.println(a.mod);
		 c.mod = 20;
		 System.out.println(a.mod);
		 System.out.println(c.mod);
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
