package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E>void main(String[] args) {
		
		ArrayList ar = new ArrayList ();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(60);
		ar.add(12.44);
		ar.add("test");
		ar.add('a');
		ar.add(true);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		for (int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic
		
		ArrayList<Integer>ar1 = new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		ar2.add("Selenium");
		
		ArrayList <E> ar3 = new ArrayList <E>();
		
		//employee class object 
		Employee e1 = new Employee ("Satya",25,"QA");
		Employee e2 = new Employee ("Nani",27,"Dev");
		Employee e3 = new Employee ("Nara",29,"Admin");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee> ();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator
		Iterator<Employee> it = ar4.iterator ();
		while (it.hasNext ()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("****************");
		//addAll
		ArrayList<String> ar5 = new ArrayList<String> ();
		ar5.add("test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String> ();
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("Javascript");
		
		for (int i =0; i<ar5.size ();i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("*********");
		//remove all
		ar5.removeAll(ar6);
		for (int i =0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		//retainAll
		ArrayList<String> ar7 = new ArrayList<String> ();
		ar7.add("test");
		ar7.add("Selenium");
		ar7.add("Qtp");
		
		ArrayList<String> ar8 = new ArrayList<String> ();
		ar8.add("test");
		ar8.add("java");
		
		ar7.retainAll(ar8);
		for (int i =0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
		
		
	}

}
