package constructorwithinnheritence;

public class childclass extends constructorwithinheritence{

	
	
	public childclass(String id, String Nme, String Sal, String empl) {
		super(id, Nme, Sal, empl);
		// TODO Auto-generated constructor stub
	}




	public void finalMethod() {
		methodToBeCalled();
		System.out.println("The Employer Name is "+ employer);
	}

	
	

	

}
