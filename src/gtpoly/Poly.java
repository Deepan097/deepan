package gtpoly;

public class Poly extends Company {


@Override
	public void empid(int age, int phoneno) {
	System.out.println(age +" " +phoneno);

		//super.empid(age, phoneno);
	
	} 
	public static void main(String[] args) {
	Poly p=new Poly();
	p.empid(258, 45562525);
	}
}