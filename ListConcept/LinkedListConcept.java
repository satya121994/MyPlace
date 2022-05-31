package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String> ();
		
		//add
		ll.add("Test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("rpa");
		ll.add("rft");
		
		System.out.println("content of linkedlist :"+ll);
		//add first
		ll.addFirst("nani");
		
		//add last
		ll.addLast("automation");
		
		System.out.println("content of linked list :"+ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set 
		ll.set(0, "satya");
		System.out.println(ll.get(0));
		
		//remove first and last 
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linked list :"+ll);
		
		ll.remove(2);
		System.out.println("content of linked list :"+ll);
		
		
		System.out.println("**using for loop");
		for (int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		//advance for loop
		System.out.println("****using advance for loop");
		
		for (String str :ll) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("**iterator");
		
		Iterator <String>it  = ll.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		
		System.out.println("****while loop");
		
		int num =0;
		while (ll.size()>num) {
			System.out.println(ll.get(num));
			
			num ++;
		}	
	}

}
