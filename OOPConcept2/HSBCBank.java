package OOPConcept2;

public class HSBCBank  implements USBank,BrazileBank {
	
	public void credit () {
		System.out.println("hsbc ---credit");
	}
	
	public void debit () {
		System.out.println("hsbc ---debit");
	}
	
	public void transfermoney () {
		System.out.println("hsbc ---transfermoney");
	}
	
	//seperate methods for hsbc bank
	
	public void educationloan() {
		System.out.println("hsbc ---educationloan");
	}
	
	public void carloan() {
		System.out.println("hsbc -----carloan");
	}
	
	public void mutulfund () {
		System.out.println("hsbc ---mutulfund");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
