package constructorwithinnheritence;

public class constructorwithinheritence {
	
	 
	String employer;
	String empid;
	String Name;
	String Salary;
	
	 
	 
	 public constructorwithinheritence(String id, String Nme,String Sal,String empl){
		 	this.employer=empl;
			this.empid=id;
			this.Name=Nme;
			this.Salary=Sal;
	 }
	
	public void Display() {
		System.out.println("Parent Class Presents "+Name+" and the emp id as "+empid);
	}
	
	public void PI() {
		System.out.println(empid + " has a salary of "+ Salary);
		
	}
	
	public void methodToBeCalled()
	{
		Display();
		PI();
	}

	
	

	

}
