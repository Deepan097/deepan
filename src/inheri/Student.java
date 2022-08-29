package inheri;

public class Student extends College {
	private void studentname() {
		System.out.println("student name is df");
	}
private void studentdep() {
System.out.println("student dept is mechanical");


}
private void studentid() {
	System.out.println("student id is 123");

}
public static void main(String[] args) {
	Student s=new Student();
	s.studentdep();
	s.studentid();
	s.studentname();
	s.collegecode();
	s.collegename();
	s.collegerank();
	s.hostelname();
	s.Deptnamre();
}

}

