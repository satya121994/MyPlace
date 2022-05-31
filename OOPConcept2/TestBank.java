package OOPConcept2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank ();
		  hs.credit ();
		  hs.debit ();
		  hs.transfermoney();
		  hs.educationloan();
		  hs.carloan();
		  hs.mutulfund();
		  
		  USBank b = new HSBCBank();
		  b.credit ();
		  b.debit ();
		  b.transfermoney();
		  
		 System.out.println(USBank.min);	
	}

}
