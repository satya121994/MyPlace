package OOPConcept2;

public class CallByValAndCallByReference {

        int p;
        int q;
	
	public static void main(String[] args) {
		
		//diff b/w CallByValAndCallByReference is the possible ? YES
		
		CallByValAndCallByReference obj = new CallByValAndCallByReference ();
		int x = 10;
		int y = 20;
		obj.testsum(x, y);
		
		obj .p = 30;
		obj .q = 50;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int testsum(int a,int b) {
		a =30;
		b =40;
		int c = a+b;
		return c;
	}
	public void swap(CallByValAndCallByReference t) {
		int temp;
		temp =t.p;
		t.p =t.q;
		t.q =temp;
	}
}
