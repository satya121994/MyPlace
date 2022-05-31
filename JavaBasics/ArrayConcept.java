package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
	
		//1. int array
		//lowest bound/index  =0
		//upper bound/index =n-1
		
		//dis -advantage of array
		//1.size is fixed ---static array  =to overcome this problem --we use collection ---array list hash table ;
		//2.store only similar data type values ---to overcome of this problem ,we use object array
		
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i.length);
		
		//for loop
		for(int j =0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2.double array :
		double d [] = new double[3];
		    d[0] = 12.33;
		    d[1] = 13.55;
		    d[2] = 44.66;
		System.out.println(d[2]);
		
		//3.char array
		char c[] = new char[3];
		c[0]= 'q';
		c[1] = 2;
		c[2] = '$';
		
		
		//4.boolean array
		boolean b[] = new boolean[2];
	        b[0] = true;
	        b[1] = false;
	        
	        //5.String array
	        String s[] = new String[3];
	        s[0] = "test";
	        s[1] = "Hello";
	        s[2] = "World";
	        
	        System.out.println(s.length);
	        System.out.println(s[1]);
		
		//6.object array 
	        Object ob [] = new Object[6];
	        ob[0] = "Nani";
	        ob[1] = 28;
	        ob[2] = 12.33;
	        ob[3] = "1/1/1994";
	        ob[4] ='M';
	        ob[5] ="Visakhapatnam";
	        
	        System.out.println(ob[5]);
		    System.out.println(ob.length);
	        System.out.println(ob[0]);
		
		
		
		
		
		
		
		
		
		
	}

}
