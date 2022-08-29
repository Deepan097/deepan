package gtpoly;

public class Company {

	private void empid() {
	   System.out.println("book");
	}
	public  void empid(int age,int phoneno) {
    	System.out.println("24" + "\t" +phoneno);
	}
	private void empid(int age ,String name){
		System.out.println();
	}
	
	public static void main(String[] args) {
	Company c=new Company();
	c.empid();
	c.empid(25, 7845);
	c.empid(25, "deepan");
	
	Company a=new Company();
	a.empid();
	a.empid();a.empid(95, 564); 
	a.empid(78, "seay");
	
	}			
}	
  	