package OOPConcept2;

public class WrapperClass {

	public static void main(String[] args) {
		 
		
		String x = "100";
		
		System.out.println(x+20);
		
		//Integer ,double ,char,boolean
		
		//data conversion :String to int
		int i = Integer.parseInt(x);
		
		System.out.println(i+20);
		
		//string to double conversion
		String y = "12.45";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//string to boolean 
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string conversion
		int j = 200;
		System.out.println(j+30);
		
		String s = String.valueOf(j);
		System.out.println(s+40);
		
		//String u = "100A";
		//Integer.parseInt(u);//NumberFormatException: For input string: "100A"
	}

}
