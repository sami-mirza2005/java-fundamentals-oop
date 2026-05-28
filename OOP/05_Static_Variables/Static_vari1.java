class student{
	int rollno;
	String name;
	static String college="LU";
student(int r,String n)
{
	rollno=r;
	name=n;	
}
void display() {
	System.out.println(rollno+" "+name+" "+college);	
}
}
public class Static_vari1 {

	public static void main(String[] args) {
		student s1=new student(111,"Sami");
		student s2=new student(112,"Y");
		s1.display();
		s2.display();
	}

}
