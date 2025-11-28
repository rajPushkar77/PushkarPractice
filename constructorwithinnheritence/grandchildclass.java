package constructorwithinnheritence;

public class grandchildclass extends childclass {

	public grandchildclass(String id, String Nme, String Sal,String employer) {
		super(id, Nme, Sal, employer);
		
	}
	
	void method() {
		super.finalMethod();
	}
	
	

	public static void main(String[] args) {
		
		grandchildclass obj1= new grandchildclass("1234","Ramesh","87000","infohub");
		obj1.method();
		

		 
		

	}

}
